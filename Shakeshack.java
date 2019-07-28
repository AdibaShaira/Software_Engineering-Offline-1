package com.company;
import java.awt.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Shakeshack {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch;
        System.out.println("TO OPEN A ORDER PRESS O\n");

        while ((ch = input.next().charAt(0)) != 'T') {


               int total = 0;
            List<shake>items=new ArrayList<shake>();
             System.out.println("A new order has been started.To proceed press S");
                char choice=input.next().charAt(0);


                while (choice!= 'E') {
                   // int total = 0;
                    System.out.println("1.Chocolate_Shake 2.Coffee_shake 3.Strawberry_Shake 4.Vanilla_shake\n");
                   System.out.println("5.Zero_Shake 6.Exit\n");
                //    Scanner input1=new Scanner(System.in);
                  choice = input.next().charAt(0);
                    if (choice == '1') {
                        System.out.println("Do you want almond milk?\n");
                        System.out.println("1.YES 2.NO");

                        int choice2 = input.next().charAt(0);
                        if (choice2 == '1') {
                            System.out.println("Do you want toppings?\n");
                            System.out.println("0.No toppings 1.Candy 2.Cookies\n");
                            int choice3 = input.next().charAt(0);
                            if (choice3 == '0') {

                                ShakeshackProduce sp = new ShakeshackProduce( true);
                                sp.production("Chocolate_shake",0);
                                shake sh = sp.getShake();
                                System.out.println("The price is"+sh.getPrice());

                               // System.out.println("Chocolate_Shake has been ordered");
                              // System.out.println("Base:->" + sh.getShakemilk() + "," + sh.getShakesugar() + "," + sh.getShakeadditionalingredient1() + "," + sh.getShakeadditionalingredients2());
                                total = total + sh.getPrice() + 60;
                            } else if (choice3 == '1') {
                                //System.out.println("dhukse");
                                //ShakeBuilder chocolate_shakes = new Chocolate_Shake();
                                // System.out.println("dhukse");
                                ShakeshackProduce sp = new ShakeshackProduce( true);
                                sp.production("Chocolate_shake",1);
                                // System.out.println("dhukse");
                                shake sh = sp.getShake();
                                items.add(sh);

                                total = total + sh.getPrice() + 50 + 60;

                            } else if (choice3 == '2') {
                                ShakeshackProduce sp = new ShakeshackProduce( true);
                                sp.production("Chocolate_shake",2);
                                shake sh = sp.getShake();
                                items.add(sh);
                                total = total + sh.getPrice()+ 40 + 60;

                            }
                        } else if (choice2 == '2') {
                            System.out.println("Do you want toppings?\n");
                            System.out.println("0.No toppings 1.Candy 2.Cookies\n");
                            int choice3 = input.next().charAt(0);
                            if (choice3 == '0') {
                                ShakeshackProduce sp = new ShakeshackProduce( false);
                                sp.production("Chocolate_shake",0);
                                shake sh = sp.getShake();
                                items.add(sh);

                                total = total + sh.getPrice();
                            } else if (choice3 == '1') {
                                ShakeshackProduce sp = new ShakeshackProduce( false);
                                sp.production("Chocolate_shake",1);
                                shake sh = sp.getShake();
                                items.add(sh);

                                total = total + sh.getPrice() + 50;

                            } else if (choice3 == '2') {
                                ShakeshackProduce sp = new ShakeshackProduce( false);
                                sp.production("Chocolate_shake",2);
                                shake sh = sp.getShake();
                                items.add(sh);

                                total = total + sh.getPrice()+ 40;

                            }

                        }
                        continue;

                    } else if (choice == '3') {
                        System.out.println("Do you want almond milk?\n");
                        System.out.println("1.YES 2.NO");

                        int choice2 = input.next().charAt(0);
                        if (choice2 == '1') {
                            System.out.println("Do you want toppings?\n");
                            System.out.println("0.No toppings 1.Candy 2.Cookies\n");
                            int choice3 = input.next().charAt(0);
                            if (choice3 == '0') {
                                ShakeshackProduce sp = new ShakeshackProduce( true);
                                sp.production("Strawberry_shake",0);
                                shake sh = sp.getShake();
                                items.add(sh);

                                total = total + sh.getPrice() + 60;
                            } else if (choice3 == '1') {
                                ShakeshackProduce sp = new ShakeshackProduce( true);
                                sp.production("Strawberry_shake",1);
                                shake sh = sp.getShake();
                                items.add(sh);

                                total = total + sh.getPrice() + 50 + 60;

                            } else if (choice3 == '2') {
                                ShakeshackProduce sp = new ShakeshackProduce( true);
                                sp.production("Strawberry_shake",2);
                                shake sh = sp.getShake();
                                items.add(sh);

                                total = total + sh.getPrice() + 40 + 60;

                            }
                        } else if (choice2 == '2') {
                            System.out.println("Do you want toppings?\n");
                            System.out.println("0.No toppings 1.Candy 2.Cookies\n");
                            int choice3 = input.next().charAt(0);
                            if (choice3 == '0') {
                                ShakeshackProduce sp = new ShakeshackProduce( false);
                                sp.production("Strawberry_shake",0);
                                shake sh = sp.getShake();
                                items.add(sh);

                                total = total + sh.getPrice();
                            } else if (choice3 == '1') {
                                ShakeshackProduce sp = new ShakeshackProduce( false);
                                sp.production("Strawberry_shake",1);
                                shake sh = sp.getShake();
                                items.add(sh);

                                total = total + sh.getPrice() + 50;

                            } else if (choice3 == '2') {
                                ShakeshackProduce sp = new ShakeshackProduce( false);
                                sp.production("Strawberry_shake",2);
                                shake sh = sp.getShake();
                                items.add(sh);

                                total = total + sh.getPrice()+ 40;

                            }

                        }
                        continue;

                    } else if (choice == '2') {
                        System.out.println("Do you want almond milk?\n");
                        System.out.println("1.YES 2.NO");

                        int choice2 = input.next().charAt(0);
                        if (choice2 == '1') {
                            System.out.println("Do you want toppings?\n");
                            System.out.println("0.No toppings 1.Candy 2.Cookies\n");
                            int choice3 = input.next().charAt(0);
                            if (choice3 == '0') {
                                ShakeshackProduce sp = new ShakeshackProduce( true);
                                sp.production("Coffee_shake",0);
                                shake sh = sp.getShake();
                                items.add(sh);
                                System.out.println("Coffee_Shake has been ordered\n");
                                System.out.println("Base:->" + sh.getShakemilk() + "," + sh.getShakesugar() + "," + sh.getShakeadditionalingredient1() + "," + sh.getShakeadditionalingredients2());
                                //System.out.println("added ingredients->"+sh.getTopings());
                                // System.out.println("Chocolate_Shake has been ordered");
                                total = total + 230 + 60;
                            } else if (choice3 == '1') {
                                ShakeshackProduce sp = new ShakeshackProduce( true);
                                sp.production("Coffee_shake",1);
                                // shake sh=sp.getShake();
                                shake sh = sp.getShake();
                                items.add(sh);

                                total = total + sh.getPrice() + 50 + 60;

                            } else if (choice3 == '2') {
                                ShakeshackProduce sp = new ShakeshackProduce( true);
                                sp.production("Coffee_shake",2);
                                //  shake sh=sp.getShake();
                                shake sh = sp.getShake();
                                items.add(sh);

                                total = total + sh.getPrice()+ 40 + 60;

                            }
                        } else if (choice2 == '2') {
                            System.out.println("Do you want toppings?\n");
                            System.out.println("0.No toppings 1.Candy 2.Cookies\n");
                            int choice3 = input.next().charAt(0);
                            if (choice3 == '0') {
                                ShakeshackProduce sp = new ShakeshackProduce( false);
                                sp.production("Coffee_shake",0);
                                shake sh = sp.getShake();
                                items.add(sh);

                                total = total + sh.getPrice();
                            } else if (choice3 == '1') {
                                ShakeshackProduce sp = new ShakeshackProduce( false);
                                sp.production("Coffee_shake",1);
                                shake sh = sp.getShake();
                                items.add(sh);

                                total = total + sh.getPrice() + 50;

                            } else if (choice3 == '2') {
                                ShakeshackProduce sp = new ShakeshackProduce( false);
                                sp.production("Coffee_shake",2);
                                shake sh = sp.getShake();
                                items.add(sh);

                                total = total + sh.getPrice() + 40;

                            }

                        }
                        continue;


                    } else if (choice == '4') {
                        System.out.println("Do you want almond milk?\n");
                        System.out.println("1.YES 2.NO");

                        int choice2 = input.next().charAt(0);
                        if (choice2 == '1') {
                            System.out.println("Do you want toppings?\n");
                            System.out.println("0.No toppings 1.Candy 2.Cookies\n");
                            int choice3 = input.next().charAt(0);
                            if (choice3 == '0') {
                                ShakeshackProduce sp = new ShakeshackProduce( true);
                                sp.production("Vanilla_shake",0);
                                shake sh = sp.getShake();
                                items.add(sh);

                                total = total + sh.getPrice() + 60;
                            } else if (choice3 == '1') {
                                ShakeshackProduce sp = new ShakeshackProduce( true);
                                sp.production("Vanilla_shake",1);
                                // shake sh=sp.getShake();
                                shake sh = sp.getShake();
                                items.add(sh);

                                total = total + sh.getPrice()+ 50 + 60;

                            } else if (choice3 == '2') {
                                ShakeshackProduce sp = new ShakeshackProduce( true);
                                sp.production("Vanilla_shake",2);
                                //  shake sh=sp.getShake();
                                shake sh = sp.getShake();
                                items.add(sh);

                                total = total + sh.getPrice()+ 40 + 60;

                            }
                        } else if (choice2 == '2') {
                            System.out.println("Do you want toppings?\n");
                            System.out.println("0.No toppings 1.Candy 2.Cookies\n");
                            int choice3 = input.next().charAt(0);
                            if (choice3 == '0') {
                                ShakeshackProduce sp = new ShakeshackProduce( false);
                                sp.production("Vanilla_shake",0);
                                shake sh = sp.getShake();
                                items.add(sh);

                                total = total+ sh.getPrice();
                            } else if (choice3 == '1') {
                                ShakeshackProduce sp = new ShakeshackProduce( false);
                                sp.production("Vanilla_shake",1);
                                shake sh = sp.getShake();
                                items.add(sh);

                                total = total + sh.getPrice() + 50;

                            } else if (choice3 == '2') {
                                ShakeshackProduce sp = new ShakeshackProduce( false);
                                sp.production("Vanilla_shake",2);
                                shake sh = sp.getShake();
                                items.add(sh);

                                total = total + sh.getPrice()+ 40;

                            }

                        }
                        continue;

                    } else if (choice == '5') {
                        System.out.println("Do you want almond milk?\n");
                        System.out.println("1.YES 2.NO");

                        int choice2 = input.next().charAt(0);
                        if (choice2 == '1') {
                            System.out.println("Do you want toppings?\n");
                            System.out.println("0.No toppings 1.Candy 2.Cookies\n");
                            int choice3 = input.next().charAt(0);
                            if (choice3 == '0') {
                                ShakeshackProduce sp = new ShakeshackProduce( true);
                                sp.production("Zero_shake",0);
                                shake sh = sp.getShake();
                                items.add(sh);

                                total = total + sh.getPrice() + 60;
                            } else if (choice3 == '1') {
                                ShakeshackProduce sp = new ShakeshackProduce( true);
                                sp.production("Zero_shake",1);
                                // shake sh=sp.getShake();
                                shake sh = sp.getShake();
                                items.add(sh);

                                total = total + sh.getPrice() + 50 + 60;

                            } else if (choice3 == '2') {
                                ShakeshackProduce sp = new ShakeshackProduce( true);
                                sp.production("Zero_shake",2);
                                //  shake sh=sp.getShake();
                                shake sh = sp.getShake();
                                items.add(sh);

                                total = total + sh.getPrice() + 40 + 60;

                            }
                        } else if (choice2 == '2') {
                            System.out.println("Do you want toppings?\n");
                            System.out.println("0.No toppings 1.Candy 2.Cookies\n");
                            int choice3 = input.next().charAt(0);
                            if (choice3 == '0') {
                                ShakeshackProduce sp = new ShakeshackProduce( false);
                                sp.production("Zero_shake",0);
                                shake sh = sp.getShake();
                                items.add(sh);

                                total = sh.getPrice() + total;
                            } else if (choice3 == '1') {
                                ShakeshackProduce sp = new ShakeshackProduce( false);
                                sp.production("Zero_shake",1);
                                shake sh = sp.getShake();
                                items.add(sh);

                                total = total + sh.getPrice() + 50;

                            } else if (choice3 == '2') {
                                ShakeshackProduce sp = new ShakeshackProduce( false);
                                sp.production("Zero_shake",2);
                                shake sh = sp.getShake();
                                items.add(sh);

                                total =total+ sh.getPrice() + 40;

                            }

                        }
                        continue;

                    } else if (choice == 'O') {
                        System.out.println("Do you want too add something to this order?");
                    } else if (choice == 'E') {
                        if (total == 0) {
                            System.out.println("You have to order at least one item");
                            System.out.println("To resume press R");
                            choice=input.next().charAt(0);
                        } else {
                            for(shake sh:items){
                                System.out.println(sh.getShakename()+" has been ordered");
                                System.out.println("Price of the shake is-"+sh.getPrice()+"taka");
                                System.out.println("Bases are:"+sh.getShakemilk()+","+sh.getShakesugar()+","+sh.getShakeadditionalingredient1()+","+sh.getShakeadditionalingredients2());
                                System.out.println("Topping are "+sh.getTopings()+"taka");
                             }

                            System.out.println("Total price is:"+total);
                            System.out.println("The order is closed");
                            System.out.println("TO OPEN A ORDER PRESS O\n");
                            continue;
                        }

                    }

                }
            }

        }
    }
