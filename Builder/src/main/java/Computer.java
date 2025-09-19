public class Computer {
    private String processor;
    private int ramSize;
    private int diskSize;
    private String graphicsCard;
    private String OS;

    public void setProcessor(String processor) {this.processor = processor;}
    public void setRamSize(int ramSize) {this.ramSize = ramSize;}
    public void setDiskSize(int diskSize) {this.diskSize = diskSize;}
    public void setGraphicsCard(String graphicsCard) {this.graphicsCard = graphicsCard;}
    public void setOS(String OS) {this.OS = OS;}

    public String toString() {
        return OS + "\n" + graphicsCard +"\n" + processor + "\n" + "RAM: " + ramSize + " GB" + "\n" + diskSize + " TB";
    }
}
