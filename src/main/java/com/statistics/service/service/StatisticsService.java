package com.statistics.service.service;

import com.statistics.service.domain.Statistics;
import com.statistics.service.dto.StatisticsDetailsDto;

public interface StatisticsService {
	
	Statistics saveStatisticsDetails(StatisticsDetailsDto statisticsDetailsDto);
	Statistics getStatisticsDetails(String idAddress);
}
