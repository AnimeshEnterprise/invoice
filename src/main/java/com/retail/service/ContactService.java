package com.retail.service;

import java.util.List;
import java.util.Optional;

import com.retail.model.Contact;

public interface ContactService {

	Optional<Contact> getContactById(Long id);

	List<Contact> getContacts();

	Contact addContact(Contact contact);

	Contact updateContact(Contact contact);

	Contact deleteContact(Long id);

}
