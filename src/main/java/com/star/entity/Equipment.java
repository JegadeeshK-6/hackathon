package com.star.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Equipment {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long equipmentId;
	private String equipmentName;
	private Integer quantity;
	private String location;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
}
