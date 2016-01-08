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
		ShapeGenerator shape = new ShapeGenerator (1, 1, 1, 1);
		ShapeGenerator shape2 = new ShapeGenerator(1, 1, 1, 2);
		ShapeGenerator shape1 = new ShapeGenerator(1, 1, 1, 3);
		CargoSpaceIndividual cargoSpace = new CargoSpaceIndividual(2, 2, 2);
		FillCargo cargoLoader = new FillCargo();
		cargoLoader.shapePlacer(0, 1, 1, cargoSpace, shape1);
		cargoLoader.shapePlacer(0, 0, 1, cargoSpace, shape);
		cargoLoader.shapePlacer( 0, 0, 0,cargoSpace, shape);
		System.out.println(cargoLoader.collisionChecker(0, 0, 0,shape1, cargoSpace));
		
		
		

		//new LwjglApplication(new CargoSpace3D(cargoSpace), config);
		new LwjglApplication(new Shape3D(new ShapesDefault().getShape(2)), config);
		
//		ShapesDefault shapes=new ShapesDefault();
//		CargoSpaceIndividual cargoSpace = new CargoSpaceIndividual(6, 6, 6);
//		FillCargoRandomly randomLoader = new FillCargoRandomly(cargoSpace, shapes);
//		randomLoader.fillCargoSpaceRandomly();
//		
//		
//		new LwjglApplication(new CargoSpace3D(cargoSpace), config);

	}

}
