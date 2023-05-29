package com.api.bechallenge.controllers;

import com.api.bechallenge.models.ReportModel;
import com.api.bechallenge.services.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/report")
public class ReportController {

    @Autowired
    private ReportService reportService;

    @GetMapping()
    public ArrayList<ReportModel> productsReport(){
        return this.reportService.productsReport();
    }
}
