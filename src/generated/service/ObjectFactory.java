
package service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetEmpIdResponse_QNAME = new QName("http://service/", "getEmpIdResponse");
    private final static QName _GetEmpId_QNAME = new QName("http://service/", "getEmpId");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetEmpId }
     * 
     */
    public GetEmpId createGetEmpId() {
        return new GetEmpId();
    }

    /**
     * Create an instance of {@link GetEmpIdResponse }
     * 
     */
    public GetEmpIdResponse createGetEmpIdResponse() {
        return new GetEmpIdResponse();
    }

    /**
     * Create an instance of {@link Employee }
     * 
     */
    public Employee createEmployee() {
        return new Employee();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmpIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getEmpIdResponse")
    public JAXBElement<GetEmpIdResponse> createGetEmpIdResponse(GetEmpIdResponse value) {
        return new JAXBElement<GetEmpIdResponse>(_GetEmpIdResponse_QNAME, GetEmpIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmpId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getEmpId")
    public JAXBElement<GetEmpId> createGetEmpId(GetEmpId value) {
        return new JAXBElement<GetEmpId>(_GetEmpId_QNAME, GetEmpId.class, null, value);
    }

}
