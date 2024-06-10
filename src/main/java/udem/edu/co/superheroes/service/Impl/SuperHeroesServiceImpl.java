package udem.edu.co.superheroes.service.Impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import udem.edu.co.superheroes.entities.SuperHeroes;
import udem.edu.co.superheroes.repositorio.SuperHeroesRepository;
import udem.edu.co.superheroes.service.SuperHeroesService;
import java.util.List;
import java.util.Optional;


@Service
public class SuperHeroesServiceImpl implements SuperHeroesService {
    private final SuperHeroesRepository superHeroesRepository;

    @Autowired
    public SuperHeroesServiceImpl(SuperHeroesRepository superHeroesRepository) {
        this.superHeroesRepository = superHeroesRepository;
    }
    @Override
    public List<SuperHeroes> findAllSuperHeroes() {
        return superHeroesRepository.findAll();
    }

    @Override
    public Optional<SuperHeroes> findByIdSuperHeroes(int idSuper) {
        return superHeroesRepository.findById(idSuper);
    }

    @Override
    public SuperHeroes createSuperHeroes(SuperHeroes superHeroes) {
        return superHeroesRepository.save(superHeroes);
    }

    @Override
    public SuperHeroes updateSuperHeroes(SuperHeroes superHeroes) {
        return superHeroesRepository.save(superHeroes);
    }

    @Override
    public SuperHeroes deleteSuperHeroes(int idSuper) {
        SuperHeroes superHeroes= new SuperHeroes();
        superHeroes.setIdSuper(idSuper);
        superHeroesRepository.delete(superHeroes);
        return superHeroes;
    }
}
