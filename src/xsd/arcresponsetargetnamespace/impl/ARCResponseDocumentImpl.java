/*
 * An XML document type.
 * Localname: ARCResponse
 * Namespace: ARCResponseTargetNamespace.xsd
 * Java type: xsd.arcresponsetargetnamespace.ARCResponseDocument
 *
 * Automatically generated - do not modify.
 */
package xsd.arcresponsetargetnamespace.impl;
/**
 * A document containing one ARCResponse(@ARCResponseTargetNamespace.xsd) element.
 *
 * This is a complex type.
 */
public class ARCResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements xsd.arcresponsetargetnamespace.ARCResponseDocument
{
    
    public ARCResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARCRESPONSE$0 = 
        new javax.xml.namespace.QName("ARCResponseTargetNamespace.xsd", "ARCResponse");
    
    
    /**
     * Gets the "ARCResponse" element
     */
    public xsd.arcresponsetargetnamespace.ARCResponseDocument.ARCResponse getARCResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            xsd.arcresponsetargetnamespace.ARCResponseDocument.ARCResponse target = null;
            target = (xsd.arcresponsetargetnamespace.ARCResponseDocument.ARCResponse)get_store().find_element_user(ARCRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ARCResponse" element
     */
    public void setARCResponse(xsd.arcresponsetargetnamespace.ARCResponseDocument.ARCResponse arcResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            xsd.arcresponsetargetnamespace.ARCResponseDocument.ARCResponse target = null;
            target = (xsd.arcresponsetargetnamespace.ARCResponseDocument.ARCResponse)get_store().find_element_user(ARCRESPONSE$0, 0);
            if (target == null)
            {
                target = (xsd.arcresponsetargetnamespace.ARCResponseDocument.ARCResponse)get_store().add_element_user(ARCRESPONSE$0);
            }
            target.set(arcResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "ARCResponse" element
     */
    public xsd.arcresponsetargetnamespace.ARCResponseDocument.ARCResponse addNewARCResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            xsd.arcresponsetargetnamespace.ARCResponseDocument.ARCResponse target = null;
            target = (xsd.arcresponsetargetnamespace.ARCResponseDocument.ARCResponse)get_store().add_element_user(ARCRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML ARCResponse(@ARCResponseTargetNamespace.xsd).
     *
     * This is a complex type.
     */
    public static class ARCResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements xsd.arcresponsetargetnamespace.ARCResponseDocument.ARCResponse
    {
        
        public ARCResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName HEADER$0 = 
            new javax.xml.namespace.QName("ARCResponseTargetNamespace.xsd", "Header");
        private static final javax.xml.namespace.QName BODY$2 = 
            new javax.xml.namespace.QName("ARCResponseTargetNamespace.xsd", "Body");
        
        
        /**
         * Gets the "Header" element
         */
        public xsd.arcresponsetargetnamespace.HeaderDocument.Header getHeader()
        {
            synchronized (monitor())
            {
                check_orphaned();
                xsd.arcresponsetargetnamespace.HeaderDocument.Header target = null;
                target = (xsd.arcresponsetargetnamespace.HeaderDocument.Header)get_store().find_element_user(HEADER$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "Header" element
         */
        public boolean isSetHeader()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(HEADER$0) != 0;
            }
        }
        
        /**
         * Sets the "Header" element
         */
        public void setHeader(xsd.arcresponsetargetnamespace.HeaderDocument.Header header)
        {
            synchronized (monitor())
            {
                check_orphaned();
                xsd.arcresponsetargetnamespace.HeaderDocument.Header target = null;
                target = (xsd.arcresponsetargetnamespace.HeaderDocument.Header)get_store().find_element_user(HEADER$0, 0);
                if (target == null)
                {
                    target = (xsd.arcresponsetargetnamespace.HeaderDocument.Header)get_store().add_element_user(HEADER$0);
                }
                target.set(header);
            }
        }
        
        /**
         * Appends and returns a new empty "Header" element
         */
        public xsd.arcresponsetargetnamespace.HeaderDocument.Header addNewHeader()
        {
            synchronized (monitor())
            {
                check_orphaned();
                xsd.arcresponsetargetnamespace.HeaderDocument.Header target = null;
                target = (xsd.arcresponsetargetnamespace.HeaderDocument.Header)get_store().add_element_user(HEADER$0);
                return target;
            }
        }
        
        /**
         * Unsets the "Header" element
         */
        public void unsetHeader()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(HEADER$0, 0);
            }
        }
        
        /**
         * Gets the "Body" element
         */
        public xsd.arcresponsetargetnamespace.ARCResponseDocument.ARCResponse.Body getBody()
        {
            synchronized (monitor())
            {
                check_orphaned();
                xsd.arcresponsetargetnamespace.ARCResponseDocument.ARCResponse.Body target = null;
                target = (xsd.arcresponsetargetnamespace.ARCResponseDocument.ARCResponse.Body)get_store().find_element_user(BODY$2, 0);
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
        public void setBody(xsd.arcresponsetargetnamespace.ARCResponseDocument.ARCResponse.Body body)
        {
            synchronized (monitor())
            {
                check_orphaned();
                xsd.arcresponsetargetnamespace.ARCResponseDocument.ARCResponse.Body target = null;
                target = (xsd.arcresponsetargetnamespace.ARCResponseDocument.ARCResponse.Body)get_store().find_element_user(BODY$2, 0);
                if (target == null)
                {
                    target = (xsd.arcresponsetargetnamespace.ARCResponseDocument.ARCResponse.Body)get_store().add_element_user(BODY$2);
                }
                target.set(body);
            }
        }
        
        /**
         * Appends and returns a new empty "Body" element
         */
        public xsd.arcresponsetargetnamespace.ARCResponseDocument.ARCResponse.Body addNewBody()
        {
            synchronized (monitor())
            {
                check_orphaned();
                xsd.arcresponsetargetnamespace.ARCResponseDocument.ARCResponse.Body target = null;
                target = (xsd.arcresponsetargetnamespace.ARCResponseDocument.ARCResponse.Body)get_store().add_element_user(BODY$2);
                return target;
            }
        }
        /**
         * An XML Body(@ARCResponseTargetNamespace.xsd).
         *
         * This is a complex type.
         */
        public static class BodyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements xsd.arcresponsetargetnamespace.ARCResponseDocument.ARCResponse.Body
        {
            
            public BodyImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName EXCEPTIONDETAILS$0 = 
                new javax.xml.namespace.QName("ARCResponseTargetNamespace.xsd", "ExceptionDetails");
            
            
            /**
             * Gets the "ExceptionDetails" element
             */
            public xsd.arcresponsetargetnamespace.ErrorMessageType getExceptionDetails()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    xsd.arcresponsetargetnamespace.ErrorMessageType target = null;
                    target = (xsd.arcresponsetargetnamespace.ErrorMessageType)get_store().find_element_user(EXCEPTIONDETAILS$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "ExceptionDetails" element
             */
            public void setExceptionDetails(xsd.arcresponsetargetnamespace.ErrorMessageType exceptionDetails)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    xsd.arcresponsetargetnamespace.ErrorMessageType target = null;
                    target = (xsd.arcresponsetargetnamespace.ErrorMessageType)get_store().find_element_user(EXCEPTIONDETAILS$0, 0);
                    if (target == null)
                    {
                      target = (xsd.arcresponsetargetnamespace.ErrorMessageType)get_store().add_element_user(EXCEPTIONDETAILS$0);
                    }
                    target.set(exceptionDetails);
                }
            }
            
            /**
             * Appends and returns a new empty "ExceptionDetails" element
             */
            public xsd.arcresponsetargetnamespace.ErrorMessageType addNewExceptionDetails()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    xsd.arcresponsetargetnamespace.ErrorMessageType target = null;
                    target = (xsd.arcresponsetargetnamespace.ErrorMessageType)get_store().add_element_user(EXCEPTIONDETAILS$0);
                    return target;
                }
            }
        }
    }
}
