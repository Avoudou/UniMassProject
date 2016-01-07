package databases;

import java.util.ArrayList;

public class ShapeData {
	
	private ArrayList<ShapeGenerator> shapeList = new ArrayList<ShapeGenerator>();
	
	
	public void addShape(ShapeGenerator aShape){
		shapeList.add(aShape);
	}
	
	public ShapeGenerator getShape(int index){
		return shapeList.get(index);
	}
	
	public ArrayList<ShapeGenerator> getShapeList(){
		return shapeList;
	}
	

}
