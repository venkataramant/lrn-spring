package lrn.tvr.examples.app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import lrn.tvr.examples.dao.SavingAccountDao;
import lrn.tvr.examples.entity.PlainAccount;
import lrn.tvr.examples.entity.SavingAccount;

@SpringBootApplication
@ComponentScan(basePackages = { "lrn.tvr.examples.dao.impl", "lrn.tvr.examples.entity" }, basePackageClasses = {
		SavingAccountDao.class, SavingAccount.class })
@EntityScan(basePackageClasses = { SavingAccount.class })
@EnableJpaRepositories
public class MainApp {

	public static void main(String[] args) {
		SpringApplication.run(MainApp.class, args);
	}

	public CommandLineRunner runThisStep(PlainAccount pa) {
		return runner -> {
			System.out.println("Running Basic Application");
		};
	}

	@Bean
	public CommandLineRunner runThisStep(SavingAccountDao sAccountDao, PlainAccount pa) {
		return runner -> {
			System.out.println("Running Basic Application");
			fetchAccount(sAccountDao);
		};
	}

	private void fetchAccount(SavingAccountDao sAccountDao) {
		System.out.println(sAccountDao.getAccount(2));

	}
}
