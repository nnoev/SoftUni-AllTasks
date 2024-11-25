package Test1.RapidCourier;

import java.util.*;

public class RapidCourier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] line1 = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] line2 = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int sumOfTotalWeightDelivered = 0;
        Stack<Integer> packagesToDeliver = new Stack<>();
        Deque<Integer> capacities = new ArrayDeque<>();
        for (int n : line1) {
            packagesToDeliver.push(n);
        }
        for (int n : line2) {
            capacities.offer(n);
        }
        while (!packagesToDeliver.isEmpty() && !capacities.isEmpty()) {
            int currentWeight = packagesToDeliver.peek();
            int currentCapacity = capacities.peek();
            if (currentCapacity >= currentWeight) {
                if (currentCapacity > currentWeight) {
                    currentCapacity -= 2 * currentWeight;
                    if (currentCapacity > 0) {
                        capacities.poll();
                        capacities.offer(currentCapacity);
                    }
                    if (currentCapacity <= 0) {
                        capacities.poll();
                    }
                }else {
                    capacities.poll();
                }
                sumOfTotalWeightDelivered += currentWeight;
                packagesToDeliver.pop();
        } else{
            currentWeight -= currentCapacity;
            packagesToDeliver.pop();
            packagesToDeliver.push(currentWeight);
            capacities.poll();
            sumOfTotalWeightDelivered += currentCapacity;
        }
    }
        System.out.printf("Total weight: %d kg%n",sumOfTotalWeightDelivered);
        if(capacities.isEmpty()&&packagesToDeliver.isEmpty())

    {
        System.out.println("Congratulations, all packages were delivered successfully by the couriers today.");
    }
        if(capacities.isEmpty()&&!packagesToDeliver.isEmpty())

    {
        String remainPackage = String.valueOf(packagesToDeliver).replaceAll("[\\[\\]]", "");
        System.out.printf("Unfortunately, there are no more available couriers to deliver the following packages: %s", remainPackage);
    }
        if(!capacities.isEmpty()&&packagesToDeliver.isEmpty())

    {
        String remainCapacities = String.valueOf(capacities).replaceAll("[\\[\\]]", "");
        System.out.printf("Unfortunately, there are no more available couriers to deliver the following packages: %s", remainCapacities);
    }
}

}
