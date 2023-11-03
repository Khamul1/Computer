package Computer;

public class Computer {
    public Computer(String monitor, String CPU, String mouse, String keyboard) {
        this.monitor = monitor;
        this.CPU = CPU;
        this.mouse = mouse;
        this.keyboard = keyboard;
    }

    public String getMonitor() {
        return monitor;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getMouse() {
        return mouse;
    }

    public void setMouse(String mouse) {
        this.mouse = mouse;
    }

    public String getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }

    private String monitor;
    private String CPU;
    private String mouse;
    private String keyboard;

    public Computer() {
    }
    public void launch(boolean value) {
        if (CPU == null) {
            System.out.println("Процессор выключен, компьютер не включится");
        }
        else if (monitor == null) {
            System.out.println("Монитор выключен, компьютер не включится");
        }
        else if (mouse == null) {
            System.out.println("Мышь выключена, компьютер не включится");
        }
        else if  (keyboard == null) {
            System.out.println("Клавиатура выключена, компьютер не включится");
        } else {
            System.out.println("Компьютер включился");
            System.out.println("Monitor: " + monitor);
            System.out.println("CPU: " + CPU);
            System.out.println("Mouse: " + mouse);
            System.out.println("Keyboard: " + keyboard);
        }
    }
}









