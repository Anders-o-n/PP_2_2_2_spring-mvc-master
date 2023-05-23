package web.model;

public class Car {
    private String model;
    private int age;
    private int mileage;

    public Car(String model, int age, int mileage) {
        this.model = model;
        this.age = age;
        this.mileage = mileage;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public String getModel() {
        return model;
    }

    public int getAge() {
        return age;
    }

    public int getMileage() {
        return mileage;
    }
}
