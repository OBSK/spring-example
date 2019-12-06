package com.javainuse.dao;

import com.javainuse.model.DAOUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserData extends JpaRepository<DAOUser, Long> {

}
