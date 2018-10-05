package com.capgemini.bank;

import java.util.TreeMap;

public class TreeMapImpl 
{
	TreeMap<Integer,String> TreeMap=new TreeMap<>();
	
	public void createMap()
	{
		TreeMap.put(1,"Swagata");
		TreeMap.put(2,"Ashwini");
		TreeMap.put(3,"Tanusree");
		TreeMap.put(4,"Pritam");
		TreeMap.put(5,"Tonmoy");
	}
	
	public String retrieval(int key)
	{
		return TreeMap.get(key);
	}
	
	
	public void removeObjects()
	{
		TreeMap.clear();
	}
	public int computeSize()
	{
		return TreeMap.size();
	}
	public void getKeys()
	{
		System.out.println(TreeMap.keySet());
	}
	public void getValues()
	{
		System.out.println(TreeMap.values());
	}
	public static void main(String[] args) 
	{
		TreeMapImpl hmp=new TreeMapImpl();
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
		
		System.out.println();
		
		
	}

}
