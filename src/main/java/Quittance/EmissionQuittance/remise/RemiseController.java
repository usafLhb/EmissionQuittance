package Quittance.EmissionQuittance.remise;

import Quittance.EmissionQuittance.remise.folder2.EntiteVO;
import Quittance.EmissionQuittance.remise.folder2.Remise;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/remises")
public class RemiseController {
  //  private final SearchRemises remiseClient;
  private RemiseClient remiseClient;

  public RemiseController(RemiseClient remiseClient) {
    this.remiseClient = remiseClient;
  }

  @GetMapping
  public List<Remise> searchRemises(  ) throws Exception {
    // créer un objet EntiteVO à partir des paramètres de l'utilisateur
    EntiteVO entiteVO = new EntiteVO();
    Date dateDebut = new Date();
     double mnt=321;
    entiteVO.setDate(dateDebut);
    entiteVO.setMontant(mnt);

    // appeler la méthode searchRemises de la classe RemiseClient
    return (List<Remise>) remiseClient.searchRemiseBcc("321564");
  }

}
