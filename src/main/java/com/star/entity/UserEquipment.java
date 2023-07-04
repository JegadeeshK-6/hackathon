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
public class UserEquipment {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@ManyToOne
	@JoinColumn(name="userId")
	private User user;
	
	
	private Long equipmentId;
	private Long equipmentName;
	private Integer quantity;
}
