package pl.softwarehut.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import pl.softwarehut.model.Pet;

import java.util.List;

public interface PetRepository extends PagingAndSortingRepository<Pet, Long> {
    List<Pet> findByName(@Param("name") String name);
}
