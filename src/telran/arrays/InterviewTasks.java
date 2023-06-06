package telran.arrays;

public class InterviewTasks {
static public boolean isSumTwo(short [] array, short sum) {
	//array of positive numbers or 0
	//{1, 2, 30, 2, 2}. sum = 4
	//helper = {false, true, true, false, false}
	boolean[] helper = new boolean[sum > 0 ? sum + 1 : Short.MAX_VALUE + 1];
	boolean res = false;
	int index = 0;
	while(index < array.length && !res) {
		short num = (short) (sum - array[index]);
		if (num >= 0) {
			if(helper[num]) {
				res = true;
			} else {
				helper[array[index]] = true;
			}
		}
		index++;
		
	}
	return res;
	
}
public static void sort(short[] array) {
	//TODO
	//array - array of the positive or 0 number
	//sorting with complexity O[N]
}
public short getMaxWithNegativePresentation(short[] array) {
	//TODO
	//returns maximal positive number having an negative value with the same abs value, if no such numbers returns -1
	//
	return -1;
}

}
