package com.jlv.web.webApplication.sum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jlv.web.webApplication.sum.model.User;
import com.jlv.web.webApplication.sum.model.UserExample;

@RestController
@RequestMapping("/userTable")
public class UserTable {

	List<User>users = new UserExample().getUserExample();
	
	@Autowired
	UserTable user;
	
	@CrossOrigin
	@GetMapping("/all")
	public List<User> getUsers(){			
		return users;
	}
	@CrossOrigin
	@GetMapping("/all/sort/{option}")
	public List<User> getUsersSorted(@PathVariable("option") String option){
		List<User> usersSorted = new UserExample().getUserExample();
		switch (option){
			case "id":
				usersSorted.sort((o1, o2) -> o1.getId().compareTo(o2.getId()));
				break;
			case "name":
				usersSorted.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
				break;
			case "age":
				usersSorted.sort((o1, o2) -> Integer.compare(o1.getAge(), o2.getAge()));
				break;
			default:
				break;
		}
		return usersSorted;
	}
}
