package fi.margokomarova.state._main;

import fi.margokomarova.state.entity.District;
import fi.margokomarova.state.entity.Region;
import fi.margokomarova.state.entity.State;
import fi.margokomarova.state.entity.Town;
import fi.margokomarova.state.service.StateService;

public class _Main {
    public static void main (String[]args){
        //Town town=new Town();
        //District district=new District();
        State state=State.getInstance();

        StateService service=new StateService();
        //Region region=new Region();
        //service.printRegion(region);

        //service.printTown(town);
        //service.printDistrict(district);
        service.printState(state);



    }
}
