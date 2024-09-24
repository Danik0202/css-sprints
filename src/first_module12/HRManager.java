package first_module12;

public class HRManager implements Worker{
      int id;
      String fullName;
      int salary;

    public HRManager() {
    }

    public HRManager(int id, String fullName, int salary) {
        this.id = id;
        this.fullName = fullName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    //Если id=2, fullName= "Thomas William", salary=50000, то метод getWorkerData() возвращает текст:
    //"ID: 2. FULL NAME: Thomas William. SALARY: 50000.";

    public String getWorkerData(){
        return ("ID: " + id + ". FULL NAME: " + fullName + ". SALARY: " + salary + ".");
    }
}
