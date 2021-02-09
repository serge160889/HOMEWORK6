package academy.belhard;

import academy.belhard.inter.Costable;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Car car1=new Car(4,5);
        Car car2=new Car(4,3);
        Motorcycle motorcycle1=new Motorcycle(2,260);
        Motorcycle motorcycle2=new Motorcycle(2,200);
        car1.printInfo();
        motorcycle1.printInfo();
        car2.printInfo();
        motorcycle2.printInfo();
    Costable money1=new Car(6,4);
    int money2=money1.getCost();
        System.out.println("Стоимость ="+money2);

    }
}
