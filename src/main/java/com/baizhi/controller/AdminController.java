package com.baizhi.controller;

import com.baizhi.entity.Admin;
import com.baizhi.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    AdminService adminService;

    @RequestMapping("/regist")
    public String regist(Admin admin,String code,HttpServletRequest request){
        Object validateCode = request.getSession().getAttribute("code");
        if(code.equals(validateCode)) {
            if(admin.getSex().equals("m")){
                admin.setSex("男");
            }else{
                admin.setSex("女");
            }
            adminService.save(admin);
            return "redirect:/back/login.jsp";
        }else {
            return "redirect:/back/regist.jsp";
        }
    }

    @RequestMapping("/login")
    public String login(HttpServletRequest request,String name,String password){
        Admin admin = adminService.queryByUsernameAndPassword(name, password);
        if(admin!=null){
            request.getSession().setAttribute("admin",admin);
            return "redirect:/empl/findAll";
        }else{
            return "redirect:/back/login.jsp";
        }
    }
}
