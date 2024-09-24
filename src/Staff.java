public class Staff extends User{
    private double salary;
    private String subjects[] = new String[100];
    private int indexOfSubject = 0;

    public Staff() {
    }

    public Staff(int id, String login, String password, String name, String surname, double salary, String[] subjects, int indexOfSubject) {
        super(id, login, password, name, surname);
        this.salary = salary;
        this.subjects = subjects;
        this.indexOfSubject = indexOfSubject;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    //Например, если id= 1, login="zhansayakulbaeva@bk.ru", password= "qwerty12345",
    //name= "Zhansaya", surname= "Kulbaeva", salary = 40000.0, subjects(Literature, History, Chemistry, Biology, Technology), то тогда текст вывода будет:
    //
    //"ID: 1. FULL NAME: Zhansaya Kulbaeva. LOGIN: zhansayakulbaeva@bk.ru. PASSWORD: qwerty12345. SALARY: 40000.0"
    //"SUBJECTS:"
    //"Literature"
    //"History"
    //"Chemistry"
    //"Biology"
    //"Technology"


    @Override
    public void getData(){
        System.out.println("ID: " + id + "." + "FULL NAME: " + name + " " + surname + ". LOGIN: " + login + ". PASSWORD: " + password + ". SALARY: " + salary);
    }

    public void addSubject(String subject){
        int size = 0;
        for (int i = 0; i <= subject.length(); i++) {
            if (size>indexOfSubject){
                subjects[i] = subject;
                size++;
                System.out.println(subjects[i]);
            }
        }

    }
}
