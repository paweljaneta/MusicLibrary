package pl.polsl.pjaneta.Muslibrynewapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import pl.polsl.pjaneta.Muslibrynewapp.model.Artist;
import pl.polsl.pjaneta.Muslibrynewapp.model.Song;
import pl.polsl.pjaneta.Muslibrynewapp.repositories.ArtistRepository;
import pl.polsl.pjaneta.Muslibrynewapp.repositories.SongRepository;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@Component
public class DataInit {

    @Autowired
    ArtistRepository artistRepository;

    @Autowired
    SongRepository songRepository;

    @EventListener(ApplicationReadyEvent.class)
    public void initData() {
        Song song = new Song("Robin", "Film", "1994", "no data");
        Artist artist = new Artist("Clannad", "", "Clannad");

        artistRepository.save(artist);

        song.setArtists(Collections.singleton(artist));

        songRepository.save(song);

        Song song1 = new Song("Change", "rock", "1998", "no data");
        song = new Song("Cover Me", "rock", "1999", "no data");
        artist = new Artist("Candlebox", "", "Candlebox");

        Set<Song> songSet = new HashSet<>();
        songSet.add(song);
        songSet.add(song1);

        artistRepository.save(artist);

        song.setArtists(Collections.singleton(artist));
        song1.setArtists(Collections.singleton(artist));

        songRepository.save(song);
        songRepository.save(song1);

    }

}
