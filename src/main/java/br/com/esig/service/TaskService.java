package br.com.esig.service;

import java.io.Serializable;

import javax.inject.Inject;

import br.com.esig.models.TaskModel;
import br.com.esig.models.dao.GenericDAO;

public class TaskService implements Serializable {

	private static final long serialVersionUID = 1L;	
	
	@Inject
	private GenericDAO<TaskModel> dao;
	
	public void create(TaskModel task) {
		dao.create(task);
	}

}
