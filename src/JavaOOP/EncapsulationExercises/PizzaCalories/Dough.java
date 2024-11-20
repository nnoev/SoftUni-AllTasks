package PizzaCalories;

public class Dough {
    private String flourType;
    private String bakingTechnique;
    private double weigh;

    public Dough(String flourType, String bakingTechnique, double weigh) {
        this.setFlourType(flourType);
        this.setBakingTechnique(bakingTechnique);
        this.setWeigh(weigh);
    }

    private void setFlourType(String flourType) {
        if (flourType.equals("white")||flourType.equals("wholegrain")) {
            this.flourType = flourType;
        }else {
            throw new IllegalArgumentException("Invalid type of dough.");
        }
    }

    private void setBakingTechnique(String bakingTechnique) {
        if (bakingTechnique.equals("crispy")||bakingTechnique.equals("chewy")||bakingTechnique.equals("homemade")) {
            this.bakingTechnique = bakingTechnique;
        }else {
            throw new IllegalArgumentException("Invalid type of dough.");
        }
    }

    private void setWeigh(double weigh) {
        if (weigh<1&&weigh>200){
            throw  new IllegalArgumentException("Dough weight should be in the range [1..200].");
        }
        this.weigh = weigh;
    }

    public double calculateCalories(){
        return calculateCalories();
    }
}
