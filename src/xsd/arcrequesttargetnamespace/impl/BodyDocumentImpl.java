/*
 * An XML document type.
 * Localname: Body
 * Namespace: ARCRequestTargetNamespace.xsd
 * Java type: xsd.arcrequesttargetnamespace.BodyDocument
 *
 * Automatically generated - do not modify.
 */
package xsd.arcrequesttargetnamespace.impl;
/**
 * A document containing one Body(@ARCRequestTargetNamespace.xsd) element.
 *
 * This is a complex type.
 */
public class BodyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements xsd.arcrequesttargetnamespace.BodyDocument
{
    
    public BodyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BODY$0 = 
        new javax.xml.namespace.QName("ARCRequestTargetNamespace.xsd", "Body");
    
    
    /**
     * Gets the "Body" element
     */
    public xsd.arcrequesttargetnamespace.BodyDocument.Body getBody()
    {
        synchronized (monitor())
        {
            check_orphaned();
            xsd.arcrequesttargetnamespace.BodyDocument.Body target = null;
            target = (xsd.arcrequesttargetnamespace.BodyDocument.Body)get_store().find_element_user(BODY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Body" element
     */
    public void setBody(xsd.arcrequesttargetnamespace.BodyDocument.Body body)
    {
        synchronized (monitor())
        {
            check_orphaned();
            xsd.arcrequesttargetnamespace.BodyDocument.Body target = null;
            target = (xsd.arcrequesttargetnamespace.BodyDocument.Body)get_store().find_element_user(BODY$0, 0);
            if (target == null)
            {
                target = (xsd.arcrequesttargetnamespace.BodyDocument.Body)get_store().add_element_user(BODY$0);
            }
            target.set(body);
        }
    }
    
    /**
     * Appends and returns a new empty "Body" element
     */
    public xsd.arcrequesttargetnamespace.BodyDocument.Body addNewBody()
    {
        synchronized (monitor())
        {
            check_orphaned();
            xsd.arcrequesttargetnamespace.BodyDocument.Body target = null;
            target = (xsd.arcrequesttargetnamespace.BodyDocument.Body)get_store().add_element_user(BODY$0);
            return target;
        }
    }
    /**
     * An XML Body(@ARCRequestTargetNamespace.xsd).
     *
     * This is a complex type.
     */
    public static class BodyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements xsd.arcrequesttargetnamespace.BodyDocument.Body
    {
        
        public BodyImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName OTPSENDREQ$0 = 
            new javax.xml.namespace.QName("ARCRequestTargetNamespace.xsd", "OTPSendReq");
        
        
        /**
         * Gets the "OTPSendReq" element
         */
        public xsd.arcrequesttargetnamespace.OTPSendReqDocument.OTPSendReq getOTPSendReq()
        {
            synchronized (monitor())
            {
                check_orphaned();
                xsd.arcrequesttargetnamespace.OTPSendReqDocument.OTPSendReq target = null;
                target = (xsd.arcrequesttargetnamespace.OTPSendReqDocument.OTPSendReq)get_store().find_element_user(OTPSENDREQ$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "OTPSendReq" element
         */
        public void setOTPSendReq(xsd.arcrequesttargetnamespace.OTPSendReqDocument.OTPSendReq otpSendReq)
        {
            synchronized (monitor())
            {
                check_orphaned();
                xsd.arcrequesttargetnamespace.OTPSendReqDocument.OTPSendReq target = null;
                target = (xsd.arcrequesttargetnamespace.OTPSendReqDocument.OTPSendReq)get_store().find_element_user(OTPSENDREQ$0, 0);
                if (target == null)
                {
                    target = (xsd.arcrequesttargetnamespace.OTPSendReqDocument.OTPSendReq)get_store().add_element_user(OTPSENDREQ$0);
                }
                target.set(otpSendReq);
            }
        }
        
        /**
         * Appends and returns a new empty "OTPSendReq" element
         */
        public xsd.arcrequesttargetnamespace.OTPSendReqDocument.OTPSendReq addNewOTPSendReq()
        {
            synchronized (monitor())
            {
                check_orphaned();
                xsd.arcrequesttargetnamespace.OTPSendReqDocument.OTPSendReq target = null;
                target = (xsd.arcrequesttargetnamespace.OTPSendReqDocument.OTPSendReq)get_store().add_element_user(OTPSENDREQ$0);
                return target;
            }
        }
    }
}
