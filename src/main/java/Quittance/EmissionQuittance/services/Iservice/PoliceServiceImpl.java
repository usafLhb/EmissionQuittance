package Quittance.EmissionQuittance.services.Iservice;

import Quittance.EmissionQuittance.mapper.QuittanceMapper;
import Quittance.EmissionQuittance.models.Police;
import Quittance.EmissionQuittance.repository.PoliceRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@AllArgsConstructor
@Service
public class PoliceServiceImpl implements IPoliceService{
    private PoliceRepository policeRepository;
   // private QuittanceMapper quittanceMapper;

    @Override
    public void addPolice(Police police) {
        policeRepository.save(police);
    }
    @Override
    public void updatePolice(Police police) {
        policeRepository.save(police);
    }

    @Override
    public void deletePolice(Long id) {
        policeRepository.deleteById(id);
    }
    @Override
    public List<Police> getAllPolices() {
        return policeRepository.findAll();
    }
    @Override
    public Set<Police> getPoliceByCodePolice(String codePolice) {
        return policeRepository.findAllByCodePolice(codePolice);
    }
    @Override
    public Set <Police> getPoliceByNumClient(String numClient){
        return policeRepository.findAllByNumClient(numClient);
    }
    @Override
    public Set <Police> getPoliceByProduit(String produit){
        return policeRepository.findAllByProduit(produit);
    }

    @Override
    public Set <Police> getPoliceByNumClientAndProduit(String numClient, String produit){
        return policeRepository.findAllByNumClientAndProduit(numClient, produit);
    }
    @Override
    public Set <Police> getPoliceByNumClientAndProduitAndCodePolice(String numClient, String produit, String codePolice){
        return policeRepository.findAllByNumClientAndProduitAndCodePolice(numClient, produit, codePolice);
    }
    @Override
    public Set <Police> getPoliceByNumClientAndCodePolice(String numClient, String codePolice){
        return policeRepository.findAllByNumClientAndCodePolice(numClient, codePolice);
    }
    //test
    @Override
    public Set <Police> getPoliceByProduitAndCodePolice(String produit, String codePolice){
        return policeRepository.findAllByProduitAndCodePolice(produit, codePolice);
    }


}
