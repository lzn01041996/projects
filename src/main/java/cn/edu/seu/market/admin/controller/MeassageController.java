package cn.edu.seu.market.admin.controller;/*
@李子宁
Happy,happy everyday!
冲鸭！
*/

import cn.edu.seu.market.admin.entity.TLeague;
import cn.edu.seu.market.admin.service.ITLeagueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MeassageController {
    @Autowired
    private ITLeagueService leagueService;

    @RequestMapping("/confirm")
    public String confirm(String title){
        String msg="";

        if (title==null||title==""){
            msg="标题不能为空！";
        }else {
            msg="ok";
        }
        List<TLeague> list = leagueService.list();
        for (TLeague league : list)
            if (league.getTitle().equals(title)){
                msg="标题已存在！";
            }
        return msg;
    }
    @RequestMapping("/confirms")
    public String confirms(String year){
        String msg="";
        if(year==null||year==""){
            msg="日期不能为空！";
        }else {
            msg="ok";
        }
        return msg;
    }
}
