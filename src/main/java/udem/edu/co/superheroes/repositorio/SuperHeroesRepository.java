package udem.edu.co.superheroes.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import udem.edu.co.superheroes.entities.SuperHeroes;
import org.springframework.stereotype.Repository;

@Repository
public interface SuperHeroesRepository extends JpaRepository<SuperHeroes,Integer> {

}
