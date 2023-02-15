package com.gsilverio.barber.services;

import com.gsilverio.barber.dto.KindOfServiceDTO;
import com.gsilverio.barber.dto.UserDTO;
import com.gsilverio.barber.entities.KindOfService;
import com.gsilverio.barber.entities.User;
import com.gsilverio.barber.repositories.KindOfServiceRepository;
import com.gsilverio.barber.services.exceptions.DataBaseExeption;
import com.gsilverio.barber.services.exceptions.ResourceNotFoundException;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
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
    @Transactional(readOnly = true)
    public KindOfServiceDTO findById(Long id) {
        Optional<KindOfService> obj = kindOfServiceRepository.findById(id);
        KindOfService entity = obj.orElseThrow(()-> new ResourceNotFoundException("Entity not found"));
        return new KindOfServiceDTO(entity);
    }
    @Transactional
    public KindOfServiceDTO insert(KindOfServiceDTO dto) {
        KindOfService entity = new KindOfService();
        entity.setNameOfService(dto.getNameOfService());
        entity.setPrice(dto.getPrice());
        entity.setImgUrl(dto.getImgUrl());
        entity = kindOfServiceRepository.save(entity);
        return new KindOfServiceDTO((entity));
    }
    @Transactional
    public KindOfServiceDTO update(Long id, KindOfServiceDTO dto) {
        try {
            KindOfService entity = kindOfServiceRepository.getReferenceById(id);
            entity.setNameOfService(dto.getNameOfService());
            entity.setPrice(dto.getPrice());
            entity.setImgUrl(dto.getImgUrl());
            entity = kindOfServiceRepository.save(entity);
            return new KindOfServiceDTO((entity));
        } catch(EntityNotFoundException e){
            throw new ResourceNotFoundException("Id not found " + id);
        }

    }
    public void delete(Long id) {
        try {
            kindOfServiceRepository.deleteById(id);
        }catch (EmptyResultDataAccessException e){
            throw new ResourceNotFoundException("Id not found " + id);
        }catch (DataIntegrityViolationException e){
            throw new DataBaseExeption("Integrity violation");
        }
    }


}
