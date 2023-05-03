package Quittance.EmissionQuittance.controller;

import Quittance.EmissionQuittance.dto.request.QtcQuittanceDTO;
import Quittance.EmissionQuittance.entities.QtcQuittanceEntity;
import Quittance.EmissionQuittance.services.ImpleService.QuittanceServiceImpl;
import Quittance.EmissionQuittance.services.ImpleService.testSer;
import ch.qos.logback.core.net.server.Client;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/quittances")
public class QtcQuittanceController {

    @Autowired
    private QuittanceServiceImpl quittanceService;
    @Autowired
    private testSer t;


    @GetMapping("/222")
    @Operation(summary = "testttt")
    public String getAll22() {
        System.out.println("getAllQuittance2");
        return t.getAllQuittance22();
    }

    @GetMapping("/22")
    @Operation(summary = "testttt 2")
    public List<QtcQuittanceEntity> getAll222() {
        System.out.println("getAllQuittance2");
        return t.getAllQuittance2();
    }







    @PostMapping("/")
    public QtcQuittanceDTO create(@RequestBody QtcQuittanceDTO quittanceDTO) {
        return quittanceService.save(quittanceDTO);
    }

    @GetMapping("/")
    public List<QtcQuittanceDTO> getAll() {
        return quittanceService.getAllQuittance();
    }
    @GetMapping("/2")
    public List<QtcQuittanceEntity> getAll2() {
        System.out.println("getAllQuittance2");
        return quittanceService.getAllQuittance2();
    }

    @PutMapping("/")
    public QtcQuittanceDTO update(@RequestBody QtcQuittanceDTO quittanceDTO) {
        return quittanceService.update(quittanceDTO);
    }

    @GetMapping("/ref/{refQuittance}")
    public List<QtcQuittanceDTO> getByRefQuittance(@PathVariable String refQuittance) {
        return quittanceService.getByRefQuittanceEntity(refQuittance);
    }

    @GetMapping("/date")
    public List<QtcQuittanceDTO> searchByDate(@RequestParam("dateDebut") Date dateDebut, @RequestParam("dateFin") Date dateFin) {
        return quittanceService.searchByDateBetween(dateDebut, dateFin);
    }

    @GetMapping("/codepolice/{codePolice}")
    public List<QtcQuittanceDTO> searchByCodePolice(@PathVariable String codePolice) {
        return quittanceService.searchByCodePolice(codePolice);
    }
}
