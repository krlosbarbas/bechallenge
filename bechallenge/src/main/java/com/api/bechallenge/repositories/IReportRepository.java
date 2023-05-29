package com.api.bechallenge.repositories;

import com.api.bechallenge.models.ReportModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IReportRepository extends JpaRepository<ReportModel,Long> {


}
