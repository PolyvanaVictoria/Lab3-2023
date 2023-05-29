package ua.kpi.its.lab.rest.entity

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
open class ApplicationConfig {

    @Bean
    open fun hospitalContainer(): HospitalContainer {
        return HospitalContainer()
    }
}