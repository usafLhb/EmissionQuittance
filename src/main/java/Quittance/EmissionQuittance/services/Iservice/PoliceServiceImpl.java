package Quittance.EmissionQuittance.services.Iservice;

import Quittance.EmissionQuittance.models.classes.PoliceEntity;
import Quittance.EmissionQuittance.repository.PoliceRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@AllArgsConstructor
@Service
public class PoliceServiceImpl implements IPoliceService{
    private PoliceRepository policeRepository;
    @Override
    public void addPolice(PoliceEntity policeEntity) {
        policeRepository.save(policeEntity);
    }
    @Override
    public void updatePolice(PoliceEntity policeEntity) {
        policeRepository.save(policeEntity);
    }

    @Override
    public List<PoliceEntity> getAllPolices() {
        return policeRepository.findAll();
    }
    @Override
    public Set<PoliceEntity> getPoliceByCodePolice(String codePolice) {
        return policeRepository.findAllByCodePolice(codePolice);
    }
    @Override
    public Set <PoliceEntity> getPoliceByNumClient(String numClient){
        return policeRepository.findAllByNumClient(numClient);
    }
    @Override
    public Set <PoliceEntity> getPoliceByProduit(String produit){
        return policeRepository.findAllByProduit(produit);
    }

    @Override
    public Set <PoliceEntity> getPoliceByNumClientAndProduit(String numClient, String produit){
        return policeRepository.findAllByNumClientAndProduit(numClient, produit);
    }
    @Override
    public Set <PoliceEntity> getPoliceByNumClientAndProduitAndCodePolice(String numClient, String produit, String codePolice){
        return policeRepository.findAllByNumClientAndProduitAndCodePolice(numClient, produit, codePolice);
    }
    @Override
    public Set <PoliceEntity> getPoliceByNumClientAndCodePolice(String numClient, String codePolice){
        return policeRepository.findAllByNumClientAndCodePolice(numClient, codePolice);
    }
    //test
    @Override
    public Set <PoliceEntity> getPoliceByProduitAndCodePolice(String produit, String codePolice){
        return policeRepository.findAllByProduitAndCodePolice(produit, codePolice);
    }


}
