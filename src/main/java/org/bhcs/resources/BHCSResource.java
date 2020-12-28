package org.bhcs.resources;

import io.dropwizard.hibernate.UnitOfWork;
import org.bhcs.dao.*;
import org.bhcs.model.*;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/")
@Consumes({MediaType.APPLICATION_JSON})
@Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
public class BHCSResource {
    AddressDao addressDao;
    CourseDao courseDao;
    CourseSummaryDao courseSummaryDao;
    TimeslotDao timeslotDao;
    MemberDao memberDao;
    ClassroomDao classroomDao;

    public BHCSResource(AddressDao addressDao, CourseDao courseDao, CourseSummaryDao courseSummaryDao, TimeslotDao timeslotDao, MemberDao memberDao, ClassroomDao classroomDao) {
        this.addressDao = addressDao;
        this.courseDao = courseDao;
        this.courseSummaryDao = courseSummaryDao;
        this.timeslotDao = timeslotDao;
        this.memberDao = memberDao;
        this.classroomDao = classroomDao;
    }

    @GET
    @Path("/hello")
    public String get() {
        return "hello!";
    }

    @GET
    @Path("address/getAll")
    @UnitOfWork
    public List<Address> getAllAddress() {
        return addressDao.findAll();
    }

    @GET
    @Path("course/getAll")
    @UnitOfWork
    public List<Course> getAllCourse() {
        return courseDao.findAll();
    }

    @GET
    @Path("timeslot/getAll")
    @UnitOfWork
    public List<Timeslot> getAllTimeslot() {
        return timeslotDao.findAll();
    }

    @GET
    @Path("classroom/getAll")
    @UnitOfWork
    public List<Classroom> getAllClassroom() {
        return classroomDao.findAll();
    }

    @GET
    @Path("courseSummary/getAll")
    @UnitOfWork
    public List<CourseSummary> getAllCourseSummary() {
        return courseSummaryDao.findAll();
    }

    @GET
    @Path("member/getAll")
    @UnitOfWork
    public List<Member> getAllMember() {
        return memberDao.findAll();
    }

}
