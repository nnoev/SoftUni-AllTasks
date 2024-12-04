package exam.prep.surfers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Beach {
    private final String name;
    private int surfboardsForRent;
    private final List<Surfer> surfers;

    public Beach(String name, int surfboardsForRent) {
        this.name = name;
        this.surfboardsForRent = surfboardsForRent;
        this.surfers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getSurfboardsForRent() {
        return surfboardsForRent;
    }

    public String addSurfer(Surfer surfer) {
        if (!surfer.getOwnsASurfBoard()) {
            if (this.surfboardsForRent > 0) {
                if (surfer.getMoney() >= 50) {
                    this.surfboardsForRent--;
                    surfers.add(surfer);
                    return String.format("Surfer %s added.", surfer.getName());
                } else {
                    return String.format("%s has not enough money to rent a surfboard.", surfer.getName());
                }
            } else {
                return "There are no free surfboards.";
            }
        }
        surfers.add(surfer);
        return String.format("Surfer %s added.", surfer.getName());
    }

    public boolean removeSurfer(String name) {
        Surfer surfer1 = this.surfers.stream().filter(surfer -> surfer.getName().equals(name)).findFirst().orElse(null);
        if (surfer1 == null) {
            return false;
        }
        return this.surfers.remove(surfer1);
    }

    public String getMostExperiencedSurfer() {
        Surfer mostExperienced = this.surfers.stream()
                .max(Comparator.comparing(Surfer::getExperience))
                .orElse(null);
        if (mostExperienced == null) {
            return "There are no surfers.";
        }
        return String.format("%s is the most experienced surfer with %d years of experience.",
                mostExperienced.getName(), mostExperienced.getExperience());
    }

    public Surfer getSurfer(String name) {
        return this.surfers.stream().filter(surfer -> surfer.getName().equals(name)).findFirst().orElse(null);
    }

    public int getCount() {
        return this.surfers.size();
    }

    public String getSurfersWithPersonalSurfboards() {
        List<String> ownsBoard = this.surfers.stream().filter(Surfer::getOwnsASurfBoard).map(Surfer::getName).toList();
        if (ownsBoard.isEmpty()) {
            return "There are no surfers.";
        }
        return "Surfers who have their own surfboards: " + String.join(", ", ownsBoard.toString());
    }

    public String getReport() {
        if (surfers.isEmpty()) {
            return String.format("There are no surfers on %s beach.", this.name);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(String.format("Beach %s was visited by the following surfers:", this.name));
            for (Surfer surfer : this.surfers) {
                sb.append(System.lineSeparator());
                if (surfer.getExperience() > 0) {
                    sb.append(String.format("%s with %d years of experience", surfer.getName(), surfer.getExperience()));
                } else {
                    sb.append(String.format("%s with no experience", surfer.getName()));
                }
            }
            return sb.toString();
        }
    }
}
