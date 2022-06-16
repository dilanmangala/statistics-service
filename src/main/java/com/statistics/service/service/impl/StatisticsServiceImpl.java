package com.statistics.service.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.statistics.service.domain.Statistics;
import com.statistics.service.dto.StatisticsDetailsDto;
import com.statistics.service.repository.StatisticsRepository;
import com.statistics.service.service.StatisticsService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class StatisticsServiceImpl implements StatisticsService{
	
	@Autowired
	StatisticsRepository statisticsRepository;
	
	/**@param
	 * This method is used to insert statistics details
	 * @Return Statistics
	 */
	@Override
	public Statistics saveStatisticsDetails(StatisticsDetailsDto statisticsDetailsDto) {
		log.info("start statistics details inserting in statistics service");
		Statistics statistics = new Statistics();
		BeanUtils.copyProperties(statisticsDetailsDto, statistics);
		statisticsRepository.save(statistics);
		log.info("end statistics details inserting in statistics service");
		return statistics;
	}
	/**@param
	 * This method is used to obtain statistics details
	 * @Return Statistics
	 */
	@Override
	public Statistics getStatisticsDetails(String idAddress) {
		log.info("start statistics details obtaining in statistics service");
		return statisticsRepository.findByIpAddress(idAddress);
	}

}
