/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.firstwebservice;

import com.entity.Ticket;
import com.persistence.TicketDAO;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author hand
 */
@WebService(serviceName = "WebService01")
public class WebService01 {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "searchTicketId")
    public Ticket searchTicketId(@WebParam(name = "ticketId") int ticketId) {
        //TODO write your implementation code here:
        Ticket tk = null;
        TicketDAO tDao = new TicketDAO();
        tk = tDao.searchTicketId(ticketId);
        return tk;
    }
}
