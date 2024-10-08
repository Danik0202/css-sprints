public class Library {
    private String name;
    private String city;
    private Book books[] = new Book[5];
    private int index = 0;

    public Library() {
    }

    public Library(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    void addBook(Book book){
        try{
            books[index] = book;
            index++;
        }catch (Exception e){
            System.out.println("The library is full");
        }
    }
    void printBooks(){
        for (int i = 0; i < index ; i++) {
            try{
                System.out.println(books[i]);
            }catch (Exception e){
                System.out.println("The book is empty");
            }
        }
    }
}
