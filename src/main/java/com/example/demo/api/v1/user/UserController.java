package com.example.demo.api.v1.user;

import com.example.demo.api.v1.user.model.User;
import com.example.demo.api.v1.user.serverimpl.UserServerimpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/user")
@Api(tags = "用户控制器")
public class UserController {

    @Autowired
    private UserServerimpl userServer;

    @ApiOperation(value = "获取所有用户", notes = "查询分页数据")
    @ApiImplicitParam(name = "name", value = "姓名")
    @RequestMapping("/getuserlist")
    public List<User> getUserList()
    {
        return userServer.getUserList();
    }

    @PostMapping("/register")
    public String addUser(User user)
    {
        return userServer.AddUser(user);
    }

}
