package 초09;

public class Lavender extends Plant {

    public Lavender(){

    }

    public Lavender(String name){
        this.name = name;
    }



    @Override
    public void sprinkleWater() {

        super.sprinkleWater();
        int n = getNutrients();
        setNutrients(n + 3);

    }

    @Override
    public void baskSun() {
        super.baskSun();
        setNutrients(getNutrients() + 7);

    }

    @Override
    public String toString() {
        return "name" + name + "nutrients" + getNutrients() ;
    }
}
