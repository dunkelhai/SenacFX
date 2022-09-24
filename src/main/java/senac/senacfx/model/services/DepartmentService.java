package senac.senacfx.model.services;

import senac.senacfx.model.dao.DaoFactory;
import senac.senacfx.model.dao.DepartmentDao;
import senac.senacfx.model.entities.Department;

import java.util.ArrayList;
import java.util.List;

public class DepartmentService {

    //dependencia injetada usando padrao factory
    private DepartmentDao dao = DaoFactory.createDepartmentDao();

    public List<Department> findAll() {
        return dao.findAll();

        //Dados MOCK (fake) so para testar, sem puxar do banco por hora
//        List<Department> list = new ArrayList<>();
//        list.add(new Department(1,"Computadores"));
//        list.add(new Department(2,"Alimentação"));
//        list.add(new Department(3,"Financeiro"));
//        return list;

    }
    public void saveOrUpdate(Department obj){
        if (obj.getId() == null){
            dao.insert(obj);
        } else {
            dao.update(obj);
            }
        }

        public void remove(Department obj){
            dao.deleteById(obj.getId());
        }
    }

