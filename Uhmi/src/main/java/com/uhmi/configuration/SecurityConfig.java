package com.uhmi.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.*;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth
            .inMemoryAuthentication()
                .withUser("petro.yurchyshyn.it@gmail.com").password("admin").roles("ADMIN");
    }
    
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .authorizeRequests()
            	.antMatchers("/resources/**").permitAll()
            	.antMatchers("/administrator/**").hasRole("ADMIN")
                .and()
            .formLogin()
                .loginPage("/login")
                .permitAll()
                .and()
            .logout()                                    
                .permitAll()
        		.logoutSuccessUrl("/");
    }
}