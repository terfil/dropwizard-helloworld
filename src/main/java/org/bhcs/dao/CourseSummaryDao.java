package org.bhcs.dao;

import io.dropwizard.hibernate.AbstractDAO;
import org.bhcs.model.Course;
import org.bhcs.model.CourseSummary;
import org.hibernate.SessionFactory;

import java.util.List;

public class CourseSummaryDao extends AbstractDAO<CourseSummary> {
    public CourseSummaryDao(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    public List<CourseSummary> findAll() {
        return (List<CourseSummary>) currentSession().createCriteria(CourseSummary.class).list();
    }

}
