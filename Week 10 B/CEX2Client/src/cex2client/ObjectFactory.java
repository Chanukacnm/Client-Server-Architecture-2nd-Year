
package cex2client;

import cex2client.*;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cex2client package. 
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
    private final static QName _FindStudentWithHighestGrade_QNAME = new QName("http://server/", "findStudentWithHighestGrade");
    private final static QName _GetStringLengthWithExceptionResponse_QNAME = new QName("http://server/", "getStringLengthWithExceptionResponse");
    private final static QName _IsConnected_QNAME = new QName("http://server/", "isConnected");
    private final static QName _AddNameToServerResponse_QNAME = new QName("http://server/", "addNameToServerResponse");
    private final static QName _FindStudentWithHighestGradeResponse_QNAME = new QName("http://server/", "findStudentWithHighestGradeResponse");
    private final static QName _FindLongestNameInServer_QNAME = new QName("http://server/", "findLongestNameInServer");
    private final static QName _IsConnectedResponse_QNAME = new QName("http://server/", "isConnectedResponse");
    private final static QName _AddStudentToServerResponse_QNAME = new QName("http://server/", "addStudentToServerResponse");
    private final static QName _GetStringLengthResponse_QNAME = new QName("http://server/", "getStringLengthResponse");
    private final static QName _GetStringLengthWithException_QNAME = new QName("http://server/", "getStringLengthWithException");
    private final static QName _Hello_QNAME = new QName("http://server/", "hello");
    private final static QName _AddStudentToServer_QNAME = new QName("http://server/", "addStudentToServer");
    private final static QName _FindLongestNameInServerResponse_QNAME = new QName("http://server/", "findLongestNameInServerResponse");
    private final static QName _HelloResponse_QNAME = new QName("http://server/", "helloResponse");
    private final static QName _AddNameToServer_QNAME = new QName("http://server/", "addNameToServer");
    private final static QName _GetStringLength_QNAME = new QName("http://server/", "getStringLength");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cex2client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FindStudentWithHighestGradeResponse }
     * 
     */
    public FindStudentWithHighestGradeResponse createFindStudentWithHighestGradeResponse() {
        return new FindStudentWithHighestGradeResponse();
    }

    /**
     * Create an instance of {@link AddNameToServerResponse }
     * 
     */
    public AddNameToServerResponse createAddNameToServerResponse() {
        return new AddNameToServerResponse();
    }

    /**
     * Create an instance of {@link IsConnected }
     * 
     */
    public IsConnected createIsConnected() {
        return new IsConnected();
    }

    /**
     * Create an instance of {@link GetStringLengthWithExceptionResponse }
     * 
     */
    public GetStringLengthWithExceptionResponse createGetStringLengthWithExceptionResponse() {
        return new GetStringLengthWithExceptionResponse();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link FindStudentWithHighestGrade }
     * 
     */
    public FindStudentWithHighestGrade createFindStudentWithHighestGrade() {
        return new FindStudentWithHighestGrade();
    }

    /**
     * Create an instance of {@link GetStringLength }
     * 
     */
    public GetStringLength createGetStringLength() {
        return new GetStringLength();
    }

    /**
     * Create an instance of {@link AddNameToServer }
     * 
     */
    public AddNameToServer createAddNameToServer() {
        return new AddNameToServer();
    }

    /**
     * Create an instance of {@link AddStudentToServer }
     * 
     */
    public AddStudentToServer createAddStudentToServer() {
        return new AddStudentToServer();
    }

    /**
     * Create an instance of {@link FindLongestNameInServerResponse }
     * 
     */
    public FindLongestNameInServerResponse createFindLongestNameInServerResponse() {
        return new FindLongestNameInServerResponse();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link GetStringLengthWithException }
     * 
     */
    public GetStringLengthWithException createGetStringLengthWithException() {
        return new GetStringLengthWithException();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link AddStudentToServerResponse }
     * 
     */
    public AddStudentToServerResponse createAddStudentToServerResponse() {
        return new AddStudentToServerResponse();
    }

    /**
     * Create an instance of {@link GetStringLengthResponse }
     * 
     */
    public GetStringLengthResponse createGetStringLengthResponse() {
        return new GetStringLengthResponse();
    }

    /**
     * Create an instance of {@link FindLongestNameInServer }
     * 
     */
    public FindLongestNameInServer createFindLongestNameInServer() {
        return new FindLongestNameInServer();
    }

    /**
     * Create an instance of {@link IsConnectedResponse }
     * 
     */
    public IsConnectedResponse createIsConnectedResponse() {
        return new IsConnectedResponse();
    }

    /**
     * Create an instance of {@link Student }
     * 
     */
    public Student createStudent() {
        return new Student();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link FindStudentWithHighestGrade }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "findStudentWithHighestGrade")
    public JAXBElement<FindStudentWithHighestGrade> createFindStudentWithHighestGrade(FindStudentWithHighestGrade value) {
        return new JAXBElement<FindStudentWithHighestGrade>(_FindStudentWithHighestGrade_QNAME, FindStudentWithHighestGrade.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStringLengthWithExceptionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "getStringLengthWithExceptionResponse")
    public JAXBElement<GetStringLengthWithExceptionResponse> createGetStringLengthWithExceptionResponse(GetStringLengthWithExceptionResponse value) {
        return new JAXBElement<GetStringLengthWithExceptionResponse>(_GetStringLengthWithExceptionResponse_QNAME, GetStringLengthWithExceptionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsConnected }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "isConnected")
    public JAXBElement<IsConnected> createIsConnected(IsConnected value) {
        return new JAXBElement<IsConnected>(_IsConnected_QNAME, IsConnected.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddNameToServerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "addNameToServerResponse")
    public JAXBElement<AddNameToServerResponse> createAddNameToServerResponse(AddNameToServerResponse value) {
        return new JAXBElement<AddNameToServerResponse>(_AddNameToServerResponse_QNAME, AddNameToServerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindStudentWithHighestGradeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "findStudentWithHighestGradeResponse")
    public JAXBElement<FindStudentWithHighestGradeResponse> createFindStudentWithHighestGradeResponse(FindStudentWithHighestGradeResponse value) {
        return new JAXBElement<FindStudentWithHighestGradeResponse>(_FindStudentWithHighestGradeResponse_QNAME, FindStudentWithHighestGradeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindLongestNameInServer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "findLongestNameInServer")
    public JAXBElement<FindLongestNameInServer> createFindLongestNameInServer(FindLongestNameInServer value) {
        return new JAXBElement<FindLongestNameInServer>(_FindLongestNameInServer_QNAME, FindLongestNameInServer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsConnectedResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "isConnectedResponse")
    public JAXBElement<IsConnectedResponse> createIsConnectedResponse(IsConnectedResponse value) {
        return new JAXBElement<IsConnectedResponse>(_IsConnectedResponse_QNAME, IsConnectedResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddStudentToServerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "addStudentToServerResponse")
    public JAXBElement<AddStudentToServerResponse> createAddStudentToServerResponse(AddStudentToServerResponse value) {
        return new JAXBElement<AddStudentToServerResponse>(_AddStudentToServerResponse_QNAME, AddStudentToServerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStringLengthResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "getStringLengthResponse")
    public JAXBElement<GetStringLengthResponse> createGetStringLengthResponse(GetStringLengthResponse value) {
        return new JAXBElement<GetStringLengthResponse>(_GetStringLengthResponse_QNAME, GetStringLengthResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStringLengthWithException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "getStringLengthWithException")
    public JAXBElement<GetStringLengthWithException> createGetStringLengthWithException(GetStringLengthWithException value) {
        return new JAXBElement<GetStringLengthWithException>(_GetStringLengthWithException_QNAME, GetStringLengthWithException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddStudentToServer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "addStudentToServer")
    public JAXBElement<AddStudentToServer> createAddStudentToServer(AddStudentToServer value) {
        return new JAXBElement<AddStudentToServer>(_AddStudentToServer_QNAME, AddStudentToServer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindLongestNameInServerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "findLongestNameInServerResponse")
    public JAXBElement<FindLongestNameInServerResponse> createFindLongestNameInServerResponse(FindLongestNameInServerResponse value) {
        return new JAXBElement<FindLongestNameInServerResponse>(_FindLongestNameInServerResponse_QNAME, FindLongestNameInServerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddNameToServer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "addNameToServer")
    public JAXBElement<AddNameToServer> createAddNameToServer(AddNameToServer value) {
        return new JAXBElement<AddNameToServer>(_AddNameToServer_QNAME, AddNameToServer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStringLength }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "getStringLength")
    public JAXBElement<GetStringLength> createGetStringLength(GetStringLength value) {
        return new JAXBElement<GetStringLength>(_GetStringLength_QNAME, GetStringLength.class, null, value);
    }

}
