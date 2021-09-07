package com.cataloguetheway.center.config.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.cataloguetheway.center.config.model.Session;

@Repository
public interface SessionDao  extends JpaRepository<Session, Long>,JpaSpecificationExecutor<Session>{

}

