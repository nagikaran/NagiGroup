package com.nagi.service;

import org.springframework.stereotype.Service;

import com.nagi.dto.user.UserDto;
import com.nagi.model.user.User;
@Service
public interface UserService {

	UserDto loadUserByUsername(User user);
	

}
