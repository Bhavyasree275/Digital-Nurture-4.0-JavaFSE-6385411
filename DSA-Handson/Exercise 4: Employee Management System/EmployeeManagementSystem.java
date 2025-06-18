//creating a class with all the required attributes
class Employee {
    int employeeId;
    String name;
    String position;
    double salary;
    //constructor
    Employee(int employeeId, String name, String position, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }


    void display() {
        System.out.println("ID: " + employeeId + ", Name: " + name + ", Position: " + position + ", Salary: " + salary);
    }
}

public class EmployeeManagementSystem {
    static final int MAX = 100;
    Employee[] employees = new Employee[MAX];
    int count = 0;


    void addEmployee(Employee emp) {
        if (count < MAX) {//checking whether the array is full or not
            employees[count++] = emp;
            System.out.println("Employee added.");
        } else {
            System.out.println("Employee list is full.");
        }
    }

    //searching employee details based on the id here i used linear search to do the operation
    Employee searchEmployee(int id) {
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == id) {
                return employees[i];
            }
        }
        return null; // if id not found then null
    }


    void displayAll() {
        if (count == 0) {
            System.out.println("No employees to display.");
            return;
        }
        for (int i = 0; i < count; i++) {
            employees[i].display();
        }
    }


    void deleteEmployee(int id) {
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == id) {

                for (int j = i; j < count - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[--count] = null;
                System.out.println("Employee deleted.");
                return;
            }
        }
        System.out.println("Employee not found.");
    }


    public static void main(String[] args) {
        EmployeeManagementSystem system = new EmployeeManagementSystem();

        // Adding employees
        system.addEmployee(new Employee(101, "Deetu", "Developer", 60000));
        system.addEmployee(new Employee(102, "Bhavya", "Manager", 75000));
        system.addEmployee(new Employee(103, "Rithu", "Tester", 50000));


        System.out.println("All Employees:");
        system.displayAll();

        System.out.println("Searching for employee with ID:");
        Employee e = system.searchEmployee(102);
        if (e != null) {
            e.display();
        } else {
            System.out.println("Employee not found.");
        }


        System.out.println("Deleting employee with ID 102:");
        system.deleteEmployee(102);


        System.out.println("All Employees after deletion:");
        system.displayAll();
    }
}
/*"C:\Program Files\Java\jdk-17\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.3.4.1\lib\idea_rt.jar=62606" -Dfile.encoding=UTF-8 -classpath C:\Users\narub\IdeaProjects\ds-exercise4\out\production\ds-exercise4 EmployeeManagementSystem
Employee added.
Employee added.
Employee added.
All Employees:
ID: 101, Name: Deetu, Position: Developer, Salary: 60000.0
ID: 102, Name: Bhavya, Position: Manager, Salary: 75000.0
ID: 103, Name: Rithu, Position: Tester, Salary: 50000.0
Searching for employee with ID:
ID: 102, Name: Bhavya, Position: Manager, Salary: 75000.0
Deleting employee with ID 102:
Employee deleted.
All Employees after deletion:
ID: 101, Name: Deetu, Position: Developer, Salary: 60000.0
ID: 103, Name: Rithu, Position: Tester, Salary: 50000.0

Process finished with exit code 0
*/
