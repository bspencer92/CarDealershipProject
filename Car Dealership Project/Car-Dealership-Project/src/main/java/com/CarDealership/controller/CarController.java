package com.CarDealership.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.CarDealership.Entity.Car;
import com.CarDealership.Entity.User;

@Controller
public class CarController {

	@Autowired
	CarService carService;

//	@Autowired
//	UserService userService;
	
	Car clickedCar = new Car(); 

	@GetMapping("/index")
	public String welcome(Model model, HttpSession session) {
		//userService.saveUser(user);

		
		return "index";
	}
	
	@GetMapping("/thank-you")
	public String thankYou(Model model, HttpSession session) {
		//userService.saveUser(user);

		
		return "thank-you";
	}
	
	

	@GetMapping("/index-all")
	public String listAll(Model model) {
//		List<CarService> c1 = new ArrayList<CarService>();
//		for(CarService hold: c1) {
//			System.out.println(c1.get(0));
//		}
		System.out.println("index all ############ ");
		model.addAttribute("carinventory", carService.getCarInventory());
		model.addAttribute("car", new Car());
		return "index-all";
	}

	@PostMapping("/index-all")
	public String handleIndexAll(Model model, Integer dealershipId, @ModelAttribute("car") Car car) {
		System.out.println(car.getDescription());
		car = carService.selectCar(dealershipId);
		//clickedCar = car; 
		System.out.println(car.getDescription());
		model.addAttribute("car", car);
		return "selectedCar";

	}

	@GetMapping("/selectedCar")
	public ModelAndView selectedCar(Model model, Integer dealershipId) {
		clickedCar = carService.selectCar(dealershipId); 
		System.out.println(dealershipId);
		return new ModelAndView("selectedCar", "car", carService.selectCar(dealershipId));
	}

	@PostMapping("/selectedCar")
	public String handleSelectedCar(Model model, @ModelAttribute("car") Car car, User user) {
		carService.saveBuyer(car.getBuyer(), clickedCar.getDealershipId()); 
		//model.addAttribute("car", carService.selectCar(dealershipId));
		System.out.println(clickedCar.getBuyer().getFirstName());
		return "thank-you";
	}

	@GetMapping("/index-used")
	public String usedInventory(Model model) {
//		List<CarService> c1 = new ArrayList<CarService>();
//		for(CarService hold: c1) {
//			
//			System.out.println(c1.get(0));
//		}
//		System.out.println(carLogic.getCarInventory());
		model.addAttribute("usedcarinventory", carService.usedList(carService.getCarInventory()));
		return "index-used";
	}

	@PostMapping("/index-used")
	public String handleIndexUsed(Model model, Integer dealershipId, @ModelAttribute("usedcarInventory") Car car) {
		// System.out.println(car.getDescription());
		car = carService.selectCar(dealershipId);
		System.out.println(car.getDescription());
		model.addAttribute("car", car);
		return "selectedCar";

	}

	@GetMapping("/index-new")
	public String newInventory(Model model) {
//		List<CarService> c1 = new ArrayList<CarService>();
//		for(CarService hold: c1) {
//			
//			System.out.println(c1.get(0));
//		}
//		System.out.println(carLogic.getCarInventory());
		model.addAttribute("newcarinventory", carService.newList(carService.getCarInventory()));
		return "index-new";
	}

	@PostMapping("/index-new")
	public String handleIndexNew(Model model, Integer dealershipId, @ModelAttribute("newcarInventory") Car car) {
		// System.out.println(car.getDescription());
		car = carService.selectCar(dealershipId);
		System.out.println(car.getDescription());
		model.addAttribute("car", car);
		return "selectedCar";

	}

	@GetMapping("/auction")
	public String auction(Model model) {
		model.addAttribute("auctionList", carService.createAuctionList(carService.getCarInventory()));
		return "auction";
	}
	
	@GetMapping("/purchase-history")
	public String purchaseHistory(Model model) {
		System.out.println(carService.getBuyerList().get(0).getCar().getMake());
		model.addAttribute("buyerlist", carService.getBuyerList());
		return "purchase-history";
	}
	
//	@PostMapping("/purchase-history")
//	public String handlePurchaseHistory(Model model,  @ModelAttribute("buyer-list") User user) {
//		model.addAttribute("buyer-list", carService.getBuyerList());
//		return "purchase-history";
//
//	}
	
	@GetMapping("/search")
	public ModelAndView search(Model model, Car car){
		//model.addAttribute("car", car); 
		//model.addAttribute("searchList", carService.createSearchList(car.getModel())); 
		return new ModelAndView("search", "car", new Car()); 
	}
	@PostMapping("/search-results")
	public String handleSearch(Model model, @ModelAttribute("car") Car car) {
		model.addAttribute("car", car); 
		model.addAttribute("searchList", carService.createSearchList(car.getModel())); 
		return "search-results"; 
	}
	
	@GetMapping("/search-results")
	public ModelAndView searchResults(Model model, Car car){
		//model.addAttribute("car", car); 
		//model.addAttribute("searchList", carService.createSearchList(car.getModel())); 
		return new ModelAndView("search", "car", new Car()); 
	}
	
}
