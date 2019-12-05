package com.bharatmaveen.amity;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bharatmaveen1.anity.CalculationClass;

@Controller
public class AddController {                //, method = RequestMethod.GET

	@RequestMapping(name = "/calculation")
	public ModelAndView add(HttpServletRequest req) {
		System.out.println("GET METHOD");
		ModelAndView mv = new ModelAndView();
		mv.addObject("num1", 10);
		mv.setViewName("index.jsp");
		return mv;
	}
																								// 
	@RequestMapping("/calculation")
	public ModelAndView add( @RequestParam("A1") int a, @RequestParam("A2") int b, HttpServletRequest request, HttpServletResponse response) {
		System.out.println("Post Method");
		CalculationClass c1 = new CalculationClass();

		/*
		 * int a = Integer.parseInt(request.getParameter("A1")); 
		 * int b = Integer.parseInt(request.getParameter("A2"));
		 */

		int k = 0;
		String s1 = request.getParameter("operations");
		switch (s1) {
		case "ADDITION":
			k = c1.add(a, b);
			break;
		case "SUBSTRACTION":
			k = c1.sub(a, b);
			break;
		case "MULTIPLICATION":
			k = c1.mul(a, b);
			break;
		case "DIVSION":
			k = c1.divi(a, b);
			break;

		default:
			break;
		}

		ModelAndView mv = new ModelAndView();

		mv.setViewName("index.jsp");
		mv.addObject("Resultadd", k);
		mv.addObject("no1", a);
		mv.addObject("no2", b);

		return mv;

		/*
		 * System.out.println("hi");
		 * 
		 * int i= Integer.parseInt(request.getParameter("a")); // System.out.println(i);
		 * 
		 * ModelAndView mv1=new ModelAndView();
		 * 
		 * mv1.setViewName("display.jsp"); mv.addObject("Resultadd",i);
		 * 
		 * return mv1; request.getRequestDispatcher("display.jsp").forward(request,
		 * response);
		 */

	}

	@RequestMapping("/PreviousPage")
	public ModelAndView button(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index.jsp");
		return mv;
	}

}
