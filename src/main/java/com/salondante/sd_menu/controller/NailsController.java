package com.salondante.sd_menu.controller;

import com.salondante.sd_menu.service.NailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/nailServices")
public class NailsController {
    @Autowired
    private NailsService nailsService;

}
