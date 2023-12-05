package com.codeguruozzy.jobfinder;

import com.codeguruozzy.jobfinder.model.Job;
import org.springframework.data.mongodb.repository.MongoRepository;

// to fetch data we just need to extends the interface with the MongoRepository <TYPEOFDATA, PRIMARY KEY>
// MONGODB will take care of crud
public interface JobRepository extends MongoRepository<Job,String> {
}
