package vn.hust.AniheiU.security;

import jakarta.servlet.DispatcherType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class WebSecurityConfiguration  {
    @Autowired
     UserDetailsService userDetailsService;
     @Bean
     AuthenticationProvider authenticationProvider(){
         DaoAuthenticationProvider daoAuthenticationProvider = new DaoAuthenticationProvider();
         daoAuthenticationProvider.setUserDetailsService(userDetailsService);
         daoAuthenticationProvider.setPasswordEncoder(new BCryptPasswordEncoder());
         return daoAuthenticationProvider;
     }
    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
    @Bean
    SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
        http
            .authorizeHttpRequests(auth -> auth
                .dispatcherTypeMatchers(DispatcherType.FORWARD, DispatcherType.INCLUDE).permitAll()
                .requestMatchers("/", "/css/**", "/js/**", "/icon/**", "/img/**").permitAll()
                .requestMatchers("/admin/**").hasRole("ADMIN")                
                .requestMatchers("/login", "/register").permitAll()
                .anyRequest().permitAll()
            ).csrf(csrf -> csrf.disable());
            // .formLogin(formLogin -> formLogin
            // .loginPage("/login")
            // .successHandler(customSuccessHandler())
            // .failureUrl("/login?error").permitAll())
            // .exceptionHandling(ex -> ex.accessDeniedPage("/accessDenied"));
            
        return http.build();
    }
}
