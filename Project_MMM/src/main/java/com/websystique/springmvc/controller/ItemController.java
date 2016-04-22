package com.websystique.springmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.websystique.springmvc.service.ItemService;

@Controller
public class ItemController {//Serves Data.

    @Autowired
    ItemService itemService;  //Service which will do all data retrieval/manipulation work
 
    @RequestMapping("/categories")
    public ResponseEntity<List> listAllCategories() {
		System.out.println("*************************************ListAllItems");
    	List<String> categories = 	itemService.populateAllCategories();
        if(categories.isEmpty()){
            return new ResponseEntity<List>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<List>(categories, HttpStatus.OK);
    }

	@RequestMapping(value="/item/Computers")
    public ResponseEntity<List> listAllComputers() {
		System.out.println("*************************************ListAllComputers");
    	List items = 	itemService.findItemsByCategory("computers");
        if(items.isEmpty()){
            return new ResponseEntity<List>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<List>(items, HttpStatus.OK);
    }

	@RequestMapping(value="/item/Login")
    public ResponseEntity<List> listAllLogins() {
		System.out.println("*************************************ListLogin");
    	List items = 	itemService.findItemsByCategory("computers");
        if(items.isEmpty()){
            return new ResponseEntity<List>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<List>(items, HttpStatus.OK);
    }





}
