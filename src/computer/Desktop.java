package computer;

public class Desktop extends Computer {

    public String getHosttype() {
        return hosttype;
    }

    public void setHosttype(String hosttype) {
        this.hosttype = hosttype;
    }

    private String hosttype;
    
    public Desktop() {
        super();
    }
    
    public Desktop(String name, String brand, String cpu, String memory, String hardDisk, String monitor, String hosttype) {
        super(name, brand, cpu, memory, hardDisk, monitor);
        this.hosttype = hosttype;
    }

    @Override
    public void printInfo() {
        // TODO Auto-generated method stub
        System.out.println(getName() + "\t" + getBrand() + "\t" + getCPU() + "\t" + getMemory() + "\t" + getHardDisk() + "\t" + getMonitor() + "\t\t\t" + getHosttype());
    }
    
}
