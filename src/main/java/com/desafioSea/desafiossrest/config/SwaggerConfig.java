package com.desafioSea.desafiossrest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket(DocumentationType.SWAGGER_2)
    .select()
    .apis(RequestMandleSelectores.basePackage("com.projeto.SeaSolution"))
            .paths(regex("/api.*")
    .build()
    .apiInfo(metaInfo());
}

    private ApiInfo metaInfo() {
        ApiInfo apiInfo = new ApiInfo(
                "Desasio SEA API",
                "API REST da SEA",
                "1.0",
                "Terms of Service",
                new Contact("Rodrigo Oliveira", "https://www.linkedin.com/in/rodrigo-oliveira-dev/", "rodrigo.deoliveira552@gmail.com"),
                "Apache License Version 2.0",
                "http://www.apache.org.license.html", new ArrayList<VendorExtencios>()
        );
        return apiInfo;

    }

}