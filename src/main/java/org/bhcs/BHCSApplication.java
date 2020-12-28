package org.bhcs;

import io.dropwizard.Application;
import io.dropwizard.db.PooledDataSourceFactory;
import io.dropwizard.hibernate.HibernateBundle;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import org.bhcs.configuration.BHCSConfiguration;
import org.bhcs.dao.*;
import org.bhcs.model.*;
import org.bhcs.resources.BHCSResource;

public class BHCSApplication
    extends Application<BHCSConfiguration> {

    public static void main(String[] args) throws Exception {
        new BHCSApplication().run(args);
    }

    private final HibernateBundle<BHCSConfiguration> hibernateBundle = new HibernateBundle<BHCSConfiguration>(Address.class, Course.class, CourseSummary.class, Timeslot.class, Classroom.class, Member.class) {
        @Override
        public PooledDataSourceFactory getDataSourceFactory(BHCSConfiguration bhcsConfiguration) {
            return bhcsConfiguration.getDataSourceFactory();
        }
    };

    @Override
    public void initialize(final Bootstrap<BHCSConfiguration> bootstrap) {
        bootstrap.addBundle(hibernateBundle);
    }

    @Override
    public void run(BHCSConfiguration configuration,
                    Environment environment) {
        final AddressDao addressDao = new AddressDao(hibernateBundle.getSessionFactory());
        final CourseDao courseDao = new CourseDao(hibernateBundle.getSessionFactory());
        final TimeslotDao timeslotDao = new TimeslotDao(hibernateBundle.getSessionFactory());
        final MemberDao memberDao = new MemberDao(hibernateBundle.getSessionFactory());
        final CourseSummaryDao courseSummaryDao = new CourseSummaryDao(hibernateBundle.getSessionFactory());
        final ClassroomDao classroomDao = new ClassroomDao(hibernateBundle.getSessionFactory());
        environment.jersey().register(new BHCSResource(addressDao, courseDao, courseSummaryDao, timeslotDao, memberDao, classroomDao));
    }
}
