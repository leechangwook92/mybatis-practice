package com.spring.mybatispractice.controller;

import com.spring.mybatispractice.service.StudyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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

        List<Map<String, String>> list = new ArrayList<>();
        list = studyList.studyList();

        for (Map<String, String> stringStringMap : list) {
            System.out.println(stringStringMap.get("KEY_ID"));
            System.out.println(stringStringMap.get("STUDY_DAY"));
            System.out.println(stringStringMap.get("CONTENTS"));
            System.out.println(stringStringMap.get("REG_DAY"));
        }

        request.setAttribute("list", list);
        //model.addAttribute("list", list);

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
