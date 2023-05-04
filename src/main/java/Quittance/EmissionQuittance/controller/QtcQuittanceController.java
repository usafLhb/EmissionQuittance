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
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

@RestController
@RequestMapping("/quittances")
public class QtcQuittanceController {

    @Autowired
    private QuittanceServiceImpl quittanceService;
    @Autowired
    private testSer t;








    @PostMapping("/")
    public QtcQuittanceDTO create(@RequestBody QtcQuittanceDTO quittanceDTO) {
        System.out.println(quittanceDTO);
        return quittanceService.save(quittanceDTO);
    }

    @GetMapping("/")
    @Operation(summary = "getAllQuittances")
    public List<QtcQuittanceDTO> getAll() {
        return quittanceService.getAllQuittance();
    }

    @GetMapping("/{id}")
    public boolean getQuittanceById(@PathVariable Long id) {
        return quittanceService.getQuittanceByPoliceId(id);
    }

    @PutMapping("/")
    public QtcQuittanceDTO update(@RequestBody QtcQuittanceDTO quittanceDTO) {
        return quittanceService.update(quittanceDTO);
    }

    @GetMapping("/ref/{refQuittance}")
    public List<QtcQuittanceDTO> getByRefQuittance(@PathVariable Long refQuittance) {
        return quittanceService.getByRefQuittanceEntity(refQuittance);
    }
    @GetMapping("/ref2")
    public List<QtcQuittanceDTO> getByRefQuittance2(@RequestParam Long refQuittance) {
        return quittanceService.getByRefQuittanceEntity(refQuittance);
    }

    @GetMapping("/date")
    public List<QtcQuittanceDTO> searchByDate(@RequestParam("dateDebut") @DateTimeFormat(pattern = "yyyy-MM-dd") Calendar dateDebut, @RequestParam("dateFin")  @DateTimeFormat(pattern =  "yyyy-MM-dd") Calendar dateFin) {
        System.out.println(dateFin +" "+dateDebut);
        return quittanceService.searchByDateBetween(dateDebut,dateFin);
    }

    @GetMapping("/codepolice/{codePolice}")
    public List<QtcQuittanceDTO> searchByCodePolice(@PathVariable Long codePolice) {
        return quittanceService.searchByCodePolice(codePolice);
    }

    @GetMapping("/search")
    public List<QtcQuittanceDTO> searchQuittances(
            @RequestParam(name = "refQuittanceid", required = false) Long refQuittanceid,
            @RequestParam(name = "dateDebut", required = false) @DateTimeFormat(pattern = "yyyy-MM-dd") Calendar dateDebut,
            @RequestParam(name = "dateFin", required = false) @DateTimeFormat(pattern = "yyyy-MM-dd") Calendar dateFin,
            @RequestParam(name = "codePolice", required = false) Long codePolice) {
        return quittanceService.searchQuittances(refQuittanceid, dateDebut, dateFin, codePolice);
    }



}
