package org.fbz.gemini.common;

import java.util.UUID;

public class UUIDUtils {
	
	public static String getId36(){
		return UUID.randomUUID().toString();
	}
	
	public static String getId32(){
		return UUID.randomUUID().toString().replaceAll("-", "");
	}
}
