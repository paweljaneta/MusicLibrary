package pl.polsl.pjaneta.Muslibrynewapp.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.polsl.pjaneta.Muslibrynewapp.model.Artist;

public interface ArtistRepository extends CrudRepository<Artist,Long> {
}
