public class Employee implements Organization {
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    @Override
    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    @Override
    public void addComponent(Organization component) {
        throw new UnsupportedOperationException("Not supported on employees");
    }

    @Override
    public void removeComponent(Organization component) {
        throw new UnsupportedOperationException("Not supported on employees");
    }

    @Override
    public String toXML() {
        return "<Employee name=" + name + " salary=" + salary + "/>";
    }
}
