/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facades;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import java.util.Collection;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;

/**
 * REST Web Service
 *
 * @author Muggi
 */
@Path("person")
public class GenericResource {

    static IPerson iperson = new IPerson();

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of GenericResource
     */
    public GenericResource() {
        if (iperson.getPersons().isEmpty()) {
            Person p1 = new Person("John", "Doe", "666", 1);
            Person p2 = new Person("Amanda", "Smith", "333", 2);
            iperson.addPerson(p1);
            iperson.addPerson(p2);
        }
    }

    /**
     * Retrieves representation of an instance of Facades.GenericResource
     *
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("application/json")
    public String getXml() {
        Gson gson = new Gson();
        String persons = gson.toJson(iperson.getPersons());
        return persons;
    }

    @GET
    @Produces("application/json")
    @Path("{id}")
    public String getPerson(@PathParam("id") int id) {
        Person p = iperson.getPerson(id);
        {
            Gson gson = new Gson();
            String person = gson.toJson(p);
            return person;
        }
    }

    @POST
    @Consumes("application/json")
    public void createPerson(String content) {
        Gson gson = new Gson();
        java.lang.reflect.Type type = new TypeToken<Person>() {
        }.getType();
        Person p = gson.fromJson(content, type);
        iperson.addPerson(p);

    }

    /**
     * PUT method for updating or creating an instance of GenericResource
     *
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("application/xml")
    public void putXml(String content) {
    }
}
