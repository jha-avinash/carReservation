package com.ea.car_reservation.configuration;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@Configuration
@EnableWebSecurity
public class AppConfiguration extends WebSecurityConfigurerAdapter {

	@Autowired
	DataSource dataSource;

	@Autowired
	public void configAuthentication(AuthenticationManagerBuilder auth) throws Exception {

		auth.jdbcAuthentication().dataSource(dataSource)
				.usersByUsernameQuery("select username, password, 1 as enabled from user where username=?")
				.authoritiesByUsernameQuery(
						"select u.username, a.role from user u, authority a where u.authority_id = a.id and u.username =?");
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		//NOTE : add the name path of form action not the jsp page
		http.authorizeRequests().antMatchers("/", "/home", "/registration","/addUser").permitAll().anyRequest().authenticated().

				and().formLogin().loginPage("/login").permitAll().and().logout().logoutSuccessUrl("/home")
				.and().exceptionHandling().accessDeniedPage("/accessdenied");
	}

	// for query based multiple user authorization

//	@Autowired
//	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//		auth.inMemoryAuthentication().withUser("admin").password("admin").roles("USER");
//	}
}
