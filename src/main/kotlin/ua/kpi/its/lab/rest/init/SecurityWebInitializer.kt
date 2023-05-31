package ua.kpi.its.lab.rest.init

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer
import ua.kpi.its.lab.rest.config.RootConfig
import ua.kpi.its.lab.rest.config.WebConfig


class SecurityWebInitializer : AbstractSecurityWebApplicationInitializer() {
    fun getServletMappings(): Array<String> = arrayOf("/")

    fun getRootConfigClasses(): Array<Class<*>> = arrayOf(RootConfig::class.java)

    fun getServletConfigClasses(): Array<Class<*>> = arrayOf(WebConfig::class.java)
}