import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		int pilihanMenu;
		
		Scanner scan = new Scanner(System.in);
		DataCivitasAkademik data = new DataCivitasAkademik();
		
		do {
			System.out.println("Main Menu");
			System.out.println("---------");
			System.out.println("Mahasiswa");
			System.out.println("1. Tambah Data Mahasiswa");
			System.out.println("2. Lihat Data Mahasiswa");
			System.out.println("3. Exit");
			
			System.out.print("Pilih menu (1-3 : ");
			pilihanMenu = scan.nextInt();
			
			switch(pilihanMenu) {
			case 1:
				System.out.println("Menu :: Tambah Data Mahasiswa");
				data.tambahDataMahasiswa();
				break;
			case 2:
				System.out.println("Menu :: Lihat Data Mahasiswa");
				data.tampilDataMahasiswa();
				break;
			case 3:
				System.out.println("Terima kasih!");
				break;
			default:
				System.err.println("Coba pilihan lain!");
				break;
			}
			
		}while(pilihanMenu < 4);
		
	}
}
