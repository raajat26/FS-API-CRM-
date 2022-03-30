package com.example.FS.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.FS.Controller.Entities.Leads3;
import com.example.FS.LeadsService.LeadsService;

@Controller

public class usrController {
	//@Autowired
	//public LeadsService ls;
	@RequestMapping("/")

	//@GetMapping("/homepage")
	public String home() {
		return "normal/user_dashboard";
	}
}
