package com.telran.rentcompamyservice.entities.locations;


import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.util.Arrays;

@Document(collection="locations")
public class Locations {
    @Id
    private String id;
    private Branch[] locations;

    public Locations() {
    }

    public String getId() {
        return id;
    }

    public Locations setId(String id) {
        this.id = id;
        return this;
    }

    public Branch[] getLocations() {
        return locations;
    }

    public Locations setLocations(Branch[] locations) {
        this.locations = locations;
        return this;
    }

    @Override
    public String toString() {
        return "Locations{" +
                "id='" + id + '\'' +
                ", locations=" + Arrays.toString(locations) +
                '}';
    }
}
