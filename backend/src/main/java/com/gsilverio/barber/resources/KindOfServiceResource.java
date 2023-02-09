package com.gsilverio.barber.resources;

import com.gsilverio.barber.dto.KindOfServiceDTO;
import com.gsilverio.barber.dto.UserDTO;
import com.gsilverio.barber.entities.KindOfService;
import com.gsilverio.barber.services.KindOfServService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/kindofservice")
public class KindOfServiceResource {
    @Autowired
    private KindOfServService kindOfServService;
    @GetMapping
    public ResponseEntity<List<KindOfServiceDTO>> findAll(){
        List<KindOfServiceDTO> list = kindOfServService.findAll();
        return ResponseEntity.ok().body(list);
    }
    @GetMapping(value="/{id}")
    public ResponseEntity<KindOfServiceDTO> findById(@PathVariable Long id){
        KindOfServiceDTO dto = kindOfServService.findById(id);
        return ResponseEntity.ok().body(dto);
    }
}
