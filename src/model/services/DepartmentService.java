package model.services;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class DepartmentService {
	
	private DepartmentDao dao = DaoFactory.createDepartmentDao();
	
	//Dados mockados = de mentirinha
	public List<Department> findAll(){
		return dao.findAll();
	}

	public void saveOrUpdate(Department obj) {
		if(obj.getId() == null) {
			dao.insert(obj);
		}
		else {
			dao.update(obj);
		}
	}
	
	public void remove(Department obj) { //Remover um departamento do banco de dados
		dao.deleteById(obj.getId());
	}

}
