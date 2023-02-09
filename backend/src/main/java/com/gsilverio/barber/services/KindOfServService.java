package com.gsilverio.barber.services;

import com.gsilverio.barber.dto.KindOfServiceDTO;
import com.gsilverio.barber.dto.UserDTO;
import com.gsilverio.barber.entities.KindOfService;
import com.gsilverio.barber.entities.User;
import com.gsilverio.barber.repositories.KindOfServiceRepository;
import com.gsilverio.barber.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class KindOfServService {
    @Autowired
    private KindOfServiceRepository kindOfServiceRepository;
    @Transactional(readOnly = true)
    public List<KindOfServiceDTO> findAll(){
        List<KindOfService> kService = kindOfServiceRepository.findAll();
        List<KindOfServiceDTO> kServiceDTO = kService.stream().map(x->new KindOfServiceDTO(x)).collect(Collectors.toList());
        return kServiceDTO;
    }

    public KindOfServiceDTO findById(Long id) {
        Optional<KindOfService> obj = kindOfServiceRepository.findById(id);
        KindOfService entity = obj.orElseThrow(()-> new ResourceNotFoundException("Entity not found"));
        return new KindOfServiceDTO(entity);
    }
}
