package pl.softwarehut.repository;

import org.springframework.data.repository.CrudRepository;

import pl.softwarehut.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}