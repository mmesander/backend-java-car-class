public class Car {
    String carBrand;
    String carType;
    String carBuildYear;
    String carColor;
    String carCilinder;

    public Car(String carBrand, String carType, String carBuildYear, String carColor, String carCilinder) {
        this.carBrand = carBrand;
        this.carType = carType;
        this.carBuildYear = carBuildYear;
        this.carColor = carColor;
        this.carCilinder = carCilinder;
    }

    public void carMessage() {
        System.out.println("Deze " + carBrand + " " + carType + " is " + carColor);
    }
}
