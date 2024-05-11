package udem.edu.co.superheroes.service.Impl;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import udem.edu.co.superheroes.entities.SuperHeroes;
import udem.edu.co.superheroes.repositorio.SuperHeroesRepository;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;


@ExtendWith(MockitoExtension.class)
public class SuperHeroesServiceImplTest {

    @Mock
    private SuperHeroesRepository superHeroesRepository;

    @InjectMocks
    private SuperHeroesServiceImpl superHeroesService;


    @BeforeEach
    void setUp() {
        SuperHeroes superHeroes = new SuperHeroes();
    }

    @AfterEach
    void tearDown() throws Exception {
    }

    @Test
    void findByIdSuperHeroesTest() {
        SuperHeroes superHeroes1 = new SuperHeroes();
        superHeroes1.setIdSuper(1);

        when(superHeroesRepository.findById(1)).thenReturn(Optional.of(superHeroes1));

        Optional<SuperHeroes> result = superHeroesService.findByIdSuperHeroes(1);
        assertEquals(superHeroes1, result.get());

        verify(superHeroesRepository, times(1)).findById(1);
    }

    @Test
    void findAllSuperHeroesTest() {
        SuperHeroes superHeroes1 = new SuperHeroes();
        SuperHeroes superHeroes2 = new SuperHeroes();
        List<SuperHeroes> superHeroesList = Arrays.asList(superHeroes1, superHeroes2);
        when(superHeroesRepository.findAll()).thenReturn(superHeroesList);
        List<SuperHeroes> result = superHeroesService.findAllSuperHeroes();
        assertEquals(superHeroesList, result);

        verify(superHeroesRepository, times(1)).findAll();
    }

    @Test
    void createSuperHeroesTest() {
        SuperHeroes superHeroes1 = new SuperHeroes();
        superHeroes1.setIdSuper(1);
        superHeroes1.setName("batman");

        when(superHeroesRepository.save(any(SuperHeroes.class))).thenReturn(superHeroes1);
        SuperHeroes result = superHeroesService.createSuperHeroes(superHeroes1);
        assertEquals(superHeroes1, result);

        verify(superHeroesRepository, times(1)).save(any(SuperHeroes.class));
    }
    @Test
    void updateSuperHeroesTest(){
        SuperHeroes superHeroes1 = new SuperHeroes();
        superHeroes1.setIdSuper(1);
        superHeroes1.setName("Batman");

        when(superHeroesRepository.save(any(SuperHeroes.class))).thenReturn(superHeroes1);

        SuperHeroes result = superHeroesService.updateSuperHeroes(superHeroes1);

        assertEquals(superHeroes1, result);

        verify(superHeroesRepository, times(1)).save(any(SuperHeroes.class));
    }
}
