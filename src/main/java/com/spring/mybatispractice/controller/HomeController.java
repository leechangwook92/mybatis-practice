package com.spring.mybatispractice.controller;

import com.spring.mybatispractice.service.StudyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
    @ResponseBody
    public String study() {

        List<Map<String, String>> list = new ArrayList<>();
        list = studyList.studyList();

        for (Map<String, String> stringStringMap : list) {
            System.out.println(stringStringMap.get("KEY_ID"));
            System.out.println(stringStringMap.get("STUDY_DAY"));
            System.out.println(stringStringMap.get("CONTENTS"));
            System.out.println(stringStringMap.get("REG_DAY"));
        }
        return "--";
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
