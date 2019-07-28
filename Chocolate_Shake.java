package com.company;

public class Chocolate_Shake implements ShakeBuilder {
    private shake Shake;
    public Chocolate_Shake(){
        this.Shake=new shake();
    }

    @Override
    public void addname() {
        Shake.setname("Chocolate_Shake");
    }

    @Override
    public void addmilk(boolean amilk) {
        if( amilk==true)
        {
            Shake.setShakemilk("almond_milk-60taka");
        }
        else{
        Shake.setShakemilk("milk");}

    }

    @Override
    public void addextraingred() {
        Shake.setShakeadditionalingredients("chocolate_syrup","chocolate_icecream");

    }

    @Override
    public void addsugar() {
        Shake.setShakesugar("sugar");

    }

    @Override
    public shake getShake() {
        return this.Shake;
    }
    public void addtopings(int choice){
        if(choice==1)
        { Shake.settopings("Candy-50");}
        else{
            Shake.settopings("Cookie-40");
        }

    }

    @Override
    public void baseprice() {
        Shake.setprice(230);
    }
}
