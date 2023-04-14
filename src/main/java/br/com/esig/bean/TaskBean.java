package br.com.esig.bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import br.com.esig.models.TaskModel;
import br.com.esig.service.TaskService;


@RequestScoped
@ManagedBean(name = "taskBean")
public class TaskBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private TaskModel task = new TaskModel();
	
	private TaskService service = new TaskService();

	public String create() {

		try {
//			service.create(task);
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

	public TaskService getService() {
		return service;
	}

	public void setService(TaskService service) {
		this.service = service;
	}
	
	

}
