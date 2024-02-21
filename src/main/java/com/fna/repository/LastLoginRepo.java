package com.fna.repository;

import javax.websocket.server.PathParam;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.fna.model.LastLogin;

public interface LastLoginRepo extends JpaRepository<LastLogin, Integer>{

	@Query(value="exec lastlogin @userid=:userid",nativeQuery = true)
	 LastLogin findByuserid(@PathParam("userid") int userid);

}
