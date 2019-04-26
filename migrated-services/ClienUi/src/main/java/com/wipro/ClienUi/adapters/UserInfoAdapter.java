package com.wipro.ClienUi.adapters;


import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.wipro.ClienUi.domain.LoginRequest;
import com.wipro.ClienUi.domain.LoginResponse;

@Service
public class UserInfoAdapter {
	
	@Autowired
	private RestTemplate restTemp;

	public LoginResponse loginUser(LoginRequest loginReq) {
		Map<String,String> uriParam = new HashMap<>();
		String url = "http://localhost:800/api/userInfo/loginValidator";
		ResponseEntity<LoginResponse> response = restTemp.postForEntity(url, loginReq, LoginResponse.class, uriParam);
		return response.getBody();
	}

}
