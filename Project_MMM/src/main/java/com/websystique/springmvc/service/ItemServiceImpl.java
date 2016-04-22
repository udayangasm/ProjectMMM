package com.websystique.springmvc.service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import com.websystique.springmvc.model.Computer;
import com.websystique.springmvc.model.Phone;
import com.websystique.springmvc.model.Printer;
import com.websystique.springmvc.model.State;

@Service("itemService")
public class ItemServiceImpl implements ItemService{
	
	private static final AtomicLong counter = new AtomicLong();

	private static List<Computer> computers;
	
	
	static{
		computers= populateDummyComputers();
		
	}
	
	public List findItemsByCategory(String category) {

		if(StringUtils.equalsIgnoreCase(category, "computers")){
				return computers;
		}
		return computers;
	}

	public Object findItemById(long id, String category) {
		if(category.equalsIgnoreCase("computers")){
			for(Computer computer : computers){
				if(computer.getId() == id){
					return computer;
				}
			}
		}		return null;
	}
	

	public List<String> populateAllCategories(){
		List<String> allCategories = new ArrayList<String>();
		allCategories.add("Computers");
		return allCategories;
	}

	
	private static List<Computer> populateDummyComputers(){
		List<Computer> computers = new ArrayList<Computer>();
		
		computers.add(new Computer(counter.incrementAndGet(),"Lenovo", "T420", State.NEW, 500, 2.4, 8, 1000));
		computers.add(new Computer(counter.incrementAndGet(),"Lenovo", "T640", State.NEW, 2000, 3.6, 32, 2000));
		computers.add(new Computer(counter.incrementAndGet(),"Apple", "IMAC21.5", State.NEW, 1400, 2.6, 8, 1000));
		computers.add(new Computer(counter.incrementAndGet(),"HP", "Pavilion", State.NEW, 900, 2.4, 8, 1000));
		computers.add(new Computer(counter.incrementAndGet(),"Dell", "E6510", State.NEW, 500, 2.3, 8, 500));
		return computers;
	}

	
}
