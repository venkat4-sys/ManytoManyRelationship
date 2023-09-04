package com.getinfy.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="role_tbl")
@AllArgsConstructor
@NoArgsConstructor
public class RoleEntity {
	
	@Id
	private Integer roleId;
	
	private String roleName;

}
