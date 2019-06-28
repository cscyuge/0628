package computer;


public class Notebook extends Computer {

    private String battery;

    public Notebook() {
        // TODO Auto-generated constructor stub
        super();
    }
    
    public Notebook(String name, String brand, String cpu, String memory, String hardDisk, String monitor, String battery) {
        super(name, brand, cpu, memory, hardDisk, monitor);
        this.battery = battery;
    }
    
    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }
    
    @Override
    public void printInfo(boolean flag) {
        // TODO Auto-generated method stub
        System.out.println(format(getName()) + format(getBrand()) + format(getCPU()) + format(getMemory()) + format(getHardDisk()) + format(getMonitor()) + format(getBattery()));
    }
}
