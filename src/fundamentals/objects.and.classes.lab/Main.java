package fundamentals.objects.and.classes.lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Songs> list = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String data = scanner.nextLine();
            String type = data.split("_")[0];
            String name = data.split("_")[1];
            String time = data.split("_")[2];
            Songs currentSong = new Songs();
            currentSong.setTypeList(type);
            currentSong.setName(name);
            currentSong.setTime(time);
            list.add(currentSong);
        }
        String command = scanner.nextLine();
        if (command.equals("all")) {
            for (Songs song : list) {
                System.out.println(song.getName());
            }
        } else {
            for (Songs song : list) {
                if (song.getTypeList().equals(command)) {
                    System.out.println(song.getName());
                }
            }
        }
    }
}


class Songs {

    private String typeList;
    private String name;
    private String time;

    public void setTypeList(String typeList) {
        this.typeList = typeList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTypeList() {
        return typeList;
    }

    public String getName() {
        return name;
    }
}