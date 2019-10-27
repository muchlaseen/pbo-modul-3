
public class CivitasAkademik {
	
	private String nama;
	private String jenisKelamin;
	private String tempatLahir;
	private String tanggalLahir;
	private String alamat;
	
	public CivitasAkademik(String name, String gender, String location, String doB, String address) {
		this.nama = name;
		this.jenisKelamin = gender;
		this.tempatLahir = location;
		this.tanggalLahir = doB;
		this.alamat = address;
	
	}
	
	public String getNama() {
		return nama;
	}
	
	public String getJenisKelamin() {
		return jenisKelamin;
	}
	
	public String getTempatLahir() {
		return tempatLahir;
	}
	
	public String getTanggalLahir() {
		return tanggalLahir;
	}
	
	public String getAlamat() {
		return alamat;
	}
	
}
