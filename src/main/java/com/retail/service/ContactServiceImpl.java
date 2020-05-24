package com.retail.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.retail.model.Contact;
import com.retail.repository.ContactRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j(topic = "ContactServiceImpl")
public class ContactServiceImpl implements ContactService {

	@Autowired
	ContactRepository contactRepository;

	@Override
	public Optional<Contact> getContactById(Long id) {
		log.info("getContactById method is called");
		return contactRepository.findById(id);
	}

	@Override
	public List<Contact> getContacts() {
		log.info("getContacts method is called");
		return contactRepository.findAll();
	}

	@Override
	public Contact addContact(Contact contact) {
		log.info("addContact method is called");
		return contactRepository.save(contact);
	}

	@Override
	public Contact updateContact(Contact contact) {
		log.info("updateContact method is called");
		return contactRepository.save(contact);
	}

	@Override
	public Contact deleteContact(Long id) {
		log.info("deleteContact method is called");
		Optional<Contact> contact = contactRepository.findById(id);
		contactRepository.delete(contact.get());
		return contact.get();
	}

}
