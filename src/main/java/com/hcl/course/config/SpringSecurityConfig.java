/*
package com.hcl.course.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.AuthenticationEntryPoint;

@Configuration
@ComponentScan(basePackages = {"com.hcl.course"})
@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    AuthenticationEntryPoint authenticationEntryPoint;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
       // return http.authorizeRequests().anyRequest().authenticated().and().formLogin().and().httpBasic();
       http.csrf().disable()
            .authorizeRequests().anyRequest().authenticated()
            .and()

               .userDetailsService(userDetailsService()).formLogin();

//               .httpBasic()
//                .authenticationEntryPoint(authenticationEntryPoint);
    }

    @Bean
    public UserDetailsService userDetailsService() {
        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
        PasswordEncoder encoder =
                PasswordEncoderFactories.createDelegatingPasswordEncoder();
                UserDetails user = User.withUsername("admin").password(encoder.encode("admin123")).roles("ADMIN")
                        .username("admin").password(encoder.encode("admin123")).roles("ADMIN")
                .build();
        manager.createUser(user);
        //manager.createUser(User.withDefaultPasswordEncoder().username("user").password("user").roles("USER").build());
        return manager;
    }

*/
/*
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.inMemoryAuthentication().withUser("mahe").password("{noop}password").roles("USER");
        auth.inMemoryAuthentication().withUser("mahe").password("{noop}password").roles("USER");
    }*//*




}
*/
