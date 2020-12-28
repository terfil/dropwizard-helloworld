package org.bhcs.dao;

import io.dropwizard.hibernate.AbstractDAO;
import org.bhcs.model.Course;
import org.bhcs.model.Timeslot;
import org.hibernate.SessionFactory;

import java.util.List;

public class TimeslotDao extends AbstractDAO<Timeslot> {
    public TimeslotDao(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    public List<Timeslot> findAll() {
        return (List<Timeslot>) currentSession().createCriteria(Timeslot.class).list();
    }

}
