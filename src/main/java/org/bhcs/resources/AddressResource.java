package org.bhcs.resources;

import io.dropwizard.hibernate.UnitOfWork;
import org.bhcs.dao.AddressDao;
import org.bhcs.model.Address;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.Optional;

@Path("/address")
@Consumes({MediaType.APPLICATION_JSON})
@Produces({MediaType.APPLICATION_JSON})
public class AddressResource {
    AddressDao addressDao;

    public AddressResource(AddressDao addressDao) {
        this.addressDao = addressDao;
    }

    @GET
    @Path("/hello")
    public String get() {
        return "hello!";
    }

    @GET
    @Path("/getAll")
    @UnitOfWork
    public List<Address> getAll() {
        return addressDao.findAll();
    }
}
