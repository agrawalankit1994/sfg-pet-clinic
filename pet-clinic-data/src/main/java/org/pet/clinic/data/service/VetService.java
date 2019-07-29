package org.pet.clinic.data.service;

import java.util.Set;

import org.pet.clinic.data.model.Vet;

public interface VetService {

	Vet findById(Long id);
	Vet save(Vet vet);
	Set<Vet> findAll();
}
