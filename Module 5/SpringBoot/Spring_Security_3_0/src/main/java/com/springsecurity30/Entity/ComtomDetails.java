package com.springsecurity30.Entity;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
				 	 
public class ComtomDetails implements UserDetails {
	 public User user;

	
	 
	    public ComtomDetails(User user) {
		super();
		this.user = user;
	}


		public Collection<? extends GrantedAuthority> getAuthorities() {
	    	HashSet<SimpleGrantedAuthority> set = new HashSet<>();
			set.add(new SimpleGrantedAuthority(this.user.getRole()));
			return set;
		}
	    

	    @Override
	    public String getPassword() {
	        return user.getPassword();
	    }

	    @Override
	    public String getUsername() {
	        return user.getName();
	    }


	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}


}
