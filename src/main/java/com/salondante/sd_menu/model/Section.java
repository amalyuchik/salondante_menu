package com.salondante.sd_menu.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Section {
    private Integer sectionId;
    private String sectionName;
    private Integer sectionOrder;
    private List<ItemRecord> sectionRecords = new ArrayList<>();
    private List<Subsection> sectionSubsections = new ArrayList<>();
}