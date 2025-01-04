package tvr.lrn.boot.ms.app.db;

import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import tvr.lrn.boot.dao.SavingAccountJPADAO;
import tvr.lrn.boot.entity.SavingAccountEntity;

@SpringBootApplication
@ComponentScan({ "tvr.lrn.boot", "tvr.lrn.boot.entity" })
//@EnableJpaRepositories(basePackages = "tvr.lrn.boot.repository")
public class MSDaoEntityManagerApp {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(MSDaoEntityManagerApp.class, args);
		ac.getBean(SavingAccountEntity.class);
	}

	@Bean
	public CommandLineRunner run(SavingAccountJPADAO jpa) {
		return runner -> {
//			var savingAccount = createSavingAccount(jpa);
			findSA(jpa, 2);
			System.out.println("Application is running");
		};
	}

	private void findSA(SavingAccountJPADAO jpa, int savingAccountId) {
		System.out.println("Checking jpa findbyID" + savingAccountId);
		System.out.println(jpa.findById(savingAccountId));

	}

	private SavingAccountEntity createSavingAccount(SavingAccountJPADAO jpa) {
		try (var scanner = new Scanner(System.in)) {
			SavingAccountEntity savingAccount = new SavingAccountEntity();

			System.out.println("Enter Full Name(String)");
			String fName = scanner.nextLine();
			savingAccount.setFullName(fName);
			System.out.println("Enter Balance Amount(Double)");
			double balance = scanner.nextDouble();
			savingAccount.setBalance(balance);
			return jpa.save(savingAccount);
		}
	}

}
