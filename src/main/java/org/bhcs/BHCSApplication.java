package org.bhcs;

import io.dropwizard.Application;
import io.dropwizard.db.PooledDataSourceFactory;
import io.dropwizard.hibernate.HibernateBundle;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import org.bhcs.configuration.BHCSConfiguration;
import org.bhcs.dao.AddressDao;
import org.bhcs.model.Address;
import org.bhcs.resources.AddressResource;

public class BHCSApplication
    extends Application<BHCSConfiguration> {

    public static void main(String[] args) throws Exception {
        new BHCSApplication().run(args);
    }

    private final HibernateBundle<BHCSConfiguration> hibernateBundle = new HibernateBundle<BHCSConfiguration>(Address.class) {
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
        environment.jersey().register(new AddressResource(addressDao));
    }
}
