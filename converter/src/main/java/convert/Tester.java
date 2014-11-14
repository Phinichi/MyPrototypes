package convert;
import java.io.File; 

class Tester{
	 
	

	public static void main(String [ ] args)
	{
		
		Converter convert = new Converter();
		String xmlStr = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n"+
	            "<Emp id=\"1\"><name>Pankaj</name><age>25</age>\n"+
	            "<role>Developer</role><gen>Male</gen></Emp>";
	   convert.plaintoxml(xmlStr);
	   
	   //File file = new File("/Users/Phinichi/Desktop/JQAssistant/converter/src/main/java/convert/tester.xml");
	 File file = new File("src/main/java/convert" ,"tester.xml");
	   convert.xmltoplain( file);
	}
 
	 
	 
}



	         