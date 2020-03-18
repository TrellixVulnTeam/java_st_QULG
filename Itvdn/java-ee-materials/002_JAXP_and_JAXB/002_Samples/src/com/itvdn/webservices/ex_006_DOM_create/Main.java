package com.itvdn.webservices.ex_006_DOM_create;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Asus on 03.12.2017.
 */
public class Main {

    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException, TransformerException {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        dbf.setIgnoringElementContentWhitespace(true);

        DocumentBuilder db = dbf.newDocumentBuilder();

        Document document = db.newDocument();
//                db.parse("D:/Andrew/CB/Web Services Student/002_JAXP/002_Samples/" +
//                "src/com/itvdn/webservices/ex_004_DOM/books.xml");

        Element root = document.createElement("books");


        Element book = document.createElement("book");
        Element title = document.createElement("title");
        Element author = document.createElement("author");

        book.setAttribute("id", "04");
        book.setAttribute("isbn", "333555");
        title.setTextContent("Lukomore");
        author.setTextContent("Alexandr Pushkin");

        book.appendChild(title);
        book.appendChild(author);

        root.appendChild(book);
        document.appendChild(root);

        DOMSource source = new DOMSource(document);
        String outputURL = "books_edit.xml";

        StreamResult result = new StreamResult(new FileOutputStream(outputURL));

        TransformerFactory tf = TransformerFactory.newInstance();
        Transformer transformer = tf.newTransformer();
        transformer.transform(source, result);

    }

}
