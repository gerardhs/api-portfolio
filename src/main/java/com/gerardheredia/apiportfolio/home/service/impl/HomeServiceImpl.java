package com.gerardheredia.apiportfolio.home.service.impl;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import com.gerardheredia.apiportfolio.home.service.HomeService;

@Service
@Lazy
public class HomeServiceImpl implements HomeService {

	@Override
	public String test() {
		return "Test API call succesful";
	}
	
}
