package com.spring.mybatispractice.service;

import com.spring.mybatispractice.dao.StudyDao;
import com.spring.mybatispractice.vo.VoStudy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class StudyService {

    private final StudyDao studyDao;

    public List<VoStudy> studyList() {
        List<VoStudy> list = new ArrayList<>();
        list = studyDao.studyList();
        return list;
    }

}
