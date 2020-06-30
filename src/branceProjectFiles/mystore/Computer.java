package branceProjectFiles.mystore;
//instructions in BranceMart
public class Computer {
    private String OS;
    private boolean isLaptop;
    private String type;

    public Computer(boolean isLaptop, String type) {
        this.isLaptop = isLaptop;
        this.type = type;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public boolean isLaptop() {
        return isLaptop;
    }

    public void setLaptop(boolean laptop) {
        isLaptop = laptop;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
