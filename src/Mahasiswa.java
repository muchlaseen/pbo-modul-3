import java.util.ArrayList;

public class Mahasiswa extends CivitasAkademik {
	
	private int npm;
	private ArrayList<Dosen> dosenAr = new ArrayList<>();
	
	public Mahasiswa(String name, int studentId, String gender, String location, String doB, String address) {
		super(name, gender, location, doB, address);
		this.npm = studentId;
	}

	public int getNpm() {
		return npm;
	}
	
	public void addDosen(ArrayList<Dosen> dosenAr) {
		this.dosenAr.addAll(dosenAr);
	}
	
	public ArrayList<Dosen> getDosens() {
		return dosenAr;
	}
}
