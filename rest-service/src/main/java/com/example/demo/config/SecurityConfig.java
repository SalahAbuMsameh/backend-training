package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * 
 * Aug 11, 2021
 * @author Salah Abu Msameh
 */
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	/**@Autowired
	public void configAuthManager(AuthenticationManagerBuilder authMgrBuilder) throws Exception {
		
		authMgrBuilder.inMemoryAuthentication()
			.withUser("user")
			.password(passwordEncoder().encode(""))
			.authorities("ROLE_ADMIN");//use ROLE_ prefix to define systems roles
	}*/
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http.authorizeRequests()
			.antMatchers(HttpMethod.GET, "/students/**").authenticated()
			.antMatchers("/students/**").hasRole("ADMIN")
			//.antMatchers("/registration").permitAll()
		.and()
			.formLogin()
			//.loginPage("/login-custom-page.html")
			//.loginProcessingUrl("/custom-login")
		.and()
			.httpBasic();
	}
	
	/**
	 * 
	 * @return
	 */
	@Bean
	public PasswordEncoder passwordEncoder() {
		
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		//System.out.println(encoder.encode("salah"));
		
		return encoder;
	}
}
