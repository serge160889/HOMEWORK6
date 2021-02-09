package academy.belhard;

public class Motorcycle extends Vehicle {
    private int maxSpeed;

    public Motorcycle(int wheelCount,int maxSpeed){
        super(wheelCount);
        this.maxSpeed=maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    @Override
    protected void printInfo(){
        System.out.println("Транспортное средство:Мотоцикл-Количество колес:"+wheelCount+"-Максимальная скорость:"+maxSpeed);
    }
}
