package tvr.lrn.boot.ms.app.db;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import tvr.lrn.boot.service.SavingAccountService;

@SpringBootApplication
@ComponentScan({ "tvr.lrn.boot.model", "tvr.lrn.boot.service", "tvr.lrn.boot.repository" })
public class MasterSpringApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(MasterSpringApplication.class, args);
		var saService = ac.getBean(SavingAccountService.class);
		saService.listAllAccountDetails();
		saService.createNewSA();
		saService.fetchBigAccounts(1000000);
	}

}
