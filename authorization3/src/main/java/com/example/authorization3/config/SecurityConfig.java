package com.example.authorization3.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

/**
 * <h3>conteiner</h3>
 * <p>Description: </p>
 *
 * @Author: Krustalev_Ivan
 * @date : 2023-10-30 22:54
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig {
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) {
        try {
            return http
                    .userDetailsService(detailsService())
                    .securityMatcher("/**")
                    .authorizeHttpRequests(r -> r.anyRequest().authenticated())
                    .formLogin(form -> form
                            .loginPage("/login")
                            .permitAll()
                            .successForwardUrl("/afterLogin")
                    )
                    .csrf(Customizer.withDefaults())
                    .build();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    @Bean
    public UserDetailsService detailsService() {
        User.UserBuilder users = User.withDefaultPasswordEncoder();
        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
        manager.createUser(users.username("user").password("password").roles("USER").build());
        manager.createUser(users.username("admin").password("password").roles("USER","ADMIN").build());
        return manager;
    }

}
