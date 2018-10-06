package com.draper.mapper;

import com.draper.entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

public interface StudentMapper {

    void insertItStudent(Student student);

    void insertSimpleStudent(Student student);

    Map selectByName(@Param("name") String name);


}
