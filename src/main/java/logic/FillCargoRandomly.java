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

		ArrayList<ShapeGenerator> ourShapes = shapeLoads.getShapeList();

		int[][][] space = aCargoSpace.getCargoSpace();

		for (int i = 0; i < space.length; i++) {
			for (int j = 0; j < space[0].length; j++) {
				for (int k = 0; k < space[0][0].length; k++) {
					if (space[i][j][k] == 0) {

						ArrayList<ShapeGenerator> tempList = new ArrayList<ShapeGenerator>(ourShapes);
						boolean somethingPlaced= false;
						while (tempList.size() > 0 && somethingPlaced==false) {

							int randomIndex = (int) (Math.random() * tempList.size());
							ShapeGenerator shape = ourShapes.get(randomIndex);
							tempList.remove(randomIndex);

							if (collisionChecker(i, j, k, shape, aCargoSpace)) {
								shapePlacer(i, j, k, aCargoSpace, shape);
								somethingPlaced=true;
							}

						}
					}
				}
			}
		}
		aCargoSpace.setCargoSpace(space);
	}
}
