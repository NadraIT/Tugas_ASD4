import java.util.ArrayList;

public class BubbleSort {

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
		
		System.out.println("Nilai awal : " + nilai.toString());
		
		ArrayList<Double> output = sort(nilai);
		
		System.out.println("Hasil Sorting : " + output.toString());
		}

		private static ArrayList<Double> sort(ArrayList<Double> data) {
		int swapped = 1;
		for(int i=data.size()-1;i>=0 && data.size()-1 >= swapped; i--){
			swapped = 0;
			for(int j=0;j<=i-1;j++){
				if(data.get(j)>data.get(j+1)){
					double temp = data.get(j);
					data.set(j, data.get(j+1));
					data.set((j+1), temp);
					swapped = 1;
				}
			}
			
			System.out.println("Step ke-"+i+ data.toString());
		}
			return data;
		}
	}


