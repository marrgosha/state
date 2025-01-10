package fi.margokomarova.state._main;

import fi.margokomarova.state.entity.Citizen;
import fi.margokomarova.state.entity.State;
import fi.margokomarova.state.service.StateService;

import java.util.Arrays;
import java.util.Scanner;

public class _Main {
    public static void main(String[] args) {
        State state = State.getInstance();
        state.setCapital("Golden");
        state.setSquare(38500.6);
        int citizenAmount = 500 + (int) (Math.random() * 1000);
        System.out.println("number of citizens=" + citizenAmount);
        Citizen[] stateCitizens = new Citizen[citizenAmount];
        int[] ageCitizens = new int[citizenAmount];
        for (int i = 0; i < citizenAmount; i++) {
            stateCitizens[i] = new Citizen();
            ageCitizens[i] = stateCitizens[i].getAge();
        }

        StateService service = new StateService();
        service.printFirstCharacterCitizens(stateCitizens);

        while (true) {
            System.out.println("===================================");
            System.out.println("Enter one of the following commands:");
            System.out.println("1-print the capital");
            System.out.println("2-number of regions");
            System.out.println("3-size of the state");
            System.out.println("4-regional centres");
            System.out.println("5-medium citizen age");
            System.out.println("6-citizens with the n size names");
            Scanner choice = new Scanner(System.in);
            int choiceEntry = choice.nextInt();
            if (choiceEntry < 1 || choiceEntry > 6) {
                System.out.println("Wrong entry. Enter 1/2/3/4/5/6");
                choiceEntry = choice.nextInt();
            }
            if (choiceEntry == 1) {
                System.out.println("The name of the capital is " + state.getCapital());
            } else if (choiceEntry == 2) {
                System.out.println("The number of regions is " + state.getRegions().length);
            } else if (choiceEntry == 3) {
                System.out.println("size of the state is " + state.getSquare() + "m2");
            } else if (choiceEntry == 4) {
                System.out.println("regional centres are " + Arrays.toString(state.getRegions()));
            } else if (choiceEntry == 5) {
                System.out.println("medium citizen age is " + service.calculateMeanAge(ageCitizens));
            } else {
                service.printCertainLengthNameCitizens(stateCitizens);
            }
        }
    }
}
