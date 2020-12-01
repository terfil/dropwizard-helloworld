package org.bhcs.dao;

import io.dropwizard.hibernate.AbstractDAO;
import org.bhcs.model.Address;
import org.hibernate.SessionFactory;
import java.util.List;

public class AddressDao extends AbstractDAO<Address> {
    public AddressDao(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    public List<Address> findAll() {
        return (List<Address>) currentSession().createCriteria(Address.class).list();
    }
}
