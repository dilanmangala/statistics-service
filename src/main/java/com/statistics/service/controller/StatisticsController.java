package com.statistics.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.statistics.service.domain.Statistics;
import com.statistics.service.dto.StatisticsDetailsDto;
import com.statistics.service.service.StatisticsService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping(value = "statistics")
public class StatisticsController {
	
	@Autowired
	StatisticsService statisticsService;
	
	@PostMapping(value = "/add-details")
	public Statistics addStatisticsDetails(@RequestBody StatisticsDetailsDto statisticsDto) {
		
		log.info("start statistics details inserting");
		Statistics statistics = statisticsService.saveStatisticsDetails(statisticsDto);
		log.info("end statistics details inserting");
		return statistics;
		
	}
	
	@GetMapping(value = "/get-details")
	public Statistics getStatisticsDetails(@RequestParam String ipAddress) {
		log.info("start statistics details obtaining");
		Statistics statistics = statisticsService.getStatisticsDetails(ipAddress);
		log.info("end statistics details obtaining");
		return statistics;
	}

}
