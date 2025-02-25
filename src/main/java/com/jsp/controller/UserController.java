package com.jsp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.entitys.User;

@RestController
public class UserController
{
   @GetMapping("/print")
   public String print()
   {
	   System.out.println("hii...done");
	   return "success";
   }
//   @PostMapping("/insert")
//   public User insert()
//   {
//	   User u = new User();
//	   u.setName("aswin");
//	   u.setAge(22);
//	   u.setLoc("vizag");
//	   	return u;	
//   }
   public void aswin()
   {
	   System.out.print("new method...!!!!");
   }
}
