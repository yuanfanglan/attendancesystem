package com.hoperun.config;

import javax.sql.DataSource;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

/**
 * MyBatis配置
 * @author yfl
 * @date 创建时间：2017年12月21日 上午9:40:24
 */
@Configuration //该注解相当于一个配置类
public class MyBatisConfig {
@Autowired
private DataSource dataSource;

@Bean
@ConditionalOnMissingBean  //当容器里没有指定的Bean的情况下创建该对象
public SqlSessionFactoryBean sessionFactoryBean(){
	SqlSessionFactoryBean sessionFactoryBean=new SqlSessionFactoryBean();
	//设置数据源
	sessionFactoryBean.setDataSource(dataSource);
	//设置mybatis主配置文件
	PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
	Resource resource = resolver.getResource("classpath:mybatis/mybatis-config.xml");
	sessionFactoryBean.setConfigLocation(resource);
	//设置别名包
	sessionFactoryBean.setTypeAliasesPackage("com.hoperun.pojo");
	return sessionFactoryBean;
}
}
