package com.solvd.laba.parsers.jaxb;

import com.solvd.laba.parsers.models.*;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class JaxbWriter {
    private static final Logger LOGGER = LogManager.getLogger(JaxbWriter.class);

    public static void marshal() {
        BatteryBuilder builder = new BatteryBuilder();
        Battery battery = new Battery(builder);
        battery.setManufacturer("Samsung");
        battery.setCapacity(3450);
        battery.setPrice(27);

        Display display = new Display();
        display.setManufacture("Samsung");
        display.setType("OLED");
        display.setInch(6.1);
        display.setPrice(110);

        Memory memory = new Memory();
        memory.setName("SamDc");
        memory.setCapacity(256);
        memory.setPrice(55);

        Processor processor = new Processor();
        processor.setName("Exynos");
        processor.setFrequency("1.8 - 3.2");
        processor.setNoc(6);

        Specification specification = new Specification();
        specification.setBattery(battery);
        specification.setDisplay(display);
        specification.setMemory(memory);
        specification.setProcessor(processor);

        MobileStore mobileStore = new MobileStore();
        mobileStore.setName("TELE2");
        mobileStore.setAddress("6 Vera Khoruzhey Street");


        MobilePhone mobilePhone = new MobilePhone();
        mobilePhone.setName("Samsung S22");
        mobilePhone.setYear(2022);
        mobilePhone.setImei(1234431344);
        mobilePhone.setPrice(1300);
        mobilePhone.setSpecification(specification);
        mobilePhone.setMobileStore(mobileStore);

        try {
            JAXBContext context = JAXBContext.newInstance(MobilePhone.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(mobilePhone, new File("src/main/resources/mobilePhone_jaxb.xml"));
        } catch (JAXBException e) {
            LOGGER.info(e);
        }
    }

    public static MobilePhone unmarshal() throws JAXBException, FileNotFoundException {
        JAXBContext jaxbContext = JAXBContext.newInstance(MobilePhone.class);
        return (MobilePhone) jaxbContext.createUnmarshaller()
                .unmarshal(new FileReader("src/main/resources/mobilePhone_jaxb.xml"));
    }

    public static void main(String[] args) {
        JaxbWriter.marshal();
        MobilePhone mobilePhone = new MobilePhone();

        try {
            mobilePhone = JaxbWriter.unmarshal();
            LOGGER.info(mobilePhone);
        } catch (JAXBException e) {
            LOGGER.info(e);
        } catch (FileNotFoundException e) {
            LOGGER.info(e);
        }
    }
}

