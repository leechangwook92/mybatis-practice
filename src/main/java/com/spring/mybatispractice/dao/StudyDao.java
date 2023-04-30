package com.spring.mybatispractice.dao;

import com.spring.mybatispractice.vo.VoStudy;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudyDao {
    public List<VoStudy> studyList();
}
