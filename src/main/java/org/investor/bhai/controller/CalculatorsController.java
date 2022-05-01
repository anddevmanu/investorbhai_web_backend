package org.investor.bhai.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorsController {
	
	
	
	@GetMapping
	public String getSimpleInterest(String amount,String time,String rate) {
		
		
		return null;
		
	}
	
	  @GetMapping("/hello0/{name}")
	  public String hello0(@PathVariable("name") String name)
	  {
	      return "Hello " + name;
	  }

	  
	  
	  
//	  @RequestMapping(value = "/hello/{name}", method = RequestMethod.POST)
//	    public String sayHi(
//	            @PathVariable("name") String name, 
//	            @RequestBody Topic topic,
//	            //@RequestParam(required = false, name = "s") String s, 
//	            @RequestParam Map<String, String> req) {
//	        
//	        return "Hi "+name +" Topic : "+ topic+" RequestParams : "+req;
//	    }
	  
	  
//	  @GetMapping(path = {"/user", "/user/{data}"})
//	  public void user(@PathVariable(required=false,name="data") String data,
//	                   @RequestParam(required=false) Map<String,String> qparams) {
//	      qparams.forEach((a,b) -> {
//	          System.out.println(String.format("%s -> %s",a,b));
//	      }
//	    
//	      if (data != null) {
//	          System.out.println(data);
//	      }
//	  }
	  
//	  @RequestMapping(value="user", method = RequestMethod.GET)
//	  public @ResponseBody Item getItem(@RequestParam("data") String itemid){
//
//	      Item i = itemDao.findOne(itemid);              
//	      String itemName = i.getItemName();
//	      String price = i.getPrice();
//	      return i;
//	  }
}

