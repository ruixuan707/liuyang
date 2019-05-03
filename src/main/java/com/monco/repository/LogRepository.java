package com.monco.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.monco.entity.Log;

/**
 * 系统日志Repository接口
 * @author java1234 小锋 老师
 *
 */
public interface LogRepository extends JpaRepository<Log, Integer>,JpaSpecificationExecutor<Log>{

	
}
