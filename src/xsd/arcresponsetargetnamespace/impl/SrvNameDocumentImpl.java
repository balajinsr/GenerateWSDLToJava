/*
 * An XML document type.
 * Localname: SrvName
 * Namespace: ARCResponseTargetNamespace.xsd
 * Java type: xsd.arcresponsetargetnamespace.SrvNameDocument
 *
 * Automatically generated - do not modify.
 */
package xsd.arcresponsetargetnamespace.impl;
/**
 * A document containing one SrvName(@ARCResponseTargetNamespace.xsd) element.
 *
 * This is a complex type.
 */
public class SrvNameDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements xsd.arcresponsetargetnamespace.SrvNameDocument
{
    
    public SrvNameDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SRVNAME$0 = 
        new javax.xml.namespace.QName("ARCResponseTargetNamespace.xsd", "SrvName");
    
    
    /**
     * Gets the "SrvName" element
     */
    public java.lang.String getSrvName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SRVNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SrvName" element
     */
    public org.apache.xmlbeans.XmlString xgetSrvName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SRVNAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "SrvName" element
     */
    public void setSrvName(java.lang.String srvName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SRVNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SRVNAME$0);
            }
            target.setStringValue(srvName);
        }
    }
    
    /**
     * Sets (as xml) the "SrvName" element
     */
    public void xsetSrvName(org.apache.xmlbeans.XmlString srvName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SRVNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SRVNAME$0);
            }
            target.set(srvName);
        }
    }
}
