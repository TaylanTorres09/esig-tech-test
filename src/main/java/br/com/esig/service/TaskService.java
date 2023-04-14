package br.com.esig.service;

import java.io.Serializable;


import br.com.esig.models.TaskModel;
import br.com.esig.models.dao.GenericDAO;

public class TaskService implements Serializable {

	private static final long serialVersionUID = 1L;	
	
	private GenericDAO<TaskModel> dao = new GenericDAO<TaskModel>();
	
	public void create(TaskModel task) {
		try {
			
			dao.create(task);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
