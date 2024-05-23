package dl;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class SVGFitx {
	
	
	public void formaGuztiakIdatzi(List<ZirkuluaE> zirkuluak,List<TestuaE> testuak) {
		try {
			IrudiaXML irudi=new IrudiaXML();
			irudi.setZirkuluak(zirkuluak);
			irudi.setTestuak(testuak);
			
			JAXBContext jaxbContext=JAXBContext.newInstance(IrudiaXML.class);
			Marshaller jaxbMarshaller=jaxbContext.createMarshaller();
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
			jaxbMarshaller.marshal(irudi, new File(System.getProperty("user.home")+"/irudia.svg"));
			
		}catch(JAXBException e) {
			e.printStackTrace();
		}
	}
	
}
