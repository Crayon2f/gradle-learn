package com.crayon2f.controller;

import com.crayon2f.dao.mapper.UserMapper;
import com.mysql.jdbc.Driver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by feiFan.gou on 2017/11/22 18:50.
 */
@Controller
public class IndexController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/home")
    public ModelAndView index(HttpServletRequest request) {

        request.setAttribute("title", 111);
        ModelAndView view = new ModelAndView("index");

        view.addObject("title", "gradle");
        view.addObject("user", userMapper.fetchById(1));
        return view;
    }
}
