import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

int[]arr= {3,2,4} ;
System.out.println("before sort it: " + Arrays.toString(arr)); 

    int temp = arr[0];
    arr[0] = arr[1];
    arr[1] = temp;
    
    System.out.println("before sort it: " + Arrays.toString(arr)); 

/*
int [] array = {45,12,85,32,89,39,69,44,42,1,6,8};
Arrays.sort(array);
for (int i = 0; i < array.length; i++) {
System.out.println(array[i]);
};



You have to initialize the value for j as i+1, this sorting algorithm is called bubble sort, that works by repeatedly swapping the adjacent elements if they are in wrong order. The below method is always runs O(n^2) time even if the array is sorted.

public static void main (String[] args)
{
int[] array = {4,2,1,3,5,9,6,8,7};

for(int i = 0 ; i < array.length;i++)
{
for(int j = i+1 ; j< array.length;j++)
{
    if(array[i] > array[j])
    {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
}

}
}
// what is the difference between arraylist and linked list ? 
// 1) ArrayList uses a dynamic to store the elements. ex: if you want add element in between 3,4 will be slow ==> 2,3,4 and is updating the cpacity by it self in search element will be faster 
// 2) LinkedList uses a doubly to store the elements. oject has 2 node next and prives if i want to add new element in between will add object with no removing any element faster in search element will be slower 



// public class Main{
//     public static void main (String [] args){
        
//         //int array[]= {1,2,2,3};
        
//         int array[]= new int [5];

//         array[0] = 0;
//         array[1] = 2;


//         for(int i=0; i<array.length; i++)
//         System.out.print(array[i]);
//     }
// }
// ======================================================================
// public class Main{
//     public static void main (String [] args){
        
//         int array[]= {33,2,1};
//         int min=array[];

//         for(int i=0; i<array.length; i++)
//         if (min > array[i])
//             min = array[i];
//             System.out.println(min);
//     }
// }
// =======================================================================
// public class Main{
//     public static void main (String [] args){
        
//         int n1=1;
//         int n2=0;
        
//          for(int i=0;i<=10;++i)   
//          {    
//           int n3 = n1+n2;
//           n1=n2;    
//           n2=n3; 
//           System.out.println(n3);    
//         }    
//     }
// }
// ======================================================================
// import java.util.*; 

// class Main 
// { 
// 	public static void main(String[] args) 
// 	{ 

// 		ArrayList<Integer> arrli = new ArrayList<Integer>(); 

// 		for (int i=1; i<=5; i++) 
// 			arrli.add(i); 

// 		System.out.println(arrli); 

// 		arrli.remove(3); 

// 		System.out.println(arrli); 

// 		for (int i=0; i<arrli.size(); i++) 
// 			System.out.print(arrli.get(i)+" "); 
// 	} 
// } 

// ====================================================================
// import java.util.*;

// public class Main {

//     public static void main(String[] args) {
//         List<String> name = new ArrayList<>();
        
//         name.add("Bassam");
//         name.add("Bassam");
//         name.add("Banawi");
//         System.out.println(name);
        
//         name.remove(1);
//         name.add(1, "Adel");
//         System.out.println(name);
        
//         for(int i=0; i < name.size(); i++)  
//             System.out.print(name.get(i)+" ");
//     }
// }
// ====================================================================
// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         List<Integer> numbers = new ArrayList<>();
//         numbers.add(13);
//         numbers.add(7);
//         numbers.add(18);
//         numbers.add(5);
//         numbers.add(2);

//         System.out.println("Before : " + numbers);

//         // Sorting an ArrayList using Collections.sort() method
//         Collections.sort(numbers);

//         System.out.println("After : " + numbers);
//     }
// }
// ========================================================================
// import java.util.*;
// public class Main {
//     public static void main(String[] args) {
//         List<String> name = new ArrayList<>();
//         name.add("Bassam");
//         name.add("Adel");
//         name.add("Banawi");
     

//         System.out.println("Before : " + name);

//         Collections.sort(name);

//         System.out.println("After : " + name);
//     }
// }
// ===============================================================
// import java.util.*;
// public class Main { 
	
// public static void main(String args[]) { 
		
// 	Map <Integer,String> name = new HashMap<>();
	
// 	name.put(1,"Banawi");
// 	name.put(2,"besoo");

//     System.out.println(name);
//     System.out.println(name.get(1));
//     System.out.println(name.keySet());
//     System.out.println(name.values());
// } 
// } 
// ============================================================================
// import java.util.*;
// public class Main { 
	
// public static void main(String args[]) { 
// 	//Hashtable {98=besoo, 78=Banawi, 12=besoo, 44=Babb} 98 besoo 12 Banawi 44 besoo 78 Babb 
// 	//HashMap {98=besoo, 12=Banawi, 44=besoo, 78=Babb} 98 besoo 12 Banawi 44 besoo 78 Babb 
// 	//TreeMap order 
// 	//LinkedHashMap {12=Banawi, 44=besoo, 98=besoo, 78=Babb} 12 Banawi 44 besoo 98 besoo 78 Babb  
	
// 	Map <Integer,String> name = new TreeMap<>();
	
// 	name.put(12,"Banawi");
// 	name.put(44,"besoo");
// 	name.put(98,"besoo");
// 	name.put(78,"Babb");

//     System.out.println(name);
//     for(Map.Entry i:name.entrySet()){  
//     System.out.println(i.getKey()+" "+i.getValue());  
// } 
// }}

// ===============================================================================
// import java.util.*;
// public class Main { 
	
// public static void main(String args[]) { 
    
//     //HashSet: 98 12 44 78
//     //TreeSet: 12 44 78 98
//     //LinkedHashSet: 12 44 98 78
// 	Set <Integer> name = new Set<>();
	
// 	name.add(12);
// 	name.add(44);
// 	name.add(98);
// 	name.add(78);

//     System.out.println(name);
//     for(int i : name){  
//     System.out.print(" " + i);  
// } 
// }}
// ==================================================
// import java.util.*;
// public class Main { 
	
// public static void main(String args[]) { 
    
//     //HashSet: 98 12 44 78
//     //TreeSet: 12 44 78 98
//     //LinkedHashSet: 12 44 98 78
// 	Set <Integer> name = new HashSet<>();
	
// 	name.add(12);
// 	name.add(44);
// 	name.add(98);
// 	name.add(78);

//     System.out.println(name);
//     for(int i : name){  
//     System.out.print(" " + i);  
// } 
// }}
// =========================================================
// import java.util.*;
// public class Main { 
	
// public static void main(String args[]) { 
    
// 	Stack <Integer> name = new Stack<>();
	
// 	name.push(1);
// 	name.push(2);
// 	name.push(3); // frist out
	
// 	System.out.println(name.set(1,3));
// 	System.out.println(name);
// 	System.out.println(name.pop());
// 	System.out.println(name);

// }}
// ==========================================================================
// import java.util.*;
// public class Main { 
	
// public static void main(String args[]) { 
    
// 	Queue <Integer> name = new LinkedList<>();
	
// 	name.add(1); // frist
// 	name.add(2);
// 	name.add(3);
	
// 	System.out.println(name);
// 	name.poll();
// 	System.out.println(name);

// }}

public class Testarray {
    public static void main (String [] args) {
       List<Integer> value = Arrays.asList(1,2,3,4,5,6);

    //    value.forEach(i -> System.out.println(i));
    //    value.forEach(System.out::println);
       value.forEach(i -> de(i));
    }
           public static void de (int i) {
               System.out.println(i*2);
           }
 }
// public class Testarray {
//     public static void main (String [] args) {
//         int i = 0;
//         try {
//             if (i == 0){
//                 throw new Exception("You Can Not do that!");
//             }
//         }catch (Exception e){
//             System.out.println(e);
//         }
//     }
// }
// public class Testarray {
//     public static void main (String [] args){
//         int i = 6 , j = 0 , k;
//         try {
//             k = i/j;
//         }

//         catch (Exception e) {
//             System.out.println(" You can not do that !! ");
//         }

//         finally {
//             System.out.println();
//             System.out.println(" Thnaks, Have a good day! ");
//         }
//     }
// }
