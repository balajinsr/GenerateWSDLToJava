/*
 * An XML document type.
 * Localname: TrackingId
 * Namespace: ARCRequestTargetNamespace.xsd
 * Java type: xsd.arcrequesttargetnamespace.TrackingIdDocument
 *
 * Automatically generated - do not modify.
 */
package xsd.arcrequesttargetnamespace.impl;
/**
 * A document containing one TrackingId(@ARCRequestTargetNamespace.xsd) element.
 *
 * This is a complex type.
 */
public class TrackingIdDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements xsd.arcrequesttargetnamespace.TrackingIdDocument
{
    
    public TrackingIdDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TRACKINGID$0 = 
        new javax.xml.namespace.QName("ARCRequestTargetNamespace.xsd", "TrackingId");
    
    
    /**
     * Gets the "TrackingId" element
     */
    public java.lang.String getTrackingId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRACKINGID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "TrackingId" element
     */
    public org.apache.xmlbeans.XmlString xgetTrackingId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TRACKINGID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "TrackingId" element
     */
    public void setTrackingId(java.lang.String trackingId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRACKINGID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TRACKINGID$0);
            }
            target.setStringValue(trackingId);
        }
    }
    
    /**
     * Sets (as xml) the "TrackingId" element
     */
    public void xsetTrackingId(org.apache.xmlbeans.XmlString trackingId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TRACKINGID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TRACKINGID$0);
            }
            target.set(trackingId);
        }
    }
}
