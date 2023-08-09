package Quittance.EmissionQuittance.controller;

import Quittance.EmissionQuittance.dto.request.QtcQuittanceDTO;
import Quittance.EmissionQuittance.dto.response.QuittanceResponse;
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
import org.springframework.data.domain.Page;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

@RestController
@RequestMapping("/quittances")
@CrossOrigin
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
    public ResponseEntity<Page<QtcQuittanceDTO>> getAllQuittance(
            @RequestParam(defaultValue = "0") int pageNumber,
            @RequestParam(defaultValue = "3") int pageSize) {
        Page<QtcQuittanceDTO> quittancePage = quittanceService.getAllQuittance(pageNumber, pageSize);
        return ResponseEntity.ok(quittancePage);
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
        public ResponseEntity<Page<QuittanceResponse>> searchQuittances(
                @RequestParam(required = false) Long refQuittanceid,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Calendar dateDebut,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Calendar dateFin,
                @RequestParam(required = false) Long codePolice,
                @RequestParam(defaultValue = "0") int pageNumber,
                @RequestParam(defaultValue = "3") int pageSize) {

            Page<QuittanceResponse> quittanceDTOs = quittanceService.searchQuittances(refQuittanceid, dateDebut, dateFin, codePolice, pageNumber, pageSize);

            return ResponseEntity.ok(quittanceDTOs);
        }


  /*  @GetMapping("/getAllQuittances")
    public   ResponseEntity<List<QtcQuittanceDTO>>getAllQuittances()  {

        List<QtcQuittanceDTO> quittanceDTOList=quittanceService.getAllQuittances();
        return ResponseEntity.ok(quittanceDTOList);
    }*/

    @GetMapping("/getAllQuittances")
    public ResponseEntity<List<QuittanceResponse>> getAllQuittances() {
        List<QuittanceResponse> quittances = quittanceService.getAllQuittances();
        return new ResponseEntity<>(quittances, HttpStatus.OK);
    }


}
