package com.swap;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class XmlTestParser {

    public static void main(String[] args) {
        String response = "<XML>\n" +
                "    <MessageType>1210</MessageType>\n" +
                "    <ProcCode>E00011</ProcCode>\n" +
                "    <LocalTxnDtTime>20150417104125</LocalTxnDtTime>\n" +
                "    <Identifier>MA</Identifier>\n" +
                "    <ActCode>000</ActCode>\n" +
                "    <UserID>NIKHIL</UserID>\n" +
                "    <BayUserId>SUDEEP14</BayUserId>\n" +
                "    <Status>A</Status>\n" +
                "    <DeliveryChannelCtrlID>TLB</DeliveryChannelCtrlID>\n" +
                "    <DataValue>\n" +
                "        <Name>Account</Name>\n" +
                "        <Value>000401186841|Eswararao Battula</Value>\n" +
                "        <Name>Account</Name>\n" +
                "        <Value>000401186841|Eswararao Battula</Value>\n" + " " +
                "       <Name>Account</Name>\n" +
                "        <Value>000401186841|Ganpat Aapte</Value>\n" +
                "        <Name>MenuProfile</Name>\n" +
                "        <Value>ICICIRWC</Value>\n" +
                "        <Name>MenuPrfile</Name>\n" +
                "        <Value>ICICIRWC</Value>\n" +
                "    </DataValue>\n" +
                "</XML>";
        response = response.replaceAll("[\\n\\r]", "");
        System.out.println("response ** : " + response);
        InputStream ios = new ByteArrayInputStream(response.getBytes());
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        dbFactory.setNamespaceAware(true);
        Map<String, String> ribDataValueMap = new HashMap<String, String>();
        try {
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            org.w3c.dom.Document doc = dBuilder.parse(ios);
            doc.getDocumentElement().normalize();
        //    Node node = doc.getElementsByTagName("DataValue");


            System.out.println("nodeList length name ** : " + doc.getElementsByTagName("Name").getLength());
            System.out.println("nodeList length val ** : " + doc.getElementsByTagName("Value").getLength());
            int len = doc.getElementsByTagName("Name").getLength();
            for (int i = 0; i < len; i++) {
                String name = doc.getElementsByTagName("Name").item(i).getTextContent();
                String value = doc.getElementsByTagName("Value").item(i).getTextContent();
                System.out.println("Name : "+name + ", Value : "+value);
            }


            String lastKey = "";
            for (int i = 0; i < len; i++) {
                System.out.println("e.getAttribute(\"Name\") ** : " + doc.getElementsByTagName("Name").item(i).getTextContent() + " e.getAttribute(\"Value\") ** : " + doc.getElementsByTagName("Value").item(i).getTextContent());
                    //{Account=000401186841|Eswararao Battula, MenuProfile=ICICIRWC}
                    ribDataValueMap.put(doc.getElementsByTagName("Name").item(i).getTextContent(), "");
                    lastKey = doc.getElementsByTagName("Name").item(i).getTextContent();
                    System.out.println("lastKey ***** "+lastKey);
                    System.out.println("----ribDataValueMap-------- "+ribDataValueMap);

                    System.out.println("--=======-- "+ribDataValueMap);
                    if (ribDataValueMap.containsKey(lastKey)) {
                        ribDataValueMap.put(lastKey, doc.getElementsByTagName("Value").item(i).getTextContent());
                        System.out.println("************ "+ribDataValueMap);
                 //   }
                }
            }
            System.out.println("ribDataValueMap : "+ribDataValueMap);
           // for (int i = 0; ; i++) {
                //Node n = nodeList.item(i);
                //System.out.println("*** child "+n.getLastChild());
             //   org.w3c.dom.Element e = (org.w3c.dom.Element) n;
               // System.out.println("e.getAttribute(\"Name\") ** : " + e.getElementsByTagName("Name").item(i).getTextContent() + " e.getAttribute(\"Value\") ** : " + e.getElementsByTagName("Value").item(i).getTextContent());
            //}

        } catch (Exception pe) {
            pe.printStackTrace();
        }
    }


}
