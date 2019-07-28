package com.company;

public class ShakeshackProduce {
    private ShakeBuilder shakeBuilder;
    public boolean amilk;
    public int choice;
    public ShakeshackProduce(boolean am){

        this.amilk=am;
    }
    public shake getShake(){
        return this.shakeBuilder.getShake();

    }
    public void production(String sh,int c)
        {
            if(sh=="Chocolate_shake")
            {
                this.shakeBuilder=new Chocolate_Shake();

                if(c==0)
                    { this.shakeBuilder.addmilk(this.amilk);
                      this.shakeBuilder.addsugar();
                      this.shakeBuilder.addextraingred();
                      this.shakeBuilder.addname();
                      this.shakeBuilder.baseprice();
                    }
            else {
                this.shakeBuilder.addmilk(this.amilk);
                this.shakeBuilder.addsugar();
                this.shakeBuilder.addextraingred();
                this.shakeBuilder.addname();
                    this.shakeBuilder.baseprice();
                this.choice=c;
                this.shakeBuilder.addtopings(this.choice);
                 }
            }
            else if(sh=="Coffee_shake"){
                this.shakeBuilder=new Coffee_Shake();

                if(c==0)
                { this.shakeBuilder.addmilk(this.amilk);
                    this.shakeBuilder.addsugar();
                    this.shakeBuilder.addextraingred();
                    this.shakeBuilder.baseprice();
                    this.shakeBuilder.addname();
                }
                else {
                    this.shakeBuilder.addmilk(this.amilk);
                    this.shakeBuilder.addsugar();
                    this.shakeBuilder.addextraingred();
                    this.shakeBuilder.baseprice();
                    this.choice=c;
                    this.shakeBuilder.addtopings(this.choice);
                    this.shakeBuilder.addname();
                }

            }
            else if(sh=="Vanilla_shake"){
                this.shakeBuilder=new Vanilla_Shake();

                if(c==0)
                { this.shakeBuilder.addmilk(this.amilk);
                    this.shakeBuilder.addsugar();
                    this.shakeBuilder.addextraingred();
                    this.shakeBuilder.baseprice();
                    this.shakeBuilder.addname();
                }
                else {
                    this.shakeBuilder.addmilk(this.amilk);
                    this.shakeBuilder.addsugar();
                    this.shakeBuilder.addextraingred();
                    this.shakeBuilder.baseprice();
                    this.choice=c;
                    this.shakeBuilder.addtopings(this.choice);
                    this.shakeBuilder.addname();
                }


            }
            else if(sh=="Strawberry_shake"){
                this.shakeBuilder=new Strawberry_Shake();
                if(c==0)
                { this.shakeBuilder.addmilk(this.amilk);
                    this.shakeBuilder.addsugar();
                    this.shakeBuilder.addextraingred();
                    this.shakeBuilder.baseprice();
                    this.shakeBuilder.addname();
                }
                else {
                    this.shakeBuilder.addmilk(this.amilk);
                    this.shakeBuilder.addsugar();
                    this.shakeBuilder.addextraingred();
                    this.shakeBuilder.baseprice();
                    this.choice=c;
                    this.shakeBuilder.addtopings(this.choice);
                    this.shakeBuilder.addname();
                }

            }
            else if(sh=="Zero_shake"){
                this.shakeBuilder=new Zero_Shake();
                if(c==0)
                { this.shakeBuilder.addmilk(this.amilk);
                    this.shakeBuilder.addsugar();
                    this.shakeBuilder.addextraingred();
                    this.shakeBuilder.baseprice();
                    this.shakeBuilder.addname();
                }
                else {
                    this.shakeBuilder.addmilk(this.amilk);
                    this.shakeBuilder.addsugar();
                    this.shakeBuilder.addextraingred();
                    this.shakeBuilder.baseprice();
                    this.choice=c;
                    this.shakeBuilder.addtopings(this.choice);
                    this.shakeBuilder.addname();
                }
            }
    }

}
