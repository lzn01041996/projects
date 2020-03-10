package cn.edu.seu.market.visual.controller;


import cn.edu.seu.market.visual.entity.TPie;
import cn.edu.seu.market.visual.service.ITPieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author jobob
 * @since 2020-02-29
 */
@RestController
@RequestMapping("/visual")
@CrossOrigin
public class TPieController {
    @Autowired
    private ITPieService pieService;
    @RequestMapping(value = "/pie", method = {RequestMethod.GET})
    public List<TPie> getPieData(){
        return pieService.list();
    }

}
