package com.nagi.config.db;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;



@Component
public class DBConfig {

	@Bean(name = "Role")
	@ConfigurationProperties(prefix = "postgresql.datasource.role")
	public DataSource dataSourceWEB() {
		return DataSourceBuilder.create().build();
	}

	@Bean(name = "jdbcTemplateRoleBasedAuthentication")
	public JdbcTemplate jdbcTemplateWEB(@Qualifier("Role") DataSource ds) {
		return new JdbcTemplate(ds);
	}


}
