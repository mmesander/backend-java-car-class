public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Fiat", "500", "2019", "groen", "1.4");
        Car car2 = new Car("Toyota", "Aygo", "2016", "blauw", "1.2");
        Car car3 = new Car("Volvo", "CX90", "2022", "zwart", "2.0");

        car1.carMessage();
        car2.carMessage();
        car3.carMessage();
    }
}
