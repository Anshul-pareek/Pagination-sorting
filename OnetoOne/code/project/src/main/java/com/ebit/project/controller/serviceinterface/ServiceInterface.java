package com.ebit.project.controller.serviceinterface;

import java.util.List;

import com.ebit.project.controller.model.Parent;

public interface ServiceInterface {

	List<Parent> getData();

	Parent getDataById(int id);

	Parent addData(Parent parent);

	Parent updateData(int id, Parent parent);

	String deletedData();

	String deleteDataId(int id);


}