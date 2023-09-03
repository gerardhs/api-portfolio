package com.gerardheredia.apiportfolio.home.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gerardheredia.apiportfolio.common.constants.UrlMvcConstants;
import com.gerardheredia.apiportfolio.common.util.ApiResponse;
import com.gerardheredia.apiportfolio.home.service.HomeService;

@RestController
@RequestMapping(UrlMvcConstants.HOME_URL)
public class HomeController {
	
	@Autowired
	private HomeService service;
	
	@GetMapping
	public ApiResponse<String> test() {
		return ApiResponse.success(service.test());
	}

}
