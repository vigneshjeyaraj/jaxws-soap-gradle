package service;

import javax.xml.ws.Endpoint;

public class Exporter {

    public static void main(String[] args) {
        /**
         * The WSDL URL for this service is http://localhost:9999/test/employeeservice?wsdl
         * XSD is available in http://localhost:9999/test/employeeservice?xsd=1
         */
        Endpoint.publish("http://localhost:9999/test/employeeservice", new EmployeeServiceImpl());

    }
}
