package com.capgemini.bank;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;

public class MyIntegerHashMap 
{
	HashMap<MyInteger,String> hashMap=new HashMap<>();
	
	public void createMap()
	{
		hashMap.put(new MyInteger(1),"Swagata");
		hashMap.put(new MyInteger(2),"Ashwini");
		hashMap.put(new MyInteger(3),"Tanusree");
		hashMap.put(new MyInteger(4),"Pritam");
		hashMap.put(new MyInteger(5),"Tonmoy");
	}
	
	public String retrieval(MyInteger g)
	{
		return hashMap.get(g.getMyInt());
	}
	
	public void iterate()
	{
		for (HashMap.Entry<MyInteger, String> entry : hashMap.entrySet()) {
		    MyInteger key = entry.getKey();
		    String value = entry.getValue();
		    System.out.print("  Key:"+key);
		    System.out.print("  Value:"+value);
		    
		}
	}
	
	public void  sortByValue() 
    { 
        
        LinkedList<Entry<MyInteger, String>> list = 
               new LinkedList<Map.Entry<MyInteger, String> >(hashMap.entrySet()); 
  
       
        Collections.sort(list, new Comparator<Map.Entry<MyInteger, String> >() { 
            public int compare(Map.Entry<MyInteger, String> o1,  
                               Map.Entry<MyInteger, String> o2) 
            { 
                return (o1.getValue()).compareTo(o2.getValue()); 
            } 
        }); 
          
       
        HashMap<MyInteger, String> temp = new LinkedHashMap<MyInteger, String>(); 
        for (Map.Entry<MyInteger, String> aa : list) { 
            temp.put(aa.getKey(), aa.getValue()); 
        } 
        System.out.println(temp.entrySet());
        
    } 
	
	
	public void  sortByKey() 
    { 
        
        LinkedList<Entry<MyInteger, String>> list = 
               new LinkedList<Map.Entry<MyInteger, String> >(hashMap.entrySet()); 
  
       
        Collections.sort(list, new Comparator<Map.Entry<MyInteger, String> >() { 
            public int compare(Map.Entry<MyInteger, String> o1,  
                               Map.Entry<MyInteger, String> o2) 
            { 
                return (o2.getKey()).compareTo(o1.getKey()); 
            } 
        }); 
          
       
        HashMap<MyInteger, String> temp = new LinkedHashMap<MyInteger, String>(); 
        for (Map.Entry<MyInteger, String> aa : list) { 
            temp.put(aa.getKey(), aa.getValue()); 
        } 
        System.out.println(temp.entrySet());
        
        
    } 
	
	
	public void removeObjects()
	{
		hashMap.clear();
	}
	public int computeSize()
	{
		return hashMap.size();
	}
	public void getKeys()
	{
		System.out.println(hashMap.keySet().toString());
	}
	
	public void getValues()
	{
		System.out.println(hashMap.values());
	}
	public static void main(String[] args) 
	{
		MyIntegerHashMap hmp=new MyIntegerHashMap();
		
		hmp.createMap();
		
		System.out.println("Size:"+hmp.computeSize());
	    System.out.println("Get all keys");
		hmp.getKeys();
		System.out.println("Get all values");
		hmp.getValues();
		hmp.removeObjects();
		hmp.getValues();
		System.out.println("Size after removal:"+hmp.computeSize());
		hmp.createMap();
		hmp.iterate();
		System.out.println();
		System.out.println("HashMap after sorting entries by values "); 
		hmp.sortByValue();
		hmp.sortByKey();
		
	}

}
