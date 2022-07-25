package com.chainsys.springmvc.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model; 
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation. RequestMapping; 
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SampleController {
	@RequestMapping("/")
	public String index() {
		return "indexa"; // index is the name of the view 
		// the runtime will search for index.jsp in webapp/WEB-INF/views folder
	}
	@PostMapping("/print")
	public String print(@RequestParam("username") String uName, Model model) {
		model.addAttribute("username",uName); // to share data from controller to view
		return "printa";// print is the name of the view 
		// the runtime will search for print.jsp in webapp/WEB-INF/views folder
	}
}
