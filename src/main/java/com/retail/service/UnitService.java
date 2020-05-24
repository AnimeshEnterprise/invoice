package com.retail.service;

import java.util.List;
import java.util.Optional;

import com.retail.model.Unit;

public interface UnitService {

	Optional<Unit> getUnitById(Long id);

	List<Unit> getUnits();

	Unit addUnit(Unit product);

	Unit deleteUnit(Long id);

	Unit updateUnit(Unit unit);

}
