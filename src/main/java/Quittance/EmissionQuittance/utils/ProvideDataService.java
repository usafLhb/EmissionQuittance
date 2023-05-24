package Quittance.EmissionQuittance.utils;


import Quittance.EmissionQuittance.dto.response.IntermediaireResponse;
import Quittance.EmissionQuittance.dto.response.PoliceResponse;
import Quittance.EmissionQuittance.dto.response.PrdVersioncommercialeResponse;
import Quittance.EmissionQuittance.dto.response.RefQuittanceResponse;
import Quittance.EmissionQuittance.entities.*;
import Quittance.EmissionQuittance.mapper.responseMapper.IntermediaireMapperResponse;
import Quittance.EmissionQuittance.mapper.responseMapper.PoliceMapperResponse;
import Quittance.EmissionQuittance.mapper.responseMapper.RefQtcQuittanceMapperResponse;
import Quittance.EmissionQuittance.mapper.responseMapper.VersionCommercialMapperResponse;
import Quittance.EmissionQuittance.repositories.IntermediaireEntityRepository;
import Quittance.EmissionQuittance.repositories.PoliceEntityRepository;
import Quittance.EmissionQuittance.repositories.PrdVersioncommercialeEntityRepository;
import Quittance.EmissionQuittance.repositories.RefQuittanceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProvideDataService {

    private final IntermediaireEntityRepository intermediaireEntityRepository;
    private final IntermediaireMapperResponse intermediaireMapperResponse;

    private final PoliceEntityRepository policeEntityRepository;
    private final PoliceMapperResponse policeMapperResponse;

    private final PrdVersioncommercialeEntityRepository prdVersioncommercialeEntityRepository;
    private final VersionCommercialMapperResponse versionCommercialMapperResponse;

    private final RefQuittanceRepository refQuittanceRepository;
    private final RefQtcQuittanceMapperResponse RefQtcQuittanceMapperResponse;



    public List<IntermediaireResponse> getAllIntermediaire() {
        List<IntermediaireEntity> intermediaire = intermediaireEntityRepository.findAll();
        List<IntermediaireResponse> intermediaireResponseList = intermediaire.stream()
                .map(intermediaireMapperResponse::toDto)
                .collect(Collectors.toList());
        return intermediaireResponseList;
    }


    public List<PoliceResponse> getAllPolice() {
        List<PoliceEntity> police = policeEntityRepository.findAll();
        List<PoliceResponse> policeResponseList = police.stream()
                .map(policeMapperResponse::toDto)
                .collect(Collectors.toList());
        return policeResponseList;
    }


    public List<PrdVersioncommercialeResponse> getAllVersionCommercial() {
        List<PrdVersioncommercialeEntity> versionCommercial = prdVersioncommercialeEntityRepository.findAll();
        List<PrdVersioncommercialeResponse> versionCommercialResponseList = versionCommercial.stream()
                .map(versionCommercialMapperResponse::toDto)
                .collect(Collectors.toList());
        return versionCommercialResponseList;
    }

    public List<RefQuittanceResponse> getAllRefQuittance() {
        List<RefQuittanceEntity> refQuittance = refQuittanceRepository.findAll();
        List<RefQuittanceResponse> refQuittanceResponseList = refQuittance.stream()
                .map(RefQtcQuittanceMapperResponse::toDto)
                .collect(Collectors.toList());
        return refQuittanceResponseList;
    }

}
