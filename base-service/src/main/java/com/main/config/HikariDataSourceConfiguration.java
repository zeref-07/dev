package com.main.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 数据库配置类
 */
@Configuration
public class HikariDataSourceConfiguration {
    @Value("${spring.datasource.driver-class-name}")
    private String jdbcDriver;
    @Value("${spring.datasource.url}")
    private String jdbcUrl;
    @Value("${spring.datasource.username}")
    private String jdbcUsername;
    @Value("${spring.datasource.password}")
    private String jdbcPassword;

    public String getJdbcDriver() {
        return jdbcDriver;
    }

    public String getJdbcUrl() {
        return jdbcUrl;
    }

    public String getJdbcUsername() {
        return jdbcUsername;
    }

    public String getJdbcPassword() {
        return jdbcPassword;
    }

    /**
     * 数据库线程池作成
     * @return HikariDataSource
     */
    @Bean(name = "dataSource")
    public HikariDataSource createDataSource() {
        HikariConfig hikariConfig = new HikariConfig();
        //设置驱动
        hikariConfig.setDriverClassName(jdbcDriver);
        //设置url
        hikariConfig.setJdbcUrl(jdbcUrl);
        //数据库帐号
        hikariConfig.setUsername(jdbcUsername);
        //数据库密码
        hikariConfig.setPassword(jdbcPassword);
        hikariConfig.addDataSourceProperty("cachePrepStmts", "true");
        hikariConfig.addDataSourceProperty("prepStmtCacheSize", "250");
        hikariConfig.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");
        return new HikariDataSource(hikariConfig);
    }
}
