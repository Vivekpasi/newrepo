package com.limetray.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONObject;

public class validation_mobile_email extends send_email_api_output{

	
	@SuppressWarnings("unchecked")
	public static void combination_validation_mobilenumber_email_blank() throws IOException
	{
		
		try 
		{
			
			name = new Object(){}.getClass().getEnclosingMethod().getName();
			
		 String public_key = "crm";
	        String private_key = "6OXsajdlsFnFZjeyRb9k";
	        URL url = new URL("http://test.crm.limetray.in/crm/public/user/create");
	        URL url1 = new URL("http://test.crm.limetray.in/crm/public/user/fetch/540090");
	        
	        HttpURLConnection myURLConnection = (HttpURLConnection)url.openConnection();
	        myURLConnection.setDoOutput(true);
	        myURLConnection.setRequestMethod("POST");
	        myURLConnection.setRequestProperty("Content-Type", "application/json");        
	        myURLConnection.setRequestProperty("Header", "");
	        JSONObject add = new JSONObject();
	        
	       /* Mobile Digit validation check */
	        add.put("first_name","fgfd");
	        add.put("user_number", "7851");
	        add.put("cloud_site_id", "230");
	        add.put("user_source", "7");
	        add.put("user_email", "");
	        
	            
	        OutputStreamWriter writer = new OutputStreamWriter(myURLConnection.getOutputStream());
	        writer.write(add.toString());
	        writer.flush();  
	        
	        InputStream getContent = null;
	        if(myURLConnection.getResponseCode() == 200){
	            getContent = myURLConnection.getInputStream();
	        }else{
	            getContent = myURLConnection.getErrorStream();
	        }
	
         
         BufferedReader br = new BufferedReader(new InputStreamReader(getContent));
         
         StringBuilder sb = new StringBuilder();
     
         int charNumber;
         while((charNumber = br.read()) != -1){
             sb.append((char) charNumber);
         }
          // JSONArray lang= (JSONArray) JSONObject.get();
              String jsonText = sb.toString();
   //      System.out.println(jsonText);
          ObjectMapper mapper = new ObjectMapper();
              JsonNode rootNode = mapper.readTree(jsonText);
              
              Iterator<JsonNode> it = rootNode.path("message").path("user_number").getElements();
              
              while(it.hasNext()){
              	String blank_mobile_number_message_combination_email = it.next().asText();
              	System.out.println("\n");
              	System.out.println("Test Case 5 : Combination validation check on API (Mobile no. & Email)"+"\n");
              	sb_email_text.append("Test Case 5 : Combination validation check on API (Mobile no. & Email)");
              	sb_email_text.append(System.lineSeparator());
              	sb_email_text.append("=================================================================================================").append(System.lineSeparator());
                
              	sb_email_text.append(System.lineSeparator());
              	
 
              	System.out.println("5.1" + "\n");
              	sb_email_text.append("5.1");
              	sb_email_text.append(System.lineSeparator());

                System.out.println("****************  Validation check  on wrong mobile number input & blank email id  ****************"+"\n");
                sb_email_text.append("****************  Validation check  on wrong mobile number input & blank email id  ****************").append(System.lineSeparator());
                sb_email_text.append(System.lineSeparator());

                System.out.println("Mobile number hit by script : 789");
                sb_email_text.append("Mobile number hit by script : 789");
                sb_email_text.append(System.lineSeparator());

                System.out.println("Email id hit by script : \"\"");
                sb_email_text.append("Email id hit by Script : \"\"");
                sb_email_text.append(System.lineSeparator());

                System.out.println("Response from API :" +" "+blank_mobile_number_message_combination_email);
                sb_email_text.append("Response from API :" +" "+blank_mobile_number_message_combination_email);
                sb_email_text.append(System.lineSeparator());
                sb_email_text.append(System.lineSeparator());
               
                System.out.println("==============================================================================");
                              
                //  System.out.println(a);
              }
                 
        // System.out.println(jsonText);
         
     }catch(Exception ex){System.out.println(ex);
 	  System.out.println("come in exception");
	  
 	  send_email_api_output.exception_method(ex);
       }
	}
		@SuppressWarnings("unchecked")
		public static void combination_validation_wrongmobile_email() throws IOException
		{
		
			try 
			{
				
				name = new Object(){}.getClass().getEnclosingMethod().getName();
				
			 String public_key = "crm";
		        String private_key = "6OXsajdlsFnFZjeyRb9k";
		        URL url = new URL("http://test.crm.limetray.in/crm/public/user/create");
		        URL url1 = new URL("http://test.crm.limetray.in/crm/public/user/fetch/540090");
		        
		        HttpURLConnection myURLConnection = (HttpURLConnection)url.openConnection();
		        myURLConnection.setDoOutput(true);
		        myURLConnection.setRequestMethod("POST");
		        myURLConnection.setRequestProperty("Content-Type", "application/json");        
		        myURLConnection.setRequestProperty("Header", "");
		        JSONObject add = new JSONObject();
		        
		       /* Mobile Digit validation check */
		        add.put("first_name","fgfd");
		        add.put("user_number", "7851");
		        add.put("cloud_site_id", "230");
		        add.put("user_source", "7");
		        add.put("user_email", "dgdfg");
		        
		            
		        OutputStreamWriter writer = new OutputStreamWriter(myURLConnection.getOutputStream());
		        writer.write(add.toString());
		        writer.flush();  
		        
		        InputStream getContent = null;
		        if(myURLConnection.getResponseCode() == 200){
		            getContent = myURLConnection.getInputStream();
		        }else{
		            getContent = myURLConnection.getErrorStream();
		        }
			
	         
	         BufferedReader br = new BufferedReader(new InputStreamReader(getContent));
	         
	         StringBuilder sb = new StringBuilder();
	     
	         int charNumber;
	         while((charNumber = br.read()) != -1){
	             sb.append((char) charNumber);
	         }
	          // JSONArray lang= (JSONArray) JSONObject.get();
	              String jsonText = sb.toString();
	   //      System.out.println(jsonText);
	          ObjectMapper mapper = new ObjectMapper();
	              JsonNode rootNode = mapper.readTree(jsonText);
	              
	              Iterator<JsonNode> it = rootNode.path("message").path("user_number").getElements();
	              Iterator<JsonNode> it1 = rootNode.path("message").path("user_email").getElements();
		              
	              while(it.hasNext()){
	              	String blank_mobile_number_message_combination_email = it.next().asText();
	              	System.out.println("\n");
	              //	System.out.println("Test Case 4 : Combination validation check on API"+"\n");
	                            	System.out.println("5.2" + "\n");
	                            	sb_email_text.append("5.2");
	                            	sb_email_text.append(System.lineSeparator());

	                System.out.println("**************** Validation check invalid mobile number & email  ****************"+"\n");
	                sb_email_text.append("**************** Validation check invalid mobile number & email  ****************").append(System.lineSeparator());
	                sb_email_text.append(System.lineSeparator());

	                System.out.println("Mobile number hit by script : 789");
	                sb_email_text.append("Mobile number hit by script : 789");
	                sb_email_text.append(System.lineSeparator());

	                System.out.println("Response from API :" +" "+blank_mobile_number_message_combination_email);
	                sb_email_text.append("Response from API :" +" "+blank_mobile_number_message_combination_email);
	                sb_email_text.append(System.lineSeparator());

	                //    System.out.println("==============================================================================");
	                              
	                //  System.out.println(a);
	              }
	                 
	              while(it1.hasNext()){
		              	String invalidemail_combination_email = it1.next().asText();
		                System.out.println("Email id hit by script : dgdfg");
		               
		                sb_email_text.append("Email id hit by script : dgdfg");
		                sb_email_text.append(System.lineSeparator());

		                 System.out.println("Response from API :" +" "+invalidemail_combination_email);
		                 sb_email_text.append("Response from API :" +" "+invalidemail_combination_email);
		                 sb_email_text.append(System.lineSeparator());
		                 sb_email_text.append(System.lineSeparator());
		                              
		                //  System.out.println(a);
		              }
	        // System.out.println(jsonText);
	         
	     }catch(Exception ex){System.out.println(ex);
	  	  System.out.println("come in exception");
		  
	  	  send_email_api_output.exception_method(ex);
	        
	     }	

		
	}


