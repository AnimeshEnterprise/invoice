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

import com.retail.model.Contact;
import com.retail.service.ContactService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j(topic = "ProductController")
@CrossOrigin(origins = "http://localhost:4200")
public class ContactController {

	@Autowired
	private ContactService contactService;

	@GetMapping("/contact/{id}")
	public Optional<Contact> getContactById(@PathVariable Long id) {
		log.info("getContactById method is called");
		return contactService.getContactById(id);
	}

	@GetMapping("/contacts")
	public List<Contact> getContacts() {
		log.info("getContacts method is called");
		return contactService.getContacts();
	}

	@PostMapping("/contact")
	public Contact addContact(@RequestBody Contact contact) {
		log.info("addContact method is called");
		return contactService.addContact(contact);
	}

	@PutMapping("/contact")
	public Contact updateContact(@RequestBody Contact contact) {
		log.info("updateContact method is called");
		return contactService.updateContact(contact);
	}

	@DeleteMapping("/contact/{id}")
	public Contact deleteContact(@PathVariable Long id) {
		log.info("deleteContact method is called");
		return contactService.deleteContact(id);
	}

}
