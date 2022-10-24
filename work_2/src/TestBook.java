public class TestBook {
    public static void main(String[] args){
        Book B = new Book("Name", "Author", 0);
        System.out.println(B.getName());
        System.out.println(B.getAuthor());
        System.out.println(B.getYear());
        B.setName("Name1");
        B.setAuthor("Author2");
        B.setYear(1);
        System.out.println(B.toString());
    }
}