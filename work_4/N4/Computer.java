package N4;

public class Computer {
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

    Computer() {
        this.TurnedOn = false;
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

    public static void main(String [] args) {
        Computer test = new Computer();
        test.on();
        test.monitor.on();
        System.out.println("\n");
        test.off();
        test.monitor.off();
    }
}
