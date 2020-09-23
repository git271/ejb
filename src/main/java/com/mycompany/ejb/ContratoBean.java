/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejb;

import com.mycompany.entidades.Contrato;
import com.mycompany.servicio.ContratoFacadeLocal;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author PC
 */

@Named("contratobean")
@RequestScoped
public class ContratoBean {

    @EJB
    private ContratoFacadeLocal contratoFacade;
    private Contrato newcontract;

    public Contrato getNewcontract() {
        if(newcontract==null){
            
            newcontract = new Contrato();
        
        }
        
        return newcontract;
    }

    public void setNewcontract(Contrato newcontract) {
        this.newcontract = newcontract;
    }
    
    public List<Contrato>getContrato(){
        return this.contratoFacade.findAll();
    }
    
    public ContratoBean(){
    
    }
    
    public void crear(){
    
        this.contratoFacade.create(newcontract);
        
    }
    
    public void Eliminar(Contrato contrato){
        
        this.contratoFacade.remove(contrato);
        
    }
    
    public void Actualizar(Contrato contrato){
    
        this.contratoFacade.edit(contrato);
    
    }
    
}
