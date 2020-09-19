package com.briansdevblog.accounts;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.3.2
 * 2020-09-19T14:06:15.648+02:00
 * Generated source version: 3.3.2
 *
 */
@WebService(targetNamespace = "http://www.briansdevblog.com/Accounts/", name = "AccountService")
@XmlSeeAlso({com.blog.demo.webservices.accountservice.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface AccountService {

    @WebMethod(operationName = "GetAccountDetails", action = "http://www.briansjavablog.com/Accounts/GetAccountDetails")
    @WebResult(name = "AccountDetailsResponse", targetNamespace = "http://com/blog/demo/webservices/accountservice", partName = "parameters")
    public com.blog.demo.webservices.accountservice.AccountDetailsResponse getAccountDetails(

        @WebParam(partName = "parameters", name = "AccountDetailsRequest", targetNamespace = "http://com/blog/demo/webservices/accountservice")
        com.blog.demo.webservices.accountservice.AccountDetailsRequest parameters
    );
}
