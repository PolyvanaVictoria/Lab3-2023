package ua.kpi.its.lab.rest.config

import org.springframework.security.config.annotation.web.builders.HttpSecurity


open class WebSecurityConfigurerAdapter {

    open fun configure(http: HttpSecurity) {}
}
