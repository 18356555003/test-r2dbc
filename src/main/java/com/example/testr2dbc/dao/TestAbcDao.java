package com.example.testr2dbc.dao;

import com.example.testr2dbc.entity.Test;
import com.example.testr2dbc.entity.TestAbc;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface TestAbcDao extends ReactiveCrudRepository<TestAbc,String> {

    @Query("select * from TEST_ABC where id='1'")
    Flux<TestAbc> testList();
}
