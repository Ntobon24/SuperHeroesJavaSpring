package udem.edu.co.superheroes.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import udem.edu.co.superheroes.entities.Power;
import udem.edu.co.superheroes.repositorio.PowerRepository;
import udem.edu.co.superheroes.service.PowerService;

import java.util.List;
import java.util.Optional;


@Service
public class PowerServiceImpl implements PowerService {
    @Autowired
    PowerRepository powerRepository;
    @Override
    public List<Power> findAllPower() {
        return powerRepository.findAll();
    }

    @Override
    public Optional<Power> findByIdPower(int idPower) {
        return powerRepository.findById(idPower);
    }

    @Override
    public Power createPower(Power power) {
        return powerRepository.save(power);
    }

    @Override
    public Power updatePower(Power power) {
        return powerRepository.save(power);
    }

    @Override
    public Power deletePower(int idPower) {
        Power power= new Power();
        power.setIdPower(idPower);
        powerRepository.delete(power);
        return power;

    }
}
