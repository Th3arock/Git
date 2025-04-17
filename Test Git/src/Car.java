public class Car {
    private String make;
    private String tire;
    private int year;
    public Car(String make, String tire, int year) {
        this.make = make;
    }


    public void setMake(String make) {
        this.make = make;
    }

    public String getTire() {
        return tire;
    }

    public void setTire(String tire) {
        this.tire = tire;
    }
}
