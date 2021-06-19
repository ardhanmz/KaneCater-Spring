package com.ardhanmz.kanecater.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ardhanmz.kanecater.model.MsUser;
import com.ardhanmz.kanecater.model.service.UserService;
import com.ardhanmz.kanecater.request.UserSaveRequest;
import com.ardhanmz.kanecater.response.UserListResponse;
import com.ardhanmz.kanecater.util.Global;
import com.google.gson.Gson;

@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/user")
	public String getAll(){
		Gson gson = new Gson();
		UserListResponse response = new UserListResponse();
		List<MsUser> listUser = userService.getAll();
		if (!listUser.isEmpty()) {
			response.setStatus(Global.RESPONSE_SUCCESS);
			response.setCode(Global.RESPONSE_SUCCESS_CODE);
			response.setListUser(listUser);
			String responses = gson.toJson(response);
			return responses;
		} else {
			response.setStatus(Global.RESPONSE_FAILED);
			response.setCode(Global.RESPONSE_FAILED_CODE);
			String responses = gson.toJson(response);
			return responses;
		}
	}
	
	@PostMapping("/user")
	public String save(@RequestBody UserSaveRequest msUser) {
		return "ahaha";
	}
	
}
