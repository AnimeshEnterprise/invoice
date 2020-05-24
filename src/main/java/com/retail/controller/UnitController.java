package com.retail.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.retail.model.Unit;
import com.retail.service.UnitService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j(topic = "UnitController")
@CrossOrigin(origins = "http://localhost:4200")
public class UnitController {

	@Autowired
	private UnitService unitService;

	@GetMapping("/unit/{id}")
	public Optional<Unit> getUnitById(@PathVariable Long id) {
		log.info("getUnitById method is called");
		return unitService.getUnitById(id);
	}

	@GetMapping("/units")
	public List<Unit> getUnits() {
		log.info("getUnits method is called");
		return unitService.getUnits();
	}

	@PostMapping("/unit")
	public Unit addUnit(@RequestBody Unit product) {
		log.info("addUnit method is called");
		return unitService.addUnit(product);
	}

	@PutMapping("/unit")
	public Unit updateUnit(@RequestBody Unit unit) {
		log.info("updateUnit method is called");
		return unitService.updateUnit(unit);
	}

	@DeleteMapping("/unit/{id}")
	public Unit deleteUnit(@PathVariable Long id) {
		log.info("deleteUnit method is called");
		return unitService.deleteUnit(id);
	}

}
