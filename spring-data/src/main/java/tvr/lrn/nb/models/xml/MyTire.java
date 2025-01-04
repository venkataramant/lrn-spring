package tvr.lrn.nb.models.xml;

import tvr.lrn.nb.models.ifc.Wheel;


public class MyTire implements Wheel{
	private String name;
	public MyTire(String name) {
		this.name=name;
		System.out.println("Tire is created with name::"+name);
	}
	@Override
	public String toString() {
		return "MyTire [name=" + name + "]";
	}
}
