package com.uhmi.configuration;

import org.springframework.security.web.context.*;

public class SecurityWebApplicationInitializer
      extends AbstractSecurityWebApplicationInitializer {

    public SecurityWebApplicationInitializer() {
        super(SecurityConfig.class);
    }
}
