package udem.edu.co.superheroes.controlador;

import org.springframework.web.bind.annotation.*;
import udem.edu.co.superheroes.entities.SuperHeroes;
import udem.edu.co.superheroes.service.SuperHeroesService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api/v1")
public class SuperHeroeControlador {
    SuperHeroesService superHeroesService;
    public SuperHeroeControlador(SuperHeroesService superHeroesService){this.superHeroesService = superHeroesService;}

    @GetMapping("/superheroes")
    public List<SuperHeroes> findAllSuperHeroes() {
        return this.superHeroesService.findAllSuperHeroes();
    }

    @GetMapping("/superheroes/{idSuper}")
    public Optional<SuperHeroes> findSuperHeroesById(@RequestParam("idSuper") int idSuper) {
        return this.superHeroesService.findByIdSuperHeroes(idSuper);
    }
    @PostMapping
    public SuperHeroes createSuperHeroes(@RequestBody() SuperHeroes superheroes) {
        return this.superHeroesService.createSuperHeroes(superheroes);
    }
    @PutMapping("/superheroes/{idSuper}")
    public SuperHeroes updateSuperHeroes(@PathVariable("idSuper") int idSuper, @RequestBody SuperHeroes  superheroes){
        superheroes.setIdSuper(idSuper);
        return this.superHeroesService.updateSuperHeroes(superheroes);
    }

    @DeleteMapping("/superheroes/{idSuper}")
    public SuperHeroes deleteSuperHeroes(@PathVariable("idSuper") int idSuper) {
        return this.superHeroesService.deleteSuperHeroes(idSuper);
    }

}
