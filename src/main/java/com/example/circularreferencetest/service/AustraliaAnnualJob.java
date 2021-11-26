package com.example.circularreferencetest.service;

import com.example.circularreferencetest.service.config.JobConfig;
import com.example.circularreferencetest.service.strategy.HolidayStrategyFactory;
import org.springframework.stereotype.Component;


@Component
public class AustraliaAnnualJob extends AnnualCalculateStrategyJob {


    public AustraliaAnnualJob(JobConfig jobConfig,
                              HolidayStrategyFactory holidayStrategyFactory) {
        super(jobConfig, holidayStrategyFactory);
    }

}