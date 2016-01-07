package logic;

import java.util.ArrayList;

import databases.CargoSpaceIndividual;
import databases.ShapeGenerator;

public class FillCargo {


	public void shapePlacer( int y, int x, int z, CargoSpaceIndividual cargo, ShapeGenerator shape)
	{
		int[][][] space = cargo.getCargoSpace();
	
		for (int i = 0; i < shape.getShape().length; i++) 
		{
			for (int j = 0; j < shape.getShape()[i].length; j++) 
			{
				for(int k = 0; k < shape.getShape()[i][j].length; k++)
				{
					space[y + i][x + j][z + k] += shape.getShape()[i][j][k];
				}
			}
		}
		cargo.setCargoSpace(space);
	}
	
	public ShapeGenerator randomShapeChooser(ArrayList<ShapeGenerator> shapes)
	{
		ShapeGenerator shape;
		int i = (int) (Math.random()*shapes.size());
		shape = shapes.get(i);
		return shape;
	}
	
	public int[] findEmpty(CargoSpaceIndividual cargo)
	{
		int[] coordinates = new int[3];
		for (int i = 0; i < cargo.getCargoSpace().length; i++) 
		{
			for (int j = 0; j < cargo.getCargoSpace()[i].length; j++) 
			{
				for(int k = 0; k < cargo.getCargoSpace()[i][j].length; k++)
				{
					if(cargo.getCargoSpace()[i][j][k]==0)
					{
						coordinates[0] = i;
						coordinates[1] = j;
						coordinates[2] = k;
						return coordinates;
					}
				}
			}
		}
		coordinates = null;
		return coordinates;
	}
	
	public boolean	collisionChecker( int y, int x, int z ,ShapeGenerator shape, CargoSpaceIndividual individual)
	{
		boolean fits = false;
		for ( int i = y; i<shape.getShape().length; i++)
		{
			for ( int j = x; j<shape.getShape()[i].length; j++)
			{
				for ( int k = z; k<shape.getShape()[i][j].length; k++)
				{
					if (shape.getShape()[i][j][k] != 0)
					{
						if (individual.getCargoSpace()[i][j][k] == 0)
						{
							fits= true;
						}
						else
						{
							fits = false;
							return fits;
						}
					}
				}
			}
		}
		
		return fits;
	}

}
