package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Custmodel;
import com.example.demo.repository.Custrepo;

@Service
public class Custservice {
	@Autowired
	Custrepo cr;
	public Custmodel saveinfo(Custmodel cm)
	{
		return cr.save(cm);
	}
	public List<Custmodel> saveninfo(List<Custmodel> cm)
	{
		return (List<Custmodel>)cr.saveAll(cm);
	}
	public List<Custmodel> showinfo()
	{
		return cr.findAll();
	}
	public Optional<Custmodel> showbyid(int custid)
	{
		return cr.findById(custid);
	}
	public Custmodel changeinfo(Custmodel cm)
	{
		return cr.saveAndFlush(cm);
	}
	public String updateinfobyid(int custid,Custmodel cm)
	{
		cr.saveAndFlush(cm);
		if(cr.existsById(custid))
		{
			return "Updated";
		}
		else
		{
			return "Enter valid id";
		}
	}
	public void deleteinfo(Custmodel cm)
	{
		cr.delete(cm);
	}
	public void deleteid(int custid)
	{
		cr.deleteById(custid);
	}

}
