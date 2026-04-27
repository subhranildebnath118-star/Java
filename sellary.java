interface Gross {
    double calculateGross();
}

class Employee {
    String name;
    int id;

    void getEmployeeDetails(String n, int i) {
        name = n;
        id = i;
    }

    void displayEmployeeDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
    }
}

class Salary extends Employee implements Gross {
    double basic, hra, da;

    void getSalaryDetails(double b, double h, double d) {
        basic = b;
        hra = h;
        da = d;
    }

    public double calculateGross() {
        return basic + hra + da;
    }

    void displaySalary() {
        System.out.println("Basic: " + basic);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Gross Salary: " + calculateGross());
    }
}


public class sellary {
    public static void main(String[] args) {
        Salary s = new Salary();

        s.getEmployeeDetails("Subhranil", 101);
        s.getSalaryDetails(20000, 5000, 3000);

        s.displayEmployeeDetails();
        s.displaySalary();
    }
}