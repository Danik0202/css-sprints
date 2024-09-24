import java.util.*;
public class StudentList <T extends Student>{
    private List<T> students = new ArrayList<>();

    public StudentList() {
    }

    public StudentList(List<T> students) {
        this.students = students;
    }

    public List<T> getStudents() {
        return students;
    }

    public void setStudents(List<T> students) {
        this.students = students;
    }


    void addStudent(T student){
        students.add(student);
    }

    void removeStudent(T student){
        students.remove(student);
    }

    T getHighestGpaStudent(){
        double max = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < students.size(); i++) {
            if(max < students.get(i).getGpa()){
                max = students.get(i).getGpa();
                index = i;
            }
        }return students.get(index);
    }

    void sortByLastName(){
        
    }



}
