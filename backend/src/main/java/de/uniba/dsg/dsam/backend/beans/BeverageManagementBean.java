package de.uniba.dsg.dsam.backend.beans;

import javax.ejb.Stateless;

import de.uniba.dsg.dsam.model.Beverage;
import de.uniba.dsg.dsam.persistence.BeverageManagement;

@Stateless
public class BeverageManagementBean implements BeverageManagement {

    @Override
    public void create(Beverage beverage) {

    }
}
