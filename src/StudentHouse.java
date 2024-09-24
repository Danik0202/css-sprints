public class StudentHouse {
    String name;
    Student[] students= new Student[1000];
    int size = 0;


    void addStudent(Student student){
        students[size] = student;
        size++;
    }

    void deleteStudent(int i){
        for (int j = 0; j <size; j++) {
            if(j==i){
                students[i]=null;
            }
        }
    }

    void printStudents(){
        for (int i = 0; i < size; i++) {
            if(students!=null) {
                System.out.println(students[i]);
            }
        }
    }





    public StudentHouse() {
    }

    public StudentHouse(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
