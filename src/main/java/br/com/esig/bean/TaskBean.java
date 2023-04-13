package br.com.esig.bean;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.esig.models.TaskModel;
import br.com.esig.service.TaskService;


@Named("taskBean")
@RequestScoped
public class TaskBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private TaskModel task;
	
	@Inject
	private TaskService service;
	
	public String create() {
		try {
			service.create(task);
			task = new TaskModel();
			
			return "";
		} catch (Exception e) {
			e.printStackTrace();
			return "";
		}
	}

	public TaskModel getTask() {
		return task;
	}

	public void setTask(TaskModel task) {
		this.task = task;
	}

}
