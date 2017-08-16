package com.boot.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@Autowired
	UserRepository userRepository;

	@RequestMapping("/user/{id}")
	public User product(@PathVariable Integer id) {

		User user = userRepository.findOne(id);
		return user;
	}

	@RequestMapping(value = "/users", method = RequestMethod.GET)
	public List<User> productsList(Model model) {
		List<User> userList = new ArrayList<>();
		userList = (List<User>) userRepository.findAll();
		return userList;
	}

	@RequestMapping(value = "/saveuser", method = RequestMethod.POST)
	@ResponseBody
	public int saveProduct(@RequestBody User user) {
		userRepository.save(user);
		return user.getId();
	}

}
