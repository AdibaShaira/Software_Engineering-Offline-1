package com.company;

public class Zero_Shake implements ShakeBuilder {
    private shake Shake;
    public Zero_Shake(){
        this.Shake=new shake();
    }
    public void addname() {
        Shake.setname("Zero_Shake");
    }

    @Override
    public void addmilk(boolean amilk) {
        if( amilk==true)
        {
            Shake.setShakemilk("almond_milk-60taka");
        }
        else{
            Shake.setShakemilk("milk");
        }
    }

    @Override
    public void addextraingred() {
        Shake.setShakeadditionalingredients("vanilla_flavouring","sugar_free_zello");

    }

    @Override
    public void addsugar() {
        Shake.setShakesugar("sweetener");

    }

    @Override
    public shake getShake() {
        return this.Shake;
    }
    public void addtopings(int choice){
        if(choice==1)
        { Shake.settopings("Candy-50taka");}
        else{
            Shake.settopings("Cookie-40taka");
        }

    }
    public void baseprice() {
        Shake.setprice(240);
    }
}
