import java.util.ArrayList;

public class InsertionSort {

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
		System.out.print("Nilai awal : " + nilai.toString()+"\n");
		
		ArrayList<Double> output = sort(nilai);
			
		System.out.println("Hasil Sorting : " + output.toString());	
		}

		private static ArrayList<Double> sort(ArrayList<Double> data) {
			for(int i=1;i<=data.size()-1;i++){
				double v = data.get(i);
				int j = i;
				while(j > 0 && data.get(j-1) > v){
					data.set(j, data.get(j-1));
					j--;
				}
				data.set(j, v);
				
				System.out.println("Step ke-"+i+ data.toString());
			}
			return data;

	}

}
