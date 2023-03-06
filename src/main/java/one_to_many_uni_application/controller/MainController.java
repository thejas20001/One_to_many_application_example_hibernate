package one_to_many_uni_application.controller;

import java.util.ArrayList;
import java.util.List;

import one_to_many_uni_application.dao.UserDao;
import one_to_many_uni_application.dto.Applications;
import one_to_many_uni_application.dto.User;

public class MainController {
	public static void main(String[] args) {
		Applications a1 = new Applications();
		a1.setName("Facebook");
		a1.setCompany("Meta");
		
		Applications a2 = new Applications();
		a2.setName("Instagram");
		a2.setCompany("Meta");
		
		Applications a3 = new Applications();
		a3.setName("Whatsapp");
		a3.setCompany("Meta");
		
		Applications a4 = new Applications();
		a4.setName("Snapchat");
		a4.setCompany("ABCD");
		
		List<Applications> list = new ArrayList<Applications>();
		list.add(a1);
		list.add(a2);
		list.add(a3);
		list.add(a4);
		
		User user = new User();
		user.setName("Thejas M");
		user.setPhone(1245641);
		user.setList(list);
		
		UserDao dao = new UserDao();
		dao.saveUser(user);
		

		
	}
		
	

}
