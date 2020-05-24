package com.retail.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.retail.model.Product;
import com.retail.model.Unit;
import com.retail.repository.UnitRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j(topic = "UnitServiceImpl")
public class UnitServiceImpl implements UnitService {

	@Autowired
	UnitRepository unitRepository;

	@Override
	public Optional<Unit> getUnitById(Long id) {
		log.info("getUnitById method is called");
		return unitRepository.findById(id);
	}

	@Override
	public List<Unit> getUnits() {
		log.info("getUnits method is called");
		return unitRepository.findAll();
	}

	@Override
	public Unit addUnit(Unit unit) {
		log.info("addUnit method is called");
		return unitRepository.save(unit);
	}

	@Override
	public Unit deleteUnit(Long id) {
		log.info("deleteUnit method is called");
		Optional<Unit> unit = unitRepository.findById(id);
		unitRepository.delete(unit.get());
		return unit.get();
	}

	@Override
	public Unit updateUnit(Unit unit) {
		log.info("updateUnit method is called");
		return unitRepository.save(unit);
	}

}
