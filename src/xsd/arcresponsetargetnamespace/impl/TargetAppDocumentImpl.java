/*
 * An XML document type.
 * Localname: TargetApp
 * Namespace: ARCResponseTargetNamespace.xsd
 * Java type: xsd.arcresponsetargetnamespace.TargetAppDocument
 *
 * Automatically generated - do not modify.
 */
package xsd.arcresponsetargetnamespace.impl;
/**
 * A document containing one TargetApp(@ARCResponseTargetNamespace.xsd) element.
 *
 * This is a complex type.
 */
public class TargetAppDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements xsd.arcresponsetargetnamespace.TargetAppDocument
{
    
    public TargetAppDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TARGETAPP$0 = 
        new javax.xml.namespace.QName("ARCResponseTargetNamespace.xsd", "TargetApp");
    
    
    /**
     * Gets the "TargetApp" element
     */
    public java.lang.String getTargetApp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGETAPP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "TargetApp" element
     */
    public org.apache.xmlbeans.XmlString xgetTargetApp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TARGETAPP$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "TargetApp" element
     */
    public void setTargetApp(java.lang.String targetApp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGETAPP$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TARGETAPP$0);
            }
            target.setStringValue(targetApp);
        }
    }
    
    /**
     * Sets (as xml) the "TargetApp" element
     */
    public void xsetTargetApp(org.apache.xmlbeans.XmlString targetApp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TARGETAPP$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TARGETAPP$0);
            }
            target.set(targetApp);
        }
    }
}
