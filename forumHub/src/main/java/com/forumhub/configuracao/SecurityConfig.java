package com.forumhub.configuracao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

public class SecurityConfig {
    public static SecurityConfig createSecurityConfig() {
        return new SecurityConfig();
    }

    // SecurityConfig.java
    @Configuration
    @EnableWebSecurity
    public static final class SecurityConfig extends WebSecurityConfigurerAdapter {
        @Autowired
        private JwtTokenProvider jwtTokenProvider;

        private SecurityConfig() {
        }

        @Override
        protected void configure(HttpSecurity http) throws Exception {
            http.csrf().disable();
            Object SessionCreationPolicy = null;
            http.sessionManagement().finalize(SessionCreationPolicy.STATELESS);
            http.authorizeRequests()
                    .antMatchers("/api/users/register").permitAll()
                    .anyRequest().authenticated();

            http.apply(new JwtTokenFilterConfigurer(jwtTokenProvider));
        }
    }

}
