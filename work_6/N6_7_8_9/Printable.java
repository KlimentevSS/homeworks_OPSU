package N6_7_8_9;
import java.util.ArrayList;
public interface Printable {
    public void print();
    ArrayList <Printable> list = new ArrayList<Printable>();
    public static void main(String [] args) {
        list.add(new Book());
        list.add(new Magazine());
        list.add(new Magazine());
        list.add(new Book());
        for (int i = 0; i < list.size(); i++) {
            list.get(i).print();
        }
    }
}