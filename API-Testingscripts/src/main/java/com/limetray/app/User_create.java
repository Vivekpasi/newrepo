package com.limetray.app;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class User_create extends send_email_api_output {
	

	
	public static void main(String args[])
	{
		
	 user_creation();	
	//user_check();
	
		
	}
	
	
	public static void user_check()
	{
		 String url = "http://test.crm.limetray.in/crm/public/user/fetch/540340";
		
		 try
		 
		 {
		 
			URL obj = new URL(url);
			HttpURLConnection con = (HttpURLConnection) obj.openConnection();

			// optional default is GET
			con.setRequestMethod("GET");

			//add request header
			//con.setRequestProperty("User-Agent", USER_AGENT);

			int responseCode = con.getResponseCode();
			System.out.println("\nSending 'GET' request to URL : " + url);
			System.out.println("Response Code : " + responseCode);

			BufferedReader in = new BufferedReader(
			        new InputStreamReader(con.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();

			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();

			//print result
		//	System.out.println(response.toString());
			
			String jsonText = response.toString();
	
			
			
         //    System.out.println(jsonText);
           //  JSONParser jsonParser = new JSONParser();
             //    JSONObject jsonObject = (JSONObject) jsonParser.parse(jsonText);

           //  String first_naming = ((Object) jsonObject).getJSONObject("result").getString("first_name");
                 
             ObjectMapper mapper = new ObjectMapper();
		     JsonNode rootNode = mapper.readTree(jsonText);
		     
		     JsonNode n  = rootNode.path("result");
		     
		     String mobile_number_fetch = (n.path("mobile").getTextValue());
		     int user_id_fetch = (n.path("user_id").getIntValue());
		//     System.out.println(mobile_number_fetch);
		     System.out.println(user_id_fetch);
		     
	
			
		 }catch(Exception e){}
  
	}
		



	
	@SuppressWarnings("unchecked")
	public static  void user_creation ()

	{
		
		try 
		{
			
			name = new Object(){}.getClass().getEnclosingMethod().getName();
			String public_key = "crm";
		        String private_key = "6OXsajdlsFnFZjeyRb9k";
		        URL url = new URL("http://test.crm.limetray.in/crm/public/user/create");
		        
		        HttpURLConnection myURLConnection = (HttpURLConnection)url.openConnection();
		        myURLConnection.setDoOutput(true);
		        myURLConnection.setRequestMethod("POST");
		        myURLConnection.setRequestProperty("Content-Type", "application/json");        
		        myURLConnection.setRequestProperty("Header", "");
		        JSONObject add = new JSONObject();
		        
		       /* MobileDigit validation check */
		        add.put("first_name","tecxv");
		        
		       String random_number_generation = number_creation.mobile_number_generating();
		   //    System.out.println(random_number_generation);
		        add.put("user_number", random_number_generation);
		        add.put("cloud_site_id", "230");
		        add.put("user_source", "5");
		        
		      
//		        
		        OutputStreamWriter writer = new OutputStreamWriter(myURLConnection.getOutputStream());
		        writer.write(add.toString());
		        writer.flush();
		        String line = null;
		        
		    
		    	
		        
		        InputStream getContent = null;
		        
		   //    myURLConnection.setConnectTimeout(1000);
		        
		        
		        if(myURLConnection.getResponseCode() == 200){
		            getContent = myURLConnection.getInputStream();
		           System.out.println("Status 200");
		           
		          sb_user_create.append("Status of User created on user manager API as follow :");
		          sb_user_create.append(System.lineSeparator());
		          
		           BufferedReader br = new BufferedReader(new InputStreamReader(getContent));
		            sb_user_create.append("Response code :" + myURLConnection.getResponseCode());
		       
		            StringBuilder sb = new StringBuilder();
		        
		            int charNumber;
		            while((charNumber = br.read()) != -1){
		                sb.append((char) charNumber);
		            }
		            JSONParser parser = new JSONParser();    
		            
		            String jsonText = sb.toString();
		            
		           
		          //     System.out.println(jsonText);
		               
		               Object obj = parser.parse(jsonText);
		               JSONObject jsonObject = (JSONObject) obj;
		               
		          String message_create =(String) jsonObject.get("message");
		         long result = (long) jsonObject.get("user_id");
		          
		         
		          System.out.println(message_create);
		         
		          System.out.println("USer id "+ result);
		          
		    System.out.println("Validating entered user details from database");
		    
		    
		          String url1 = "http://test.crm.limetray.in/crm/public/user/fetch/"+result;
		  		
		 		 try
		 		 
		 		 {
		 		 
		 			URL obj1 = new URL(url1);
		 			HttpURLConnection con = (HttpURLConnection) obj1.openConnection();

		 			// optional default is GET
		 			con.setRequestMethod("GET");

		 			//add request header
		 			//con.setRequestProperty("User-Agent", USER_AGENT);

		 			int responseCode = con.getResponseCode();
		 			System.out.println("\nSending 'GET' request to URL : " + url1);
		 			System.out.println("Response Code : " + responseCode);

		 			BufferedReader in = new BufferedReader(
		 			        new InputStreamReader(con.getInputStream()));
		 			String inputLine;
		 			StringBuffer response = new StringBuffer();

		 			while ((inputLine = in.readLine()) != null) {
		 				response.append(inputLine);
		 			}
		 			in.close();

		 			//print result
		 		//	System.out.println(response.toString());
		 			
		 			String jsonText1 = response.toString();
		 	
		 			
		 			
		            //  System.out.println(jsonText1);
		            //  JSONParser jsonParser = new JSONParser();
		              //    JSONObject jsonObject = (JSONObject) jsonParser.parse(jsonText);

		            //  String first_naming = ((Object) jsonObject).getJSONObject("result").getString("first_name");
		                  
		              ObjectMapper mapper = new ObjectMapper();
		 		     JsonNode rootNode = mapper.readTree(jsonText1);
		 		     
		 		     JsonNode n  = rootNode.path("result");
		 		     
		 		     String mobile_number_fetch = (n.path("mobile").getTextValue());
		 		     int user_id_fetch = (n.path("user_id").getIntValue());
		 		   //  System.out.println(mobile_number_fetch);
		 		    // System.out.println(user_id_fetch);
		 		    // String mobile_number_fetch_string = Integer.toString(mobile_number_fetch);
		 	
		 		     // System.out.println(mobile_number_fetch_string);
		 	
		 		     System.out.println("Mobile number enter by  user "+random_number_generation);
		 		     System.out.println("Mobile number fetch from db " +mobile_number_fetch );
		 	  if(random_number_generation.equals (mobile_number_fetch))
		 	
		 		     {
		 	
		 		System.out.println("User successfully created");
		 	            
		 		     }
		 		
		 	  else 
		 		  
		 	  {
		 		  
		 		  System.out.println("Fail user not created");
		 		  
		 	  }
		 		 
		 		 }catch(Exception e){}
		   
		          
		        }
		        
		        
		        else{
		         
		        	System.out.println("Status is not 200");
		        	System.out.println("Something went wrong");
		        	getContent = myURLConnection.getErrorStream();
		        	 myURLConnection.setConnectTimeout(1000);  
		            
		        }
			
			
		}catch(Exception e ){}
		
		
	}	
	

}
