package org.delivery.db.User;

import org.delivery.db.User.enmus.UserStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepositroty extends JpaRepository<UserEntity,Long> {

    // select * from user where id = ? and status =? order by id desc limit 1
    Optional<UserEntity>findFirstByIdAndStatusOrderByIdDesc(Long userid, UserStatus status);

    // select * from user where email =? and password = ? and status = ? order by id desc limit 1
    Optional<UserEntity> findFirstByEmailAndPasswordAndStatusOrderByIdDesc(String emai, String password, UserStatus status);
}
