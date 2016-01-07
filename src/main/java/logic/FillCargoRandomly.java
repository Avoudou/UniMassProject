package logic;

import java.util.ArrayList;

import databases.CargoSpaceIndividual;
import databases.ShapeData;
import databases.ShapeGenerator;

public class FillCargoRandomly extends FillCargo {

	private CargoSpaceIndividual aCargoSpace;
	private ShapeData shapeLoads;

	public FillCargoRandomly(CargoSpaceIndividual aCargoSpace, ShapeData shapeLoads) {
		this.aCargoSpace = aCargoSpace;
		this.shapeLoads = shapeLoads;

	}

	public void fillCargoSpaceRandomly() {
		
		 ArrayList<ShapeGenerator> ourShapes= shapeLoads.getShapeList();
		 ShapeGenerator shape= ourShapes.get((int)(Math.random()*ourShapes.size()));
		 int[][][] space= aCargoSpace.getCargoSpace();
		 int[] emptySpaceCoords= findEmpty(aCargoSpace);
		 int y= emptySpaceCoords[0];
		 int x= emptySpaceCoords[1];
		 int z= emptySpaceCoords[2];
		 super.shapePlacer(y, x, z, aCargoSpace, shape);
		
		aCargoSpace.setCargoSpace(space);
	}
		
		

	}


