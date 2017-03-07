/*
 * An XML document type.
 * Localname: CardNo
 * Namespace: ARCRequestTargetNamespace.xsd
 * Java type: xsd.arcrequesttargetnamespace.CardNoDocument
 *
 * Automatically generated - do not modify.
 */
package xsd.arcrequesttargetnamespace.impl;
/**
 * A document containing one CardNo(@ARCRequestTargetNamespace.xsd) element.
 *
 * This is a complex type.
 */
public class CardNoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements xsd.arcrequesttargetnamespace.CardNoDocument
{
    
    public CardNoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CARDNO$0 = 
        new javax.xml.namespace.QName("ARCRequestTargetNamespace.xsd", "CardNo");
    
    
    /**
     * Gets the "CardNo" element
     */
    public java.lang.String getCardNo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CARDNO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CardNo" element
     */
    public org.apache.xmlbeans.XmlString xgetCardNo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CARDNO$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "CardNo" element
     */
    public void setCardNo(java.lang.String cardNo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CARDNO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CARDNO$0);
            }
            target.setStringValue(cardNo);
        }
    }
    
    /**
     * Sets (as xml) the "CardNo" element
     */
    public void xsetCardNo(org.apache.xmlbeans.XmlString cardNo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CARDNO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CARDNO$0);
            }
            target.set(cardNo);
        }
    }
}
