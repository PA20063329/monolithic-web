package com.wipro.ClienUi.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wipro.ClienUi.adapters.ItemAdapter;
import com.wipro.ClienUi.adapters.PasswordVaultadapter;
import com.wipro.ClienUi.adapters.UserInfoAdapter;
import com.wipro.ClienUi.domain.Item;
import com.wipro.ClienUi.domain.LoginRequest;
import com.wipro.ClienUi.domain.LoginResponse;
import com.wipro.ClienUi.domain.SaveCredentailRequest;
import com.wipro.ClienUi.domain.SaveCredentialResponse;

@Controller
public class ClientUIController {
	
	@Autowired
	private ItemAdapter itemAdapter;
	
	@RequestMapping("/") 
	public String pupulateVaultPage(ModelMap model) {
		List<Item> itmList = itemAdapter.getAllItem();
		model.addAttribute("itmList", itmList);
		return "userHome"; 
	}
	
	/*
	 * @Autowired UserInfoAdapter userAdapter;
	 * 
	 * @Autowired private HttpSession httpSession;
	 * 
	 * @Autowired private PasswordVaultadapter passwordVaultAdapter;
	 */

	/*
	 * @RequestMapping("/") public String loadLoginPage() { return "login"; }
	 * 
	 * @RequestMapping("/login") public String loginValidator(HttpServletRequest
	 * request, HttpServletResponse resonse, ModelMap model) { String userName =
	 * request.getParameter("user"); String password = request.getParameter("pass");
	 * LoginRequest loginReq = new LoginRequest(userName, password); LoginResponse
	 * logResp = userAdapter.loginUser(loginReq); if(logResp!=null &&
	 * logResp.getLoginStatus()) { httpSession.setAttribute("userId",
	 * logResp.getUserId()); return pupulateVaultPage(model); }else {
	 * model.addAttribute("invalidCred", "success"); return "login"; } }
	 * 
	 * @RequestMapping("userHome") public String pupulateVaultPage(ModelMap model) {
	 * Integer userId = (Integer) httpSession.getAttribute("userId"); if(userId ==
	 * null || userId == 0) { return "login"; }else { model.addAttribute("userId",
	 * userId); return "userHome"; } }
	 * 
	 * @RequestMapping("/addCredentials") public String addCredentials(ModelMap
	 * model) { return "createCred"; }
	 * 
	 * @RequestMapping("/saveCredentials") public String saveCredentials(ModelMap
	 * model, HttpServletRequest request, HttpServletResponse resonse) {
	 * SaveCredentailRequest reqeustObj = new SaveCredentailRequest();
	 * reqeustObj.setId(0);
	 * reqeustObj.setUserName(request.getParameter("userName"));
	 * reqeustObj.setEmailAddress(request.getParameter("email"));
	 * reqeustObj.setAccount(request.getParameter("account"));
	 * reqeustObj.setPassword(request.getParameter("password"));
	 * reqeustObj.setUserId((Integer) httpSession.getAttribute("userId"));
	 * SaveCredentialResponse responseObj =
	 * passwordVaultAdapter.saveUpdateCredentials(reqeustObj); if(responseObj!= null
	 * && responseObj.getStatus()) { return pupulateVaultPage(model); }else { return
	 * "saveError"; } }
	 */
}
	
