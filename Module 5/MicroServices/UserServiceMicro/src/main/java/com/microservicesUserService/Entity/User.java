package com.microservicesUserService.Entity;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.sym.Name;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "micro_user")
public class User {
	
	@Id
	@Column(name = "ID")
	private String userId;
	
	@Column(name =  "NAME",length = 20)
	private String	name;
	
	@Column(name = "EMAIL")
	private String email;
	
	@Column(name = "ABOUT")
	private String about;
	
	private List<Rating> ratings = new ArrayList<>();
	
}