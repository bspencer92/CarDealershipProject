package com.CarDealership.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.CarDealership.Entity.Car;

@Controller
public class CarController {

	@Autowired
	CarService carLogic;

	@GetMapping("/index")
	public String welcome(Model model) {
//		List<CarService> c1 = new ArrayList<CarService>();
//		for(CarService hold: c1) {
//			System.out.println(c1.get(0));
//		}
//		System.out.println(carLogic.getCarInventory());
		model.addAttribute("carinventory", carLogic.getCarInventory());
		return "index";
	}
	
	@GetMapping("/index-all")
	public String listAll(Model model) {
//		List<CarService> c1 = new ArrayList<CarService>();
//		for(CarService hold: c1) {
//			System.out.println(c1.get(0));
//		}
//		System.out.println(carLogic.getCarInventory());
		model.addAttribute("carinventory", carLogic.getCarInventory());
		return "index-all";
	}

	@PostMapping("/selectedCar")
	public String handleIndexAll(Model model, @RequestParam int dealershipId, Car car, HttpSession session) {
		car = carLogic.selectCar(dealershipId); 
		model.addAttribute("car", car); 
		return "selectedCar"; 

	}
	
	@GetMapping("/selectedCar")
	public ModelAndView selectedCar(Model model) {
		System.out.println("selected a car");
		return new ModelAndView("selectedCar", "car", new Car());
	}
	
	@GetMapping("/index-used")
	public String usedInventory(Model model) {
//		List<CarService> c1 = new ArrayList<CarService>();
//		for(CarService hold: c1) {
//			
//			System.out.println(c1.get(0));
//		}
//		System.out.println(carLogic.getCarInventory());
		model.addAttribute("usedcarinventory", carLogic.usedList(carLogic.getCarInventory()));
		return "index-used";
	}
	
	@GetMapping("/index-new")
	public String newInventory(Model model) {
//		List<CarService> c1 = new ArrayList<CarService>();
//		for(CarService hold: c1) {
//			
//			System.out.println(c1.get(0));
//		}
//		System.out.println(carLogic.getCarInventory());
		model.addAttribute("newcarinventory", carLogic.newList(carLogic.getCarInventory()));
		return "index-new";
	}
	
	@GetMapping("/auction")
	public String auction(Model model) {
		model.addAttribute("auctionList", carLogic.createAuctionList(carLogic.getCarInventory()));
		return "auction";
	}
}
