package Controller;

import io.swagger.annotations.ApiOperation;
import model.Acteur;
import model.Film;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ActeurController {

    public List<Acteur> AllActeur() {

        List<Acteur> acteurList = new ArrayList<>();
        acteurList.add(new Acteur("nor", "tess", "26/02/2008","la vie"));

        return acteurList;
    }
    @ApiOperation(value = "Get list of actors in the System ", response = Acteur.class, tags = "getAcetur")
    @RequestMapping(value = "/getActeur")
    public List<Acteur> getActeurs() {
        return AllActeur();
    }

    @ApiOperation(value = "Get specific acteur in the System ", response = Acteur.class, tags = "getAcetur")
    @RequestMapping(value = "/getStudent/{nom}")
    public Acteur getActeur(@PathVariable(value = "nom") String name) {
        return AllActeur().stream().filter(x -> x.getNom().equalsIgnoreCase(x.getNom())).collect(Collectors.toList()).get(0);
    }
    @ApiOperation(value = "filmographie ", response = Film.class, tags = "getFilmographie")
    @RequestMapping(value = "/getFilmographie/{filmographie}")
    public List<Acteur> getStudent(@PathVariable(value = "date_de_sortie") String name) {

        return AllActeur().stream().filter(x -> x.getFilmographie().equalsIgnoreCase(x.getFilmographie())).collect(Collectors.toList());
    }

    }
