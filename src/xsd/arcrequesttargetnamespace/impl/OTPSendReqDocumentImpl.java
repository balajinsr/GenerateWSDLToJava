/*
 * An XML document type.
 * Localname: OTPSendReq
 * Namespace: ARCRequestTargetNamespace.xsd
 * Java type: xsd.arcrequesttargetnamespace.OTPSendReqDocument
 *
 * Automatically generated - do not modify.
 */
package xsd.arcrequesttargetnamespace.impl;
/**
 * A document containing one OTPSendReq(@ARCRequestTargetNamespace.xsd) element.
 *
 * This is a complex type.
 */
public class OTPSendReqDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements xsd.arcrequesttargetnamespace.OTPSendReqDocument
{
    
    public OTPSendReqDocumentImpl(org.apache.xmlbeans.SchemaType sType)
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
    /**
     * An XML OTPSendReq(@ARCRequestTargetNamespace.xsd).
     *
     * This is a complex type.
     */
    public static class OTPSendReqImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements xsd.arcrequesttargetnamespace.OTPSendReqDocument.OTPSendReq
    {
        
        public OTPSendReqImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CARDNO$0 = 
            new javax.xml.namespace.QName("ARCRequestTargetNamespace.xsd", "CardNo");
        private static final javax.xml.namespace.QName OTPMESSAGE$2 = 
            new javax.xml.namespace.QName("ARCRequestTargetNamespace.xsd", "OTPMessage");
        private static final javax.xml.namespace.QName LANGUAGEINDICATOR$4 = 
            new javax.xml.namespace.QName("ARCRequestTargetNamespace.xsd", "Language_Indicator");
        
        
        /**
         * Gets the "CardNo" element
         */
        public java.lang.String getCardNo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CARDNO$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "CardNo" element
         */
        public org.apache.xmlbeans.XmlString xgetCardNo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CARDNO$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "CardNo" element
         */
        public void setCardNo(java.lang.String cardNo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CARDNO$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CARDNO$0);
                }
                target.setStringValue(cardNo);
            }
        }
        
        /**
         * Sets (as xml) the "CardNo" element
         */
        public void xsetCardNo(org.apache.xmlbeans.XmlString cardNo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CARDNO$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CARDNO$0);
                }
                target.set(cardNo);
            }
        }
        
        /**
         * Gets the "OTPMessage" element
         */
        public java.lang.String getOTPMessage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OTPMESSAGE$2, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OTPMESSAGE$2, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OTPMESSAGE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OTPMESSAGE$2);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OTPMESSAGE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OTPMESSAGE$2);
                }
                target.set(otpMessage);
            }
        }
        
        /**
         * Gets the "Language_Indicator" element
         */
        public java.lang.String getLanguageIndicator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LANGUAGEINDICATOR$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Language_Indicator" element
         */
        public org.apache.xmlbeans.XmlString xgetLanguageIndicator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LANGUAGEINDICATOR$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "Language_Indicator" element
         */
        public boolean isSetLanguageIndicator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LANGUAGEINDICATOR$4) != 0;
            }
        }
        
        /**
         * Sets the "Language_Indicator" element
         */
        public void setLanguageIndicator(java.lang.String languageIndicator)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LANGUAGEINDICATOR$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LANGUAGEINDICATOR$4);
                }
                target.setStringValue(languageIndicator);
            }
        }
        
        /**
         * Sets (as xml) the "Language_Indicator" element
         */
        public void xsetLanguageIndicator(org.apache.xmlbeans.XmlString languageIndicator)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LANGUAGEINDICATOR$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LANGUAGEINDICATOR$4);
                }
                target.set(languageIndicator);
            }
        }
        
        /**
         * Unsets the "Language_Indicator" element
         */
        public void unsetLanguageIndicator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LANGUAGEINDICATOR$4, 0);
            }
        }
    }
}
