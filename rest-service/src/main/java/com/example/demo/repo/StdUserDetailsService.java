package com.example.demo.repo;

import java.util.Collection;
import java.util.Collections;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * 
 * Aug 11, 2021
 * @author Salah Abu Msameh
 */
@Service
public class StdUserDetailsService implements UserDetailsService {
	
	//UserRepo
	

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		//userRepo.findByUsername(String name);
		
		if(!"salah".equals(username)) {
			throw new UsernameNotFoundException("Username or password is not correct!!");
		}
		
		return new UserDetails() {
			
			@Override
			public boolean isEnabled() {
				return true;
			}
			
			@Override
			public boolean isCredentialsNonExpired() {
				return true;
			}
			
			@Override
			public boolean isAccountNonLocked() {
				return true;
			}
			
			@Override
			public boolean isAccountNonExpired() {
				return true;
			}
			
			@Override
			public String getUsername() {
				return "salah";
			}
			
			@Override
			public String getPassword() {
				return "$2a$10$k79FRH9nEVZsiw6tO8U28OA2/xgZrAkXLAZnAAaGlvDLXH9VoL6Xm";
			}
			
			@Override
			public Collection<? extends GrantedAuthority> getAuthorities() {
				return Collections.EMPTY_LIST;
			}
		};
	}

}
