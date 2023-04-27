package sa;

/*
* SimulatedAnnealing.java
* Contains the main runner method of the project.
* 
*/

public class SimulatedAnnealing {
    
    public static void main(String[] args) {
        
        City city = new City("1",8375, 4700);
        TourManager.addCity(city);
        City city2 = new City("2",8775, 4700);
        TourManager.addCity(city2);
        City city3 = new City("3",8375, 4900);
        TourManager.addCity(city3);
        City city4 = new City("4",8175, 4900);
        TourManager.addCity(city4);
        City city5 = new City("5",8775, 4900);
        TourManager.addCity(city5);
        City city6 = new City("6",8575, 4900);
        TourManager.addCity(city6);
        City city7 = new City("7",8775, 5400);
        TourManager.addCity(city7);
        City city8 = new City("8",8375, 5450);
        TourManager.addCity(city8);
        City city9 = new City("9",8775, 5600);
        TourManager.addCity(city9);
        City city10 = new City("10",8575, 5600);
        TourManager.addCity(city10);        
        City city11 = new City("11",8375, 5650);
        TourManager.addCity(city11);
        City city12 = new City("12",8175, 5650);
        TourManager.addCity(city12);
        City city13 = new City("13",8375, 6200);
        TourManager.addCity(city13);
        City city14 = new City("14",8775, 6200);
        TourManager.addCity(city14);
        City city15 = new City("15",8375, 6400);
        TourManager.addCity(city15);
        City city16 = new City("16",8175, 6400);
        TourManager.addCity(city16);
        City city17 = new City("17",8775, 6400);
        TourManager.addCity(city17);
        City city18 = new City("18",8575, 6400);
        TourManager.addCity(city18);
        City city19 = new City("19",8375, 7000);
        TourManager.addCity(city19);
        City city20 = new City("20",8775, 7000);
        TourManager.addCity(city20);
        City city21 = new City("21",8375, 7200);
        TourManager.addCity(city21);
        City city22 = new City("22",8175, 7200);
        TourManager.addCity(city22);
        City city23 = new City("23",8775, 7200);
        TourManager.addCity(city23);
        City city24 = new City("24",8575, 7200);
        TourManager.addCity(city24);
        City city25 = new City("25",8375, 7800);
        TourManager.addCity(city25);
        City city26 = new City("26",8775, 7800);
        TourManager.addCity(city26);
        City city27 = new City("27",8375, 8000);
        TourManager.addCity(city27);
        City city28 = new City("28",8175, 8000);
        TourManager.addCity(city28);
        City city29 = new City("29",8775, 8000);
        TourManager.addCity(city29);
        City city30 = new City("30",8575, 8000);
        TourManager.addCity(city30);
        City city31 = new City("31",8375, 8700);
        TourManager.addCity(city31);
        City city32 = new City("32",8775, 8700);
        TourManager.addCity(city32);
        City city33 = new City("33",8375, 8900);
        TourManager.addCity(city33);
        City city34 = new City("34",8175, 8900);
        TourManager.addCity(city34);
        City city35 = new City("35",8775, 8900);
        TourManager.addCity(city35);
        City city36 = new City("36",8575, 8900);
        TourManager.addCity(city36);
        City city37 = new City("37",8375, 9600);
        TourManager.addCity(city37);
        City city38 = new City("38",8775, 9600);
        TourManager.addCity(city38);
        City city39 = new City("39",8375, 9800);
        TourManager.addCity(city39);
        City city40 = new City("40",8175, 9800);
        TourManager.addCity(city40);
        City city41 = new City("41",8775, 9800);
        TourManager.addCity(city41);
        City city42 = new City("42",8575, 9800);
        TourManager.addCity(city42);
        City city43 = new City("43",8375, 10500);
        TourManager.addCity(city43);
        City city44 = new City("44",8775, 10450);
        TourManager.addCity(city44);
        City city45 = new City("45",8375, 10700);
        TourManager.addCity(city45);
        City city46 = new City("46",8175, 10700);
        TourManager.addCity(city46);
        City city47 = new City("47",8775, 10650);
        TourManager.addCity(city47);
        City city48 = new City("48",8575, 10650);
        TourManager.addCity(city48);
        City city49 = new City("49",8375, 11300);
        TourManager.addCity(city49);
        City city50 = new City("50",8775, 11300);
        TourManager.addCity(city50);
        City city51 = new City("51",8375, 11500);
        TourManager.addCity(city51);
        City city52 = new City("52",8175, 11500);
        TourManager.addCity(city52);
        City city53 = new City("53",8775, 11500);
        TourManager.addCity(city53);
        City city54 = new City("54",8575, 11500);
        TourManager.addCity(city54);
        City city55 = new City("55",15825, 11500);
        TourManager.addCity(city55);
        City city56 = new City("56",15825, 10700);
        TourManager.addCity(city56);
        City city57 = new City("57",15825, 9800);
        TourManager.addCity(city57);
        City city58 = new City("58",15825, 8900);
        TourManager.addCity(city58);
        City city59 = new City("59",15825, 8000);
        TourManager.addCity(city59);
        City city60 = new City("60",15825, 7200);
        TourManager.addCity(city60);
        City city61 = new City("61",15825, 6400);
        TourManager.addCity(city61);
        City city62 = new City("62",15825, 5650);
        TourManager.addCity(city62);
        City city63 = new City("63",15825, 4900);
        TourManager.addCity(city63);
        City city64 = new City("64",16025, 4700);
        TourManager.addCity(city64);
        City city65 = new City("65",16425, 4700);
        TourManager.addCity(city65);
        City city66 = new City("66",16025, 4900);
        TourManager.addCity(city66);
        City city67 = new City("67",16225, 4900);
        TourManager.addCity(city67);
        City city68 = new City("68",16425, 4900);
        TourManager.addCity(city68);
        City city69 = new City("69",16425, 5400);
        TourManager.addCity(city69);
        City city70 = new City("70",16025, 5450);
        TourManager.addCity(city70);
        City city71 = new City("71",16225, 5600);
        TourManager.addCity(city71);
        City city72 = new City("72",16425, 5600);
        TourManager.addCity(city72);
        City city73 = new City("73",16025, 5650);
        TourManager.addCity(city73);
        City city74 = new City("74",16025, 6200);
        TourManager.addCity(city74);
        City city75 = new City("75",16425, 6200);
        TourManager.addCity(city75);
        City city76 = new City("76",16025, 6400);
        TourManager.addCity(city76);
        City city77 = new City("77",16225, 6400);
        TourManager.addCity(city77);
        City city78 = new City("78",16425, 6400);
        TourManager.addCity(city78);
        City city79 = new City("79",16025, 7000);
        TourManager.addCity(city79);
        City city80 = new City("80",16425, 7000);
        TourManager.addCity(city80);
        City city81 = new City("81",16025, 7200);
        TourManager.addCity(city81);
        City city82 = new City("82",16225, 7200);
        TourManager.addCity(city82);
        City city83 = new City("83",16425, 7200);
        TourManager.addCity(city83);
        City city84 = new City("84",16025, 7800);
        TourManager.addCity(city84);
        City city85 = new City("85",16425, 7800);
        TourManager.addCity(city85);
        City city86 = new City("86",16025, 8000);
        TourManager.addCity(city86);
        City city87 = new City("87",16225, 8000);
        TourManager.addCity(city87);
        City city88 = new City("88",16425, 8000);
        TourManager.addCity(city88);
        City city89 = new City("89",16025, 8700);
        TourManager.addCity(city89);
        City city90 = new City("90",16425, 8700);
        TourManager.addCity(city90);
        City city91 = new City("91",16025, 8900);
        TourManager.addCity(city91);
        City city92 = new City("92",16225, 8900);
        TourManager.addCity(city92);
        City city93 = new City("93",16425, 8900);
        TourManager.addCity(city93);
        City city94 = new City("94",16025, 9600);
        TourManager.addCity(city94);
        City city95 = new City("95",16425, 9600);
        TourManager.addCity(city95);
        City city96 = new City("96",16025, 9800);
        TourManager.addCity(city96);
        City city97 = new City("97",16225, 9800);
        TourManager.addCity(city97);
        City city98 = new City("98",16425, 9800);
        TourManager.addCity(city98);
        City city99 = new City("99",16025, 10500);
        TourManager.addCity(city99);
        City city100 = new City("100",16425, 10450);
        TourManager.addCity(city100);
        City city101 = new City("101",16025, 10700);
        TourManager.addCity(city101);
        City city102 = new City("102",16225, 10650);
        TourManager.addCity(city102);
        City city103 = new City("103",16425, 10650);
        TourManager.addCity(city103);
        City city104 = new City("104",16025, 11300);
        TourManager.addCity(city104);
        City city105 = new City("105",16425, 11300);
        TourManager.addCity(city105);
        City city106 = new City("106",16025, 11500);
        TourManager.addCity(city106);
        City city107 = new City("107",16225, 11500);
        TourManager.addCity(city107);
        
        
        // Initial Temperature
        double temp = 40000;

        // Cooling Rate
        double coolingRate = 0.00001;

        // Create random current solution
        Tour currentSolution = new Tour();
        currentSolution.generateIndividual();
        
        System.out.println("Total distance of initial solution: " + currentSolution.getTotalDistance());
        System.out.println("Tour: " + currentSolution);
        
        // Plotting graph of initial tour solution
        GraphTour current = new GraphTour(currentSolution, "Initial Simulated Annealing");
        
        // First assume best solution is equal to the initial solution
        Tour bestSolution = new Tour(currentSolution.getTour());
        
        // Loop until system has cooled
        while (temp > 1) {
        	
            // Create new neighbour tour
            Tour newSolution = new Tour(currentSolution.getTour());

            // Get random positions in the tour
            int tourPos1 = Utility.randomInt(1 , newSolution.tourSize());
            int tourPos2 = Utility.randomInt(1 , newSolution.tourSize());
            
            // Ensure tourPos1 and tourPos2 are different
    		while(tourPos1 == tourPos2) {tourPos2 = Utility.randomInt(1 , newSolution.tourSize());}

            // Cities at selected positions in the tour
            City citySwap1 = newSolution.getCity(tourPos1);
            City citySwap2 = newSolution.getCity(tourPos2);

            // Swapping of the cities
            newSolution.setCity(tourPos2, citySwap1);
            newSolution.setCity(tourPos1, citySwap2);
            
            // Get distance of the solutions
            int currentDistance   = currentSolution.getTotalDistance();
            int neighbourDistance = newSolution.getTotalDistance();

            // Acceptance Probability to decide if neighbour should be accepted
            double rand = Utility.randomDouble();
            if (Utility.acceptanceProbability(currentDistance, neighbourDistance, temp) >= rand) {
                currentSolution = new Tour(newSolution.getTour());
            }

            // If current tour is better than (shorter than) best tour, update best tour
            if (currentSolution.getTotalDistance() < bestSolution.getTotalDistance()) {
                bestSolution = new Tour(currentSolution.getTour());
            }
            
            // Cool system
            temp *= 1 - coolingRate;
        }

        System.out.println("Best solution distance: " + bestSolution.getTotalDistance());
        System.out.println("Tour: " + bestSolution);
        
        // Plotting graph of best tour solution
        GraphTour best = new GraphTour(bestSolution, "Best Simulated Annealing");
    }
    
   

}
