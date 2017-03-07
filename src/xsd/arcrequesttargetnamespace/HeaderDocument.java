/*
 * An XML document type.
 * Localname: Header
 * Namespace: ARCRequestTargetNamespace.xsd
 * Java type: xsd.arcrequesttargetnamespace.HeaderDocument
 *
 * Automatically generated - do not modify.
 */
package xsd.arcrequesttargetnamespace;


/**
 * A document containing one Header(@ARCRequestTargetNamespace.xsd) element.
 *
 * This is a complex type.
 */
public interface HeaderDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(HeaderDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1383480092BB3B3330B840625D6C3273").resolveHandle("headerba0edoctype");
    
    /**
     * Gets the "Header" element
     */
    xsd.arcrequesttargetnamespace.HeaderDocument.Header getHeader();
    
    /**
     * Sets the "Header" element
     */
    void setHeader(xsd.arcrequesttargetnamespace.HeaderDocument.Header header);
    
    /**
     * Appends and returns a new empty "Header" element
     */
    xsd.arcrequesttargetnamespace.HeaderDocument.Header addNewHeader();
    
    /**
     * An XML Header(@ARCRequestTargetNamespace.xsd).
     *
     * This is a complex type.
     */
    public interface Header extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Header.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1383480092BB3B3330B840625D6C3273").resolveHandle("headerc4a5elemtype");
        
        /**
         * Gets the "Version" element
         */
        java.lang.String getVersion();
        
        /**
         * Gets (as xml) the "Version" element
         */
        org.apache.xmlbeans.XmlString xgetVersion();
        
        /**
         * Sets the "Version" element
         */
        void setVersion(java.lang.String version);
        
        /**
         * Sets (as xml) the "Version" element
         */
        void xsetVersion(org.apache.xmlbeans.XmlString version);
        
        /**
         * Gets the "SrvType" element
         */
        java.lang.String getSrvType();
        
        /**
         * Gets (as xml) the "SrvType" element
         */
        org.apache.xmlbeans.XmlString xgetSrvType();
        
        /**
         * Sets the "SrvType" element
         */
        void setSrvType(java.lang.String srvType);
        
        /**
         * Sets (as xml) the "SrvType" element
         */
        void xsetSrvType(org.apache.xmlbeans.XmlString srvType);
        
        /**
         * Gets the "SrvName" element
         */
        java.lang.String getSrvName();
        
        /**
         * Gets (as xml) the "SrvName" element
         */
        org.apache.xmlbeans.XmlString xgetSrvName();
        
        /**
         * Sets the "SrvName" element
         */
        void setSrvName(java.lang.String srvName);
        
        /**
         * Sets (as xml) the "SrvName" element
         */
        void xsetSrvName(org.apache.xmlbeans.XmlString srvName);
        
        /**
         * Gets the "SrcApp" element
         */
        java.lang.String getSrcApp();
        
        /**
         * Gets (as xml) the "SrcApp" element
         */
        org.apache.xmlbeans.XmlString xgetSrcApp();
        
        /**
         * Sets the "SrcApp" element
         */
        void setSrcApp(java.lang.String srcApp);
        
        /**
         * Sets (as xml) the "SrcApp" element
         */
        void xsetSrcApp(org.apache.xmlbeans.XmlString srcApp);
        
        /**
         * Gets the "TargetApp" element
         */
        java.lang.String getTargetApp();
        
        /**
         * Gets (as xml) the "TargetApp" element
         */
        org.apache.xmlbeans.XmlString xgetTargetApp();
        
        /**
         * Sets the "TargetApp" element
         */
        void setTargetApp(java.lang.String targetApp);
        
        /**
         * Sets (as xml) the "TargetApp" element
         */
        void xsetTargetApp(org.apache.xmlbeans.XmlString targetApp);
        
        /**
         * Gets the "Timestamp" element
         */
        java.lang.String getTimestamp();
        
        /**
         * Gets (as xml) the "Timestamp" element
         */
        org.apache.xmlbeans.XmlString xgetTimestamp();
        
        /**
         * Sets the "Timestamp" element
         */
        void setTimestamp(java.lang.String timestamp);
        
        /**
         * Sets (as xml) the "Timestamp" element
         */
        void xsetTimestamp(org.apache.xmlbeans.XmlString timestamp);
        
        /**
         * Gets the "SrcMsgId" element
         */
        java.lang.String getSrcMsgId();
        
        /**
         * Gets (as xml) the "SrcMsgId" element
         */
        org.apache.xmlbeans.XmlString xgetSrcMsgId();
        
        /**
         * Sets the "SrcMsgId" element
         */
        void setSrcMsgId(java.lang.String srcMsgId);
        
        /**
         * Sets (as xml) the "SrcMsgId" element
         */
        void xsetSrcMsgId(org.apache.xmlbeans.XmlString srcMsgId);
        
        /**
         * Gets the "TrackingId" element
         */
        java.lang.String getTrackingId();
        
        /**
         * Gets (as xml) the "TrackingId" element
         */
        org.apache.xmlbeans.XmlString xgetTrackingId();
        
        /**
         * Sets the "TrackingId" element
         */
        void setTrackingId(java.lang.String trackingId);
        
        /**
         * Sets (as xml) the "TrackingId" element
         */
        void xsetTrackingId(org.apache.xmlbeans.XmlString trackingId);
        
        /**
         * Gets the "OrgId" element
         */
        java.lang.String getOrgId();
        
        /**
         * Gets (as xml) the "OrgId" element
         */
        org.apache.xmlbeans.XmlString xgetOrgId();
        
        /**
         * Sets the "OrgId" element
         */
        void setOrgId(java.lang.String orgId);
        
        /**
         * Sets (as xml) the "OrgId" element
         */
        void xsetOrgId(org.apache.xmlbeans.XmlString orgId);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static xsd.arcrequesttargetnamespace.HeaderDocument.Header newInstance() {
              return (xsd.arcrequesttargetnamespace.HeaderDocument.Header) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static xsd.arcrequesttargetnamespace.HeaderDocument.Header newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (xsd.arcrequesttargetnamespace.HeaderDocument.Header) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static xsd.arcrequesttargetnamespace.HeaderDocument newInstance() {
          return (xsd.arcrequesttargetnamespace.HeaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static xsd.arcrequesttargetnamespace.HeaderDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (xsd.arcrequesttargetnamespace.HeaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static xsd.arcrequesttargetnamespace.HeaderDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (xsd.arcrequesttargetnamespace.HeaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static xsd.arcrequesttargetnamespace.HeaderDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (xsd.arcrequesttargetnamespace.HeaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static xsd.arcrequesttargetnamespace.HeaderDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (xsd.arcrequesttargetnamespace.HeaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static xsd.arcrequesttargetnamespace.HeaderDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (xsd.arcrequesttargetnamespace.HeaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static xsd.arcrequesttargetnamespace.HeaderDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (xsd.arcrequesttargetnamespace.HeaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static xsd.arcrequesttargetnamespace.HeaderDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (xsd.arcrequesttargetnamespace.HeaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static xsd.arcrequesttargetnamespace.HeaderDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (xsd.arcrequesttargetnamespace.HeaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static xsd.arcrequesttargetnamespace.HeaderDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (xsd.arcrequesttargetnamespace.HeaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static xsd.arcrequesttargetnamespace.HeaderDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (xsd.arcrequesttargetnamespace.HeaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static xsd.arcrequesttargetnamespace.HeaderDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (xsd.arcrequesttargetnamespace.HeaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static xsd.arcrequesttargetnamespace.HeaderDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (xsd.arcrequesttargetnamespace.HeaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static xsd.arcrequesttargetnamespace.HeaderDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (xsd.arcrequesttargetnamespace.HeaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static xsd.arcrequesttargetnamespace.HeaderDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (xsd.arcrequesttargetnamespace.HeaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static xsd.arcrequesttargetnamespace.HeaderDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (xsd.arcrequesttargetnamespace.HeaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static xsd.arcrequesttargetnamespace.HeaderDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (xsd.arcrequesttargetnamespace.HeaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static xsd.arcrequesttargetnamespace.HeaderDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (xsd.arcrequesttargetnamespace.HeaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
