package car;

public class Car {
    private String brand;
    private double price;
    private String color;


    public Car() {
    }

    public Car(String brand, double price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void showOfIn(){
        System.out.printf("汽车品牌:%s\n汽车价格:%.2f\n汽车颜色:%s\n",this.brand,this.price,this.color);
    }
}
