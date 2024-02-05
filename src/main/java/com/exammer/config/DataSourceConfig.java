package com.exammer.config;

import com.zaxxer.hikari.HikariConfig;

import com.zaxxer.hikari.HikariDataSource;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;
import java.sql.SQLException;


@Configuration
@PropertySource({"classpath:application.properties"})
public class DataSourceConfig extends HikariConfig {

    @Autowired
    private Environment env;

    @Bean(name="exammer")
    @Primary
    public DataSource getConfigurationDataSource() throws SQLException
    {
        HikariConfig config = new HikariConfig();
//        config.setAutoCommit(Boolean.parseBoolean(env.getProperty("spring.datasource.hikari.autoCommit")));
//        config.setConnectionTimeout(Long.parseLong(env.getProperty("spring.datasource.hikari.connectionTimeout")));
//        config.setMinimumIdle(Integer.parseInt(env.getProperty("spring.datasource.hikari.minimumIdle")));
//        config.setMaximumPoolSize(Integer.parseInt(env.getProperty("spring.datasource.hikari.maximumPoolSize")));
//        config.setIdleTimeout(Integer.parseInt(env.getProperty("spring.datasource.hikari.idleTimeout")));
//        config.setMaxLifetime(Integer.parseInt(env.getProperty("spring.datasource.hikari.maxLifetime")));
        config.setJdbcUrl(env.getProperty("spring.datasource.url"));
        config.setPassword(env.getProperty("spring.datasource.password"));
        config.setUsername(env.getProperty("spring.datasource.username"));
        config.setDriverClassName(env.getProperty("spring.datasource.driverClassName"));

        return new HikariDataSource(config);
    }
}
