package tvr.lrn.boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tvr.lrn.boot.repository.SavingAccountRepository;

@Service
public class SavingAccountService {
	@Autowired
	private SavingAccountRepository saRepository;

	public void listAllAccountDetails() {
		saRepository.getAccounts().forEach(System.out::println);
	}
}
