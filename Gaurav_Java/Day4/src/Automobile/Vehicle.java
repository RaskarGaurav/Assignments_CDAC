package Automobile;

public class Vehicle {
	private String brand;
	private int passengers;
	private double power;
	private int wheels;
	
	public Vehicle() {
		brand="undefined";
		passengers=0;
		power=0.0;
		wheels=0;
	}
	
	public Vehicle(String brand, int passengers, double power, int wheels) {
		super();
		this.brand = brand;
		this.passengers = passengers;
		this.power = power;
		this.wheels = wheels;
	}
}
