package javaOPP.encapsulation.exercises.shopping.spree;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] personsInput = scanner.nextLine().split(";");
        String[] productsInput = scanner.nextLine().split(";");
        Map<String, Person> costumer = new HashMap<>();
        List<Product> products = new ArrayList<>();
        for (String s : personsInput) {
            String name = s.split("=")[0];
            double money = Double.parseDouble(s.split("=")[1]);
            Person person = new Person(name, money);
            costumer.put(name, person);
        }
        for (String productInfo : productsInput) {
            String name = productInfo.split("=")[0];
            double cost = Double.parseDouble(productInfo.split("=")[1]);
            Product product = new Product(name, cost);
            products.add(product);
        }
        String command = scanner.nextLine();
        while (!command.equals("END")) {
            String[] input = command.split(" ");
            String name = input[0];
            String product = input[1];
            Person currentPerson = costumer.get(name);
            Product product1 = products.stream().filter(a -> a.getName().equals(product)).findFirst().orElse(null);
            currentPerson.buyProduct(product1);
            System.out.println(currentPerson.getName() + " bought " + product1.getName());
            command = scanner.nextLine();
        }
       for (Person person:costumer.values()){
           if (person.getBagSize() == 0){
               System.out.printf("%s - Nothing bought",person.getName());
               continue;
           }
           System.out.println(person.getName() + " - " + String.join(", ", person.getProducts()));
       }
    }


}
