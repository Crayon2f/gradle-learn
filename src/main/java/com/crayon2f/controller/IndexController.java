package com.crayon2f.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by feiFan.gou on 2017/11/22 18:50.
 */
@Controller
public class IndexController {

    @RequestMapping("/index")
    public ModelAndView index(Model model) {

        model.addAttribute("title", "gradle");
        return new ModelAndView("index");
    }
}
