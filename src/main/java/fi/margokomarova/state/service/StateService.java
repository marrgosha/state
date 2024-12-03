package fi.margokomarova.state.service;

import fi.margokomarova.state.entity.District;
import fi.margokomarova.state.entity.Region;
import fi.margokomarova.state.entity.State;
import fi.margokomarova.state.entity.Town;

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


}
