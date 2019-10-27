import java.util.ArrayList;
import java.util.Scanner;

public class DataCivitasAkademik {
	String name, gender, location, doB, address;
	int lectureId, studentId;
	
	ArrayList<Dosen> dosenArr = new ArrayList<>();
	ArrayList<Mahasiswa> mahasiswaArr = new ArrayList<>();
	
	Scanner input = new Scanner(System.in);
	
	void tambahData() {
		System.out.print("Nama\t\t: "); name = input.next();
		System.out.print("Jenis Kelamin\t: "); gender = input.next();
		System.out.print("Tempat Lahir\t: "); location = input.next();
		System.out.print("Tanggal Lahir\t: "); doB = input.next();
		System.out.print("Alamat\t\t: "); address = input.next();
		
 	}
	
	void tambahDataMahasiswa() {
		System.out.print("\nNPM\t\t: ");
		studentId = input.nextInt();
		tambahData();
		Mahasiswa mahasiswa = new Mahasiswa(name, studentId, gender, location, doB, address);
		mahasiswaArr.add(mahasiswa);
	}
	
	void tambahDataDosen() {
		System.out.println("\nNIP\t\t: ");
		lectureId = input.nextInt();
		tambahData();
		Dosen dosen = new Dosen(name, lectureId, gender, location, doB, address);
		dosenArr.add(dosen);
	}
	
	void tampilDataMahasiswa() {
		System.out.println("\nData Mahasiswa\t: ");
		for (int i = 0; i < mahasiswaArr.size(); i++) {
			System.out.println("\nNama\t\t\t: " + mahasiswaArr.get(i).getNama() 
					+ "\nNPM\t\t\t: " + mahasiswaArr.get(i).getNpm() 
					+ "\nJenis Kelamin\t: " + mahasiswaArr.get(i).getJenisKelamin()
					+ "\nTempat, tanggal lahir\t: " + mahasiswaArr.get(i).getTempatLahir() + ", " + mahasiswaArr.get(i).getTanggalLahir()
					+ "\nAlamat\t\t\t: " + mahasiswaArr.get(i).getAlamat());
		}
	}
}
