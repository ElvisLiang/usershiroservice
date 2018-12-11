package com.shiroproject.usershiroservice;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.datasource.DataSourceFactory;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

@SpringBootApplication
@MapperScan("com.shiroproject.usershiroservice.dao")
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class UsershiroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsershiroserviceApplication.class, args);
	}


	@Bean
	@ConfigurationProperties(prefix="spring.datasource.druid")
	public DataSource getBataSource(){
		return  new DruidDataSource();
	}


}
