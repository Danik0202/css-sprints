public class Company {
    private String name;
    private Worker director;

    public Company() {
    }

    public Company(String name, Worker director) {
        this.name = name;
        this.director = director;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Worker getDirector() {
        return director;
    }

    public void setDirector(Worker director) {
        this.director = director;
    }

    //Например, если name = "Apple", director.name = "Steve", director.surname="Jobs", то возвращаемый текст будет:
    //"Company name: Apple. Information about director -> Steve Jobs."

    String getData(){
        try{
            return "Company name: " + name + ". Information about director -> " + director.getName() + " " + director.getSurname() + ".";
        }catch (NullPointerException e){
            return "Data not found";
        }

    }
}
