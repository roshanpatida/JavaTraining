package com.springnewfeatures.postgres.Config;




import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
		entityManagerFactoryRef = "secondentityManagerFactoryBean",
		basePackages = {"com.springnewfeatures.postgres.Repository"},
		transactionManagerRef = "secondtransactionManager"
		)
public class ProductConfig {
	
	@Autowired
private Environment environment;
	//datasource
    @Bean("seconddatasource")
    @Primary
	public DataSource datasource() {
		DriverManagerDataSource datasource = new DriverManagerDataSource();
		datasource.setUrl(environment.getProperty("spring.seconddatasource.url"));
		datasource.setDriverClassName(environment.getProperty("spring.seconddatasource.driver-class-name"));
		datasource.setUsername(environment.getProperty("spring.seconddatasource.username"));
		datasource.setPassword(environment.getProperty("spring.seconddatasource.password"));
		return datasource;

	}
    
			//entityManagerFactory
			@Bean(name ="secondentityManagerFactoryBean")
			@Primary
			public LocalContainerEntityManagerFactoryBean entityManagerFactoryBean() {
				
				LocalContainerEntityManagerFactoryBean bean = new LocalContainerEntityManagerFactoryBean();
				bean.setDataSource(datasource());
				JpaVendorAdapter adaptor = new HibernateJpaVendorAdapter();
				bean.setJpaVendorAdapter(adaptor);
				Map<String, String> props = new HashMap<>();
				props.put("hibernate.dialect","org.hibernate.dialect.PostgreSQLDialect");
				props.put("hibernate.show_sql", "true");
				props.put("hibernate.hbm2ddl.auto", "update");
				bean.setJpaPropertyMap(props);
				bean.setPackagesToScan("com.springnewfeatures.postgres.Entity");
				return bean;
			}
	
	
	// platform transaction manager
	
		@Bean(name = "secondtransactionManager")
		@Primary
	public PlatformTransactionManager transactionManager() {
			JpaTransactionManager manager =new JpaTransactionManager();
			manager.setEntityManagerFactory(entityManagerFactoryBean().getObject());
		return manager;
		}
	
    }

