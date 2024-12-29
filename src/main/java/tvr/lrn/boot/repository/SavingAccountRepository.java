package tvr.lrn.boot.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import tvr.lrn.boot.model.SavingAccount;
import tvr.lrn.boot.model.ifc.Account;

@Repository()
public class SavingAccountRepository {
	private JdbcTemplate template;

	@Autowired
	public void setJdbcTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public List<Account> getAccounts() {
		String query = "Select * from saving_account";
		return this.template.query(query, (rs, rowNum) -> {
			var sa = new SavingAccount();
			sa.setAccountNo(rs.getInt(1));
			sa.setFullName(rs.getString(2));
			sa.setBalance(rs.getDouble(3));
			return sa;
		});
	}
}
