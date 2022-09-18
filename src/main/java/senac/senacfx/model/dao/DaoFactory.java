package senac.senacfx.model.dao;

import senac.senacfx.db.DB;
import senac.senacfx.model.dao.impl.DepartmentDaoJDBC;
import senac.senacfx.model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

    public static SellerDao createSellerDao(){
        return new SellerDaoJDBC(DB.getConnection());
    }

    public static DepartmentDao createDepartmentDao(){
        return new DepartmentDaoJDBC(DB.getConnection());
    }

}
