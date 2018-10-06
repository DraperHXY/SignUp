package com.draper.mapper;

import com.draper.entity.Student;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class StudentMapperTest extends BaseTest {

    @Autowired
    private StudentMapper studentMapper;

    @Test
    public void testInsertStudent() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        long time_long = sdf.parse("2018-10-2").getTime();
        Student student = new Student();
        student.setCreateAt(System.currentTimeMillis());
        student.setOnlineId(4975);
        student.setStudyType("JAVA工程师");
        student.setStartStudyTime(time_long);
        student.setDailyLink("http://www.jnshu.com/school/86/daily");
        student.setWish("如果我不能在IT特训营拼尽全力，为自己以后的修行路上打好基础，就让我变胖2k斤！");
        student.setCoachSenior("桂伟腾");
        student.setKnowFrom("知乎");
        student.setName("贾伟奇");
        student.setQq("860733414");
        student.setGraduateSchool("北京YD大学");
        studentMapper.insertItStudent(student);
        studentMapper.insertSimpleStudent(student);
    }

//    @Test
//    public void testSelectByName() {
////        String coachSenior = (String) studentMapper.selectByName("贾伟奇").get("coachSenior");
////        System.out.println(coachSenior);
//        Map map = studentMapper.selectByName("贾伟奇");
//        Set set  = map.keySet();
//        for (Object o : set) {
//            System.out.println(o + "：" + map.get(o));
//        }
//    }

    @Test
    public void testSelectByName() {
        Student student = studentMapper.selectByName("贾伟奇");
        System.out.println(student.getCoachSenior());
    }

    @Test
    public void testUpdateWishByName() {
        studentMapper.updateWishByName("贾伟奇","老大最帅！");
    }

    @Test
    public void testInsertTenStudent() throws ParseException {
        int id = 10000;
        for (int i = 0; i < 10; i++) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            long time_long = sdf.parse("2018-10-2").getTime();
            Student student = new Student();
            student.setCreateAt(System.currentTimeMillis());
            student.setOnlineId(id+i);
            student.setStudyType("JAVA工程师");
            student.setStartStudyTime(time_long);
            student.setDailyLink("http://www.jnshu.com/school/86/daily");
            student.setWish("如果我不能在IT特训营拼尽全力，为自己以后的修行路上打好基础，就让我变胖2k斤！");
            student.setCoachSenior("桂伟腾");
            student.setKnowFrom("知乎");
            student.setName("贾伟奇");
            student.setQq("860733414");
            student.setGraduateSchool("北京YD大学");
            studentMapper.insertItStudent(student);
            studentMapper.insertSimpleStudent(student);
        }
    }
}