		@SuppressWarnings("unchecked")
		public static void combination_validation_blank_mobilenumber_email() throws IOException
		{
			
			try 
			{
				
				name = new Object(){}.getClass().getEnclosingMethod().getName();
				
			 String public_key = "crm";
		        String private_key = "6OXsajdlsFnFZjeyRb9k";
		        URL url = new URL("http://test.crm.limetray.in/crm/public/user/create");
		        URL url1 = new URL("http://test.crm.limetray.in/crm/public/user/fetch/540090");
		        
		        HttpURLConnection myURLConnection = (HttpURLConnection)url.openConnection();
		        myURLConnection.setDoOutput(true);
		        myURLConnection.setRequestMethod("POST");
		        myURLConnection.setRequestProperty("Content-Type", "application/json");        
		        myURLConnection.setRequestProperty("Header", "");
		        JSONObject add = new JSONObject();
		        
		       /* Mobile Digit validation check */
		        add.put("first_name","fgfd");
		        add.put("user_number", "");
		        add.put("cloud_site_id", "230");
		        add.put("user_source", "7");
		        add.put("user_email", "dgdfg@gmail.com");
		        
		            
		        OutputStreamWriter writer = new OutputStreamWriter(myURLConnection.getOutputStream());
		        writer.write(add.toString());
		        writer.flush();  
		        
		        InputStream getContent = null;
		        if(myURLConnection.getResponseCode() == 200){
		            getContent = myURLConnection.getInputStream();
		        }else{
		            getContent = myURLConnection.getErrorStream();
		        }
			
	         
	         BufferedReader br = new BufferedReader(new InputStreamReader(getContent));
	         
	         StringBuilder sb = new StringBuilder();
	     
	         int charNumber;
	         while((charNumber = br.read()) != -1){
	             sb.append((char) charNumber);
	         }
	          // JSONArray lang= (JSONArray) JSONObject.get();
	              String jsonText = sb.toString();
	   //      System.out.println(jsonText);
	          ObjectMapper mapper = new ObjectMapper();
	              JsonNode rootNode = mapper.readTree(jsonText);
	              
	              Iterator<JsonNode> it = rootNode.path("message").path("user_number").getElements();
	              Iterator<JsonNode> it1 = rootNode.path("message").path("user_email").getElements();
		              
	              while(it.hasNext()){
	              	String blank_mobile_number = it.next().asText();
	              	System.out.println("\n");
	              //	System.out.println("Test Case 4 : Combination validation check on API"+"\n");
	                            	System.out.println("5.3" + "\n");
	                            	sb_email_text.append("5.3");
	                            	sb_email_text.append(System.lineSeparator());

	                System.out.println("**************** Validation check blank mobile number & input email  ****************"+"\n");
	                sb_email_text.append("**************** Validation check blank mobile number & input email  ****************").append(System.lineSeparator());
	                sb_email_text.append(System.lineSeparator());

	                System.out.println("Mobile number hit by script : \"\"");
	                sb_email_text.append("Mobile number hit by script : \"\"");
	                sb_email_text.append(System.lineSeparator());

	                System.out.println("Email id hit by script : dgdfg@gmail.com");
	                sb_email_text.append("Email id hit by script : dgdfg@gmail.com");
	                sb_email_text.append(System.lineSeparator());

	 	            System.out.println("Response from API :" +" "+blank_mobile_number);
	 	           sb_email_text.append("Response from API :" +" "+blank_mobile_number);
	 	          sb_email_text.append(System.lineSeparator());
                  sb_email_text.append(System.lineSeparator());
                   sb_email_text.append("=================================================================================================").append(System.lineSeparator());
                 
	                     System.out.println("==============================================================================");
	                              
	                //  System.out.println(a);
	              }
	                 
	             
	         
	     }catch(Exception ex){System.out.println(ex);
	  	  System.out.println("come in exception");
		  
	  	  send_email_api_output.exception_method(ex);
	        }	

		
	}
		
		
}
