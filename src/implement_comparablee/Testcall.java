package implement_comparablee;

import implement_comparablee.Car;

import java.util.Arrays;
public class Testcall {

	
	public static void main(String[] args) {
		Car[] CarArrays = new Car[] {
				new Car("Camero","ö��",530000),
				new Car("Tritan","��к�",800000)};
				Arrays.sort(CarArrays);
				System.out.println(Arrays.toString(CarArrays));
}
}