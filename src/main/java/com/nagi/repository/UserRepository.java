package com.nagi.repository;

import org.springframework.stereotype.Repository;

import com.nagi.QueryMaster;
import com.nagi.connection.web.DbContextService;
import com.nagi.dto.user.UserDto;
import com.nagi.model.user.User;
import com.nagi.service.UserService;
@Repository
public class UserRepository implements UserService {
	
	private DbContextService dbContextserviceBms;
	public UserRepository(DbContextService dbContextserviceBms) {
		this.dbContextserviceBms=dbContextserviceBms;
	}

	@Override
	public UserDto loadUserByUsername(User user) {
		System.out.println("hello");
		Object[] param = { user.getLogin_user_id(), user.getPassword() };
        try {
            // Query the database for user login and return UserDto
            UserDto userDto = dbContextserviceBms.QueryToFirstWithParam(QueryMaster.user_login, param, UserDto.class);
            System.out.println("userDto---->>>> " + userDto);
            return userDto;
        } catch (Exception e) {
            System.err.println("Error during user login: " + e.getMessage());
            return null;  // Return null or throw a custom exception
        }
	}

}
