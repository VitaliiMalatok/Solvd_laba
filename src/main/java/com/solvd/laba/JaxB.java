package com.solvd.laba;

import com.solvd.laba.xml.parser.jaxb.model.FosterHome;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;

import java.io.File;


public class JaxB {

    public static void main(String[] args) throws Exception {
        JAXBContext jc = JAXBContext.newInstance(FosterHome.class);

        Unmarshaller unmarshaller = jc.createUnmarshaller();
        FosterHome fosterHome = (FosterHome) unmarshaller.unmarshal(new File("src/main/resources/employee.xml"));

        Marshaller marshaller = jc.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(fosterHome, System.out);
    }

}