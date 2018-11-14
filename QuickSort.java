import java.util.ArrayList;
public class QuickSort {

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
		
		System.out.println("Nilai Awal : " + nilai.toString());
		
		ArrayList<Double> Keluaran = sort(nilai, 0, nilai.size()-1);
		
		System.out.println("Hasil Sorting : " + Keluaran.toString());
		
	}

	private static ArrayList<Double> sort(ArrayList<Double> Data, int low, int high) {
		if (Data == null || Data.size() == 0) {
			return Data;
		}

		if (low >= high) {
		return Data; 
	}
		int mid = low + (high - low) / 2;
		double pivot = Data.get(mid);
		
		int i = low, j = high;
		
		while (i <= j) {
			while (Data.get(i) < pivot) {
				i++;
			}
			while (Data.get(j) > pivot) {
				j--;
			}
			if (i <= j);
			swap(Data, i, j);
			i++;
			j--;
		}

	if (low < j) {
		sort (Data, low, j);
	}
		if (high > i)
			sort(Data, i, high);
		
	System.out.println("Step ->"+ Data.toString());
	return Data;
	}
	
	private static void swap(ArrayList<Double> data, int x, int y) {
		double temp = data.get(x);
		data.set(x, data.get(y));
		data.set(y, temp);
	}
	
}