package com.solvd.laba.parsers.dom;

import com.solvd.laba.parsers.models.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RealDom implements IDOMEnum {
    private static final Logger LOGGER = LogManager.getLogger(RealDom.class);
    private List<MobilePhone> mobilePhones = new ArrayList<>();

    public List<MobilePhone> getMobilePhones() {
        return mobilePhones;
    }

    public void setMobilePhones(List<MobilePhone> mobilePhones) {
        this.mobilePhones = mobilePhones;
    }

    public void run() throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        Document document = null;
        DocumentBuilder builder = documentBuilderFactory.newDocumentBuilder();
        document = builder.parse(new File("src/main/resources/mobilePhone_jdom.xml"));

        NodeList nodeList = document.getElementsByTagName(PHONE);
        int index = nodeList.getLength();


        for (int i = 0; i < index; i++) {
            MobilePhone mobilePhone = new MobilePhone();
            MobileStore mobileStore = new MobileStore();
            Specification specification = new Specification();
            BatteryBuilder bbuilder = new BatteryBuilder();
            bbuilder.build();
            Battery battery = new Battery(bbuilder);
            Display display = new Display();
            Processor processor = new Processor();
            Memory memory = new Memory();
            Node node = nodeList.item(i);
            Element element = (Element) node;
            mobilePhone.setName(element.getElementsByTagName(PHONE_NAME).item(0).getTextContent());
            mobilePhone.setYear(Integer.parseInt(element.getElementsByTagName(PHONE_YEAR).item(0).getTextContent()));
            mobilePhone.setImei(Long.parseLong(element.getElementsByTagName(PHONE_IMEI).item(0).getTextContent()));
            mobilePhone.setPrice(Integer.parseInt(element.getElementsByTagName(PHONE_PRICE).item(0).getTextContent()));

            Node mStoreNode = element.getElementsByTagName(IDOMEnum.IStore.STORE).item(0);
            Element mStoreElement = (Element) mStoreNode;
            mobileStore.setName(mStoreElement.getElementsByTagName(IDOMEnum.IStore.STORE_NAME).item(0).getTextContent());
            mobileStore.setAddress(mStoreElement.getElementsByTagName(IDOMEnum.IStore.STORE_ADDRESS).item(0).getTextContent());
            mobilePhone.setMobileStore(mobileStore);

            Node batteryNode = element.getElementsByTagName(IDOMEnum.ISpecification.BATTERY).item(0);
            Element batteryElement = (Element) batteryNode;
            battery.setManufacturer(batteryElement.getElementsByTagName(IDOMEnum.ISpecification.BATTERY_MANUFACTURER).item(0).getTextContent());
            battery.setCapacity(Integer.parseInt(batteryElement.getElementsByTagName(IDOMEnum.ISpecification.BATTERY_CAPACITY).item(0).getTextContent()));
            battery.setPrice(Integer.parseInt(batteryElement.getElementsByTagName(IDOMEnum.ISpecification.BATTERY_PRICE).item(0).getTextContent()));
            specification.setBattery(battery);

            Node memoryNode = element.getElementsByTagName(IDOMEnum.ISpecification.MEMORY).item(0);
            Element memoryElement = (Element) memoryNode;
            memory.setName(memoryElement.getElementsByTagName(IDOMEnum.ISpecification.MEMORY_MANUFACTURER).item(0).getTextContent());
            memory.setCapacity(Integer.parseInt(memoryElement.getElementsByTagName(IDOMEnum.ISpecification.MEMORY_CAPACITY).item(0).getTextContent()));
            memory.setPrice(Integer.parseInt(memoryElement.getElementsByTagName(IDOMEnum.ISpecification.MEMORY_PRICE).item(0).getTextContent()));
            specification.setMemory(memory);

            Node displayNode = element.getElementsByTagName(IDOMEnum.ISpecification.DISPLAY).item(0);
            Element displayElement = (Element) displayNode;
            display.setManufacture(displayElement.getElementsByTagName(IDOMEnum.ISpecification.DISPLAY_MANUFACTURER).item(0).getTextContent());
            display.setType(displayElement.getElementsByTagName(IDOMEnum.ISpecification.DISPLAY_TYPE).item(0).getTextContent());
            display.setInch(Double.parseDouble(displayElement.getElementsByTagName(IDOMEnum.ISpecification.DISPLAY_INCH).item(0).getTextContent()));
            display.setPrice(Integer.parseInt(displayElement.getElementsByTagName(IDOMEnum.ISpecification.DISPLAY_PRICE).item(0).getTextContent()));
            specification.setDisplay(display);

            Node processorNode = element.getElementsByTagName(IDOMEnum.ISpecification.PROCESSOR).item(0);
            Element processorElement = (Element) processorNode;
            processor.setName(processorElement.getElementsByTagName(IDOMEnum.ISpecification.PROCESSOR_MANUFACTURER).item(0).getTextContent());
            processor.setNoc(Integer.parseInt(processorElement.getElementsByTagName(IDOMEnum.ISpecification.PROCESSOR_NOC).item(0).getTextContent()));
            processor.setFrequency(processorElement.getElementsByTagName(IDOMEnum.ISpecification.PROCESSOR_FREQUENCY).item(0).getTextContent());
            specification.setProcessor(processor);

            mobilePhone.setSpecification(specification);
            mobilePhones.add(mobilePhone);
        }
        LOGGER.info(mobilePhones);
    }

    public static void main(String[] args) {
        RealDom realDom = new RealDom();
        try {
            realDom.run();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        }
    }
}


