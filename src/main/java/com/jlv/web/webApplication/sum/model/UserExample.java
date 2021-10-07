package com.jlv.web.webApplication.sum.model;

import java.util.ArrayList;
import java.util.List;

public class UserExample {
	List <User> users = new ArrayList<User>();
	public UserExample() {
		users.add(new User("Jose", "123", 25));
		users.add(new User("Ari", "456", 20));
		users.add(new User("Ena", "458", 10));
		users.add(new User("Ana1", "324", 11));
		users.add(new User("Cna2", "648", 12));
		users.add(new User("Yna3", "124", 13));
		users.add(new User("Bna4", "756", 14));
		users.add(new User("Ana5", "111", 15));
		users.add(new User("Dna6", "000", 16));
		users.add(new User("Hna7", "014", 17));
		users.add(new User("Zna8", "085", 18));
	}
	public List<User> getUserExample() {
		return users;
	}
}
