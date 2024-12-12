import java.util.*;

public class ClickBait {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> suggestedLinks = new ArrayDeque<>();
        ArrayDeque<Integer> featuredArticles = new ArrayDeque<>();
        List<Integer> finalFeed = new LinkedList<>();
        int[] line1 = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] line2 = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (Integer number : line1) {
            suggestedLinks.offer(number);
        }
        for (Integer number : line2) {
            featuredArticles.push(number);
        }
        int target = Integer.parseInt(scanner.nextLine());
        while (!suggestedLinks.isEmpty() && !featuredArticles.isEmpty()) {
            int element1 = suggestedLinks.poll();
            int element2 = featuredArticles.pop();
            if (element2 > element1) {
                int reminder = element2 % element1;
                finalFeed.add(reminder);
                if (reminder != 0) {
                    featuredArticles.push(reminder* 2);
                }
            }
            if (element1 > element2) {
                int reminder = -element1 % element2;
                finalFeed.add(reminder);
                if (reminder != 0) {
                    suggestedLinks.offer(Math.abs(reminder) * 2);
                }
            }
            if (element1 == element2) {
                finalFeed.add(0);
            }
        }
        int sum = 0;
        for (Integer number : finalFeed){
            sum+=number;
        }
        System.out.print("Final Feed: ");
        System.out.println(String.join(", ", finalFeed.stream().map(String::valueOf).toArray(String[]::new)));
        if (sum>=target){
            System.out.printf("Goal achieved! Engagement Value: %d",sum);
        }else {
            System.out.printf("Goal not achieved! Short by: %d",target-sum);
        }
    }

}
