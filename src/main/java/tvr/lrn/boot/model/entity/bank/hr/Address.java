package tvr.lrn.boot.model.entity.bank.hr;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int addressId;
	private String firstLine;
	private String secondLine;
	private String city;
	private String State;
	private int zipCode;

	@Override
	public boolean equals(Object newobject) {
		if (newobject!=null && newobject instanceof Address addr2){
			if (addr2==this) {
				return true;
			}
			if (addr2.firstLine==null || !addr2.firstLine.equals(this.firstLine)) {
				return false;
			}
			if (addr2.secondLine==null || !addr2.secondLine.equals(this.secondLine)) {
				return false;
			}
			if (addr2.city==null || !addr2.city.equals(this.city)) {
				return false;
			}
			if (addr2.State==null || !addr2.State.equals(this.State)) {
				return false;
			}
			if (addr2.zipCode!=this.zipCode) {
				return false;
			}
			return true;
			
		}
		return false;

	}
}
