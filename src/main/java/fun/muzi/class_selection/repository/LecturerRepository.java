package fun.muzi.class_selection.repository;

import fun.muzi.class_selection.entity.Curriculum;
import fun.muzi.class_selection.entity.Lecturer;
import fun.muzi.class_selection.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface LecturerRepository {

    Lecturer getById(String lect_id);

    List<Curriculum> getClassList(String lect_id, Integer year, String semester);

    List<Student> getStudentList(String cour_id, String curr_id, Integer year, String semester);

    Integer changeInfo(Lecturer lecturer);

    Integer changePasswd(String lect_id, String new_passwd);
}
