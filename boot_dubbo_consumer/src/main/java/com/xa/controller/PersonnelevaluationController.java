package com.xa.controller;

import com.xa.dto.PersonnelevaluationDto;
import com.xa.pojo.Phaddevaluation;
import com.xa.pojo.User;
import com.xa.service.PersonnelevaluationService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class PersonnelevaluationController {

    @Resource
    private PersonnelevaluationService personnelevaluationService;

    //根据用户id查出追加评论
    @GetMapping("getAddvaluationByUid")
    @ResponseBody
    public List<Phaddevaluation> getAddvaluationByUid(HttpServletRequest request){
         User user =(User) request.getSession().getAttribute("user");
        int uid= user.getUid();
        List<Phaddevaluation> addvaluationByUid = personnelevaluationService.getAddvaluationByUid(uid );
        return addvaluationByUid;
    }

    @PostMapping("getUserSession")
    @ResponseBody
    public User getUser(HttpServletRequest request){
       User user =(User) request.getSession().getAttribute("user");
        return user;
    }

    //查出我的评论
    @GetMapping("getAllPingLunByUser")
    @ResponseBody
    public List<PersonnelevaluationDto> getAllPingLunByUser(HttpServletRequest request){
        User user =(User) request.getSession().getAttribute("user");
        int uid= user.getUid();
        List<PersonnelevaluationDto> allPingLunByUser = personnelevaluationService.getAllPingLunByUser(uid);
        return allPingLunByUser;
    }

    @GetMapping("getAllPingLun")
    @ResponseBody
    public List<PersonnelevaluationDto> getAllPingLun(){
        List<PersonnelevaluationDto> allPingLun = personnelevaluationService.getAllPingLun();
        return allPingLun;
    }
    @GetMapping("delPinglun/{id}")
    public String delPinglun(@PathVariable int id ){
        boolean b = personnelevaluationService.delPinglunById(id);
        System.out.println(b);
        return "redirect:http://localhost:8088/jypj.html";
    }

    @GetMapping("delAddPinglun/{id}")
    public String delAddPinglun(@PathVariable int id ){
        boolean b = personnelevaluationService.delAddPinglun(id);
        return "redirect:http://localhost:8088/jypj01.html";

    }
}
