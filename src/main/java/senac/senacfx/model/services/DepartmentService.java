package senac.senacfx.model.services;

import senac.senacfx.model.entities.Department;

import java.util.ArrayList;
import java.util.List;

public class DepartmentService {

    public List<Department> findAll(){
        //Dados MOCK (fake) so para testar, sem puxar do banco por hora
        List<Department> list = new ArrayList<>();
        list.add(new Department(1,"Computadores"));
        list.add(new Department(2,"Alimentação"));
        list.add(new Department(3,"Financeiro"));
        return list;
    }
}
