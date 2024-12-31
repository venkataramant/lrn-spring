package tvr.lrn.boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tvr.lrn.boot.model.SavingAccount;
import tvr.lrn.boot.repository.SavingAccountRepository;

@Service
public class SavingAccountService {
	@Autowired
	private SavingAccountRepository saRepository;

	public void listAllAccountDetails() {
		saRepository.getAccounts().forEach(System.out::println);
	}

	public void createNewSA() {
		var sa=new SavingAccount("BigBullAccount",1000000);
		System.out.println(saRepository.save(sa));
	}

	public void fetchBigAccounts(double balance) {
		saRepository.fetchBigAccounts(balance).forEach(System.out::println);
	}
}
