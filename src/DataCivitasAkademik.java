import java.util.ArrayList;
import java.util.Scanner;

public class DataCivitasAkademik {
	String name, gender, location, doB, address;
	int lectureId, studentId;
	
	Dosen dosen;
	Mahasiswa mahasiswa;
	
	ArrayList<Dosen> dosenArr = new ArrayList<>();
	ArrayList<Mahasiswa> mahasiswaArr = new ArrayList<>();
	
	Scanner input = new Scanner(System.in);
	
	void mainMenu() {
		System.out.println("\tMain Menu");
		System.out.println("------------------------");
		System.out.println("Mahasiswa");
		System.out.println("------------------------");
		System.out.println("1. Tambah Data Mahasiswa");
		System.out.println("2. Lihat Data Mahasiswa");
		System.out.println("------------------------");
		System.out.println("Dosen");
		System.out.println("------------------------");
		System.out.println("3. Tambah Data Dosen");
		System.out.println("4. Lihat Data Dosen");
		System.out.println("------------------------");
		System.out.println("\n5. Exit");
	}
	
	void tambahData() {
		System.out.print("Nama\t\t: "); name = input.next();
		System.out.print("Jenis Kelamin\t: "); gender = input.next();
		System.out.print("Tempat Lahir\t: "); location = input.next();
		System.out.print("Tanggal Lahir\t: "); doB = input.next();
		System.out.print("Alamat\t\t: "); address = input.next();
		
 	}
	
	void tambahDataDosen() {
		System.out.println("\nNIP\t\t: ");
		lectureId = input.nextInt();
		tambahData();
		this.dosen = new Dosen(name, lectureId, gender, location, doB, address);
		dosenArr.add(dosen);
		dosen.addMahasiswa(mahasiswaArr);
	}
	
	void tambahDataMahasiswa() {
		System.out.print("\nNPM\t\t: ");
		studentId = input.nextInt();
		tambahData();
		this.mahasiswa = new Mahasiswa(name, studentId, gender, location, doB, address);
		mahasiswaArr.add(mahasiswa);
	}
	

	
	void tampilDataMahasiswa() {
		System.out.println("\nData Mahasiswa\t: ");
		for (int i = 0; i < mahasiswaArr.size(); i++) {
			System.out.println("\nNama\t\t\t: " + mahasiswaArr.get(i).getNama() 
					+ "\nNPM\t\t\t: " + mahasiswaArr.get(i).getNpm() 
					+ "\nJenis Kelamin\t\t: " + mahasiswaArr.get(i).getJenisKelamin()
					+ "\nTempat, tanggal lahir\t: " + mahasiswaArr.get(i).getTempatLahir() + ", " + mahasiswaArr.get(i).getTanggalLahir()
					+ "\nAlamat\t\t\t: " + mahasiswaArr.get(i).getAlamat());
		}
	}
	
	void tampilDataDosen() {
		System.out.println("\nData Mahasiswa\t: ");
		for (int i = 0; i < dosenArr.size(); i++) {
			System.out.println("\nNama\t\t\t: " + dosenArr.get(i).getNama() 
					+ "\nNPM\t\t\t: " + dosenArr.get(i).getNip()
					+ "\nJenis Kelamin\t: " + dosenArr.get(i).getJenisKelamin()
					+ "\nTempat, tanggal lahir\t: " + dosenArr.get(i).getTempatLahir() + ", " + dosenArr.get(i).getTanggalLahir()
					+ "\nAlamat\t\t\t: " + dosenArr.get(i).getAlamat());
		}
	}
	
	void tampilDataBimbingan() {
		System.out.println();
	}
}
