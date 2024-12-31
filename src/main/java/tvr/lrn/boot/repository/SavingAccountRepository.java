package tvr.lrn.boot.repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
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

	public List<SavingAccount> getAccounts() {
		String query = "Select * from saving_account";
		return this.template.query(query, new SARowMapper());
	}
	public int save(SavingAccount sa) {
		String query = "insert into saving_account(full_name,balance) values(?,?)";
		return this.template.update(query,sa.getFullName(),sa.getBalance());
	}
	public List<SavingAccount> fetchBigAccounts(double balance) {
		String query = "select * from saving_account s where s.balance>=?";
		return this.template.query(query,ps->ps.setDouble(1,balance), new SARowMapper());
	}
	class SARowMapper implements RowMapper<SavingAccount>{

		@Override
		public SavingAccount mapRow(ResultSet rs, int rowNum) throws SQLException {
			var sa = new SavingAccount();
			sa.setAccountNo(rs.getInt(1));
			sa.setFullName(rs.getString(2));
			sa.setBalance(rs.getDouble(3));
			return sa;
		}
	}
}
