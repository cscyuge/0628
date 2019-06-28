package computer;

public abstract class Computer {
    
    private String name;
    private String brand;
    private String cpu;
    private String memory;
    private String hardDisk;
    private String monitor;
    
    
    public Computer() {
        // TODO Auto-generated constructor stub
    }
    
    public Computer(String name, String brand, String cpu, String memory, String hardDisk, String monitor) {
        this.name = name;
        this.brand = brand;
        this.cpu = cpu;
        this.memory = memory;
        this.hardDisk = hardDisk;
        this.monitor = monitor;
    }
    
    public abstract void printInfo(boolean flag);
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCPU() {
        return cpu;
    }

    public void setCPU(String cpu) {
        this.cpu = cpu;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(String hardDisk) {
        this.hardDisk = hardDisk;
    }

    public String getMonitor() {
        return monitor;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }   
    
    public String format(String s) {
        return s + (s.length() >= 7 ? "\t" : "\t\t");
    }
}
