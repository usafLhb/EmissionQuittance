package Quittance.EmissionQuittance.services.Iservice;

import Quittance.EmissionQuittance.models.Police;

import java.util.List;
import java.util.Set;

public interface IPoliceService {
    void addPolice(Police police);
    void updatePolice(Police police);
    void deletePolice(Long id);
     List<Police> getAllPolices();
    Set <Police> getPoliceByNumClient(String numClient);
    Set <Police> getPoliceByProduit(String produit);
    Set <Police> getPoliceByNumClientAndProduit(String numClient, String produit);
    Set <Police> getPoliceByNumClientAndProduitAndCodePolice(String numClient, String produit, String codePolice);
    Set <Police> getPoliceByNumClientAndCodePolice(String numClient, String codePolice);
    Set <Police> getPoliceByProduitAndCodePolice(String produit, String codePolice);
    Set <Police> getPoliceByCodePolice(String codePolice);

}
