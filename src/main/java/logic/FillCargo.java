package logic;

import databases.CargoSpaceIndividual;
import databases.ShapeGenerator;

public class FillCargo {
	
	
	
	public void addShape(CargoSpaceIndividual cargoSpace,ShapeGenerator aShape,int yPos,int xPos,int zPos){
		for(int i= 0 ;i<aShape.getShape().length;i++){
			for(int j= 0 ;j<aShape.getShape()[0].length;j++){
				for(int q= 0 ;q<aShape.getShape()[0][0].length;q++){
					cargoSpace.getCargoSpace()[i+yPos][j+xPos][q+zPos]=aShape.getShapeIdentity();
					
				}
			}
		}
		
		
		
		
	}

}
