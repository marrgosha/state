package fi.margokomarova.state._main;

import fi.margokomarova.state.entity.*;
import fi.margokomarova.state.service.StateService;

import java.util.Scanner;

public class _Main {
    public static void main (String[]args){
        //Town town=new Town();
        //District district=new District();
        State state=State.getInstance();
        state.setCapital("Golden");
        state.setSquare(38500);
        Citizen citizen=new Citizen();

        StateService service=new StateService();
        //Region region=new Region();
        //service.printRegion(region);

        //service.printTown(town);
        //service.printDistrict(district);
        //service.printState(state);
        //service.printCitizen(citizen);

        System.out.println("Enter one of the following commands:");
        System.out.println("1-print the capital");
        System.out.println("2-number of regions");
        System.out.println("3-size of the state");
        System.out.println("4-regional centres");
        System.out.println("5-medium citizen age");
        System.out.println("6-citizens with the n size names");
        Scanner choice=new Scanner(System.in);
        System.out.println("Enter 1/2/3/4/5/6");
        int choiceEntry= choice.nextInt();

        while (true){
            if (choiceEntry<1 || choiceEntry>6){
                System.out.println("Enter 1/2/3/4/5/6");
                choiceEntry=choice.nextInt();

            }
            else if(choiceEntry==1){
                System.out.println("The name of the capital is "+state.getCapital());
            } else if (choiceEntry==2) {
                System.out.println("The number of regions is "+state.getRegions().length);
            }else if (choiceEntry==3){
                System.out.println("3-size of the state is "+state.getSquare()+"m2");
            }


        }






    }
}
