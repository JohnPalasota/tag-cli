package com.improving.tagcli.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;


@Configuration
public class TagJdbcConfiguration {
    @Bean
    public DataSource mysqlDataSource() {
        var dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/tag?serverTimezone=UTC");
        dataSource.setUsername("johnlocal");
        dataSource.setPassword("password!");
        return dataSource;
    }
}
