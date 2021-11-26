package com.example.circularreferencetest.service;

import com.example.circularreferencetest.service.config.JobConfig;
import com.example.circularreferencetest.service.strategy.BaseHolidayCalculateService;
import com.example.circularreferencetest.service.strategy.HolidayStrategyFactory;
import org.springframework.stereotype.Service;


@Service
public class FranceCalculateService extends BaseHolidayCalculateService {

    public FranceCalculateService(HolidayStrategyFactory holidayStrategyFactory,
                                  JobConfig jobConfig) {


        super(holidayStrategyFactory,
                jobConfig);

    }

}
