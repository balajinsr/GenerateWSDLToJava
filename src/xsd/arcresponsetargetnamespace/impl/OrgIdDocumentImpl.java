/*
 * An XML document type.
 * Localname: OrgId
 * Namespace: ARCResponseTargetNamespace.xsd
 * Java type: xsd.arcresponsetargetnamespace.OrgIdDocument
 *
 * Automatically generated - do not modify.
 */
package xsd.arcresponsetargetnamespace.impl;
/**
 * A document containing one OrgId(@ARCResponseTargetNamespace.xsd) element.
 *
 * This is a complex type.
 */
public class OrgIdDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements xsd.arcresponsetargetnamespace.OrgIdDocument
{
    
    public OrgIdDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORGID$0 = 
        new javax.xml.namespace.QName("ARCResponseTargetNamespace.xsd", "OrgId");
    
    
    /**
     * Gets the "OrgId" element
     */
    public java.lang.String getOrgId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "OrgId" element
     */
    public org.apache.xmlbeans.XmlString xgetOrgId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORGID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "OrgId" element
     */
    public void setOrgId(java.lang.String orgId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORGID$0);
            }
            target.setStringValue(orgId);
        }
    }
    
    /**
     * Sets (as xml) the "OrgId" element
     */
    public void xsetOrgId(org.apache.xmlbeans.XmlString orgId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORGID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ORGID$0);
            }
            target.set(orgId);
        }
    }
}
