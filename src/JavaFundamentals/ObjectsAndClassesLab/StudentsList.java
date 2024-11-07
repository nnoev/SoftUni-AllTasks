package JavaFundamentals.ObjectsAndClassesLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentsList{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Student> list = new ArrayList<>();
        while (!input.equals("end")){
            String[] data = input.split(" ");
            String first = data[0];
            String last = data[1];
            int age = Integer.parseInt(data[2]);
            String town = data[3];
            Student currentstudent = new Student();
            currentstudent.setFirstName(first);
            currentstudent.setLastName(last);
            currentstudent.setAge(age);
            currentstudent.setHomeTown(town);
            list.add(currentstudent);
            input=scanner.nextLine();
            }
        String command = scanner.nextLine();
        for (Student student : list){
            if (student.getHomeTown().equals(command)){
                System.out.printf("%s %s is %d years old%n",student.getFirstName(),student.getLastName(), student.getAge());
            }
        }
    }
}
class Student {
    String firstName;
    String lastName;
    int age;
    String  homeTown;

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }
}
