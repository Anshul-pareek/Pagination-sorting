package com.ebit.project.controller.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ebit.project.controller.model.Parent;
import com.ebit.project.controller.serviceinterface.ServiceInterface;
import com.ebit.project.repo.HomeRepo;

@Service
public class ServiceImpl implements ServiceInterface{

	@Autowired
	private HomeRepo repo;
	
	@Override
	public List<Parent> getData() {
		return repo.findAll();
	}

	@Override
	public Parent getDataById(int id) {
		return repo.findById(id).get();
	}

	@Override
	public Parent addData(Parent parent) {
		return repo.save(parent);
	}

	@Override
	public Parent updateData(int id, Parent parent) {
		Parent data = repo.findById(id).get();
		
		if(data != null) {
			data.setName(parent.getName());
			data.setChild(parent.getChild());;
		}
		return repo.save(data);
	}

	@Override
	public String deletedData() {
		repo.deleteAll();
		return "data deleted";
		
	}
	
	@Override
	public String deleteDataId(int id) {
		repo.deleteById(id);;
		return "data deleted";
		
	}
	
	
	

}