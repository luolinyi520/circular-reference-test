package com.example.circularreferencetest.service.strategy;

import com.example.circularreferencetest.service.config.JobConfig;


public class BaseHolidayCalculateService {

    protected HolidayStrategyFactory holidayStrategyFactory;
    protected JobConfig jobConfig;


    public BaseHolidayCalculateService(
            HolidayStrategyFactory holidayStrategyFactory,
            JobConfig jobConfig) {
        this.holidayStrategyFactory = holidayStrategyFactory;
        this.jobConfig = jobConfig;
    }

}