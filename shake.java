package com.company;

import java.security.PublicKey;

public class shake implements OrderPlan {
    private String Shakemilk;
    private String Shakesugar;
    private String Shakeadditionalingredients1;
    private String Shakeadditionalingredients2;
    private String topings;
    private int price;
    private  String shakename;

    @Override
    public void setname(String name) {
        this.shakename=name;
    }
    public String getShakename(){
        return this.shakename;
    }

    @Override
    public void setShakemilk(String milk) {
        this.Shakemilk=milk;

    }
    public String getShakemilk(){return this.Shakemilk; }

    @Override
    public void setShakesugar(String sugar) {
        this.Shakesugar=sugar;

    }
    public String getShakesugar(){
        return  this.Shakesugar;
    }

    @Override
    public void setShakeadditionalingredients(String ingredient1,String ingredient2) {
        this.Shakeadditionalingredients1=ingredient1;
        this.Shakeadditionalingredients2=ingredient2;

    }

    @Override
    public void settopings(String toping) {
        this.topings=toping;
    }

    public String getTopings() {
        return this.topings;
    }

    public String getShakeadditionalingredient1() {
        return this.Shakeadditionalingredients1;
    }
    public String getShakeadditionalingredients2(){
        return this.Shakeadditionalingredients2;
    }
    public void setprice(int p){this.price=p;}
    public int getPrice(){return this.price;}
}
