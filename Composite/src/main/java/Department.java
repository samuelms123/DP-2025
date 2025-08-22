import java.util.ArrayList;

public class Department implements Organization {
    String name;
    ArrayList<Organization> employees_departments;

    public Department(String name) {
        this.name = name;
        employees_departments = new ArrayList<>();
    }

    @Override
    public double getSalary() {
        double totalSalary = 0;
        for (Organization component : employees_departments) {
            totalSalary += component.getSalary();
        }
        return totalSalary;
    }

    public String getName() {
        return name;
    }

    public void addComponent(Organization component) {
        employees_departments.add(component);
    }

    public void removeComponent(Organization component) {
        employees_departments.remove(component);
    }

    @Override
    public String toXML() {
        StringBuilder sb = new StringBuilder();
        sb.append("<Department name=" + this.name + ">\n");

        for (Organization component : employees_departments) {
            String childComponent = component.toXML();
            for ( String line : childComponent.split("\n")) {
                sb.append("     ").append(line).append("\n");
            }

        }
        sb.append("</Department>");
        return sb.toString();
    }
}
