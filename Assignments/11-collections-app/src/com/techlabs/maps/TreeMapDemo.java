package com.techlabs.maps;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {

        Map<Integer,String> map=new TreeMap<Integer,String>();
        
        map.put(2, "ABC");
        map.put(3, "LMN");
        map.put(1, "XYZ");
        
        System.out.println(map);
        
        Set<Entry<Integer,String>> entries=map.entrySet();
        
        for(Map.Entry entry:entries)
        {
        	System.out.println(entry.getKey()+"---->"+entry.getValue());
        }

	}

}
