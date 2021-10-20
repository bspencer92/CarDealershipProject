package com.CarDealership.controller;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Service;

import com.CarDealership.Entity.Car;

@Service
public class CarService  {
	
	private LocalDate purchaseDate;
	private LocalDate sellDate;  
	//private Date date = new Date(); 
	private int dealershipID = 1000; 
	private LocalDate currentDate = LocalDate.now();
	private final int auctionDays = 120; 
	private ArrayList<Car> auctionList = new ArrayList<Car>(); 
	///private int daysFromPurchase = Period.between(purchaseDate, currentDate).getDays(); 
	
	
	
	private Car car1000 = new Car("Ford", "Mustang", "6-Spead Mannual", "Rear-Wheel Drive", "Blue", "New 2021 Ford Mustang with all the features!", 
			dealershipID, 2021, 2, false, false, 75000, 0.0, 
			"https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse3.mm.bing.net%2Fth%3Fid%3DOIP.ytUxOm8vi0BtP0wIvS7TsAHaEK%26pid%3DApi&f=1",
			LocalDate.of(2021, Month.OCTOBER, 11), sellDate);
		
	
	private Car car1001 = new Car("Ford", "Focus", "Automatic", "Front-Wheel Drive", "Blue", "New 2021 Ford Focus! Its loaded with all the upgrades!", 
			dealershipID++, 2021, 4, false, false, 50000, 0.0, 
			"https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse1.mm.bing.net%2Fth%3Fid%3DOIP.4Ens08_Bz9qQgWO6_i80gAHaEA%26pid%3DApi&f=1",
			LocalDate.of(2021, Month.OCTOBER, 11), sellDate);
	
	private Car car1002 = new Car("Nissan", "Versa", "Automatic", "Front-Wheel Drive", "Blue", "Used 2009 Nissan Versa! Low Miles and great condition!", 
			dealershipID++, 2009, 4, false, true, 3500, 85000.09, 
			"https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse3.mm.bing.net%2Fth%3Fid%3DOIP.I0prcgxa6wuoLQS1UBqQ8AHaGF%26pid%3DApi&f=1",
			LocalDate.of(2021, Month.OCTOBER, 11), sellDate);
	
	private Car car1003 = new Car("Nissan", "Titan", "Automatic", "4-Wheel Drive", "Gray", "New 2021 Nissan Titan comes with off road 4x4 package!", 
			dealershipID++,2021, 4, false, false, 60000, 0.0, 
			"https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse2.mm.bing.net%2Fth%3Fid%3DOIP.XYpjd5LghWrSy8J7Ra2O_AHaEj%26pid%3DApi&f=1", 
			LocalDate.of(2021, Month.OCTOBER, 11), sellDate);
	
	private Car car1004 = new Car("Chevy", "Volt", "Automatic", "All-Wheel Drive", "White", "New 2021 Chevy volt Hybird!", 
			dealershipID++, 2021, 4, true, false, 45000, 0.0, 
			"https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse3.mm.bing.net%2Fth%3Fid%3DOIP.-qzVYaiGQznf3rCqyYJhuAHaE8%26pid%3DApi&f=1",
			LocalDate.of(2021, Month.OCTOBER, 11), sellDate);;
	
	private Car car1005 = new Car("Ford", "F350", "Automatic", "4-Wheel Drive", "Blue", "New 2021 F350 super-duty with 4-wheel drive!", 
			dealershipID++, 2021, 3, false, false, 82000, 0.0, 
			"https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse4.mm.bing.net%2Fth%3Fid%3DOIP.GzuDDwwuaD7bedr2pAGdYgHaFj%26pid%3DApi&f=1", 
			LocalDate.of(2021, Month.OCTOBER, 11), sellDate);
	
	private Car car1006 = new Car("Dodge", "Dart", "Automatic", "Front-Wheel Drive", "Red", "New 2021 Dodge Dart!", 
			dealershipID++, 2021, 4, false, false, 30000, 0.0, 
			"https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse1.mm.bing.net%2Fth%3Fid%3DOIP.GDQAh4vqLYtzFKqsupmNBgHaEK%26pid%3DApi&f=1",
			LocalDate.of(2021, Month.OCTOBER, 11), sellDate);
	
	private Car car1007 = new Car("Dodge", "Charger", "Automatic", "Rear-Wheel Drive", "Orange", "New 2021 Dodge Charger!", 
			dealershipID++, 2021, 2, false, false, 55000, 0.0, 
			"https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse4.mm.bing.net%2Fth%3Fid%3DOIP.IHEGlWhE2gnh2Dd9_tkn5wHaEp%26pid%3DApi&f=1", 
			LocalDate.of(2021, Month.OCTOBER, 11), sellDate);
	
	private Car car1008 = new Car("Chevy", "Duramax", "Automatic", "4-Wheel Drive", "White", "New 2021 2500HD Duramax!", 
			dealershipID++, 2021, 4, false, false, 78000, 0.0, 
			"https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse3.mm.bing.net%2Fth%3Fid%3DOIP.HQ83hoQeAaflQAvS68no7gHaEY%26pid%3DApi&f=1"
			, LocalDate.of(2021, Month.JANUARY, 15), sellDate);
	
