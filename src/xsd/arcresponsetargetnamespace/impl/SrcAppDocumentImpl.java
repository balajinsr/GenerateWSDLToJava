/*
 * An XML document type.
 * Localname: SrcApp
 * Namespace: ARCResponseTargetNamespace.xsd
 * Java type: xsd.arcresponsetargetnamespace.SrcAppDocument
 *
 * Automatically generated - do not modify.
 */
package xsd.arcresponsetargetnamespace.impl;
/**
 * A document containing one SrcApp(@ARCResponseTargetNamespace.xsd) element.
 *
 * This is a complex type.
 */
public class SrcAppDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements xsd.arcresponsetargetnamespace.SrcAppDocument
{
    
    public SrcAppDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SRCAPP$0 = 
        new javax.xml.namespace.QName("ARCResponseTargetNamespace.xsd", "SrcApp");
    
    
    /**
     * Gets the "SrcApp" element
     */
    public java.lang.String getSrcApp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SRCAPP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SrcApp" element
     */
    public org.apache.xmlbeans.XmlString xgetSrcApp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SRCAPP$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "SrcApp" element
     */
    public void setSrcApp(java.lang.String srcApp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SRCAPP$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SRCAPP$0);
            }
            target.setStringValue(srcApp);
        }
    }
    
    /**
     * Sets (as xml) the "SrcApp" element
     */
    public void xsetSrcApp(org.apache.xmlbeans.XmlString srcApp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SRCAPP$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SRCAPP$0);
            }
            target.set(srcApp);
        }
    }
}
