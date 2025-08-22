import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Organization company = new Department("Company");
        Organization boss = new Employee("Pasi", 10000);
        Organization hr_department = new Department("Hr Department");
        Organization hr_employee = new Employee("Virpi", 2000);
        Organization hr_employee2 = new Employee("Jukka", 1700);
        Organization it_department = new Department("IT Department");
        Organization it_employee = new Employee("Keke Koodari", 3500);
        Organization helpdesk_department = new Department("IT Helpdesk");
        Organization helpdesk_employee = new Employee("Reinikainen", 1000);
        Organization helpdesk_employee2 = new Employee("Sulo", 999);

        company.addComponent(boss);
        company.addComponent(it_department);
        company.addComponent(hr_department);
        hr_department.addComponent(hr_employee);
        hr_department.addComponent(hr_employee2);
        it_department.addComponent(it_employee);
        it_department.addComponent(helpdesk_department);
        helpdesk_department.addComponent(helpdesk_employee);
        helpdesk_department.addComponent(helpdesk_employee2);

        // Company total salary
        System.out.println("Company total salary: " + company.getSalary() + " e");

        // CEO salary
        System.out.println("CEO: " + boss.getName() + " | Salary: " + boss.getSalary() + " e");

        // IT-Department total salary
        System.out.println(it_department.getName() + " | Total salary: " + it_department.getSalary() + " e");

        // Helpdesk-Department total salary
        System.out.println(helpdesk_department.getName() + " | Total salary: " + helpdesk_department.getSalary() + " e");

        // Company structure in XML-format
        System.out.println("\nCOMPANY IN XML");
        System.out.println(company.toXML());

        // IT-Department structure in XML-format
        System.out.println("\nIT-DEPARTMENT IN XML");
        System.out.println(it_department.toXML());
    }
}
