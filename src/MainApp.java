import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		int pilihanMenu;
		
		Scanner scan = new Scanner(System.in);
		DataCivitasAkademik civitasAkademik = new DataCivitasAkademik();
		
		do {
			civitasAkademik.mainMenu();
			
			System.out.print("Pilih menu (1-5) : ");
			pilihanMenu = scan.nextInt();
			
			switch(pilihanMenu) {
			case 1:
				System.out.println("Menu :: Tambah Data Mahasiswa");
				civitasAkademik.tambahDataMahasiswa();
				break;
			case 2:
				System.out.println("Menu :: Lihat Data Mahasiswa");
				civitasAkademik.tampilDataMahasiswa();
				break;
			case 3:
				System.out.println("Menu :: Tambah Data Dosen");
				civitasAkademik.tambahDataDosen();
				break;
			case 4:
				System.out.println("Menu :: Lihat Data Dosen");
				civitasAkademik.tampilDataDosen();
				break;
			case 5:
				System.out.println("Terima kasih!");
				System.exit(0);
				break;
			default:
				System.err.println("Coba pilihan lain!");
				break;
			}
			
		}while(pilihanMenu < 5);
		
	}
}
