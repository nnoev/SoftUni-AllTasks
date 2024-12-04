package multidimensional.arrays.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Crossfire {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dimensions = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int rows = dimensions[0];
        int cols = dimensions[1];
        List<List<Integer>> field = new ArrayList<>();
        fillMatrix(field, rows, cols);
        String command = scanner.nextLine();
        while (!command.equals("Nuke it from orbit")) {
            int[] attack = Arrays.stream(command.split(" ")).mapToInt(Integer::parseInt).toArray();
            int rowAttack = attack[0];
            int colAttack = attack[1];
            int radiusOfAttack = attack[2];
            for (int row = rowAttack - radiusOfAttack; row <= rowAttack + radiusOfAttack; row++) {
                if (isValid(field, row, colAttack)) {
                    field.get(row).set(colAttack,0);
                }
            }
            for (int col = colAttack - radiusOfAttack; col <= colAttack + radiusOfAttack; col++) {
                if (isValid(field, rowAttack, col)) {
                    field.get(rowAttack).set(col,0);
                }
            }
            for (int row = 0; row < field.size(); row++) {
                List<Integer> currentRow = field.get(row);
                currentRow.removeAll(List.of(0));
                if (field.get(row).size() == 0) {
                    field.remove(row);
                    row++;
                }
            }
            command = scanner.nextLine();
        }

        for (List<Integer> list:field){
            System.out.println(list.toString().replaceAll("[\\[\\],]",""));
        }
    }

    private static boolean isValid(List<List<Integer>> field, int row, int col) {
        return row <= field.size() - 1 && col <= field.get(row).size() - 1 && col >= 0 && row >= 0;
    }

    private static void fillMatrix(List<List<Integer>> field, int rows, int cols) {
        int count = 1;
        for (int i = 0; i <= rows - 1; i++) {
            ArrayList<Integer> number = new ArrayList<>();
            for (int j = 0; j <= cols - 1; j++) {
                number.add(count++);
            }
            field.add(number);
        }
    }
}
