package com.techlabs.maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
	public static void main(String[] args) {

        Map<Integer,String> map=new LinkedHashMap<Integer,String>();
        
        map.put(2, "ABC");
        map.put(3, "LMN");
        map.put(1, "XYZ");
        
        System.out.println(map);

	}

}
