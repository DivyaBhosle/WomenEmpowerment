package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lti.model.Address;
import com.lti.model.Contact_Person;
import com.lti.model.NGO;
import com.lti.service.NGOService;

@Controller
public class NGOController {

	
	
		@Autowired
		NGOService service;
		
		@RequestMapping(value="/addngo",method=RequestMethod.POST)
		public ModelAndView addUser(@RequestParam String name,String add1,String add2,String landmark,String district,String city,long pincode,String state,String contactperson,long contactno,String website,String pancard,int year)
		{
			NGO incomingNGO=new NGO();
			incomingNGO.setName_of_org(name);
			
			Contact_Person contact_person = new Contact_Person();
			contact_person.setName(contactperson);
		    contact_person.setContact_number(contactno);
		  //  contact_person.setContact_id(100);
		    incomingNGO.setContact_person(contact_person);
		    
			incomingNGO.setWebsite(website);
			incomingNGO.setPan_card_org(pancard);
			incomingNGO.setYear_of_establishment(year);
			
			Address address = new Address();
			
			address.setAdd_line1(add1);
			address.setAdd_line2(add2);
			address.setLandmark(landmark);
			address.setDistrict(district);
			address.setCity(city);
			address.setPincode(pincode);
			address.setState(state);
			//address.setAdd_id(25);
			
			incomingNGO.setAddress(address);
			
			incomingNGO.setStatus("Submitted");
			ModelAndView model=null;
			NGO n=service.addNGO(incomingNGO);

		
			if(n==null)
			{
				model= new ModelAndView("insertFailed");

			}
			else
			{
				model= new ModelAndView("insertSuccessful");
				model.addObject("ngo",n);

			}
			return model;		
		}

}
