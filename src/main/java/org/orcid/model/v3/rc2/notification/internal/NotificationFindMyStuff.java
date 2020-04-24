//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.11.24 at 04:27:39 PM GMT 
//

package org.orcid.model.v3.rc2.notification.internal;

import javax.xml.datatype.XMLGregorianCalendar;

import org.orcid.jaxb.model.v3.rc2.notification.Notification;
import org.orcid.jaxb.model.v3.rc2.notification.NotificationType;
import org.orcid.jaxb.model.v3.rc2.notification.permission.AuthorizationUrl;

public class NotificationFindMyStuff extends Notification {

    private final static long serialVersionUID = 1L;
    protected AuthorizationUrl authorizationUrl;
    protected XMLGregorianCalendar actionedDate;
    protected String serviceProviderId;

    {
        notificationType = NotificationType.FIND_MY_STUFF;
    }

    /**
     * Gets the value of the authorizationUrl property.
     * 
     * @return possible object is {@link AuthorizationUrl }
     * 
     */
    public AuthorizationUrl getAuthorizationUrl() {
        return authorizationUrl;
    }

    /**
     * Sets the value of the authorizationUrl property.
     * 
     * @param value
     *            allowed object is {@link AuthorizationUrl }
     * 
     */
    public void setAuthorizationUrl(AuthorizationUrl value) {
        this.authorizationUrl = value;
    }

    public XMLGregorianCalendar getActionedDate() {
        return actionedDate;
    }

    public void setActionedDate(XMLGregorianCalendar actionedDate) {
        this.actionedDate = actionedDate;
    }

    public String getServiceProviderId() {
        return serviceProviderId;
    }

    public void setServiceProviderId(String serviceProviderId) {
        this.serviceProviderId = serviceProviderId;
    }

}
