package com.techactivate.bootdemo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
public class User {

	@Id
	private Integer id;
	private String firstName;
	private String lastName;
	private String email;
	

}
