package com.spring.jdbc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.dao.StudentDaoImpl;

@Configuration // using this we can removed .xml file 
@ComponentScan(basePackages="com.spring.jdbc.dao;")
public class JdbcConfig {
// we need to create methods for all bean which was make in the .xml file because we want to remove xml file so for that facilities we create a saperate class for declared all the beans and property and 
	// we create the object of the that class which is declared in the xml file and just we create here the object of implementing class which is iplements the DriverManager class
	@Bean("ds")
	public DriverManagerDataSource getDataSource() {// it is a bean of DataSource
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbc?openSSL=false");
		ds.setUsername("root");
		ds.setPassword("root");
		return ds;
	}
	
	@Bean("jdbcTemplate")
	public JdbcTemplate getTemplate() {// it a bean of JdbcTemplate 
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		
		return jdbcTemplate;
		
	}
	
//	
//	@Bean("studentDao")
//	public StudentDao getStudentDao() {// it is a bean of StudentDao
//		StudentDaoImpl studentDao= new StudentDaoImpl();
//		studentDao.setJdbcTemplate(getTemplate());
//		return studentDao;
//	}
	
	// we does use autowiring for  remove studentSDao bean 
}
