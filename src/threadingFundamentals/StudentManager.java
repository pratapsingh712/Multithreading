package threadingFundamentals;

import java.util.List;

public class StudentManager {

    private List<Student> studentList;

    public StudentManager(List<Student> studentList){
        this.studentList = studentList;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
}
