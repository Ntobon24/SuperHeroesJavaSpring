package udem.edu.co.superheroes.controlador;

import org.springframework.web.bind.annotation.*;
import udem.edu.co.superheroes.entities.Power;
import udem.edu.co.superheroes.service.PowerService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api/v2")
public class PowerControlador {
    PowerService powerService;

    public PowerControlador(PowerService powerService) {
        this.powerService = powerService;
    }

    @GetMapping("/power")
    public List<Power> findAllPower() {
        return this.powerService.findAllPower();
    }

    @GetMapping("/power/{idPower}")
    public Optional<Power> findByIdPower(@RequestParam("idPower") int idPower) {
        return this.powerService.findByIdPower(idPower);
    }


    @PostMapping
    public Power createPower(@RequestBody() Power user) {
        return this.powerService.createPower(user);
    }

    @PutMapping("/power/{idPower}")
    public Power updatePower(@PathVariable("idPower") int idPower, @RequestBody Power power ){
        power.setIdPower(idPower);
        return this.powerService.updatePower(power);
    }

    @DeleteMapping("/power/{idPower}")
    public Power deletePower(@PathVariable("idPower") int idPower) {
        return this.powerService.deletePower(idPower);
    }
}


