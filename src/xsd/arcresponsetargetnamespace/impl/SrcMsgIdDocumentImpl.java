/*
 * An XML document type.
 * Localname: SrcMsgId
 * Namespace: ARCResponseTargetNamespace.xsd
 * Java type: xsd.arcresponsetargetnamespace.SrcMsgIdDocument
 *
 * Automatically generated - do not modify.
 */
package xsd.arcresponsetargetnamespace.impl;
/**
 * A document containing one SrcMsgId(@ARCResponseTargetNamespace.xsd) element.
 *
 * This is a complex type.
 */
public class SrcMsgIdDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements xsd.arcresponsetargetnamespace.SrcMsgIdDocument
{
    
    public SrcMsgIdDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SRCMSGID$0 = 
        new javax.xml.namespace.QName("ARCResponseTargetNamespace.xsd", "SrcMsgId");
    
    
    /**
     * Gets the "SrcMsgId" element
     */
    public java.lang.String getSrcMsgId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SRCMSGID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SrcMsgId" element
     */
    public org.apache.xmlbeans.XmlString xgetSrcMsgId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SRCMSGID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "SrcMsgId" element
     */
    public void setSrcMsgId(java.lang.String srcMsgId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SRCMSGID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SRCMSGID$0);
            }
            target.setStringValue(srcMsgId);
        }
    }
    
    /**
     * Sets (as xml) the "SrcMsgId" element
     */
    public void xsetSrcMsgId(org.apache.xmlbeans.XmlString srcMsgId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SRCMSGID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SRCMSGID$0);
            }
            target.set(srcMsgId);
        }
    }
}
