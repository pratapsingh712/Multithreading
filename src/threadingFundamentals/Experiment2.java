package threadingFundamentals;

import java.util.List;

public class Experiment2 {
    public static void main(String[] args) {

        List<Student> studentList = List.of(
                new Student(1,"Raghav"),
                new Student(2,"Manvi"),
                new Student(3,"Tarun"),
                new Student(4,"Satyam")
        );

        StudentManager studentManager = new StudentManager(studentList);

        for(Student stu : studentManager.getStudentList()){
            System.out.println(stu);
        }
    }
}

