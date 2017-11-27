package com.crayon2f.dao.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * Created by feiFan.gou on 2017/11/27 16:08.
 */
@Configurable
//为了支持注解事务，增加了@EnableTransactionManagement注解，并且反回了一个PlatformTransactionManagerBean
@EnableTransactionManagement
@MapperScan(basePackages = {"com.crayon2f.dao.mapper"}, sqlSessionFactoryRef = "sqlSessionFactory")
public class MybatisConfig {

    public DataSource init() {

        return null;
    }
}
