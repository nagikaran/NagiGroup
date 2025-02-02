package com.nagi.controller;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagi.dto.user.LoginResponseDto;
import com.nagi.dto.user.UserDto;
import com.nagi.model.user.User;
import com.nagi.service.UserService;
import com.nagi.utility.ApiResponse;


@CrossOrigin("*")
@RestController
@RequestMapping("api/user")
public class UserController {
	private Logger infoLogger = Logger.getLogger("info");
	private UserService userService = null;
	public UserController(UserService userService) {
		// TODO Auto-generated constructor stub
		this.userService=userService;
	}
	
	/**
	 * To get User Login
	 * 
	 * @author Karan
	 * @date 01-08-2025
	 * @return List of appropriate Model / DTO class
	 * @function = user_login
	 */
	@GetMapping(value = "/login")
	public ApiResponse<LoginResponseDto>  userLogin(@ModelAttribute User user) {
		LoginResponseDto loginResponseDto = new LoginResponseDto();
		System.out.println("User details "+user.getLogin_user_id()+":"+user.getPassword());
		UserDto userDto  = userService.loadUserByUsername(user);
		loginResponseDto.setFirst_name(userDto.getFirst_name());
		//String authorizeToken = authorizeTokenController.getAuthorizeToke(userDto.getLogin_user_id(),userDto.getRole_name());
		
		return new ApiResponse<LoginResponseDto>(true,
				"valid user credential", true, loginResponseDto, 1);
	
	}
	
	

}
