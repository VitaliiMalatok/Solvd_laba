package com.solvd.laba.xml.parser.jaxb.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementWrapper;

import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
public class Family {

    @XmlElement(name="ParentID")
    private String parentID;

    @XmlElementWrapper(name="ChildList")
    @XmlElement(name="ChildID")
    private List<String> childList;

}
