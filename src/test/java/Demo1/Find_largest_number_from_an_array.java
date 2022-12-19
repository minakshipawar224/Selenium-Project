package Demo1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Find_largest_number_from_an_array {
	public static void main(String[] args) {
		int[] arr={13,26,0,34,0,5,8,53,67,0};

		//List<Integer> list=new ArrayList<>();
ArrayList list=new ArrayList();
		for(int i=0;i<arr.length;i++)
		{
		    list.add(arr[i]);
		}	
		System.out.println(Collections.max(list));
			}
		}	
	