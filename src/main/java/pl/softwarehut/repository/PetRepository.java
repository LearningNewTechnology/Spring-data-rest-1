package pl.softwarehut.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import pl.softwarehut.model.Pet;

public interface PetRepository extends PagingAndSortingRepository<Pet, Long> {
}
