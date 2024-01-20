package BehavioralPattern_interpreter;

import java.util.*;

public class Context {
	Map<String,Integer> contextMap = new HashMap<>();
	public void put(String key,int val) {
	contextMap.put(key ,val);
	}
	
	public int get(String key) {
		return contextMap.get(key);
	}
}
