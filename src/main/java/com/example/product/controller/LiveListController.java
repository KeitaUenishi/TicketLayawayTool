package com.example.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.product.service.LiveListService;

@Controller
@RequestMapping
public class LiveListController {

	@Autowired
	private LiveListService liveListService;

	@GetMapping
	public String findAll(Model model) {

		model.addAttribute("liveList", liveListService.findAll());
		return "liveList";
	}
}
