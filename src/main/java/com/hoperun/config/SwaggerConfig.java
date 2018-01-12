package com.hoperun.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * swagger2相关配置
 * @author yfl
 * @date 创建时间：2017年12月25日 下午3:54:38
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
	private ApiInfo getApiInfo(){
        return new ApiInfoBuilder()
                .title("考勤系统")
                .contact("yfl")
                .description("关于考勤系统的方法接口")
                .license("Apache 2.0")
                .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html")
                .termsOfServiceUrl("")
                .version("1.0")
                .build();
    }
    @Bean
    public Docket getDocket(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(getApiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.hoperun.web.controller"))
                .paths(PathSelectors.any())
                .build();
    }
	
	}