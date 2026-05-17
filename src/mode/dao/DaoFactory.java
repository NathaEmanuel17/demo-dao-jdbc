package mode.dao;

import db.DB;
import model.dao.impl.SellerDaoJDBC;
import model.dao.impl.DepartamentDaoJDBC;

public class DaoFactory {

	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}
	
	public static DepartmentDao createDepartmentDao() {
		return new DepartamentDaoJDBC(DB.getConnection());
	}
}
