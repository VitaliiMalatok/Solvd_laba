package com.solvd.laba.xml.parser.jaxb.model;
import com.solvd.laba.xml.parser.jaxb.model.Family;
import jakarta.xml.bind.annotation.*;

import java.util.List;


@XmlRootElement(name="FosterHome")
@XmlAccessorType(XmlAccessType.FIELD)
public class FosterHome {

    @XmlElement(name="Orphanage")
    private String orphanage;

    @XmlElement(name="Location")
    private String location;

    @XmlElementWrapper(name="Families")
    @XmlElement(name="Family")
    private List<Family> families;

    @XmlElementWrapper(name="RemainingChildList")
    @XmlElement(name="ChildID")
    private List<String> remainingChildren;

}
