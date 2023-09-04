package com.getinfy.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="User_tbl")
public class UserEntity {
	
	@Id
	private Integer userId;
	
	private String firstName;
	
	private String lastName;
	
	private String email;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(
            name = "users_roles",
            joinColumns = @JoinColumn(
                    name = "user_id", referencedColumnName = "userId"
            ),
            inverseJoinColumns = @JoinColumn(
                    name = "role_id", referencedColumnName = "roleId"
            )
    )
	private List<RoleEntity> rentity;

}
