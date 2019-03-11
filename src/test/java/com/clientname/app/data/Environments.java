package com.clientname.app.data;

/**
 ****************************************************************************
 *HIGHLIGHTS:
 * > Class Example 
 * > Class to be used as repository of URL. This is project specific.
 * > Based on project put the name of the env as a case option and then the url
 * > See below only as an example. Then update with the project info
 * > Use enum to represent the fixed value for environments in the project.
 ****************************************************************************
 */

public enum Environments {
	GOOGLE("GOOGLE",
			 "http://www.google.com"),
	ACCENTURE_MX("ACCENTURE_MX",
			"https://www.accenture.com/mx-es"),
	BBVA_MX("BBVA_MX",
			"https://www.bancomer.com/index.jsp");
  
	private String key;
    private String appUrl;

    Environments (String key, String url){

           this.key = key;
           this.appUrl = url;

    }    

    public String getAppUrl() {
        return appUrl;
    }

	 public void setAppUrl(String appUrl) {
	        this.appUrl = appUrl;
	 }
	
	 public String getKey() {
	        return key;
	 }
	
	 public void setKey(String key) {
	        this.key = key;
	 }
	
	 public static String getKey(String key) {
	     for (Environments value : values()) {
	            if (value.getKey().equals(key)) {
	                  return value.getKey();
	            }
	     }
	     throw new IllegalArgumentException("Incorrect Key value: " + key);
	}
	
	public static String getAppUrl(String key) {
	     for (Environments value : values()) {
	            if (value.getKey().equals(key)) {
	                  return value.getAppUrl();
	            }
	     }
	     throw new IllegalArgumentException("Incorrect URL value: " + key);
	}
        
}
