package com.hotel.entities;

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
@Table(name = "micro_hotel")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Hotel {
	
	@Id
	@Column(name = "id")
	private Long hotel_id;
	
	private String name;
	
	private String location;
	
	private String about;
}
