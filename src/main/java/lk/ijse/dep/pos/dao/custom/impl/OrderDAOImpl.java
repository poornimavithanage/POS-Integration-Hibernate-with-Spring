package lk.ijse.dep.pos.dao.custom.impl;

import lk.ijse.dep.pos.dao.CrudDAOImpl;
import lk.ijse.dep.pos.dao.custom.OrderDAO;
import lk.ijse.dep.pos.entity.Order;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class OrderDAOImpl extends CrudDAOImpl<Order,String>implements OrderDAO {

    public String getLastOrderId() throws Exception {
       return (String) getSession().createQuery("SELECT o.id FROM Order o ORDER BY o.id DESC ").setMaxResults(1).list().get(0);
    }


}
