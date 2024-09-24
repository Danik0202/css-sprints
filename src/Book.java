public class Book {
    private int id;
    private String name;
    private String author;

    public Book() {
    }

    public Book(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    //К примеру, если id=1, name=”Alice in Wonderland”, author=”Lewis Carroll”, то возвращаемый текст будет:
    //"ID: 1. NAME: Alice in Wonderland. AUTHOR: Lewis Carroll."

    String getData(){
        return "ID: " + id + ". NAME: " + name + ". AUTHOR: " + author + ".";
    }
}
