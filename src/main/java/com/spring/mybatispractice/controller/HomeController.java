package com.spring.mybatispractice.controller;

import com.spring.mybatispractice.service.StudyService;
import com.spring.mybatispractice.vo.VoStudy;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Slf4j
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
            log.info(stringStringMap.getKeyId());
            log.info(stringStringMap.getStudyDay());
            log.info(stringStringMap.getContents());
            log.info(stringStringMap.getRegDay());
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
