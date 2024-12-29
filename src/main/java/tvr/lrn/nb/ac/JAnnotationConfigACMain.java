package tvr.lrn.nb.ac;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import tvr.lrn.nb.config.JavaSpringConfiguration;
import tvr.lrn.nb.models.ifc.Vehicle;

public class JAnnotationConfigACMain {

	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(JavaSpringConfiguration.class);
		var vh = ac.getBean(Vehicle.class);
		vh.drive();
		var obj1 = ac.getBean("myCar");
		if (obj1 instanceof Vehicle vh2) {
			vh2.drive();
		}
		var obj2 = ac.getBean("car1");
		if (obj2 instanceof Vehicle vh2) {
			vh2.drive();
		}
	}

}
