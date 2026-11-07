package galaxy.training.sessions.five.poo;

public class Car implements CarInterface {
    private String color;
    private String brand;
    private int doors;
    private int year;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String car() {
        return ":::Summary::: \n Brand: " + this.getBrand()
                + " \n Year: " + this.getYear()
                + " \n Color: " + this.getColor()
                + " \n Doors: " + this.getDoors()
                + " \n";
    }

    @Override
    public void speed() {
        System.out.println("Run run run!! __|'''''|__");
    }

    @Override
    public void brake() {
        System.out.println("Brake! Brake! ... Stop!");
    }

    @Override
    public String topic() {
        return "---Topic: Interfaces---\n";
    }

    public Car add(String brand, int year, String color, int doors) {
        this.setBrand(brand);
        this.setYear(year);
        this.setColor(color);
        this.setDoors(doors);
        return this;
    }
}
