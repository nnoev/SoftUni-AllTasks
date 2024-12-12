package animals;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        while (!command.equals("Beast!")) {
            String[] parameters = scanner.nextLine().split(" ");
            try {
                switch (command) {
                    case "Cat":
                        Cat cat = new Cat(parameters[0], Integer.parseInt(parameters[1]), parameters[2]);
                        System.out.println(cat);
                        break;
                    case "Dog":
                        Dog dog = new Dog(parameters[0], Integer.parseInt(parameters[1]), parameters[2]);
                        System.out.println(dog);
                        break;
                    case "Frog":
                        Frog frog = new Frog(parameters[0], Integer.parseInt(parameters[1]), parameters[2]);
                        System.out.println(frog);
                        break;
                    case "Kitten":
                        Kitten kitten = new Kitten(parameters[0], Integer.parseInt(parameters[1]));
                        System.out.println(kitten);
                        break;
                    case "Tomcat":
                        Tomcat tomcat = new Tomcat(parameters[0], Integer.parseInt(parameters[1]));
                        System.out.println(tomcat);
                        break;
                }
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }


            command = scanner.nextLine();
        }
    }


}
