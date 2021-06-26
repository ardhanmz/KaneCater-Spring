package com.ardhanmz.kanecater.controller;

import java.util.List;

import com.ardhanmz.kanecater.model.MsUserEntity;
import com.ardhanmz.kanecater.util.http.ResponseType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ardhanmz.kanecater.service.UserService;
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
		List<MsUserEntity> listUser = userService.getAll();
		if (!listUser.isEmpty()) {
			response.setStatus(Global.RESPONSE_SUCCESS);
			response.setCode(Global.RESPONSE_SUCCESS_CODE);
			response.setListUser(listUser);
			return gson.toJson(response);
		} else {
			response.setStatus(Global.RESPONSE_FAILED);
			response.setCode(Global.RESPONSE_FAILED_CODE);
			return gson.toJson(response);
		}
	}
	
	@PostMapping("/user")
	public String save(@RequestBody UserSaveRequest userSaveRequest) {
		ResponseType response = new ResponseType();
		Gson gson = new Gson();
		if (null != userSaveRequest) {
			userService.save(userSaveRequest.getUserData());
			response.setStatus(Global.RESPONSE_SUCCESS);
			response.setCode(Global.RESPONSE_SUCCESS_CODE);
			return gson.toJson(response);
		} else {
			response.setStatus(Global.RESPONSE_FAILED);
			response.setCode(Global.RESPONSE_FAILED_CODE);
			return gson.toJson(response);
		}
	}

	@PutMapping("/user")
	public String update(@RequestBody UserSaveRequest userSaveRequest) {
		return "hahaha";
	}
	
}
