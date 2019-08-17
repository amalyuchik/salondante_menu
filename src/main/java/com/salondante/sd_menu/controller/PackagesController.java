package com.salondante.sd_menu.controller;

import com.salondante.sd_menu.service.PackagesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/packageServices")
public class PackagesController {
    @Autowired
    private PackagesService packagesService;

}
