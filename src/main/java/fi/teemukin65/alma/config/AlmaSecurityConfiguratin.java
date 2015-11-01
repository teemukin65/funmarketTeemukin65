package fi.teemukin65.alma.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Created by teemu on 1.11.2015.
 */
@Configuration
public class AlmaSecurityConfiguratin extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().antMatchers("/manage/info").permitAll()
                .and()
                .authorizeRequests().antMatchers("/manage/**").authenticated()
                .and()
                .authorizeRequests().antMatchers("/**").permitAll();



    }
}
