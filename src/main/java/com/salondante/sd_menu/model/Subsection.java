package com.salondante.sd_menu.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Subsection {
    private Integer sectionId;
    private Integer subsectionId;
    private String subsectionName;
    private Integer subsectionOrder;
    private Integer subsectionImageId;
    private ImageRecord subsectionImage = new ImageRecord();
    private List<ItemRecord> subsectionRecords = new ArrayList<>();
}