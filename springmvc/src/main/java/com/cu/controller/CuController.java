package com.cu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value ="/v1")
public class CuController 
{
    //TODO 增加日志输出
	
	@GetMapping(value = "/index")
	public String getIndex(Model model)
	{
		model.addAttribute("name", "CheerUp");
//		return "forward:cheerup.jsp";
		return "redirect:/cheerup.jsp";
	}
}
