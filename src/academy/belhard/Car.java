package academy.belhard;

import academy.belhard.inter.Costable;

public class Car extends Vehicle implements Costable {
    private int doorsCount;

    public Car(int wheelCount, int doorsCount){
        super(wheelCount);
        this.doorsCount=doorsCount;
    }

    public int getDoorsCount() {
        return doorsCount;
    }

    public void setDoorsCount(int doorsCount) {
        this.doorsCount = doorsCount;
    }
    @Override
    public int getCost(){
       return (doorsCount+wheelCount)*1000;
    }




    @Override
    protected void printInfo() {
        System.out.println("Транспорное средство: Машина-Количество дверей:"+doorsCount+"- Количество колес:"+wheelCount+"-Стоимость:"+getCost());
    }
}

