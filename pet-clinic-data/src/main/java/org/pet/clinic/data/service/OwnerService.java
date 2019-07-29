package org.pet.clinic.data.service;

import java.util.Set;

import org.pet.clinic.data.model.Owner;

public interface OwnerService {

	Owner findById(Long id);
	Owner save(Owner owner);
	Set<Owner> findAll();
	Owner findByLastName(String lastName);
}
