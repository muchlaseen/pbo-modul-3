import java.util.ArrayList;

public class Dosen extends CivitasAkademik {
	
	private int nip;
	private ArrayList<Mahasiswa> mahasiswaAr = new ArrayList<>();
	
	public Dosen(String name, int lectureId, String gender, String location, String doB, String address) {
		super(name, gender, location, doB, address);
		this.nip = lectureId;
	}
	
	public int getNip() {
		return nip;
	}	
	
	public void addMahasiswa(ArrayList<Mahasiswa> mahasiswaAr) {
		this.mahasiswaAr.addAll(mahasiswaAr);
	}
	
	public ArrayList<Mahasiswa> getMahasiswa() {
		return mahasiswaAr;
	}
	
	
}