package com.example.circularreferencetest.service;

import com.example.circularreferencetest.service.config.JobConfig;
import com.example.circularreferencetest.service.strategy.HolidayStrategyFactory;


public class AnnualCalculateStrategyJob {

    private JobConfig jobConfig;

    private HolidayStrategyFactory holidayStrategyFactory;

    public AnnualCalculateStrategyJob(JobConfig jobConfig,
                                      HolidayStrategyFactory holidayStrategyFactory) {
        this.jobConfig = jobConfig;
        this.holidayStrategyFactory = holidayStrategyFactory;
    }


}