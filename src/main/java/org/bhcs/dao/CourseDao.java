package org.bhcs.dao;

import io.dropwizard.hibernate.AbstractDAO;
import org.bhcs.model.Course;
import org.hibernate.SessionFactory;

import java.util.List;

public class CourseDao extends AbstractDAO<Course> {
    public CourseDao(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    public List<Course> findAll() {
        return (List<Course>) currentSession().createCriteria(Course.class).list();
    }

}
