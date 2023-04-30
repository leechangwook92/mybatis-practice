package com.spring.mybatispractice.controller;

import com.spring.mybatispractice.service.StudyService;
import com.spring.mybatispractice.vo.VoStudy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class HomeController {

    private final StudyService studyList;


    @GetMapping("/")
    public String index() {
        return "home";
    }

    @GetMapping("/study")
    public String study(HttpServletRequest request, Model model) {

        List<VoStudy> list = new ArrayList<>();
        list = studyList.studyList();

        for (VoStudy stringStringMap : list) {
            System.out.println(stringStringMap.getKEY_ID());
            System.out.println(stringStringMap.getSTUDY_DAY());
            System.out.println(stringStringMap.getCONTENTS());
            System.out.println(stringStringMap.getREG_DAY());
        }

        //request.setAttribute("list", list);
        model.addAttribute("list", list);

        return "study";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/user")
    public String user() {
        return "user";
    }

}
