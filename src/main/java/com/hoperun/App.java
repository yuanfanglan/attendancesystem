package com.hoperun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * @author yfl
 * @date 创建时间：2017年12月20日 上午9:34:08
 * @version 1.0
 */
@SpringBootApplication
public class App extends SpringBootServletInitializer {
    //此方法为需要使用jsp模板需要实现的方法
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		// TODO Auto-generated method stub
		return builder.sources(App.class);
	}

	//程序入口
	public static void main(String[] args) {

		SpringApplication.run(App.class, args);
		System.out.println("成功");
	}
}
