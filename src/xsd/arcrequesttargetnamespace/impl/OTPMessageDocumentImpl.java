/*
 * An XML document type.
 * Localname: OTPMessage
 * Namespace: ARCRequestTargetNamespace.xsd
 * Java type: xsd.arcrequesttargetnamespace.OTPMessageDocument
 *
 * Automatically generated - do not modify.
 */
package xsd.arcrequesttargetnamespace.impl;
/**
 * A document containing one OTPMessage(@ARCRequestTargetNamespace.xsd) element.
 *
 * This is a complex type.
 */
public class OTPMessageDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements xsd.arcrequesttargetnamespace.OTPMessageDocument
{
    
    public OTPMessageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OTPMESSAGE$0 = 
        new javax.xml.namespace.QName("ARCRequestTargetNamespace.xsd", "OTPMessage");
    
    
    /**
     * Gets the "OTPMessage" element
     */
    public java.lang.String getOTPMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OTPMESSAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "OTPMessage" element
     */
    public org.apache.xmlbeans.XmlString xgetOTPMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OTPMESSAGE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "OTPMessage" element
     */
    public void setOTPMessage(java.lang.String otpMessage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OTPMESSAGE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OTPMESSAGE$0);
            }
            target.setStringValue(otpMessage);
        }
    }
    
    /**
     * Sets (as xml) the "OTPMessage" element
     */
    public void xsetOTPMessage(org.apache.xmlbeans.XmlString otpMessage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OTPMESSAGE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OTPMESSAGE$0);
            }
            target.set(otpMessage);
        }
    }
}
