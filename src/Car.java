public class Car {
    public String name;
    public String model;
    public int maxSpeed;
    public int year;
    public double volume;

    public Car() {
    }

    public Car(String name, String model, int maxSpeed, int year, double volume) {
        this.name = name;
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.year = year;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
    //Например, если name = "KIA", model = "RIO", maxSpeed = 220, year = 2012, volume = 2.2, то тогда текст вывода будет:
    //
    //"Car KIA RIO with max speed 220 km/h from 2012 year with engine volume 2.2 liters is riding."
    public String ride(){
        return "Car " + name + " " + model + " with max speed " + maxSpeed + " km/h from " + year + " year with engine volume " + volume + " liters is riding.";
    }
}
