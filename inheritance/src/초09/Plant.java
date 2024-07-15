package 초09;

public abstract class Plant implements GrowingPlant{
    protected String name;
    private int nutrients = 0;

    // protected #
    // default ~

    public Plant(){}

    public Plant(String name, int nutrients) {
        this.name = name;
        this.nutrients = nutrients;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNutrients() {
        return nutrients;
    }

    public void setNutrients(int nutrients) {
        this.nutrients = nutrients;
    }

    @Override
    public void sprinkleWater() {

    }

    @Override
    public void baskSun() {

    }
}
