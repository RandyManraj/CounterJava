package com.randy.strings;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CounterController {
	Integer counter = 0;
	@RequestMapping("/")
	public String index(Model model, HttpSession session) {
		Integer counter = (Integer) session.getAttribute("counter");
		session.setAttribute("counter", counter);
		return "index.jsp";
	}
	
	@RequestMapping("/counter")
	public String counter(HttpSession session) {
		counter++;
		session.setAttribute("counter", counter);
		Integer counter = (Integer) session.getAttribute("counter");
		session.setAttribute("counter", counter);
		return "counter.jsp";
	}
	@RequestMapping("/counter2")
	public String counter2(HttpSession session){
		counter += 2;
		session.setAttribute("counter", counter);
		Integer counter = (Integer) session.getAttribute("counter");
		session.setAttribute("counter", counter);
		return "counter.jsp";
		
	}
	@RequestMapping("/reset")
	public String reset(HttpSession session) {
		counter = 0;
		return "index.jsp";
	}
	
}
