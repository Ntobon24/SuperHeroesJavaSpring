package udem.edu.co.superheroes.service;

import udem.edu.co.superheroes.entities.Power;

import java.util.List;
import java.util.Optional;

public interface PowerService {
    public List<Power> findAllPower();
    public Optional<Power> findByIdPower(int idPower);


    public Power createPower(Power power);
    public Power updatePower(Power power);
    public Power deletePower(int idPower);
}
