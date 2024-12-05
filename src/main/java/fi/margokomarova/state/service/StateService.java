package fi.margokomarova.state.service;

import fi.margokomarova.state.entity.*;

public class StateService {
    public void printTown (Town town){
        System.out.println(town);
    }

    public void printDistrict(District district){
        System.out.println(district);
    }

    public void printRegion(Region region){
        System.out.println(region);
    }

    public void printState(State state){
        System.out.println(state);
    }

    public void printCitizen(Citizen citizen){
        System.out.println(citizen);
    }


}
