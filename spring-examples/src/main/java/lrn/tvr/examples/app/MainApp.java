package lrn.tvr.examples.app;

import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import lrn.tvr.examples.dao.CurrentAccountDao;
import lrn.tvr.examples.dao.SavingAccountDao;
import lrn.tvr.examples.dao.impl.CurrentAccountDaoImpl;
import lrn.tvr.examples.entity.CurrentAccount;
import lrn.tvr.examples.entity.SavingAccount;

@SpringBootApplication
@ComponentScan(basePackages = { "lrn.tvr.examples.dao.impl", "lrn.tvr.examples.entity" }, basePackageClasses = {})
@EntityScan(basePackageClasses = { SavingAccount.class, CurrentAccount.class })
@EnableJpaRepositories(basePackageClasses = { CurrentAccountDaoImpl.class })
public class MainApp {

	public static void main(String[] args) {
		SpringApplication.run(MainApp.class, args);
	}

	public CommandLineRunner runThisStep(SavingAccountDao sAccountDao) {
		return runner -> {
			System.out.println("Running Basic Application");
			var account = createNewAccount(sAccountDao);
			fetchAccount(sAccountDao, account.getAccountNo());
		};
	}

	@Bean
	public CommandLineRunner runThisStep2(CurrentAccountDao cAccountDao) {
		return runner -> {
			System.out.println("Running Basic Application");
			var account = createNewCurrentAccount(cAccountDao);
			fetchAccount(cAccountDao, account.getAccountNo());
		};
	}

	private SavingAccount createNewAccount(SavingAccountDao sAccountDao) {
		try (var scanner = new Scanner(System.in)) {
			SavingAccount savingAccount = new SavingAccount();
			String fullName;
			double balance;
			System.out.println("Enter Name of Account Holder");
			fullName = scanner.nextLine();
			System.out.println("Enter Initial Balance");
			balance = scanner.nextDouble();
			savingAccount.setFullName(fullName);
			savingAccount.setBalance(balance);
			sAccountDao.insertAccount(savingAccount);
			return savingAccount;
		}
	}

	private void fetchAccount(SavingAccountDao sAccountDao, int accountNo) {
		System.out.println(sAccountDao.getAccount(accountNo));

	}

	private CurrentAccount createNewCurrentAccount(CurrentAccountDao cAccountDao) {
		try (var scanner = new Scanner(System.in)) {
			CurrentAccount cAccount = new CurrentAccount();
			String bName;
			double balance, overdrawAmount;
			System.out.println("Enter Name of Business Entity");
			bName = scanner.nextLine();
			System.out.println("Enter Initial Balance");
			balance = scanner.nextDouble();
			System.out.println("Enter Initial overdraw Amount");
			overdrawAmount = scanner.nextDouble();

			cAccount.setBusinessName(bName);
			cAccount.setBalance(balance);
			cAccount.setOverdrawAmount(overdrawAmount);
			cAccountDao.insertAccount(cAccount);
			return cAccount;
		}
	}

	private void fetchAccount(CurrentAccountDao cAccountDao, int accountNo) {
		System.out.println(cAccountDao.getAccount(accountNo));

	}
}
