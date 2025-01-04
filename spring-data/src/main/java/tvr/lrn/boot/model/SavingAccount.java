package tvr.lrn.boot.model;

import org.springframework.stereotype.Component;

import lombok.NoArgsConstructor;

@Component
@NoArgsConstructor
public class SavingAccount extends BasicAccount {

	public SavingAccount(String fullName, double balance) {
		this.setBalance(balance);
		this.setFullName(fullName);
	}

	@Override
	public String toString() {
		return super.toString();
	}
}
