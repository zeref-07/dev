package com.main.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

/**
 * 数据库sqlSession配置类
 */
@Configuration
public class SessionFactoryConfiguration {
    @Value("${mybatis.mapper-locations}")
    private String mybatisMapper;

    public String getMybatisMapper() {
        return mybatisMapper;
    }

    @Autowired
    private DataSource dataSource;

    /**
     * 数据库sqlSessionFactory作成
     * @return SqlSessionFactory
     * @throws Exception
     */
    @Bean
    public SqlSessionFactory createSqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        String packageSearchPath = PathMatchingResourcePatternResolver.CLASSPATH_ALL_URL_PREFIX + mybatisMapper;
        sqlSessionFactoryBean.setMapperLocations(resolver.getResources(packageSearchPath));
        sqlSessionFactoryBean.setDataSource(dataSource);
        return sqlSessionFactoryBean.getObject();
    }
}
