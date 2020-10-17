package student_recoder;

import java.util.ArrayList;
import java.util.List;

public class Students {
  private ArrayList<Student> student ;  
  
    public Students() {
    }

    public Students(ArrayList<Student> student) {
        this.student = student;
    }

    public ArrayList<Student> getStudent() {
        return student;
    }

    public void setStudent(ArrayList<Student> student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Students{" + "student=" + student + '}';
    }
   
}
