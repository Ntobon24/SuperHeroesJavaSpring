package udem.edu.co.superheroes.repositorio;


import org.springframework.data.jpa.repository.JpaRepository;
import udem.edu.co.superheroes.entities.Power;
import org.springframework.stereotype.Repository;


@Repository
public interface PowerRepository extends JpaRepository<Power,Integer>  {
}
