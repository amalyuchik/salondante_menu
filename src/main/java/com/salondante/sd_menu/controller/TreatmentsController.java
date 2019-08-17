package com.salondante.sd_menu.controller;

import com.salondante.sd_menu.service.TreatmentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/treatmentServices")
public class TreatmentsController {
    @Autowired
    private TreatmentsService treatmentsService;
}
