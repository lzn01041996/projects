package cn.edu.seu.market.user.controller;


import cn.edu.seu.market.user.entity.TUser;
import cn.edu.seu.market.user.service.ITUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author jobob
 * @since 2020-02-27
 */
@RestController
@RequestMapping("/user")
public class TUserController {
    @Autowired
    private ITUserService userService;
    @RequestMapping("/{userid}")
    public TUser getUserData(@PathVariable String userid){
        TUser user = userService.getById(userid);
        return user;
    }

}
