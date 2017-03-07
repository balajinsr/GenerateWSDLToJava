/*
 * An XML document type.
 * Localname: InstanceId
 * Namespace: ARCRequestTargetNamespace.xsd
 * Java type: xsd.arcrequesttargetnamespace.InstanceIdDocument
 *
 * Automatically generated - do not modify.
 */
package xsd.arcrequesttargetnamespace.impl;
/**
 * A document containing one InstanceId(@ARCRequestTargetNamespace.xsd) element.
 *
 * This is a complex type.
 */
public class InstanceIdDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements xsd.arcrequesttargetnamespace.InstanceIdDocument
{
    
    public InstanceIdDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INSTANCEID$0 = 
        new javax.xml.namespace.QName("ARCRequestTargetNamespace.xsd", "InstanceId");
    
    
    /**
     * Gets the "InstanceId" element
     */
    public java.lang.String getInstanceId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INSTANCEID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "InstanceId" element
     */
    public org.apache.xmlbeans.XmlString xgetInstanceId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INSTANCEID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "InstanceId" element
     */
    public void setInstanceId(java.lang.String instanceId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INSTANCEID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INSTANCEID$0);
            }
            target.setStringValue(instanceId);
        }
    }
    
    /**
     * Sets (as xml) the "InstanceId" element
     */
    public void xsetInstanceId(org.apache.xmlbeans.XmlString instanceId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INSTANCEID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INSTANCEID$0);
            }
            target.set(instanceId);
        }
    }
}
