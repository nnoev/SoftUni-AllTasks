package EncapsulationLab.ValidationData;

public class Person {
   private String firstName;
   private String lastName;
   private  int age;
   private  double salary;

    public Person(String firstName, String lastName, int age, double salary) {

        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        setSalary(salary);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public void setFirstName(String firstName) {
        if (firstName.length()<4){
            throw new IllegalArgumentException("First name cannot be less than 3 symbols");
        }
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        if (firstName.length()<4){
            throw new IllegalArgumentException("Last name cannot be less than 3 symbols");
        }

        this.lastName = lastName;
    }

    public void setAge(int age) {
        if (age<1){
            throw new IllegalArgumentException("Age cannot be zero or negative integer");
        }
        this.age = age;
    }

    public void setSalary(double salary) {
        if (salary<460){
            throw new IllegalArgumentException("Salary cannot be less than 460 leva");
        }
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s gets %f leva.",this.firstName,this.lastName,this.salary);
    }
    public void increaseSalary(double bonus) {
        if (this.age<30){
            this.salary+=salary*0.5*bonus/100;
        }else {
            this.salary+=salary*bonus/100;
        }
    }
}
