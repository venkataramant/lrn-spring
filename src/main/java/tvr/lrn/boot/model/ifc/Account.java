package tvr.lrn.boot.model.ifc;

public interface Account {
	public default double getBalance() {
		return 0.0;
	}

}
