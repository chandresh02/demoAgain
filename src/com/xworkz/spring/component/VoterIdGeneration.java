package com.xworkz.spring.component;

import java.util.Date;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class VoterIdGeneration {
	
	
	public  VoterIdGeneration()
	{
		System.out.println(this.getClass().getSimpleName() + " object created");
	}

	 @RequestMapping("/VoterId.do")
	public String onSend(@RequestParam String name ,@RequestParam String fathername,
			@RequestParam int age,@RequestParam String gender ,@RequestParam String bdate,@RequestParam String address, Model  model) {
		System.out.println("invoke onSend from " + this.getClass().getSimpleName());
		System.out.println("NAME:\t" +name);
		System.out.println("FATHERNAME:\t" +fathername);
		System.out.println("AGE:\t" +age);
		System.out.println("GENDER:\t"+ gender);
		System.out.println("DATE: \t"+ bdate);
		model.addAttribute(name);
		System.out.println("ADDRESS: \t" + address);
		return "/Success.jsp";
	}    
}
