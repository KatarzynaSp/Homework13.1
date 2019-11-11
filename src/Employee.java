 class Employee {
     private String firstName;
     private String lastName;
     private String pesel;
     private String departament;
     private int salary;

     public Employee(String firstName, String lastName, String pesel, String departament, int salary) {
         this.firstName = firstName;
         this.lastName = lastName;
         this.pesel = pesel;
         this.departament = departament;
         this.salary = salary;
     }

     public String getFirstName() {
         return firstName;
     }

     public void setFirstName(String firstName) {
         this.firstName = firstName;
     }

     public String getLastName() {
         return lastName;
     }

     public void setLastName(String lastName) {
         this.lastName = lastName;
     }

     public String getPesel() {
         return pesel;
     }

     public void setPesel(String pesel) {
         this.pesel = pesel;
     }

     public String getDepartament() {
         return departament;
     }

     public void setDepartament(String departament) {
         this.departament = departament;
     }
     public int getSalary() {

         return salary;
     }

     public void setSalary(int salary) {
         this.salary = salary;
     }

 }
