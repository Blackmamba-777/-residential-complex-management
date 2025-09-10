package com.exe.residentialcomplexmanagement.Config;


import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperConfig {

    //Define el bean ModelMapper
    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

}
