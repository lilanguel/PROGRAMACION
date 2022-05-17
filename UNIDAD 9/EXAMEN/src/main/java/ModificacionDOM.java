import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class ModificacionDOM {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();

            Document doc = db.parse(new File("restaurante.xml"));

            Node root = doc.getDocumentElement();

            Text saltoLinea = doc.createTextNode("\n");

            NodeList nodePlatos = doc.getElementsByTagName("plato");

            for (int i = 0; i < nodePlatos.getLength(); i++) {
                Element disponible = doc.createElement("disponible");
                disponible.setTextContent("si");
                nodePlatos.item(i).appendChild(disponible);
            }

            Element plato = doc.createElement("plato");
            plato.setAttribute("calorias", "685");

            Element nombre = doc.createElement("nombre");
            nombre.setTextContent("Gambas al Pilpil");

            Element precio = doc.createElement("precio");
            precio.setTextContent("5.25");

            Element disponible = doc.createElement("disponible");
            disponible.setTextContent("si");

            plato.appendChild(saltoLinea);
            plato.appendChild(nombre);
            plato.appendChild(saltoLinea);
            plato.appendChild(precio);
            plato.appendChild(saltoLinea);
            plato.appendChild(disponible);

            root.appendChild(plato);

            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();

            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
            transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "no");
            transformer.setOutputProperty(OutputKeys.METHOD, "xml");
            transformer.setOutputProperty("http://www.oracle.com/xml/is-standalone", "yes");

            DOMSource origen = new DOMSource(root);
            File nuevoPlatos = new File("examen2.xml");
            StreamResult destino = new StreamResult(nuevoPlatos);
            transformer.transform(origen, destino);

        } catch (ParserConfigurationException | IOException | SAXException
                 | TransformerException e) {
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
    }
}