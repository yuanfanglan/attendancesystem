package com.hoperun.config;

import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis mapper扫描
 * @author yfl
 * @date 创建时间：2017年12月21日 上午9:33:49
 */
//该注解相当于一个配置类 
@Configuration  
//@AutoConfigureAfter保证在MyBatisConfig实例化之后再实例化该类
@AutoConfigureAfter(MyBatisConfig.class) 
public class MapperScannerConfig {
//mapper接口扫描器
	@Bean
	public MapperScannerConfigurer mapperScannerConfigurer(){
		MapperScannerConfigurer mapperScannerConfigurer=new MapperScannerConfigurer();
		mapperScannerConfigurer.setBasePackage("com.hoperun.mapper");
		return mapperScannerConfigurer;
	}
	
}
