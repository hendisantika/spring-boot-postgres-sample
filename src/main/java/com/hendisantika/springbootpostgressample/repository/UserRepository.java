package com.hendisantika.springbootpostgressample.repository;

import com.hendisantika.springbootpostgressample.domain.AppUser;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-postgres-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 23/09/18
 * Time: 06.37
 * To change this template use File | Settings | File Templates.
 */
public interface UserRepository extends CrudRepository<AppUser, Long> {
}