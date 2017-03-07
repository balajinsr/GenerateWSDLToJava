/*
 * An XML document type.
 * Localname: ARCRequest
 * Namespace: ARCRequestTargetNamespace.xsd
 * Java type: xsd.arcrequesttargetnamespace.ARCRequestDocument
 *
 * Automatically generated - do not modify.
 */
package xsd.arcrequesttargetnamespace.impl;
/**
 * A document containing one ARCRequest(@ARCRequestTargetNamespace.xsd) element.
 *
 * This is a complex type.
 */
public class ARCRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements xsd.arcrequesttargetnamespace.ARCRequestDocument
{
    
    public ARCRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARCREQUEST$0 = 
        new javax.xml.namespace.QName("ARCRequestTargetNamespace.xsd", "ARCRequest");
    
    
    /**
     * Gets the "ARCRequest" element
     */
    public xsd.arcrequesttargetnamespace.ARCRequestDocument.ARCRequest getARCRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            xsd.arcrequesttargetnamespace.ARCRequestDocument.ARCRequest target = null;
            target = (xsd.arcrequesttargetnamespace.ARCRequestDocument.ARCRequest)get_store().find_element_user(ARCREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ARCRequest" element
     */
    public void setARCRequest(xsd.arcrequesttargetnamespace.ARCRequestDocument.ARCRequest arcRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            xsd.arcrequesttargetnamespace.ARCRequestDocument.ARCRequest target = null;
            target = (xsd.arcrequesttargetnamespace.ARCRequestDocument.ARCRequest)get_store().find_element_user(ARCREQUEST$0, 0);
            if (target == null)
            {
                target = (xsd.arcrequesttargetnamespace.ARCRequestDocument.ARCRequest)get_store().add_element_user(ARCREQUEST$0);
            }
            target.set(arcRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "ARCRequest" element
     */
    public xsd.arcrequesttargetnamespace.ARCRequestDocument.ARCRequest addNewARCRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            xsd.arcrequesttargetnamespace.ARCRequestDocument.ARCRequest target = null;
            target = (xsd.arcrequesttargetnamespace.ARCRequestDocument.ARCRequest)get_store().add_element_user(ARCREQUEST$0);
            return target;
        }
    }
    /**
     * An XML ARCRequest(@ARCRequestTargetNamespace.xsd).
     *
     * This is a complex type.
     */
    public static class ARCRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements xsd.arcrequesttargetnamespace.ARCRequestDocument.ARCRequest
    {
        
        public ARCRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName HEADER$0 = 
            new javax.xml.namespace.QName("ARCRequestTargetNamespace.xsd", "Header");
        private static final javax.xml.namespace.QName BODY$2 = 
            new javax.xml.namespace.QName("ARCRequestTargetNamespace.xsd", "Body");
        
        
        /**
         * Gets the "Header" element
         */
        public xsd.arcrequesttargetnamespace.HeaderDocument.Header getHeader()
        {
            synchronized (monitor())
            {
                check_orphaned();
                xsd.arcrequesttargetnamespace.HeaderDocument.Header target = null;
                target = (xsd.arcrequesttargetnamespace.HeaderDocument.Header)get_store().find_element_user(HEADER$0, 0);
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
        public void setHeader(xsd.arcrequesttargetnamespace.HeaderDocument.Header header)
        {
            synchronized (monitor())
            {
                check_orphaned();
                xsd.arcrequesttargetnamespace.HeaderDocument.Header target = null;
                target = (xsd.arcrequesttargetnamespace.HeaderDocument.Header)get_store().find_element_user(HEADER$0, 0);
                if (target == null)
                {
                    target = (xsd.arcrequesttargetnamespace.HeaderDocument.Header)get_store().add_element_user(HEADER$0);
                }
                target.set(header);
            }
        }
        
        /**
         * Appends and returns a new empty "Header" element
         */
        public xsd.arcrequesttargetnamespace.HeaderDocument.Header addNewHeader()
        {
            synchronized (monitor())
            {
                check_orphaned();
                xsd.arcrequesttargetnamespace.HeaderDocument.Header target = null;
                target = (xsd.arcrequesttargetnamespace.HeaderDocument.Header)get_store().add_element_user(HEADER$0);
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
        public xsd.arcrequesttargetnamespace.BodyDocument.Body getBody()
        {
            synchronized (monitor())
            {
                check_orphaned();
                xsd.arcrequesttargetnamespace.BodyDocument.Body target = null;
                target = (xsd.arcrequesttargetnamespace.BodyDocument.Body)get_store().find_element_user(BODY$2, 0);
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
                target = (xsd.arcrequesttargetnamespace.BodyDocument.Body)get_store().find_element_user(BODY$2, 0);
                if (target == null)
                {
                    target = (xsd.arcrequesttargetnamespace.BodyDocument.Body)get_store().add_element_user(BODY$2);
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
                target = (xsd.arcrequesttargetnamespace.BodyDocument.Body)get_store().add_element_user(BODY$2);
                return target;
            }
        }
    }
}
