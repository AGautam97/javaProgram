package testOnline;

public class Program4 {
	public static void main(String[] args) {
		int [] input = {1,2,8,9,12,46,76,82,15,20,30};
		int [] multiples = {1,2,3,4,5,6,7,8,9};
		int noOfTimes = 0;
		for(int i=0;i<multiples.length;i++) {
			noOfTimes = 0;
			for(int j=0;j<input.length;j++) {
				if(input[j]%multiples[i]==0) {
					noOfTimes++;
				}
			}
			System.out.println( multiples[i] +":" +noOfTimes);

		}
	}
}
