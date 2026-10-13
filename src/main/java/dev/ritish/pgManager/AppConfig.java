package dev.ritish.pgManager;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
  @Bean
  ModelMapper gotMapper() {
    return new ModelMapper();
  }
}
