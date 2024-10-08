package first_module12;

public class Staff implements Worker{
    int id;
    String name;
    String surname;
    int salary;

    public Staff() {
    }

    public Staff(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    //Если id=1, name = "Ilyas", surname="Zhuanyshev", salary = 40000, то метод getWorkerData() возвращает текст:
    //"ID: 1. NAME: Ilyas. SURNAME: Zhuanyshev. SALARY: 40000.";

    public String getWorkerData(){
        return ("ID: " + id + ". NAME: " + name + ". SURNAME: " + surname + ". SALARY: " + salary + "." );
    }
}
