package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Custmodel;
import com.example.demo.service.Custservice;

@RestController
public class Custcontroller {
	@Autowired
	Custservice cs;
	//to create the data
	@PostMapping("addcust")
	public Custmodel add(@RequestBody Custmodel cm)
	{
		return cs.saveinfo(cm);
	}
	
	//to create a n data
	@PostMapping("addncust")
	public List<Custmodel> addn(@RequestBody List<Custmodel> cm)
	{
		return cs.saveninfo(cm);
	}
	
	//to read the data
	@GetMapping("showcust")
	public List<Custmodel> show()
	{
		return cs.showinfo();
	}
	
	//get by id
	@GetMapping("showbyid/{custid}")
	public Optional<Custmodel> showid(@PathVariable int custid)
	{
		return cs.showbyid(custid);
	}
	
	//to update the data
	@PutMapping("changecust")
    public Custmodel modify(@RequestBody Custmodel cm)
    {
    	return cs.changeinfo(cm);
    }
    
	//update by id
	@PutMapping("updatebyid/{custid}")
	public String modifybyid(@PathVariable int custid,@RequestBody Custmodel cm)
	{
		return cs.updateinfobyid(custid, cm);
	}
    //to delete the data
	@DeleteMapping("deletecust")
    public String del(@RequestBody Custmodel cm)
    {
    	cs.deleteinfo(cm);
    	return "Data deleted successfully";
    }
	//delete by id
	@DeleteMapping("delid/{custid}")
	public void deletebyid(@PathVariable int custid)
	{
		cs.deleteid(custid);
	}
}