	private Car car1009 = new Car("Chevy", "Duramax", "Automatic", "4-Wheel Drive", "Grey", "New 2021 3500HD Duramax!", 
			dealershipID++, 2021, 4, false, false, 84000, 0.0, 
			"https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse2.mm.bing.net%2Fth%3Fid%3DOIP.br0TxHv487jI8hUEk8f2jAHaEK%26pid%3DApi&f=1"
			, LocalDate.of(2021, Month.FEBRUARY, 5), sellDate);
	
	private Car car1010 = new Car("Chevy", "Silverado", "Automatic", "4-Wheel Drive", "Grey", "New 2021 2500 Silverado!", 
			dealershipID++, 2021, 4, false, false, 69000, 0.0, 
			"https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse2.mm.bing.net%2Fth%3Fid%3DOIP.yfTO-kLf9gJzJI_lf-6wMAHaEK%26pid%3DApi&f=1"
			, LocalDate.of(2021, Month.JANUARY, 1), sellDate);

	
	private ArrayList<Car> carInventory = new ArrayList<>(Arrays.asList(car1000, car1001, car1002, car1003, car1004, car1005, car1006, 
			car1007, car1008, car1009, car1010)); 
	
	public ArrayList<Car> usedList(ArrayList<Car> carInventory){
		ArrayList<Car> usedArrList = new ArrayList<Car>(); 
		for(int i = 0; i < carInventory.size(); i++) {
			if(carInventory.get(i).isUsed()) {
				usedArrList.add(carInventory.get(i)); 
			}
		}
		return usedArrList; 
	}
	
	public ArrayList<Car> newList(ArrayList<Car> carInventory){
		ArrayList<Car> newArrList = new ArrayList<Car>(); 
		for(int i = 0; i < carInventory.size(); i++) {
			if(!carInventory.get(i).isUsed()) {
				newArrList.add(carInventory.get(i)); 
			}
		}
		return newArrList; 
	}
	
	public ArrayList<Car> createAuctionList(ArrayList<Car> carInventory){
		//ArrayList<Car> auctionList = new ArrayList<Car>();
		int daysFromPurchase;
		for(int i = 0; i < carInventory.size(); i++) {
		 daysFromPurchase = (int) ChronoUnit.DAYS.between(carInventory.get(i).getDealershipPurchaseDate(), currentDate); 
			if(daysFromPurchase >= auctionDays) {
				auctionList.add(carInventory.get(i)); 
			}
		}
		return auctionList; 
	}
	
	public Car selectCar(int dealershipId) {
		Car car = new Car(); 
		for(int i = 0; i < carInventory.size(); i++) {
			if(carInventory.get(i).getDealershipID() == dealershipId) {
				car = carInventory.get(i); 
			}
		}
		return car; 
	}

	public LocalDate getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(LocalDate purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public LocalDate getSellDate() {
		return sellDate;
	}

	public void setSellDate(LocalDate sellDate) {
		this.sellDate = sellDate;
	}

	public int getDealershipID() {
		return dealershipID;
	}

	public void setDealershipID(int dealershipID) {
		this.dealershipID = dealershipID;
	}

	public Car getCar1000() {
		return car1000;
	}

	public void setCar1000(Car car1000) {
		this.car1000 = car1000;
	}

	public Car getCar1001() {
		return car1001;
	}

	public void setCar1001(Car car1001) {
		this.car1001 = car1001;
	}

	public Car getCar1002() {
		return car1002;
	}

	public void setCar1002(Car car1002) {
		this.car1002 = car1002;
	}

	public Car getCar1003() {
		return car1003;
	}

	public void setCar1003(Car car1003) {
		this.car1003 = car1003;
	}

	public Car getCar1004() {
		return car1004;
	}

	public void setCar1004(Car car1004) {
		this.car1004 = car1004;
	}

	public Car getCar1005() {
		return car1005;
	}

	public void setCar1005(Car car1005) {
		this.car1005 = car1005;
	}

	public Car getCar1006() {
		return car1006;
	}

	public void setCar1006(Car car1006) {
		this.car1006 = car1006;
	}

	public Car getCar1007() {
		return car1007;
	}

	public void setCar1007(Car car1007) {
		this.car1007 = car1007;
	}

	public Car getCar1008() {
		return car1008;
	}

	public void setCar1008(Car car1008) {
		this.car1008 = car1008;
	}

	public Car getCar1009() {
		return car1009;
	}

	public void setCar1009(Car car1009) {
		this.car1009 = car1009;
	}

	public Car getCar1010() {
		return car1010;
	}

	public void setCar1010(Car car1010) {
		this.car1010 = car1010;
	}

	public ArrayList<Car> getCarInventory() {
		
		return carInventory;
	}

	public void setCarInventory(ArrayList<Car> carInventory) {
		this.carInventory = carInventory;
	}

	public LocalDate getCurrentDate() {
		return currentDate;
	}

	public void setCurrentDate(LocalDate currentDate) {
		this.currentDate = currentDate;
	}

	public int getAuctionDays() {
		return auctionDays;
	}

	public ArrayList<Car> getAuctionList() {
		return auctionList;
	}

	public void setAuctionList(ArrayList<Car> auctionList) {
		this.auctionList = auctionList;
	}
	
	
}
