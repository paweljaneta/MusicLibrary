package pl.polsl.pjaneta.Muslibrynewapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.polsl.pjaneta.Muslibrynewapp.model.Song;
import pl.polsl.pjaneta.Muslibrynewapp.repositories.SongRepository;


/**
 * Created by Paweł on 2018-04-26.
 */
@Controller
public class SongController {

    @Autowired
    SongRepository songRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getSongs(Model model) {
        Iterable<Song> allSongs = songRepository.findAll();

        model.addAttribute("songs", allSongs);

        return "songList";
    }
}
