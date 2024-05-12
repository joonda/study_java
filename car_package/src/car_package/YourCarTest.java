package car_package;

public class YourCarTest {
	public static void main(String[] args) {
		Car yourCar;
		yourCar = new Car("Grandeur", "Black", 2500, 60);
		yourCar.setCarName("Grandeur");
		yourCar.setCarColor("Black");
		yourCar.setCarSize(2500);
		yourCar.setVelocity(60);
		
		String carName = yourCar.getCarName();
		String carColor = yourCar.getCarColor();
		int carSize = yourCar.getCarSize();
		int velocity = yourCar.getVelocity();
		yourCar.speedUp();
		yourCar.speedDown();
		velocity = yourCar.getVelocity();
		System.out.println("Your Car infomation >> ");
		System.out.println("Car name : " + carName +
				", Color : " + carColor+
				", CC : " + carSize + "cc" +
				", Speed : " + velocity);
	}
}