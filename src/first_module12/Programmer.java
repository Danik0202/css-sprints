package first_module12;

public class Programmer implements Worker{
    int id;
    String nickname;
    int salary;
    int bonusSalary;
    double KPIValue;

    public Programmer() {
    }

    public Programmer(int id, String nickname, int salary, int bonusSalary, double KPIValue) {
        this.id = id;
        this.nickname = nickname;
        this.salary = salary;
        this.bonusSalary = bonusSalary;
        this.KPIValue = KPIValue;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getBonusSalary() {
        return bonusSalary;
    }

    public void setBonusSalary(int bonusSalary) {
        this.bonusSalary = bonusSalary;
    }

    public double getKPIValue() {
        return KPIValue;
    }

    public void setKPIValue(double KPIValue) {
        this.KPIValue = KPIValue;
    }



    //Например, если id=3, nickname="itszhansayaax", salary = 50000, bonusSalary = 30000, KPIValue = 0.1, то метод getWorkerData() возвращает текст:
    //"ID: 3. NICKNAME: itszhansayaax. SALARY: 50000. BONUS SALARY: 30000. KPI VALUE: 0.1";

    public String getWorkerData(){
        return ("ID: " + id + ". NICKNAME: " + nickname + ". SALARY: " + (salary + KPIValue*bonusSalary) + ". BONUS SALARY: " + bonusSalary + ". KPI VALUE: " + getKPIValue());
    }

}
