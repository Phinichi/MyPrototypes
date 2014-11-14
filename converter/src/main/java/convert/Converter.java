package convert;
import java.io.StringReader;
import java.io.StringWriter;
 
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
 
import org.w3c.dom.Document;
import java.io.File;
import org.xml.sax.InputSource;


import java.io.File;
import java.io.IOException;
import java.util.List;


import org.w3c.dom.Attr;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;



public class Converter {
	Xmlview xmlview = new Xmlview();
	   
	
	public  void plaintoxml(String plain){
		System.out.println("Here!");
		  DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance(); 
	        DocumentBuilder builder; 
	        try 
	        { 
	            builder = factory.newDocumentBuilder(); 
	            Document doc = builder.parse( new InputSource( new StringReader( plain ) ) );
	            
	            
	           
	    		
	    		
	    		DOMSource source = new DOMSource(doc);
	    		//StreamResult result = new StreamResult(new File("C:\\file.xml"));
	     
	    		// Output to console for testing
	    		StreamResult result = new StreamResult(System.out);
	     
	    		
	            
	            
	            
	            
	            xmlview.show(source, result);
	            
	        } catch (Exception e) { 
	            e.printStackTrace(); 
	        }
	       
	         xmlview.errorshow();
	    }
		
		
		
	
	
	public  void xmltoplain(File file){
		 try {
			 
				
				DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
				DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
				Document doc = dBuilder.parse(file);
			 
				//optional, but recommended
				//read this - http://stackoverflow.com/questions/13786607/normalization-in-dom-parsing-with-java-how-does-it-work
				doc.getDocumentElement().normalize();
			 
				System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
			 
				NodeList nList = doc.getElementsByTagName("staff");
			 
				System.out.println("----------------------------");
			 
				for (int temp = 0; temp < nList.getLength(); temp++) {
			 
					Node nNode = nList.item(temp);
			 
					System.out.println("\nCurrent Element :" + nNode.getNodeName());
			 
					if (nNode.getNodeType() == Node.ELEMENT_NODE) {
			 
						Element eElement = (Element) nNode;
			 
						System.out.println("Staff id : " + eElement.getAttribute("id"));
						System.out.println("First Name : " + eElement.getElementsByTagName("firstname").item(0).getTextContent());
						System.out.println("Last Name : " + eElement.getElementsByTagName("lastname").item(0).getTextContent());
						System.out.println("Nick Name : " + eElement.getElementsByTagName("nickname").item(0).getTextContent());
						System.out.println("Salary : " + eElement.getElementsByTagName("salary").item(0).getTextContent());
			 
					}
				}
			    } catch (Exception e) {
				e.printStackTrace();
			    }
			  
			 
			
		
		xmlview.showplain();
	}

	

	
	

}