package chap2;

import java.util.Arrays;

/**
 * p12 降序insert order
 * @author xiuzhu
 *
 */
public class prac211_InsertSortDesc {

	public static void insertSortDesc(int[] source){
		for(int i = 1; i < source.length; i ++){
			int j = i - 1;
			int key = source[i];
			while( j >= 0 && source[j] < key){
				source[j + 1] = source[j];
				j--;
			}
			source[j + 1] = key;
		}
		System.out.println(Arrays.toString(source));
	}
	
	public static void main(String[] args) {
		int a[] = {6,1,2,3,4,4,5};
		prac211_InsertSortDesc.insertSortDesc(a);
		
		int b[] = {};
		prac211_InsertSortDesc.insertSortDesc(b);
		
		int c[] = {1};
		prac211_InsertSortDesc.insertSortDesc(c);
	}

}
