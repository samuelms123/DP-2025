public interface Organization {
    public double getSalary();
    public String getName();
    public void addComponent(Organization component);
    public void removeComponent(Organization component);
    public String toXML();
}
