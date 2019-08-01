package com.telran.rentcompamyservice.dao;


import com.telran.rentcompamyservice.entities.locations.Locations;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LocationBranchesRepository extends MongoRepository<Locations, String> {
}
