package com.vedoc.qa.testdata;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;

import org.openqa.selenium.Cookie;

import com.jayway.jsonpath.JsonPath;

public class json {
	public static String brandj;
	public static String xsrf;
	public static void json(String cookie) throws IOException {
		URL url = new URL("https://vedoc-test1-em1.i.daimler.com/vedoc-rest-adapter/jaxrs/VehiclePresentationFacade/searchVehicleWithMasterData");
		

		URLConnection con = url.openConnection(); 
		con.setDoOutput(true);
//		con.setRequestProperty("Cookie", "JSESSIONID=0000bIUZrti_j2TRtH5HhymmpWq:1dare8ot4;"
//	    		+ "LtpaToken2=12G3VctomOKWmW2Z0nAP6N/cvkLwMdfQlOJ7oa/To8lDIF3uCscm+u37Nhfegp1np6w8JwWyYbz0qglSFhPSBFyOhIdy6C9oXOqa+Pd2TOUDrev7hfcYXHUr93Ws+TC8gRRwVlhc7mC3mAWwPdAVu2rkgCrBdX3fDb3f3xazUe4BOUh9XiBcpDJrmFQJ/wr25CS19NqGlTcH0NlvqqjFY3qFLW4LFLtgsDJYQ4whcPSrNLEUbTuiJmXvc9bqhRnDNha2ELWMFvU5bOvyCkX5xTHIFsbejzj1oHv8oy2i3DlP0oIdCg2rmw6BFpSEULcxDaFMJq1yOY2JX+th6BX2x5gmoTeJgWfDO8zjuDXanCSSmTrOCa7EYOjkSjhpZRZwFxu2mVsCFTTGCsASjXuXgKKCWoXJy2/WAJ0UMJd4rFAqFVo/eCapGyNvsPKfJ5d7;"
//	    		+ "XSRF-TOKEN=-734499156;"
//	    		+ "OIDCSESSIONID_9b296397-357e-420f-8fe9-dd878b73ced6=174uAtlJYRt0ItES0R4lJLX7Yu6nanpp7ucQvIkGQbc=");

		System.out.println(cookie);
		String regex="(XSRF\\-TOKEN\\=)(\\S+)(\\;)";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(cookie);
		matcher.matches();
		matcher.groupCount();
		if (matcher.find())
		{
		xsrf= matcher.group(2);
		System.out.println(xsrf);
		}
		
		con.setRequestProperty("Cookie", cookie);
		
		
		con.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
	    con.setRequestProperty("Accept","application/json, text/plain, */*");
	    con.setRequestProperty("Referer"," https://vedoc-test1-em1.i.daimler.com/vedocweb/VehicleArrangement.html");
	    con.setRequestProperty("X-XSRF-TOKEN", xsrf);
	    con.connect();

	    String postData= "{\"vehicleSearchCategory\":\"finOrVin\",\"vehicleSearchValue\":\"WDB96300510255369\"}";
		OutputStreamWriter out = new OutputStreamWriter(con.getOutputStream(), "UTF-8");
		out.write(postData);
		out.close();
		
		BufferedReader in=null;

	      if ("gzip".equals(con.getContentEncoding())) {
	    	  	    	  
	    	   in = new BufferedReader(new InputStreamReader(new GZIPInputStream(con.getInputStream())));
		    	        String inputLine;
		    	        StringBuffer response = new StringBuffer();
		    	        while ((inputLine = in .readLine()) != null) {
		    	            response.append(inputLine);
		    	        } in .close();
		    	        //System.out.println(response.toString());
		    	        String JsonResponse= response.toString();
		    	        String formattedJson=JsonResponse.substring(5);
		    	        //System.out.println(formattedJson);
		    	        
		    	        brandj = JsonPath.read(formattedJson, "$.vehicle.activeState.cocData.brand");
		    	        System.out.println(brandj);

		    	        
		    	        
		    	        
		    	        
	      }
	}

}
