package com.zoumf77;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

@SuppressWarnings("unused")
public class TreeMapDemo {
	public static void main(String[] args){
		
		/*
		Map<String,String> treeMap = new TreeMap<String,String>(new Comparator<String>(){
			
			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o2.compareTo(o1);
			}});
	    */
		Map<String,String> treeMap = new TreeMap<String,String>((o1, o2) -> o2.compareTo(o1));
		treeMap.put("zoo", "a place where animals live");
		treeMap.put("airport", "a place where planes take off and land");
		treeMap.put("school", "a place where students take classes");
		
		Iterator<String> it=treeMap.keySet().iterator();
		while(it.hasNext()){
			String key=it.next();
			System.out.println("key="+key+";value="+treeMap.get(key));
		}
		
		
	}
	
	
}
