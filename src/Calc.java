import java.io.*;
import java.util.Arrays;

public class Calc {

    static void writeToTxt(File file, Employee[] employees) throws IOException {
        File file1 = new File("EmployeesData2.txt");
        BufferedWriter bfw = new BufferedWriter(new FileWriter(file1));
        bfw.write("Średnia wypłata: " + mediumSalaryCalc(employees));
        bfw.newLine();
        bfw.write("Najmniejsza wypłata: " + minSalaryCalc(employees));
        bfw.newLine();
        bfw.write("Największa wypłata: " + maxSalaryCalc(employees));
        bfw.newLine();
        bfw.write("Łączna liczba pracowników: " + employees.length);
        bfw.newLine();
        bfw.write("Liczba pracowników w dziale IT :" + employeesAmountCalc(employees, "it"));
        bfw.newLine();
        bfw.write("Liczba pracowników w dziale Management :" + employeesAmountCalc(employees, "Management"));
        bfw.newLine();
        bfw.write("Liczba pracowników w dziale Support :" + employeesAmountCalc(employees, "Support"));
        bfw.newLine();
        bfw.flush();
        bfw.close();
    }

    static Employee[] read(File file) throws IOException {
        FileReader fr = new FileReader(file);
        BufferedReader bfr = new BufferedReader(fr);
        String line;
        int index = 0;
        Employee[] employees1 = new Employee[4];
        while ((line = bfr.readLine()) != null) {
            String[] split = line.split(";");
            employees1[index] = new Employee(split[0], split[1], split[2], split[3], Integer.parseInt(split[4]));
            index++;
        }
        return employees1;
    }

    private static int mediumSalaryCalc(Employee[] employees) {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum += employees[i].getSalary();
        }
        return sum / employees.length;
    }

    private static int minSalaryCalc(Employee[] employees) {
        int minSalary = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (minSalary < employees[i].getSalary()) {
                minSalary = employees[i].getSalary();
            }
        }
        return minSalary;
    }

    private static int maxSalaryCalc(Employee[] employees) {
        int maxSalary = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (maxSalary > employees[i].getSalary()) {
                maxSalary = employees[i].getSalary();
            }
        }
        return maxSalary;
    }

    private static int employeesAmountCalc(Employee[] employees, String departament) {
        int employeesAmount = 0;
        for (int i = 0; i < employees.length; i++) {
            if (departament.equals(employees[i].getDepartament())) {
                employeesAmount++;
            }
        }
        return employeesAmount;
    }
}