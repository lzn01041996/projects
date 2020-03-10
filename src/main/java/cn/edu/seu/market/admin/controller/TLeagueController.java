package cn.edu.seu.market.admin.controller;


import cn.edu.seu.market.admin.entity.TLeague;
import cn.edu.seu.market.admin.service.ITLeagueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author jobob
 * @since 2020-02-27
 */
@Controller
@RequestMapping("/admin")
public class TLeagueController {

    @Autowired
    private ITLeagueService leagueService;

    @RequestMapping("/leagueform")
    public String viewLeagueForm(){
        return "admin/AddLeague";
    }

    @RequestMapping(value = "/addleague",method = {RequestMethod.POST})
    public String addLeague(TLeague league, Model model){
        if (league.getTitle().equals("")||league.getYear().equals("")){
            return "admin/AddLeague";
        }
        else{
            leagueService.save(league);
            model.addAttribute("league",league);
            return "admin/AddLeagueSucc";
        }

    }

}
