/**
 * 
 */
package com.gensoft.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gensoft.model.Person;

/**
 * Person's repository.
 * <p>
 * @author Anand Golechha, Copyright © 2018 GenSoft inc. All rights reserved.
 */
public interface PersonRepository extends JpaRepository<Person, Long>{
}
