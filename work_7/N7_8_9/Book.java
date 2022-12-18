package N7_8_9;
public class Book implements Printable {
    private String title;

    Book(String title) {
        this.title = title;
    }

    public void print() {
        System.out.println("the book is printed");
    }

    public String getTitle() {
        return this.title;
    }
}