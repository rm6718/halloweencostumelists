package com.ironyard.halloween.repositories;

import com.ironyard.halloween.data.Costume;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by sam on 10/13/16.
 */
public interface CostumeRepository extends CrudRepository<Costume, Long> {
}
