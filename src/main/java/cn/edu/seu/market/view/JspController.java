package cn.edu.seu.market.view;/*
@李子宁
Happy,happy everyday!
冲鸭！
*/

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.LinkedList;
import java.util.List;

@Controller
@RequestMapping("/view")
public class JspController {
    @RequestMapping("/hello")
    public String viewHello(Model model){
        model.addAttribute("name","李子宁在学java，努力当个全栈java工程师！");
        List<String> names = new LinkedList<>();
        names.add("xi000");
        names.add("asihdia");
        model.addAttribute("names",names);
        return "hello";
    }
}
