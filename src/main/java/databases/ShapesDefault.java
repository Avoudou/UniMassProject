
package databases;

import java.util.ArrayList;

public class ShapesDefault {
	

	
		private ShapeGenerator shapeA = new ShapeGenerator(2,2,4,2);
		private ShapeGenerator shapeB = new ShapeGenerator(2,3,4,3);
		private ShapeGenerator shapeC = new ShapeGenerator(3,3,3,1);
		
		public ArrayList<ShapeGenerator> shapeList = new ArrayList<ShapeGenerator>();
		
		public ShapesDefault()
		{
			shapeList.add(shapeA);
			shapeList.add(shapeB);
			shapeList.add(shapeC);
		}
		
	

}
