package cl.fullstack.dbtest.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;

/*
    This class was create to set database properties in an external file to make
    our application more cleaner and readable.
 */

@Configuration
@PropertySource(value = "classpath:properties/data/data.properties")
public class DataConfig {
    // Environment object help us to use defined variables in imported properties.
    @Autowired
    private Environment environment;

    // This bean makes the connection to database. This case, Oracle database.
    @Bean
    @Primary
    public DataSource oracleDataSource() {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.url(environment.getProperty("spring.oracle.url"));
        dataSourceBuilder.username(environment.getProperty("spring.oracle.username"));
        dataSourceBuilder.password(environment.getProperty("spring.oracle.password"));
        return dataSourceBuilder.build();
    }
}
