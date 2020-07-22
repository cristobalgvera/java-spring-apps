package com.fullstack.springsecurityjpatest.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;

@Configuration
@PropertySource(value = "classpath:properties/data/oracle.properties")
public class DataSourceConfig {
    @Autowired
    private Environment environment;

    @Bean
    @Primary
    public DataSource oracleDataSource() {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.url(environment.getProperty("spring.database.url"));
        dataSourceBuilder.username(environment.getProperty("spring.database.username"));
        dataSourceBuilder.password(environment.getProperty("spring.database.password"));
        return dataSourceBuilder.build();
    }
}
