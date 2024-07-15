package 초09;

public class Monstera extends Plant{




    public Monstera(){

    }

    public Monstera(String string){
        this.name = name;

    }

    @Override
    public void sprinkleWater() {
        super.sprinkleWater();
        setNutrients(getNutrients() + 10);
        // 값을 10증가

        // int n = gerN
        // set(n + 10);

    }

    @Override
    public void baskSun() {
        super.baskSun();
        // 값을 20 증가
        setNutrients(getNutrients() + 20);
    }


    @Override
    public String toString() {
        return "name" + getName() +", nutrients= " + getNutrients();
    }
}
