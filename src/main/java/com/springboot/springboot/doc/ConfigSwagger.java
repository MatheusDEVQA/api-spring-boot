/*package com.springboot.springboot.doc;


import io.swagger.models.Contact;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class ConfigSwagger {

    private Contact contacto(){
        return new Contact();
    }

    private ApiInfoBuilder informacoesApi(){
        ApiInfoBuilder apiInfoBuilder = new ApiInfoBuilder();
        //corpo do info
        return apiInfoBuilder;
    }

    @Bean
    private Docket docket(){
        Docket docket = new Docket(DocumentationType.SWAGGER_2);
        //corpo do dockets
        return docket;
    }
}*/
