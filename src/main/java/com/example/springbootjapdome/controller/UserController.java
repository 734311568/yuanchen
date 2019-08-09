/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.springbootjapdome.controller;

import com.example.springbootjapdome.model.Userinfo;
import com.example.springbootjapdome.repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author 73431
 */
@Controller
public class UserController {
	
	@Autowired
	private UserRepository userRepository;

	@RequestMapping("/user")
	
	public String getUser(Model model) {
		List<Userinfo> queryUser = userRepository.findList();
		 model.addAttribute("queryUser",queryUser);
		return "userList";
	}
	
 
}
