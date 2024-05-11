package udem.edu.co.superheroes.service;
import udem.edu.co.superheroes.entities.SuperHeroes;
import java.util.List;
import java.util.Optional;
public interface SuperHeroesService {
    public List<SuperHeroes> findAllSuperHeroes();
    public Optional<SuperHeroes> findByIdSuperHeroes(int idSuper);
    public SuperHeroes createSuperHeroes(SuperHeroes superHeroes);
    public SuperHeroes updateSuperHeroes(SuperHeroes superHeroes);
    public SuperHeroes deleteSuperHeroes(int idSuper);
}
