package com.salondante.sd_menu.model;

import org.springframework.stereotype.Component;

@Component
public class ItemRecord {
    private Integer recordId;
    private Integer recordSectionId;
    private Integer recordSubSectionId;
    private String recordText;
    private Long recordPrice;
    private Integer recordAddOnId;
    private String recordAddOnText;
    private String recordAddOnPrice;
    private Integer recordOrder;
    private Boolean recordAndUp;
}