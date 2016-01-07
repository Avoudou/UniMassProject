package desktop;

import static graphics.Constants.screenHeight;
import static graphics.Constants.screenWidth;
import logic.FillCargo;
import logic.FillCargoRandomly;
import graphics.CargoSpace3D;
import graphics.Shape3D;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

import databases.CargoSpaceIndividual;
import databases.ShapeGenerator;
import databases.ShapesDefault;

public class MainTests3D {

	public static void main(String[] args) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = screenWidth;
		config.height = screenHeight;
//		ShapeGenerator shape = new ShapeGenerator (3, 1, 1, 10);
//		ShapeGenerator shape2 = new ShapeGenerator(1, 3, 1, 10);
//		ShapeGenerator shape1 = new ShapeGenerator(1, 1, 3, 10);
//		CargoSpaceIndividual cargoSpace = new CargoSpaceIndividual(3, 3, 3);
//		FillCargo cargoLoader = new FillCargo();
//		 cargoLoader.addShape(cargoSpace, shape, 5, 5, 5);
//		 cargoLoader.addShape(cargoSpace, shape2, 0, 0, 0);
//		 cargoLoader.addShape(cargoSpace, shape, 0, 0, 0);
//		cargoLoader.shapePlacer( 0, 0, 0,cargoSpace, shape1);
//		System.out.println(cargoLoader.collisionChecker(0, 0, 0,shape1, cargoSpace));
//
//		 System.out.println(cargoSpace.getCargoSpace()[0][0][0]);
//
//		new LwjglApplication(new Shape3D(shape2), config);
		
		ShapesDefault shapes=new ShapesDefault();
		CargoSpaceIndividual cargoSpace = new CargoSpaceIndividual(6, 6, 6);
		FillCargoRandomly randomLoader = new FillCargoRandomly(cargoSpace, shapes);
		randomLoader.fillCargoSpaceRandomly();
		
		
		new LwjglApplication(new CargoSpace3D(cargoSpace), config);

	}

}
