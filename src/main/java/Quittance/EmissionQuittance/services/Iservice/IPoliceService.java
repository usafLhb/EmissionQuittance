package Quittance.EmissionQuittance.services.Iservice;

import Quittance.EmissionQuittance.models.classes.PoliceEntity;

import java.util.List;
import java.util.Set;

public interface IPoliceService {
    void addPolice(PoliceEntity policeEntity);
    void updatePolice(PoliceEntity policeEntity);
     List<PoliceEntity> getAllPolices();
    Set <PoliceEntity> getPoliceByNumClient(String numClient);
    Set <PoliceEntity> getPoliceByProduit(String produit);
    Set <PoliceEntity> getPoliceByNumClientAndProduit(String numClient, String produit);
    Set <PoliceEntity> getPoliceByNumClientAndProduitAndCodePolice(String numClient, String produit, String codePolice);
    Set <PoliceEntity> getPoliceByNumClientAndCodePolice(String numClient, String codePolice);
    Set <PoliceEntity> getPoliceByProduitAndCodePolice(String produit, String codePolice);
    Set <PoliceEntity> getPoliceByCodePolice(String codePolice);

}
