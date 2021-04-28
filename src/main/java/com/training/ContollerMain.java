package com.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;


import com.training.model.Booking;

@Controller
public class ContollerMain {
	
	@Autowired
	BookingRepo repo;

	@RequestMapping("/")
	public String home() {
		return "index";
	}
	
	@RequestMapping(value="offers")
	public String offers(@RequestParam("price")int i,@RequestParam("id")String j,@RequestParam("usern")String k,Model m) {
	m.addAttribute("price", i);
	m.addAttribute("id", j);
	m.addAttribute("usern",k);
	return "entery";
		
	}
	
	@GetMapping("bookingdetails")
	public String bookingdetails(@RequestParam("uname") String uname, Model m)
	{
		m.addAttribute("ans",repo.findByuname(uname));
		return "mod";
	}

	
	@GetMapping(value="details")
	public String details(Model m) {
		m.addAttribute("ans", repo.findAll());
		return "showdata";
	}
	
	@RequestMapping(value="test")
	public String test(@ModelAttribute Booking a, Model m,@RequestParam("usern") String name) {
		m.addAttribute("name",name);
		m.addAttribute("ans", repo.save(a));
		return "showdata";
	}
	
	@GetMapping(value="cancelbooking")
	public String cancelbooking(@RequestParam Integer bid) {
		repo.deleteById(bid);
		return "index";
		
	}
	
	@ExceptionHandler(value=Exception.class)
	public String exceptionHandlerNull() {
		return "errorfile";
		
	}

	
	

}
