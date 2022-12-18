package N10;
public class Computer {

    private int id;
    private Mark mark;
    private int price;
    private static int maxId;

    public enum Mark {
        MSI,
        Asus,
        Lenovo,
        Macintosh,
        Huawei
    }

    Memory memory;
    Processor processor;
    Monitor monitor;

    private boolean TurnedOn;

    public Computer(String mark, int price) {
        this.memory = new Memory();
        this.monitor = new Monitor();
        this.processor = new Processor();

        this.TurnedOn = false;
        this.id = this.maxId;
        this.maxId++;
        switch(mark) {
            case "MSI":
                this.mark = Mark.MSI;
                break;
            case "Asus":
                this.mark = Mark.Asus;
                break;
            case "Lenovo":
                this.mark = Mark.Lenovo;
                break;
            case "Macintosh":
                this.mark = Mark.Macintosh;
                break;
            default:
                this.mark = Mark.Huawei;
        }
        this.price = price;
    }

    public void on() {
        if (!this.TurnedOn) {
            this.memory = new Memory();
            this.processor = new Processor();
            this.monitor = new Monitor();

            this.memory.on();
            this.processor.on();
            this.monitor.on();

            this.TurnedOn = true;
            System.out.println("Computer: ON \n");
        }
    }

    public void off() {
        if (this.TurnedOn) {
            this.memory.off();
            this.processor.off();
            this.monitor.off();

            this.TurnedOn = false;
            System.out.println("Computer: OFF \n");
        }
    }

    public String getMark() {
        return this.mark.toString();
    }

    public void setMark(String mark) {
        switch(mark) {
            case "MSI":
                this.mark = Mark.MSI;
                break;
            case "Asus":
                this.mark = Mark.Asus;
                break;
            case "Lenovo":
                this.mark = Mark.Lenovo;
                break;
            case "Macintosh":
                this.mark = Mark.Macintosh;
                break;
            default:
                this.mark = Mark.Huawei;
        }
    }

    public int getId() {
        return this.id;
    }
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{id=" + this.id + ", company=" + this.mark + ", price=" + this.price + "}";
    }

}
