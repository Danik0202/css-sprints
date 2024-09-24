import java.util.*;
public class Box <T>{
    private ArrayList<T> contents = new ArrayList<>();

    public Box() {
    }

    public Box(ArrayList<T> contents) {
        this.contents = contents;
    }

    public ArrayList<T> getContents() {
        return contents;
    }

    public void setContents(ArrayList<T> contents) {
        this.contents = contents;
    }

    void add(T item){
        contents.add(item);
    }

    @Override
    public String toString() {
        return "Box{" +
                "contents=" + contents +
                '}';
    }
}
