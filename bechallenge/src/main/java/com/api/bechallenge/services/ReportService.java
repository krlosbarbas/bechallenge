package com.api.bechallenge.services;

import com.api.bechallenge.models.ReportModel;
import com.api.bechallenge.repositories.IReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ReportService {

    @Autowired
    IReportRepository reportRepository;

        public ArrayList<ReportModel> productsReport(){
            return (ArrayList<ReportModel>) reportRepository.findAll();

    }
}
