import java.util.*;

class Employee{
    String fullname;
    String department;
    double salary;

    public Employee(String fullname, String department, double salary) {
        this.fullname = fullname;
        this.department = department;
        this.salary = salary;
    }

    public String getDepartament() {
        return department;
    }

    public double getSalary() {
        return salary;
    }
}



public class IndexRunner {

    static List<Employee> employees = Arrays.asList(new Employee("Adrian Kasprzyk", "IT", 16000), new Employee("Rober Kasprzak", "Accountant", 1600),
            new Employee("Angelika Kasprzyk", "IT", 11000), new Employee("Marzena Okulska", "Marketing", 4000), new Employee("Adrian Nowak", "IT", 6000),
            new Employee("Tadeusz Loska", "Accountant", 10000), new Employee("Ryszard Piatek", "Marketing", 9000)
    );

    public static void main(String[] args) {
        Map<String, List<Employee>> employeesbyDepartment = new HashMap<>();
        for (Employee employee : employees) {
            if (!employeesbyDepartment.containsKey(employee.getDepartament())) {
                List<Employee> employees = new ArrayList<>();
                employees.add(employee);
                employeesbyDepartment.put(employee.getDepartament(), employees);
            } else {
                employeesbyDepartment.get(employee.getDepartament()).add(employee);
            }

        }
        employeesbyDepartment.entrySet().forEach(
                e -> System.out.println(e.getKey() + " " + e.getValue().size())
        );
        employeesbyDepartment
                .entrySet().stream()
                .forEach(e -> {
                    Double salarySum = calculateSalarySume(e.getValue());
                    System.out.println(e.getKey() + " " + salarySum);
                });
    }

    private static Double calculateSalarySume(List<Employee> value) {
    }

    private static Double toListofSalaries(List<Employee> employees){
        return employees.stream()
                .map(employee -> employee.getSalary())
                .reduce(0.0,(a,e)->a+e);
    }
}
