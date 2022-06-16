package com.statistics.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.statistics.service.domain.Statistics;

@Repository
public interface StatisticsRepository extends JpaRepository<Statistics, Long>{
	Statistics findByIpAddress(String ipAddress);
}
