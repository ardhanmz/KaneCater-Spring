package com.ardhanmz.kanecater.controller;

import java.sql.Timestamp;
import java.util.List;

import com.ardhanmz.kanecater.model.MsUserEntity;
import com.ardhanmz.kanecater.response.UserResponse;
import com.ardhanmz.kanecater.util.Tools;
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
    public String getAll() {
        Gson gson = new Gson();
        UserListResponse response = new UserListResponse();
        List<MsUserEntity> listUser = userService.getAll();
        if (!listUser.isEmpty()) {
            response.setStatus(Global.RESPONSE_SUCCESS);
            response.setCode(Global.RESPONSE_SUCCESS_CODE);
            response.setListUser(listUser);
        } else {
            response.setStatus(Global.RESPONSE_FAILED);
            response.setCode(Global.RESPONSE_FAILED_CODE);
        }
        return gson.toJson(response);
    }

    @GetMapping("/user/{id}")
    public String getUserByID(@PathVariable int id) {
        Gson gson = new Gson();
        UserResponse response = new UserResponse();
        MsUserEntity msUserEntity = userService.getOneById(id);
        if (null != msUserEntity) {
            response.setStatus(Global.RESPONSE_SUCCESS);
            response.setCode(Global.RESPONSE_SUCCESS_CODE);
            response.setUserEntity(msUserEntity);
        } else {
            response.setStatus(Global.RESPONSE_FAILED);
            response.setCode(Global.RESPONSE_FAILED_CODE);
            response.setUserEntity(null);
        }
        return gson.toJson(response);
    }

    @PostMapping("/user")
    public String save(@RequestBody UserSaveRequest userSaveRequest) {
        ResponseType response = new ResponseType();
        Gson gson = new Gson();
        if (null != userSaveRequest) {
            userService.save(convertFromJson(userSaveRequest));
            response.setStatus(Global.RESPONSE_SUCCESS);
            response.setCode(Global.RESPONSE_SUCCESS_CODE);
        } else {
            response.setStatus(Global.RESPONSE_FAILED);
            response.setCode(Global.RESPONSE_FAILED_CODE);
        }
        return gson.toJson(response);
    }

    @PutMapping("/user")
    public String update(@RequestBody UserSaveRequest userSaveRequest) {
        ResponseType response = new ResponseType();
        Gson gson = new Gson();
        if (null != userSaveRequest) {
            MsUserEntity msUserEntity = userService.getOneById(userSaveRequest.getUserData().getUuidMsUser());
            if (null != msUserEntity) {
                msUserEntity.setDtmUpd(new Timestamp(System.currentTimeMillis()));
                msUserEntity.setUsrUpd(userSaveRequest.getUserData().getUsrUpd());
                msUserEntity.setUserName(userSaveRequest.getUserData().getUserName());
                msUserEntity.setFullName(userSaveRequest.getUserData().getFullName());
                msUserEntity.setPassword(userSaveRequest.getUserData().getPassword());
                msUserEntity.setEmail(userSaveRequest.getUserData().getEmail());
                msUserEntity.setRole(userSaveRequest.getUserData().getRole());
                msUserEntity.setImage(userSaveRequest.getUserData().getImage());
                userService.update(msUserEntity);
            }
            response.setStatus(Global.RESPONSE_SUCCESS);
            response.setCode(Global.RESPONSE_SUCCESS_CODE);
        } else {
            response.setStatus(Global.RESPONSE_FAILED);
            response.setCode(Global.RESPONSE_FAILED_CODE);
        }
        return gson.toJson(response);
    }

    @DeleteMapping("/user/{id}")
    public String deleteByUserId(@PathVariable int id) {
        ResponseType response = new ResponseType();
        Gson gson = new Gson();
        int resultCode = userService.delete(id);
        if (resultCode != 99) {
            response.setStatus(Global.RESPONSE_SUCCESS);
            response.setCode(Global.RESPONSE_SUCCESS_CODE);
        } else {
            response.setStatus(Global.RESPONSE_FAILED);
            response.setCode(Global.RESPONSE_FAILED_CODE);
        }
        return gson.toJson(response);
    }

    private MsUserEntity convertFromJson(UserSaveRequest userSaveRequest) {
        MsUserEntity msUserEntity = new MsUserEntity();
        msUserEntity.setUserName(userSaveRequest.getUserData().getUserName());
        msUserEntity.setDtmCrt(new Timestamp(System.currentTimeMillis()));
        msUserEntity.setUsrCrt(userSaveRequest.getUserData().getUsrCrt());
        msUserEntity.setPassword(userSaveRequest.getUserData().getPassword());
        msUserEntity.setFullName(userSaveRequest.getUserData().getFullName());
        msUserEntity.setRole(userSaveRequest.getUserData().getRole());
        msUserEntity.setEmail(userSaveRequest.getUserData().getEmail());
        msUserEntity.setImage(userSaveRequest.getUserData().getImage());
        return msUserEntity;
    }
}
