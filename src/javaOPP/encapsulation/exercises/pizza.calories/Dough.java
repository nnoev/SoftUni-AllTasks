package pizza.calories;

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
        if (flourType.equals("White")||flourType.equals("Wholegrain")) {
            this.flourType = flourType;
        }else {
            throw new IllegalArgumentException("Invalid type of dough.");
        }
    }

    private void setBakingTechnique(String bakingTechnique) {
        if (bakingTechnique.equals("Crispy")||bakingTechnique.equals("Chewy")||bakingTechnique.equals("Homemade")) {
            this.bakingTechnique = bakingTechnique;
        }else {
            throw new IllegalArgumentException("Invalid type of dough.");
        }
    }

    private void setWeigh(double weigh) {
        if (weigh<1 || weigh>200){
            throw  new IllegalArgumentException("Dough weight should be in the range [1..200].");
        }
        this.weigh = weigh;
    }

    public double calculateCalories(){
        double typeCal = 0.0;
        double techCal = 0.0;
       switch (this.flourType){
           case "White":
               typeCal =1.5;
               break;
           case "Wholegrain":
               typeCal=1.0;
               break;
       }
       switch (bakingTechnique){
           case "Crispy":
               techCal=0.9;
               break;
           case "Chewy":
               techCal=1.1;
               break;
           case "Homemade":
               techCal=1.0;
               break;
       }
       return 2*this.weigh*typeCal*techCal;
    }
}
