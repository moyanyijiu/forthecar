package com.xa.controller;

import com.xa.pojo.Phcar;
import com.xa.service.PhcarService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class PhcarController {

    @Resource
    PhcarService phcarService;


    @GetMapping("getAllPhcar")
    public List<Phcar>  getAllPhcar(){
        return phcarService.getAllPhcar();
    }


    @GetMapping("getOnePhcar")
    public Phcar getOnePhcar(HttpServletRequest request){
        String id = request.getParameter("cid");
        Integer cid = id!=null?Integer.parseInt(id):-1;
        return phcarService.getOnePhcar(cid);
    }

}
