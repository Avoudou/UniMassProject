package databases;

import lombok.Getter;

public class ShapeGenerator {
	@Getter
 private int shapeIdentity;
 private int weight;
 private int[][][] aShape;

	public ShapeGenerator(int yElemUnits, int xElemUnits, int zElemUnits, int identity) {
		this.aShape = new int[yElemUnits][xElemUnits][zElemUnits];
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
