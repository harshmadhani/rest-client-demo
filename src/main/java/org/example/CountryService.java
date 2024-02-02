package org.example;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient(baseUri = "https://restcountries.com/v3.1")
public interface CountryService {
    @GET
    @Path("/capital/{capitalName}")
    String getCountryByName(@PathParam("capitalName") String capitalName);
}
