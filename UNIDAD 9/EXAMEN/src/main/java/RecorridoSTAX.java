import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class RecorridoSTAX {
    public static void main(String[] args) {
        String tagActual = "";
        int contadorPlatos = 0;

        try {
            XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
            XMLEventReader xmlReader = xmlInputFactory.createXMLEventReader(new FileInputStream("restaurante.xml"));

            while (xmlReader.hasNext()) {
                XMLEvent xmlEvent = xmlReader.nextEvent();
                if (xmlEvent.isStartElement()) {
                    StartElement startElement = xmlEvent.asStartElement();

                    tagActual = startElement.getName().getLocalPart();

                    if (tagActual.equals("plato")) {
                        contadorPlatos++;
                    }
                }
            }

        } catch (XMLStreamException | FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Hay " + contadorPlatos + " platos");
    }
}