package com.karol.rogozinski.kursspring.config;

import com.karol.rogozinski.kursspring.domain.repository.DBKnightRepository;
import com.karol.rogozinski.kursspring.domain.repository.InMemoryRepository;
import com.karol.rogozinski.kursspring.domain.repository.KnightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;

import javax.naming.AuthenticationException;

@Configuration
public class MainConfig {

    @Bean(name="inMemoryKnightRepository")
    @Profile("dev")
    public KnightRepository createInMemoryRepo(){
        KnightRepository repo = new InMemoryRepository();
        return repo;
    }

    @Bean(name="DBKnightRepository")
    @Profile("prod")
    public KnightRepository createDBRepo(){
        KnightRepository repo = new DBKnightRepository();
        return repo;
    }

}
