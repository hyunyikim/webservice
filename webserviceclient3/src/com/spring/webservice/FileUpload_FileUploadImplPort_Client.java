
package com.spring.webservice;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.activation.DataHandler;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.6.2
 * 2019-02-14T17:59:18.409+09:00
 * Generated source version: 2.6.2
 * 
 */
public final class FileUpload_FileUploadImplPort_Client {

    private static final QName SERVICE_NAME = new QName("http://webservice.spring.com/", "FileUploadImplService");

    private FileUpload_FileUploadImplPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = FileUploadImplService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        FileUploadImplService ss = new FileUploadImplService(wsdlURL, SERVICE_NAME);
        FileUpload port = ss.getFileUploadImplPort();  
        
        /*
        {
        System.out.println("Invoking uploadFile...");
        com.spring.webservice.FileUploader _uploadFile_dfile = new com.spring.webservice.FileUploader();
        DataHandler _uploadFile_dfileDfile = new byte[] {};
        _uploadFile_dfile.setDfile(_uploadFile_dfileDfile);
        _uploadFile_dfile.setFileType("FileType1883417532");
        _uploadFile_dfile.setName("Name-1273221758");
        port.uploadFile(_uploadFile_dfile);


        }
         */
        System.exit(0);
    }

}
