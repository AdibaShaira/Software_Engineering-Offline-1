package com.company;

public class Coffee_Shake implements ShakeBuilder {
    private shake Shake;
    public Coffee_Shake(){
        this.Shake=new shake();
    }

    public void addname() {
        Shake.setname("Cofffee_Shake");
    }
    @Override
    public void addsugar() {
        Shake.setShakesugar("sugar");

    }

    @Override
    public void addmilk(boolean amilk) {
        if(amilk==true)
        {
            Shake.setShakemilk("almond_milk-60taka");
        }
        else{
            Shake.setShakemilk("milk");}
    }

    @Override
    public void addextraingred() {
        Shake.setShakeadditionalingredients("coffee","jello");

    }

    @Override
   /* public shake getShake() {
        return this.Shake;
    }*/
    public void addtopings(int choice){
        if(choice==1)
        { Shake.settopings("Candy-50taka");}
        else{
            Shake.settopings("Cookie-40taka");
        }

    }
    public shake getShake() {
        return this.Shake;
    }

    public void baseprice() {
        Shake.setprice(230);
    }
}
