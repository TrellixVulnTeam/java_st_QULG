package com.itvdn.webservices.ex_001_SAX;

import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;


public class Main {

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();

        File file = new File("D:\\Andrew\\CB\\Java EE (ITVDN)\\002_JAXP_and_JAXB\\002_Samples" +
                "\\src\\com\\itvdn\\webservices\\ex_001_SAX\\country.xml");

        if (file.exists())
           parser.parse(file, new MyHandler());

    }

}
