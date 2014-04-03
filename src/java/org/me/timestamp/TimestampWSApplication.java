/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.timestamp;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author Rhayan
 */
@WebService(serviceName = "TimestampWSApplication")
@Stateless()
public class TimestampWSApplication {

     /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "getTimestamp")
    public String getTimestamp() {
        Date dateToday = new Date();;
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/YYYY HH:mm a");
        return dateFormat.format(dateToday);
    }
}
