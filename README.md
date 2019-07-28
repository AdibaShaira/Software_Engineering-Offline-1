# Software_Engineering-Offline-1
It is a builder pattern
Problem 1:
ShakeShack should create milkshakes of the following types, Chocolate_Shake, Coffee_Shake, Strawberry_Shake, Vanilla_Shake, and Zero_Shake. 
As a customer of ShakeShack you don't know any of this unnecessary detail, you just order your preferred shake using the produceShake function of ShakeShack. 
All these shakes have milk, and all shakes other than Zero_Shake have sugar. The additional ingredients are: chocolate_syrup and chocolate icecream for Chocolate_Shake, coffee and jello for Coffee_Shake, strawberry_syrup and strawberry_icecream for strawberry shake, vanilla_flavoring and jello for vanilla shake. Zero_shake has sweetener instead of sugar, and vanilla_flavoring with sugar_free_jello.
All of the shakes can be made lactose-free, by substituting almond milk instead of milk. However, making the shake lactose-free adds Tk 60 to the base price. Moreover, all of these shakes can have candy added on top (adding Tk 50 to the base price), or cookie added on top (adding Tk 40 to the base price). Please ensure that your object creation handles these cases. 
The base prices of the shakes are: 
Chocolate_Shake: Tk 230
Coffee_Shake: Tk 230
Strawberry_Shake: Tk 200
Vanilla_Shake: Tk 190
Zero_Shake: Tk 240
After the order placing is done, the code should output the names of the shakes ordered, the base and added ingredients, and the individual prices (in case of a price increase, mention why the pricing increased). You have to perform this using a print function. Also, output the total price of the order. 
Please note that there can be multiple orders during a run. However, the orders are sequential. If 'O' is pressed, an order opens, and if 'E' is pressed, the order closes. If one tries to open another order while a current order is ongoing, you should show an error message, and ask if he wants to include something else in the previous order. Once placed, an order cannot be changed. Moreover, ensure that there is at least one item in an order before closing it. Think of a few more boundary cases and include those in your code.

