package org.bhcs.dao;

import io.dropwizard.hibernate.AbstractDAO;
import org.bhcs.model.Member;
import org.bhcs.model.Timeslot;
import org.hibernate.SessionFactory;

import java.util.List;

public class MemberDao extends AbstractDAO<Member> {
    public MemberDao(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    public List<Member> findAll() {
        return (List<Member>) currentSession().createCriteria(Member.class).list();
    }

}
