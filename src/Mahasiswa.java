
public class Mahasiswa extends CivitasAkademik {
	
	private int npm;
	
	public Mahasiswa(String name, int studentId, String gender, String location, String doB, String address) {
		super(name, gender, location, doB, address);
		this.npm = studentId;
	}

	public int getNpm() {
		return npm;
	}
	
	
}
