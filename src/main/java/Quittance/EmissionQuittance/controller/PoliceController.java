package Quittance.EmissionQuittance.controller;

import Quittance.EmissionQuittance.dto.request.PoliceDTO;
import Quittance.EmissionQuittance.dto.request.PoliceSearchCriteriaDTO;
import Quittance.EmissionQuittance.dto.request.PrdVersioncommercialeDTO;
import Quittance.EmissionQuittance.dto.request.RefVilleDTO;
import Quittance.EmissionQuittance.services.ImpleService.PoliceServiceImpl;
import Quittance.EmissionQuittance.services.Iservice.IPoliceService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/polices")
@CrossOrigin(exposedHeaders = "X-Total-Count")
public class PoliceController {
    public PoliceSearchCriteriaDTO policeSearchCriteriaDTO;

    private final PoliceServiceImpl policeService;

    public PoliceController(PoliceServiceImpl policeService) {
        this.policeService = policeService;
    }

    @PostMapping("/add")
    public ResponseEntity<PoliceDTO> addPolice(@RequestBody @Validated PoliceDTO policeDTO) {
        PoliceDTO savedPoliceDTO = policeService.addPolice(policeDTO);
        return ResponseEntity
                .created(URI.create("/polices/" + savedPoliceDTO.getCodePolice()))
                .body(savedPoliceDTO);
    }

    @PutMapping("/{policeId}")
    public ResponseEntity<PoliceDTO> updatePolice(@PathVariable Long policeId, @RequestBody @Validated PoliceDTO policeDTO) {
        PoliceDTO updatedPoliceDTO = policeService.updatePolice(policeId, policeDTO);
        return ResponseEntity.ok(updatedPoliceDTO);
    }

    @GetMapping
    public ResponseEntity<List<PoliceDTO>> getAllPolices() {
        List<PoliceDTO> policesDTO = policeService.getAllPolices();
        return ResponseEntity.ok(policesDTO);
    }
    @GetMapping("/consult/{codePolice}")
    public ResponseEntity<PoliceDTO> ConsultPolice(@PathVariable String codePolice) {
        PoliceDTO policeDTO = policeService.getPoliceByCodePolice(codePolice);
        return ResponseEntity.ok(policeDTO);
    }

    @GetMapping("/search")
    public ResponseEntity<List<PoliceDTO>> getPoliceByCriteres(@RequestParam(name = "numClient", required = false) Long numClient,
                                                               @RequestParam(name = "codePolice", required = false) String codePolice,
                                                               @RequestParam(name = "nomcommercial", required = false) String nomcommercial,
                                                               @RequestParam(name = "ville", required = false) String ville,
                                                               @RequestParam(name = "page", defaultValue = "0") int page,
                                                               @RequestParam(name = "size", defaultValue = "5") int size) {

        PoliceSearchCriteriaDTO policeSearchCriteriaDTO = new PoliceSearchCriteriaDTO();
        policeSearchCriteriaDTO.setNumClient(numClient);
        policeSearchCriteriaDTO.setCodePolice(codePolice);

        PrdVersioncommercialeDTO prdVersioncommercialeDTO = new PrdVersioncommercialeDTO();
        prdVersioncommercialeDTO.setNomcommercial(nomcommercial);
        policeSearchCriteriaDTO.setPrdVersioncommerciale(prdVersioncommercialeDTO);

        RefVilleDTO refVilleDTO = new RefVilleDTO();
        refVilleDTO.setLibelle(ville);
        policeSearchCriteriaDTO.setRefVille(refVilleDTO);

        Page<PoliceDTO> policesDTO = policeService.getPoliceByCriteres(policeSearchCriteriaDTO, page, size);

        return ResponseEntity.ok()
                .header("X-Total-Count", String.valueOf(policesDTO.getTotalElements()))
                .body(policesDTO.getContent());
    }

}

