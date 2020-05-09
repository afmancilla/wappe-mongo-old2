package com.prueba;

import com.mongodb.MongoClientOptions;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MongoDbSettings {

    @Bean
    public MongoClientOptions mongoOptions() {

        int minuto = 90000000*10;


        return MongoClientOptions.builder()
                .socketKeepAlive(true)
                .socketTimeout(minuto)
                .serverSelectionTimeout(minuto)
                .connectTimeout(minuto)
                .build();
    }

}
