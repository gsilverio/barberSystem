package com.gsilverio.barber.dto;

import com.gsilverio.barber.entities.KindOfService;
import com.gsilverio.barber.repositories.KindOfServiceRepository;

import java.io.Serializable;

public class KindOfServiceDTO implements Serializable {
    private static final long serialVersionUID =1L;
    private Long id;
    private String nameOfService;
    private Double price;
    private String imgUrl;

    public KindOfServiceDTO(){
    }
    public KindOfServiceDTO(Long id, String nameOfService, Double price, String imgUrl) {
        this.id = id;
        this.nameOfService = nameOfService;
        this.price = price;
        this.imgUrl = imgUrl;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameOfService() {
        return nameOfService;
    }

    public void setNameOfService(String nameOfService) {
        this.nameOfService = nameOfService;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public KindOfServiceDTO(KindOfService kindOfService){
        id=kindOfService.getId();
        nameOfService=kindOfService.getNameOfService();
        price=kindOfService.getPrice();
        imgUrl=kindOfService.getImgUrl();
    }
}
