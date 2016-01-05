package databases;

import lombok.Getter;

public class ShapeGenerator {
 private int shapeIdentity;


 private int[][][] aShape;

	public ShapeGenerator(int xElemUnits, int yElemUnits, int zElemUnits, int identity) {
		this.aShape = new int[xElemUnits][yElemUnits][zElemUnits];
		this.shapeIdentity= identity;
		for (int i = 0; i<aShape.length; i++)
		{
			for (int j = 0; j<aShape[i].length; j++)
			{
				for (int k = 0; k<aShape[i][j].length; k++)
				{
					aShape[i][j][k]=shapeIdentity;
				}
			}
		}
	}
	public int[][][] getShape(){
		return aShape;
		
	}
}
