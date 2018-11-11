import java.util.ArrayList;

public class ShellSort {

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
		int i = 1, j;
		while(9*i < data.size()){
			i = 3*i+1;
		}
		while(i>0){
			for(int k = i;k<data.size();k++){
				double l = data.get(k);
				j = k;
				while(j>=i && data.get(j-i) > l){
					data.set(j, data.get(j-i));
					j -= i;
				}
				data.set(j, l);
			}
			i/=3;
		}
		System.out.println("Step ke-"+i+ " SWAP -> " + data.toString());
		return data;
	}

}

