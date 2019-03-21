package com.jlcindia.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jlcindia.spring.dao.ContactDAO;
import com.jlcindia.spring.to.ContactTO;

@Service
public class ContactServiceImpl implements ContactService{
@Autowired
ContactDAO contactDAO;
public boolean addContact(ContactTO cto)
{
return contactDAO.addContact(cto);	
}
public List<ContactTO> getAllContacts()
{
return contactDAO.getAllContacts();	
}
}
