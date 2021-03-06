package com.spring.webservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.6.2
 * 2019-02-14T17:59:18.514+09:00
 * Generated source version: 2.6.2
 * 
 */
@WebServiceClient(name = "FileUploadImplService", 
                  wsdlLocation = "http://localhost:9999/webservice/FileUpload?wsdl",
                  targetNamespace = "http://webservice.spring.com/") 
public class FileUploadImplService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://webservice.spring.com/", "FileUploadImplService");
    public final static QName FileUploadImplPort = new QName("http://webservice.spring.com/", "FileUploadImplPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:9999/webservice/FileUpload?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(FileUploadImplService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://localhost:9999/webservice/FileUpload?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public FileUploadImplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public FileUploadImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public FileUploadImplService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public FileUploadImplService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public FileUploadImplService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public FileUploadImplService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns FileUpload
     */
    @WebEndpoint(name = "FileUploadImplPort")
    public FileUpload getFileUploadImplPort() {
        return super.getPort(FileUploadImplPort, FileUpload.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns FileUpload
     */
    @WebEndpoint(name = "FileUploadImplPort")
    public FileUpload getFileUploadImplPort(WebServiceFeature... features) {
        return super.getPort(FileUploadImplPort, FileUpload.class, features);
    }

}
