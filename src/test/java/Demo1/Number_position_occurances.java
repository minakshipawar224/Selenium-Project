package Demo1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;

public class Number_position_occurances {
public static void main(String[] args) {

int [] arr={20,50,80,20,30,80,80};

Map<Integer,List<Integer>> map = new HashMap<>();

for(int i=0; i<arr.length;i++){
if(map.containsKey(arr[i])){
	List<Integer> list=map.get(arr[i]);
	list.add(i);
map.put(arr[i],list);
}
else{
	List<Integer> list=new ArrayList<>(); 
	list.add(i);
map.put(arr[i],list);
}
}



Set<Integer> setValues=map.keySet();

{
for(int setValue: setValues)
{
System.out.println(setValue+":"+map.get(setValue));
}

}




}
}

