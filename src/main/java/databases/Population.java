package databases;

import java.util.ArrayList;

public class Population {
ArrayList<CargoSpaceIndividual> population;

public Population(){
	
}
public void addCargoIndividual(CargoSpaceIndividual anIndividual){
	population.add(anIndividual);
}
public void addCargoIndividual(int numOfCargos){
	
	for(int i=0;i<=numOfCargos;i++){
		population.add(new CargoSpaceIndividual(3,	 3, 3));
		
	}
	
}
}
