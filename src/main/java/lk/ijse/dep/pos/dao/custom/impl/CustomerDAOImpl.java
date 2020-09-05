package lk.ijse.dep.pos.dao.custom.impl;

import lk.ijse.dep.pos.dao.CrudDAOImpl;
import lk.ijse.dep.pos.dao.custom.CustomerDAO;
import lk.ijse.dep.pos.entity.Customer;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerDAOImpl extends CrudDAOImpl<Customer,String> implements CustomerDAO {

    @Override
    public String getLastCustomerId() throws Exception {
       return (String)getSession().createNativeQuery("SELECT id FROM Customer ORDER BY id DESC LIMIT 1 ").uniqueResult();
    }


}
