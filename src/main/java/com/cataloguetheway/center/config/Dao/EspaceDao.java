package com.cataloguetheway.center.config.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.cataloguetheway.center.config.model.Espace;


@Repository
public interface EspaceDao extends JpaRepository<Espace, Long>,JpaSpecificationExecutor<Espace>{

}
