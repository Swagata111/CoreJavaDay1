package com.capgemini.bank;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class HashMapimplementation 
{
	HashMap<Integer,String> hashMap=new HashMap<>();
	
	public void createMap()
	{
		hashMap.put(1,"Swagata");
		hashMap.put(2,"Ashwini");
		hashMap.put(3,"Tanusree");
		hashMap.put(4,"Pritam");
		hashMap.put(5,"Tonmoy");
	}
	
	public String retrieval(int key)
	{
		return hashMap.get(key);
	}
	
	public void iterate()
	{
		for (HashMap.Entry<Integer, String> entry : hashMap.entrySet()) {
		    Integer key = entry.getKey();
		    String value = entry.getValue();
		    System.out.print("  Key:"+key);
		    System.out.print("  Value:"+value);
		    
		}
	}
	
	public void  sortByValue() 
    { 
        
        LinkedList<Entry<Integer, String>> list = 
               new LinkedList<Map.Entry<Integer, String> >(hashMap.entrySet()); 
  
       
        Collections.sort(list, new Comparator<Map.Entry<Integer, String> >() { 
            public int compare(Map.Entry<Integer, String> o1,  
                               Map.Entry<Integer, String> o2) 
            { 
                return (o1.getValue()).compareTo(o2.getValue()); 
            } 
        }); 
          
       
        HashMap<Integer, String> temp = new LinkedHashMap<Integer, String>(); 
        for (Map.Entry<Integer, String> aa : list) { 
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
		System.out.println(hashMap.keySet());
	}
	public void getValues()
	{
		System.out.println(hashMap.values());
	}
	public static void main(String[] args) 
	{
		HashMapimplementation hmp=new HashMapimplementation();
		hmp.createMap();
		System.out.println("Retrieve by key:"+hmp.retrieval(1));
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
	
		
	}

}
