package org.bhcs.dao;

import io.dropwizard.hibernate.AbstractDAO;
import org.bhcs.model.Classroom;
import org.bhcs.model.Course;
import org.hibernate.SessionFactory;

import java.util.List;

public class ClassroomDao extends AbstractDAO<Classroom> {
    public ClassroomDao(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    public List<Classroom> findAll() {
        return (List<Classroom>) currentSession().createCriteria(Classroom.class).list();
    }

}
