package com.CarDealership.Entity;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class Car {
	private String make, model, transMissonType, driveTrain, color, description, imagePath;
	private int year, numberOfDoors;
	private boolean isElectric, isUsed;
	private double price, miles;
	private LocalDate dealershipPurchaseDate, dateSold;
	private int dealershipID;
	public Car() {
	}

	public Car(String make, String model, String transMissonType, String driveTrain, String color, String description,
			int dealershipID, int year, int numberOfDoors, boolean isElectric, boolean isUsed, double price,
			double miles, String imagePath, LocalDate dealershipPurchaseDate, LocalDate dateSold) {
		
		this.make = make;
		this.model = model;
		this.transMissonType = transMissonType;
		this.driveTrain = driveTrain;
		this.color = color;
		this.description = description;
		this.dealershipID = dealershipID;
		this.year = year;
		this.numberOfDoors = numberOfDoors;
		this.isElectric = isElectric;
		this.isUsed = isUsed;
		this.price = price;
		this.miles = miles;
		this.imagePath = imagePath; 
		this.dealershipPurchaseDate = dealershipPurchaseDate; 
		this.dateSold = dateSold; 
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getTransMissonType() {
		return transMissonType;
	}

	public void setTransMissonType(String transMissonType) {
		this.transMissonType = transMissonType;
	}

	public String getDriveTrain() {
		return driveTrain;
	}

	public void setDriveTrain(String driveTrain) {
		this.driveTrain = driveTrain;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getMiles() {
		return miles;
	}

	public void setMiles(double miles) {
		this.miles = miles;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getNumberOfDoors() {
		return numberOfDoors;
	}

	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}

	public boolean isElectric() {
		return isElectric;
	}

	public void setElectric(boolean isElectric) {
		this.isElectric = isElectric;
	}

	public boolean isUsed() {
		return isUsed;
	}

	public void setUsed(boolean isUsed) {
		this.isUsed = isUsed;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public LocalDate getDealershipPurchaseDate() {
		return dealershipPurchaseDate;
	}

	public void setDealershipPurchaseDate(LocalDate dealershipPurchaseDate) {
		this.dealershipPurchaseDate = dealershipPurchaseDate;
	}

	public LocalDate getDateSold() {
		return dateSold;
	}

	public void setDateSold(LocalDate dateSold) {
		this.dateSold = dateSold;
	}

	public int getDealershipID() {
		return dealershipID;
	}

	public void setDealershipID(int dealershipID) {
		this.dealershipID = dealershipID;
	}

	

}
