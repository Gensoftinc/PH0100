/**
 * 
 */
package com.gensoft.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gensoft.model.User;

/**
 * User's repository class.
 * <p>
 * @author Anand Golechha, Copyright © 2018 GenSoft inc. All rights reserved.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
