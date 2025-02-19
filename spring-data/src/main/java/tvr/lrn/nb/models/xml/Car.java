package tvr.lrn.nb.models.xml;

import tvr.lrn.nb.models.ifc.Vehicle;
import tvr.lrn.nb.models.ifc.Wheel;

public class Car implements Vehicle {
	private Wheel myWheel;
	private String name;

	public Car(String name, Wheel myWheel) {
		this.myWheel = myWheel;
		this.name=name;
		System.out.println(name + ":: Car is created");
	}

	public void drive() {
		System.out.println(name + " :: Car is driving  with " + myWheel);
	}
}
