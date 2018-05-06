package pl.polsl.pjaneta.Muslibrynewapp.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.polsl.pjaneta.Muslibrynewapp.model.Song;

public interface SongRepository extends CrudRepository<Song,Long> {
}
