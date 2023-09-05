package com.java.sp.config;

import java.util.Properties;

import org.apache.commons.dbcp.BasicDataSource;
import org.hibernate.cfg.AvailableSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import com.java.sp.entitites.Employee;
import com.java.sp.entitites.SkillsEn;

@EnableWebMvc
@Configuration		// create instance of this class inside container
@ComponentScan(basePackages = {"com.java.sp.*"})
@PropertySource("classpath:database.properties")
public class SpringHibernateConfiguration {
	
	@Autowired
    Environment env;
	
	byte b = -128;		//byte --> 1byte ch
	
	@Bean		// container madhe
	public BasicDataSource dbConfiguration() {
		System.out.println("DBConfiguration method called...");
		System.out.println("Username --> " + env.getProperty("hibernate.connection.username"));
		BasicDataSource ds = new BasicDataSource();
		ds.setUsername(env.getProperty("hibernate.connection.username"));
		ds.setPassword(env.getProperty("hibernate.connection.password"));
		ds.setUrl("jdbc:mysql://localhost/spdb");
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		return ds;
	}
	
	@Bean
	public LocalSessionFactoryBean sessionFactoryConfig() {
		System.out.println("Inside sessionfactory configuration...");
		LocalSessionFactoryBean local = new LocalSessionFactoryBean();
		local.setDataSource(dbConfiguration());
		local.setAnnotatedClasses(Employee.class);
		local.setAnnotatedClasses(SkillsEn.class);
		
		local.setHibernateProperties(hibernateProps());
		return local;
	}


	private Properties hibernateProps() {
		Properties props = new Properties();
		props.put(AvailableSettings.DIALECT,"org.hibernate.dialect.MySQL8Dialect");
		props.put(AvailableSettings.HBM2DDL_AUTO,"update");
		props.put(AvailableSettings.SHOW_SQL,true);
		return props;
	}
	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setViewClass(JstlView.class);
		viewResolver.setPrefix("/WEB-INF/pages/");		//JSP pages --> java server pages --> front end --> 
		viewResolver.setSuffix(".jsp");		// MVC --> Model View Controller
		return viewResolver;
	}
	 
	 public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer){
	   configurer.enable();
	 }
	 
}
