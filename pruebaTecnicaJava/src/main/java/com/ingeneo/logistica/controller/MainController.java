package com.ingeneo.logistica.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.ingeneo.logistica.service.AlmacenService;

@Controller
public class MainController {
	
	@Autowired
	private AlmacenService almacenService;
	
	
}
