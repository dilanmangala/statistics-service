package com.statistics.service.dto;

import java.util.Date;

import lombok.Data;

@Data
public class StatisticsDetailsDto {
	
	private String ipAddress;
	
	private String userName;

	private Date registerDate;

}
