package com.example.demo.core.java;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class RemoveDuplicate {

    public static void main(String[] args){

        String inputFile = "C:\\Users\\ankit\\OneDrive\\Desktop\\input.xml";
        String outputFile = "C:\\Users\\ankit\\OneDrive\\Desktop\\output.txt";

        try {
            // Initialize document builder factory and parser
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            // Parse the XML file
            Document document = builder.parse(inputFile);
            document.getDocumentElement().normalize();

            // Open the output file for writing
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

            // Get the root element of the XML document
            Element root = document.getDocumentElement();

            // Get a list of all child elements of the root element
            NodeList nodes = root.getChildNodes();

            // Loop through the child elements and extract data
            for (int i = 0; i < nodes.getLength(); i++) {
                Node node = nodes.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;

                    // Extract data from the element and write to the output file
                    String data = element.getAttribute("attribute1") + "|" + element.getAttribute("attribute2") + "|" + element.getTextContent();
                    writer.write(data);
                    writer.newLine();
                }
            }

            // Close the output file
            writer.close();

            System.out.println("Conversion completed successfully.");

        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }

      /*  try{
            Object o="abc";
            if (o=="abc"){
                System.out.println("in");
            }
        }catch (Exception e) {
            throw new Exception();
        }
        System.out.println("test");*/
      /*  int[] input={1,1,2};
        int i = removeDuplicates(input);
        System.out.println(i);*/
    }

}
