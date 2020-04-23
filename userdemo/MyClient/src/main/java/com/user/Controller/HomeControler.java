package com.user.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.Service.LService;
import com.userModel.Details;

@RestController
public class HomeControler {
	@Autowired
	LService service;
	
	@GetMapping("/verify")
	public String status()
	{
		return "user is working";
	}
	
	/*
	 * @RequestMapping("/List") void get() { List<Details> list=service.getAll();
	 * System.out.println(list);
	 * 
	 * }
	 */
}
