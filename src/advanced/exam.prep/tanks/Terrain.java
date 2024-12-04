package advanced.exam.prep.tanks;

import java.util.ArrayList;
import java.util.List;

public class Terrain {
    private final String type;
    private final List<Tank> tanks;
    private final int area;

    public Terrain(String type, int area) {
        this.type = type;
        this.tanks = new ArrayList<>();
        this.area = area;
    }

    public String getType() {
        return type;
    }

    public String addTank(Tank tank) {
            if (tanks.stream().anyMatch(tank1 -> tank1.getBrand().equals(tank.getBrand()) && tank1.getModel().equals(tank.getModel()))) {
                return "Tank with this brand and model already exists!";
            }
        if (this.type.equals("Swamp") && tank.getWeight() > 14000) {
            return String.format("This %s is too heavy for this terrain!", tank.getBrand());
        }
        tanks.add(tank);
        return String.format("Tank %s %s added.", tank.getBrand(), tank.getModel());
    }

    public boolean removeTank(String brand, String model) {
        Tank tank = this.getTankByBrandAndModel(brand,model);
                tanks.remove(tank);
        return tank!= null;
    }

    public String getTanksByBarrelCaliberMoreThan(int barrelCaliber) {
        List<Tank> tanks = this.tanks.stream().filter(tank -> tank.getBarrelCaliber()>barrelCaliber).toList();
        List<String> tankBrands= tanks.stream().map(Tank::getBrand).toList();
        if (tanks.isEmpty()) {
            return "There are no tanks with the specified caliber.";
        }
        return String.format("Tanks with caliber more than %dmm: %s",barrelCaliber,tankBrands.toString().replaceAll("[\\[\\]]", ""));
    }

    public Tank getTankByBrandAndModel(String brand, String model) {
            return tanks.stream().filter(tank -> tank.getBrand().equals(brand) && tank.getModel().equals(model)).findFirst().orElse(null);
    }

    public String getTheMostArmoredTank() {
        int max = Integer.MIN_VALUE;
        String brand = "";
        String model = "";
        for (Tank tank : tanks) {
            if (tank.getArmor() > max) {
                max = tank.getArmor();
                brand = tank.getBrand();
                model = tank.getModel();
            }
        }
        return String.format("%s %s is the most armored tank with %dmm. armor thickness.", brand, model, max);
    }

    public int getCount() {
        return tanks.size();
    }

    public String getStatistics() {
        StringBuilder build = new StringBuilder();
        if (tanks.isEmpty()) {
            build.append("There are no tanks in the ").append(getType().toLowerCase()).append(".");
        } else {
            build.append("Tanks located in the ").append(getType().toLowerCase()).append(":");
            for (Tank tank : tanks) {
                build.append("\n");
                build.append("-- ").append(tank.getBrand()).append(" ").append(tank.getModel());
            }
        }
        return build.toString();
    }
}
