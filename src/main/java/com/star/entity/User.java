package com.star.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long userId;
	private String userName;
	private String userType;
	
	@OneToMany(mappedBy="user")
	private List<UserEquipment> userEquipments;
	
	
	@OneToMany(mappedBy="user",cascade=CascadeType.ALL)
	private List<Equipment> equipments;
}
