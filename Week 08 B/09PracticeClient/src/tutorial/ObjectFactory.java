
package tutorial;

import tutorial.*;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the tutorial package. 
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

    private final static QName _Exception_QNAME = new QName("http://server/", "Exception");
    private final static QName _FindShortestBetween_QNAME = new QName("http://server/", "findShortestBetween");
    private final static QName _AddPerson_QNAME = new QName("http://server/", "addPerson");
    private final static QName _TestConnection_QNAME = new QName("http://server/", "testConnection");
    private final static QName _AddPersonResponse_QNAME = new QName("http://server/", "addPersonResponse");
    private final static QName _AddString_QNAME = new QName("http://server/", "addString");
    private final static QName _FindPersonWithLongestName_QNAME = new QName("http://server/", "findPersonWithLongestName");
    private final static QName _FindShortestBetweenWithExceptionResponse_QNAME = new QName("http://server/", "findShortestBetweenWithExceptionResponse");
    private final static QName _TestConnectionResponse_QNAME = new QName("http://server/", "testConnectionResponse");
    private final static QName _FindShortestAmongStrings_QNAME = new QName("http://server/", "findShortestAmongStrings");
    private final static QName _FindShortestBetweenWithException_QNAME = new QName("http://server/", "findShortestBetweenWithException");
    private final static QName _FindPersonWithLongestNameResponse_QNAME = new QName("http://server/", "findPersonWithLongestNameResponse");
    private final static QName _AddStringResponse_QNAME = new QName("http://server/", "addStringResponse");
    private final static QName _FindShortestAmongStringsResponse_QNAME = new QName("http://server/", "findShortestAmongStringsResponse");
    private final static QName _FindShortestBetweenResponse_QNAME = new QName("http://server/", "findShortestBetweenResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: tutorial
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddPersonResponse }
     * 
     */
    public AddPersonResponse createAddPersonResponse() {
        return new AddPersonResponse();
    }

    /**
     * Create an instance of {@link TestConnection }
     * 
     */
    public TestConnection createTestConnection() {
        return new TestConnection();
    }

    /**
     * Create an instance of {@link FindShortestBetween }
     * 
     */
    public FindShortestBetween createFindShortestBetween() {
        return new FindShortestBetween();
    }

    /**
     * Create an instance of {@link AddPerson }
     * 
     */
    public AddPerson createAddPerson() {
        return new AddPerson();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link FindShortestBetweenResponse }
     * 
     */
    public FindShortestBetweenResponse createFindShortestBetweenResponse() {
        return new FindShortestBetweenResponse();
    }

    /**
     * Create an instance of {@link AddStringResponse }
     * 
     */
    public AddStringResponse createAddStringResponse() {
        return new AddStringResponse();
    }

    /**
     * Create an instance of {@link FindShortestAmongStringsResponse }
     * 
     */
    public FindShortestAmongStringsResponse createFindShortestAmongStringsResponse() {
        return new FindShortestAmongStringsResponse();
    }

    /**
     * Create an instance of {@link FindPersonWithLongestNameResponse }
     * 
     */
    public FindPersonWithLongestNameResponse createFindPersonWithLongestNameResponse() {
        return new FindPersonWithLongestNameResponse();
    }

    /**
     * Create an instance of {@link FindShortestAmongStrings }
     * 
     */
    public FindShortestAmongStrings createFindShortestAmongStrings() {
        return new FindShortestAmongStrings();
    }

    /**
     * Create an instance of {@link FindShortestBetweenWithException }
     * 
     */
    public FindShortestBetweenWithException createFindShortestBetweenWithException() {
        return new FindShortestBetweenWithException();
    }

    /**
     * Create an instance of {@link FindPersonWithLongestName }
     * 
     */
    public FindPersonWithLongestName createFindPersonWithLongestName() {
        return new FindPersonWithLongestName();
    }

    /**
     * Create an instance of {@link FindShortestBetweenWithExceptionResponse }
     * 
     */
    public FindShortestBetweenWithExceptionResponse createFindShortestBetweenWithExceptionResponse() {
        return new FindShortestBetweenWithExceptionResponse();
    }

    /**
     * Create an instance of {@link TestConnectionResponse }
     * 
     */
    public TestConnectionResponse createTestConnectionResponse() {
        return new TestConnectionResponse();
    }

    /**
     * Create an instance of {@link AddString }
     * 
     */
    public AddString createAddString() {
        return new AddString();
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindShortestBetween }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "findShortestBetween")
    public JAXBElement<FindShortestBetween> createFindShortestBetween(FindShortestBetween value) {
        return new JAXBElement<FindShortestBetween>(_FindShortestBetween_QNAME, FindShortestBetween.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "addPerson")
    public JAXBElement<AddPerson> createAddPerson(AddPerson value) {
        return new JAXBElement<AddPerson>(_AddPerson_QNAME, AddPerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestConnection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "testConnection")
    public JAXBElement<TestConnection> createTestConnection(TestConnection value) {
        return new JAXBElement<TestConnection>(_TestConnection_QNAME, TestConnection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "addPersonResponse")
    public JAXBElement<AddPersonResponse> createAddPersonResponse(AddPersonResponse value) {
        return new JAXBElement<AddPersonResponse>(_AddPersonResponse_QNAME, AddPersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "addString")
    public JAXBElement<AddString> createAddString(AddString value) {
        return new JAXBElement<AddString>(_AddString_QNAME, AddString.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindPersonWithLongestName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "findPersonWithLongestName")
    public JAXBElement<FindPersonWithLongestName> createFindPersonWithLongestName(FindPersonWithLongestName value) {
        return new JAXBElement<FindPersonWithLongestName>(_FindPersonWithLongestName_QNAME, FindPersonWithLongestName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindShortestBetweenWithExceptionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "findShortestBetweenWithExceptionResponse")
    public JAXBElement<FindShortestBetweenWithExceptionResponse> createFindShortestBetweenWithExceptionResponse(FindShortestBetweenWithExceptionResponse value) {
        return new JAXBElement<FindShortestBetweenWithExceptionResponse>(_FindShortestBetweenWithExceptionResponse_QNAME, FindShortestBetweenWithExceptionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestConnectionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "testConnectionResponse")
    public JAXBElement<TestConnectionResponse> createTestConnectionResponse(TestConnectionResponse value) {
        return new JAXBElement<TestConnectionResponse>(_TestConnectionResponse_QNAME, TestConnectionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindShortestAmongStrings }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "findShortestAmongStrings")
    public JAXBElement<FindShortestAmongStrings> createFindShortestAmongStrings(FindShortestAmongStrings value) {
        return new JAXBElement<FindShortestAmongStrings>(_FindShortestAmongStrings_QNAME, FindShortestAmongStrings.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindShortestBetweenWithException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "findShortestBetweenWithException")
    public JAXBElement<FindShortestBetweenWithException> createFindShortestBetweenWithException(FindShortestBetweenWithException value) {
        return new JAXBElement<FindShortestBetweenWithException>(_FindShortestBetweenWithException_QNAME, FindShortestBetweenWithException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindPersonWithLongestNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "findPersonWithLongestNameResponse")
    public JAXBElement<FindPersonWithLongestNameResponse> createFindPersonWithLongestNameResponse(FindPersonWithLongestNameResponse value) {
        return new JAXBElement<FindPersonWithLongestNameResponse>(_FindPersonWithLongestNameResponse_QNAME, FindPersonWithLongestNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddStringResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "addStringResponse")
    public JAXBElement<AddStringResponse> createAddStringResponse(AddStringResponse value) {
        return new JAXBElement<AddStringResponse>(_AddStringResponse_QNAME, AddStringResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindShortestAmongStringsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "findShortestAmongStringsResponse")
    public JAXBElement<FindShortestAmongStringsResponse> createFindShortestAmongStringsResponse(FindShortestAmongStringsResponse value) {
        return new JAXBElement<FindShortestAmongStringsResponse>(_FindShortestAmongStringsResponse_QNAME, FindShortestAmongStringsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindShortestBetweenResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "findShortestBetweenResponse")
    public JAXBElement<FindShortestBetweenResponse> createFindShortestBetweenResponse(FindShortestBetweenResponse value) {
        return new JAXBElement<FindShortestBetweenResponse>(_FindShortestBetweenResponse_QNAME, FindShortestBetweenResponse.class, null, value);
    }

}
