package com.tutal.didikle.api;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DidikRepository extends CrudRepository<DidikModel, Long> {

    List<DidikModel> findByUrl(String url);

}
