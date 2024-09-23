package net.melawor.maasaui.parser;

import net.melawor.maasaui.base.UINode;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

/**
 * @author Michael Eberlein
 */
public class TemplateParser {

    /**
     * Parse template and create nodes
     *
     * @return
     */
    public static UINode parse(String template) {

        // Create factory
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

        try {
            // Enable security
            factory.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);

            // Parse
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(template);

            // Normalize
            doc.normalizeDocument();

            // Read root element
            Element root = doc.getDocumentElement();

            NodeList children = root.getChildNodes();
            for (int i = 0; i < children.getLength(); i++) {
                org.w3c.dom.Node item = children.item(i);
            }

            // TODO

            return null;
        } catch (ParserConfigurationException | IOException | SAXException e) {
            throw new RuntimeException(e);
        }
    }
}
