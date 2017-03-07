/*
 * An XML document type.
 * Localname: Header
 * Namespace: ARCRequestTargetNamespace.xsd
 * Java type: xsd.arcrequesttargetnamespace.HeaderDocument
 *
 * Automatically generated - do not modify.
 */
package xsd.arcrequesttargetnamespace.impl;
/**
 * A document containing one Header(@ARCRequestTargetNamespace.xsd) element.
 *
 * This is a complex type.
 */
public class HeaderDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements xsd.arcrequesttargetnamespace.HeaderDocument
{
    
    public HeaderDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HEADER$0 = 
        new javax.xml.namespace.QName("ARCRequestTargetNamespace.xsd", "Header");
    
    
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
     * An XML Header(@ARCRequestTargetNamespace.xsd).
     *
     * This is a complex type.
     */
    public static class HeaderImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements xsd.arcrequesttargetnamespace.HeaderDocument.Header
    {
        
        public HeaderImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName VERSION$0 = 
            new javax.xml.namespace.QName("ARCRequestTargetNamespace.xsd", "Version");
        private static final javax.xml.namespace.QName SRVTYPE$2 = 
            new javax.xml.namespace.QName("ARCRequestTargetNamespace.xsd", "SrvType");
        private static final javax.xml.namespace.QName SRVNAME$4 = 
            new javax.xml.namespace.QName("ARCRequestTargetNamespace.xsd", "SrvName");
        private static final javax.xml.namespace.QName SRCAPP$6 = 
            new javax.xml.namespace.QName("ARCRequestTargetNamespace.xsd", "SrcApp");
        private static final javax.xml.namespace.QName TARGETAPP$8 = 
            new javax.xml.namespace.QName("ARCRequestTargetNamespace.xsd", "TargetApp");
        private static final javax.xml.namespace.QName TIMESTAMP$10 = 
            new javax.xml.namespace.QName("ARCRequestTargetNamespace.xsd", "Timestamp");
        private static final javax.xml.namespace.QName SRCMSGID$12 = 
            new javax.xml.namespace.QName("ARCRequestTargetNamespace.xsd", "SrcMsgId");
        private static final javax.xml.namespace.QName TRACKINGID$14 = 
            new javax.xml.namespace.QName("ARCRequestTargetNamespace.xsd", "TrackingId");
        private static final javax.xml.namespace.QName ORGID$16 = 
            new javax.xml.namespace.QName("ARCRequestTargetNamespace.xsd", "OrgId");
        
        
        /**
         * Gets the "Version" element
         */
        public java.lang.String getVersion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERSION$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Version" element
         */
        public org.apache.xmlbeans.XmlString xgetVersion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VERSION$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Version" element
         */
        public void setVersion(java.lang.String version)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERSION$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VERSION$0);
                }
                target.setStringValue(version);
            }
        }
        
        /**
         * Sets (as xml) the "Version" element
         */
        public void xsetVersion(org.apache.xmlbeans.XmlString version)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VERSION$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VERSION$0);
                }
                target.set(version);
            }
        }
        
        /**
         * Gets the "SrvType" element
         */
        public java.lang.String getSrvType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SRVTYPE$2, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SRVTYPE$2, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SRVTYPE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SRVTYPE$2);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SRVTYPE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SRVTYPE$2);
                }
                target.set(srvType);
            }
        }
        
        /**
         * Gets the "SrvName" element
         */
        public java.lang.String getSrvName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SRVNAME$4, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SRVNAME$4, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SRVNAME$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SRVNAME$4);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SRVNAME$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SRVNAME$4);
                }
                target.set(srvName);
            }
        }
        
        /**
         * Gets the "SrcApp" element
         */
        public java.lang.String getSrcApp()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SRCAPP$6, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SRCAPP$6, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SRCAPP$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SRCAPP$6);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SRCAPP$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SRCAPP$6);
                }
                target.set(srcApp);
            }
        }
        
        /**
         * Gets the "TargetApp" element
         */
        public java.lang.String getTargetApp()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGETAPP$8, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TARGETAPP$8, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGETAPP$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TARGETAPP$8);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TARGETAPP$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TARGETAPP$8);
                }
                target.set(targetApp);
            }
        }
        
        /**
         * Gets the "Timestamp" element
         */
        public java.lang.String getTimestamp()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIMESTAMP$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Timestamp" element
         */
        public org.apache.xmlbeans.XmlString xgetTimestamp()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TIMESTAMP$10, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Timestamp" element
         */
        public void setTimestamp(java.lang.String timestamp)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIMESTAMP$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIMESTAMP$10);
                }
                target.setStringValue(timestamp);
            }
        }
        
        /**
         * Sets (as xml) the "Timestamp" element
         */
        public void xsetTimestamp(org.apache.xmlbeans.XmlString timestamp)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TIMESTAMP$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TIMESTAMP$10);
                }
                target.set(timestamp);
            }
        }
        
        /**
         * Gets the "SrcMsgId" element
         */
        public java.lang.String getSrcMsgId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SRCMSGID$12, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SRCMSGID$12, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SRCMSGID$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SRCMSGID$12);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SRCMSGID$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SRCMSGID$12);
                }
                target.set(srcMsgId);
            }
        }
        
        /**
         * Gets the "TrackingId" element
         */
        public java.lang.String getTrackingId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRACKINGID$14, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TRACKINGID$14, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRACKINGID$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TRACKINGID$14);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TRACKINGID$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TRACKINGID$14);
                }
                target.set(trackingId);
            }
        }
        
        /**
         * Gets the "OrgId" element
         */
        public java.lang.String getOrgId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGID$16, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORGID$16, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGID$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORGID$16);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORGID$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ORGID$16);
                }
                target.set(orgId);
            }
        }
    }
}
