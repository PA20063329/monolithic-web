package com.wipro.ClienUi.adapters;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.wipro.ClienUi.domain.SaveCredentailRequest;
import com.wipro.ClienUi.domain.SaveCredentialResponse;

@Service
public class PasswordVaultadapter {

	@Autowired
	private RestTemplate restTemp;
	
	public SaveCredentialResponse saveUpdateCredentials(SaveCredentailRequest reqeustObj) {
		Map<String,String> uriParam = new HashMap<>();
		String url = "http://localhost:901/api/passwordVault/saveUpdateCredntials";
		try {
			ResponseEntity<SaveCredentialResponse> response = restTemp.postForEntity(url, reqeustObj, SaveCredentialResponse.class, uriParam);
			return response.getBody();
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
