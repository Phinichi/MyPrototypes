package convert;

import org.w3c.dom.Document;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

class Xmlview{
	
	public  void show(DOMSource source, StreamResult result){
		try 
        { 
		 TransformerFactory transformerFactory = TransformerFactory.newInstance();
 		Transformer transformer = transformerFactory.newTransformer();
 		
 		transformer.transform(source, result);
	 } catch (Exception e) { 
         e.printStackTrace(); 
     }
	   
	    
		
	
	}
	
	
	public void errorshow(){
		
	
	}
	
	public void showplain(){
	System.out.println("Blubb");
}

	

}