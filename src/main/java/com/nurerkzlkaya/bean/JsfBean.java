package com.nurerkzlkaya.bean;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;
import lombok.Getter;
import lombok.Setter;

@Named("cdiBean")
@ApplicationScoped
@Getter
@Setter
public class JsfBean {

private  String patika;

    public JsfBean() {
        this.patika = "Merhaba NUR";
    }
}
