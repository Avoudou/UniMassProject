
package databases;

import java.util.ArrayList;

public class ShapesDefault extends ShapeData {
	

	
		private ShapeGenerator shapeA = new ShapeGenerator(2,2,4,2);
		private ShapeGenerator shapeB = new ShapeGenerator(2,3,4,3);
		private ShapeGenerator shapeC = new ShapeGenerator(3,3,3,1);
		
		
		
		public ShapesDefault()
		{
			super.addShape(shapeA);
			super.addShape(shapeB);
			super.addShape(shapeC);
		}
		
	

}
