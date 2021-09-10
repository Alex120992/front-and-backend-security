package ru.zateev.springsecuritytest.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;

import javax.servlet.http.HttpServletRequest;
import javax.sql.DataSource;
import java.util.Collections;

@Configuration

public class ConfigurationSecurity extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.cors()
                .configurationSource(new CorsConfigurationSource() { // конфигурации cors filters
                    @Override
                    public CorsConfiguration getCorsConfiguration(HttpServletRequest httpServletRequest) {
                        CorsConfiguration corsConfiguration = new CorsConfiguration();
                        corsConfiguration.setAllowCredentials(true);
                        corsConfiguration.setAllowedOrigins(Collections.singletonList("http://localhost:4200"));//любая коммуникация с этим хостом
                        corsConfiguration.setAllowedMethods(Collections.singletonList("*"));// указываем типы методов которые взаимодействуют
                        corsConfiguration.setMaxAge(3600L); // кеширование на столько секунд
                        corsConfiguration.setAllowCredentials(true); // также будут пиянты учетные данные и он будет нужен если скьюрные приложение
                        corsConfiguration.setAllowedHeaders(Collections.singletonList("*"));
                        return corsConfiguration;
                    }
                })
                .and().csrf().ignoringAntMatchers("/contact").csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse())
                .and()
                .authorizeRequests()
                .antMatchers("/myAccount").authenticated()
                .antMatchers("/myBalance").authenticated()
                .antMatchers("/myLoans").authenticated()
                .antMatchers("/contact").permitAll()
                .antMatchers("/myCards").authenticated()
                .antMatchers("/user").authenticated()
                .antMatchers("/notices").permitAll()
                .and()
                .formLogin()
                .and()
                .httpBasic();
    }
//    @Bean
//    public UserDetailsService userDetailsService(DataSource dataSource){
//        return new JdbcUserDetailsManager(dataSource);
//    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
