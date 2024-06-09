package DZ_4_seminar_4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentGroup {
    private ArrayList<Student> studentList;

    public StudentGroup(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    public void addStudent(Student student){
        studentList.add(student);
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(studentList);

    }
}
