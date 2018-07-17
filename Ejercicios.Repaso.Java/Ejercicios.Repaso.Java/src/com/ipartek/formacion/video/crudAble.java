package com.ipartek.formacion.video;

import java.util.List;
//Pojo -> Plain Old Java Objects -> Objetos Java de toda la vida

//crud=
//create
//retrieve
//update
//delete
public interface crudAble<T> {
	//Retrieve
	List<T> getAll();
	//Create
	void insert(T pojo);
	//Update
	void Update(T pojo);
	//Delete
	void Delete(T pojo);
}
