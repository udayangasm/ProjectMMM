package com.websystique.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TemplateController {//Serves Templates.

    @RequestMapping(value="/category")
    public String getMainTemplate() {
    	return "all_categories";	
    }

    @RequestMapping(value="/category/Computers")
    public String getComputersTemplate() {
    	return "category_computers";	
    }

    @RequestMapping(value="/category/Login")
    public String getLoginTemplate() {
    	return "UserManagement";	
    }


}

