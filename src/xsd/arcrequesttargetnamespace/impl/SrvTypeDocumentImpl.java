/*
 * An XML document type.
 * Localname: SrvType
 * Namespace: ARCRequestTargetNamespace.xsd
 * Java type: xsd.arcrequesttargetnamespace.SrvTypeDocument
 *
 * Automatically generated - do not modify.
 */
package xsd.arcrequesttargetnamespace.impl;
/**
 * A document containing one SrvType(@ARCRequestTargetNamespace.xsd) element.
 *
 * This is a complex type.
 */
public class SrvTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements xsd.arcrequesttargetnamespace.SrvTypeDocument
{
    
    public SrvTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SRVTYPE$0 = 
        new javax.xml.namespace.QName("ARCRequestTargetNamespace.xsd", "SrvType");
    
    
    /**
     * Gets the "SrvType" element
     */
    public java.lang.String getSrvType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SRVTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SrvType" element
     */
    public org.apache.xmlbeans.XmlString xgetSrvType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SRVTYPE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "SrvType" element
     */
    public void setSrvType(java.lang.String srvType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SRVTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SRVTYPE$0);
            }
            target.setStringValue(srvType);
        }
    }
    
    /**
     * Sets (as xml) the "SrvType" element
     */
    public void xsetSrvType(org.apache.xmlbeans.XmlString srvType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SRVTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SRVTYPE$0);
            }
            target.set(srvType);
        }
    }
}
