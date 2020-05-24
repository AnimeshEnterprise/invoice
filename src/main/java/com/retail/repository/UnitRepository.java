package com.retail.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.retail.model.Unit;

@Repository
public interface UnitRepository extends JpaRepository<Unit, Long> {

}
