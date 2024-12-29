package tvr.lrn.ms.configac.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;

import tvr.lrn.ms.models.ifc.Wheel;
import tvr.lrn.ms.models.xml.Car;
import tvr.lrn.ms.models.xml.MyTire;

@Configuration
@PropertySource("classpath:application.properties")
public class JavaSpringConfiguration {

	@Value("${car.primary.name}")
	private String myPrimaryCar;
	@Value("${car.name}")
	private String myCarName;
	@Value("${tire.primary.name}")
	private String myPrimaryTire;
	@Value("${tire.name}")
	private String myTireName;

	@Bean
	@Primary
	public Car myCar(Wheel wheel) {
		return new Car(myPrimaryCar, wheel);
	}

	@Bean(name = { "car1", "car2" })
	public Car myCar2(@Qualifier("myTire1") Wheel wheel) {
		return new Car(myCarName, wheel);
	}

	@Bean
	@Primary
	public MyTire myTire() {
		return new MyTire(myPrimaryTire);
	}

	@Bean(name = { "myTire1", "myTire2" })
	public MyTire myTire2() {
		return new MyTire(myTireName);
	}
}
