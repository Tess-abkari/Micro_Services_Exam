package Controller;

import io.swagger.annotations.ApiOperation;
import model.Acteur;
import model.Film;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilmController {

    public List<Film> AllFilm() {

        List<Film> filmList = new ArrayList<>();
        filmList.add(new Film("tess", "moi", "abkari", ""));
        filmList.add(new Film("tess", "moi", "abkari", "20"));
        filmList.add(new Film("tess", "moi", "abkari", "20"));


        return filmList;
    }
    @ApiOperation(value = "Get film in the System ", response = Acteur.class, tags = "getFilm")
    @RequestMapping(value = "/getFilms")
    public List<Film> getFilm() {
        return AllFilm();
    }

    @ApiOperation(value = "Get specific film in the System ", response = Acteur.class, tags = "getFilm")
    @RequestMapping(value = "/getFilm/{titre}")
    public Film getActeur(@PathVariable(value = "titre") String name) {
        return AllFilm().stream().filter(x -> x.getTitre().equalsIgnoreCase(x.getTitre())).collect(Collectors.toList()).get(0);
    }
    @ApiOperation(value = "date de sortie ", response = Film.class, tags = "getDate_de_sortie")
    @RequestMapping(value = "/getFilmByDate/{date_de_sortie}")
    public List<Film> getStudent(@PathVariable(value = "date_de_sortie") String name) {

        return AllFilm().stream().filter(x -> x.getDate_de_sortie().equalsIgnoreCase(x.getDate_de_sortie())).collect(Collectors.toList());
    }
}

