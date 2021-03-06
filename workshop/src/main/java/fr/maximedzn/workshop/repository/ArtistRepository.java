package fr.maximedzn.workshop.repository;

import fr.maximedzn.workshop.domain.Artist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ArtistRepository extends JpaRepository<Artist,Long> {
}
