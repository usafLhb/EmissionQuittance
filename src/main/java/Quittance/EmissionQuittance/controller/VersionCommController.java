package Quittance.EmissionQuittance.controller;

import Quittance.EmissionQuittance.dto.request.PrdVersioncommercialeDTO;
import Quittance.EmissionQuittance.dto.request.RefVilleDTO;
import Quittance.EmissionQuittance.services.ImpleService.VersionComServiceImpl;
import Quittance.EmissionQuittance.services.ImpleService.VilleServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/versioncommerciales")
@CrossOrigin
public class VersionCommController {
    private final VersionComServiceImpl versionComService;

    public VersionCommController(VersionComServiceImpl versionComService) {
        this.versionComService = versionComService;
    }
    @GetMapping
    public ResponseEntity<List<PrdVersioncommercialeDTO>> getAllVilles() {
        List<PrdVersioncommercialeDTO> versions = versionComService.getAllVersions();
        return ResponseEntity.ok(versions);
    }
}
