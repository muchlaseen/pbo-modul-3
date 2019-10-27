
public class Dosen extends CivitasAkademik {
	
	private int nip;
	
	public Dosen(String name, int lectureId, String gender, String location, String doB, String address) {
		super(name, gender, location, doB, address);
		this.nip = lectureId;
		
	}
	
	public int getNip() {
		return nip;
	}
	

}