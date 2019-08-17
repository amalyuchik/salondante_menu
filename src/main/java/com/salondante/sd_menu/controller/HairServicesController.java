package com.salondante.sd_menu.controller;

import com.salondante.sd_menu.service.HairServicesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hairServices")
public class HairServicesController {
    @Autowired
    private HairServicesService hairServicesService;

}
