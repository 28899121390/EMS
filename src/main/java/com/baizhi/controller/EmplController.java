package com.baizhi.controller;

import com.baizhi.entity.Empl;
import com.baizhi.service.EmplService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/empl")
public class EmplController {
    @Autowired
    EmplService emplService;
    @RequestMapping("/save")
    public String addEmpl(Empl empl){
        emplService.save(empl);
        return "redirect:/empl/findAll";
    }

    @RequestMapping("delete")
    public String deleteEmplById(Integer id){
        emplService.delete(id);
        return "redirect:/empl/findAll";
    }

    @RequestMapping("update")
    public String updateEmpl(Empl empl){
        emplService.update(empl);
        return "redirect:/empl/findAll";
    }

    @RequestMapping("findOne")
    public String queryOne(Integer id, HttpServletRequest request){
        Empl empl = emplService.queryOne(id);
        request.getSession().setAttribute("empl",empl);
        return "redirect:/employee/updateEmp.jsp";
    }

    @RequestMapping("findAll")
    public String queryAll(HttpServletRequest request){
        List<Empl> empls = emplService.queryAll();
        request.setAttribute("empls",empls);
        return "/employee/emplist";
    }
}
