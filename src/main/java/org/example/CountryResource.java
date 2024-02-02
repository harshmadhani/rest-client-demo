package org.example;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@Path("/countries")
public class CountryResource {
    @Inject
    @RestClient
    CountryService countryService;

    @GET
    @Path("/capital/{capitalName}")
    public String getCountryByCapital(@PathParam("capitalName") String capitalName){
        return countryService.getCountryByName(capitalName);
    }
}
