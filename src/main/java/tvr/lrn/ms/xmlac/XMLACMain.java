package tvr.lrn.ms.xmlac;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import tvr.lrn.ms.models.xml.Car;

public class XMLACMain {

	public static void main(String[] args) {
		loadXmlAC();
	}

	public static void loadXmlAC() {
		try (var ac = new ClassPathXmlApplicationContext("beans1.xml")) {
			Car car1 = (Car) ac.getBean("car1");
			System.out.println(car1);
			car1.drive();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
