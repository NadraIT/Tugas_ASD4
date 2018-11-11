import java.util.ArrayList;
import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		ArrayList<Double> nilai = new ArrayList<Double>();
		nilai.add(18.42);
		nilai.add(16.17);
		nilai.add(22.12);
		nilai.add(10.3);
		nilai.add(52.41);
		nilai.add(63.31);
		nilai.add(18.17);
		nilai.add(12.32);
		nilai.add(10.28);
		nilai.add(12.4);
		nilai.add(21.45);
		nilai.add(32.24);
		nilai.add(12.4);
		nilai.add(5.53);
		nilai.add(26.12);

		System.out.println("Data : " + nilai.toString());		
					
		Scanner s = new Scanner(System.in);
		System.out.print("Masukkan kunci pencarian: ");
		double key	= s.nextDouble();
					
		int posisi = -1;
					
		for(int i=0;i<nilai.size();i++){
			if(key==nilai.get(i)){
				posisi = i;
				break;
			}
		}
		if(posisi!=-1){
		System.out.println("KEY: "+key+" Berada di index array list: "+posisi);
		}else{
		System.out.println("KEY TIDAK DITEMUKAN");
			}

		}

	}

