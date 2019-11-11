import java.io.*;

public class EmployeeTest {
    public static void main(String[] args) {
        File file = new File("EmployeesData.csv");
        try {
            Employee[] employees = Calc.read(file);
            Calc.writeToTxt(file, employees);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}