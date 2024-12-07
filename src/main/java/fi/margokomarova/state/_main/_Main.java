package fi.margokomarova.state._main;

import fi.margokomarova.state.entity.*;
import fi.margokomarova.state.service.StateService;

import java.util.Arrays;
import java.util.Scanner;

public class _Main {
    public static void main (String[]args){
        //Town town=new Town();
        //District district=new District();
        State state=State.getInstance();
        state.setCapital("Golden");
        state.setSquare(38500);
        //Citizen citizen=new Citizen();
        int citizenAmount=500+(int)(Math.random()*1000);
        System.out.println(citizenAmount);
        Citizen[]stateCitizens=new Citizen[citizenAmount];
        int [] ageCitizens=new int [citizenAmount];
        for (int i=0; i<citizenAmount; i++) {
            stateCitizens[i] = new Citizen();
            ageCitizens[i]= stateCitizens[i].getAge();

        }
       // for (Citizen element:stateCitizens){
            //System.out.println(element);

        StateService service=new StateService();

        //Region region=new Region();
        //service.printRegion(region);

        //service.printTown(town);
        //service.printDistrict(district);
        //service.printState(state);
        //service.printCitizen(citizen);
        service.printFirstCharacterCitizens(stateCitizens);

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
                System.out.println("size of the state is "+state.getSquare()+"m2");
            }else if (choiceEntry==4){
                System.out.println("regional centres are "+ Arrays.toString(state.getRegions()));
            }else if (choiceEntry==5){
                System.out.println("medium citizen age is "+ service.calculateMeanAge(ageCitizens));
            }else {
                //Scanner choice1=new Scanner(System.in);
                //System.out.println("Enter n number");


            }





        }






    }
}
