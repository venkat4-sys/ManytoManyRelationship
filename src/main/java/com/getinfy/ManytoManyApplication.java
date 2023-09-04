package com.getinfy;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.getinfy.entity.RoleEntity;
import com.getinfy.entity.UserEntity;
import com.getinfy.repo.UserRepo;

@SpringBootApplication
public class ManytoManyApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(ManytoManyApplication.class, args);
		
		UserRepo userRepo = context.getBean(UserRepo.class);
		
		
		UserEntity entity=new UserEntity();
		
		entity.setUserId(1);
		entity.setFirstName("venkat");
		entity.setLastName("kilari");
		entity.setEmail("venkatkilari5@gmail.com");
		
		
		RoleEntity r1=new RoleEntity(1, "User");
		RoleEntity r2=new RoleEntity(2, "Admin");
		
		entity.setRentity(Arrays.asList(r1,r2));
		
		userRepo.save(entity);
	}

}
