/*
 * An XML document type.
 * Localname: OTPSendReq
 * Namespace: ARCRequestTargetNamespace.xsd
 * Java type: xsd.arcrequesttargetnamespace.OTPSendReqDocument
 *
 * Automatically generated - do not modify.
 */
package xsd.arcrequesttargetnamespace;


/**
 * A document containing one OTPSendReq(@ARCRequestTargetNamespace.xsd) element.
 *
 * This is a complex type.
 */
public interface OTPSendReqDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OTPSendReqDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1383480092BB3B3330B840625D6C3273").resolveHandle("otpsendreq7cccdoctype");
    
    /**
     * Gets the "OTPSendReq" element
     */
    xsd.arcrequesttargetnamespace.OTPSendReqDocument.OTPSendReq getOTPSendReq();
    
    /**
     * Sets the "OTPSendReq" element
     */
    void setOTPSendReq(xsd.arcrequesttargetnamespace.OTPSendReqDocument.OTPSendReq otpSendReq);
    
    /**
     * Appends and returns a new empty "OTPSendReq" element
     */
    xsd.arcrequesttargetnamespace.OTPSendReqDocument.OTPSendReq addNewOTPSendReq();
    
    /**
     * An XML OTPSendReq(@ARCRequestTargetNamespace.xsd).
     *
     * This is a complex type.
     */
    public interface OTPSendReq extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OTPSendReq.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1383480092BB3B3330B840625D6C3273").resolveHandle("otpsendreqbd65elemtype");
        
        /**
         * Gets the "CardNo" element
         */
        java.lang.String getCardNo();
        
        /**
         * Gets (as xml) the "CardNo" element
         */
        org.apache.xmlbeans.XmlString xgetCardNo();
        
        /**
         * Sets the "CardNo" element
         */
        void setCardNo(java.lang.String cardNo);
        
        /**
         * Sets (as xml) the "CardNo" element
         */
        void xsetCardNo(org.apache.xmlbeans.XmlString cardNo);
        
        /**
         * Gets the "OTPMessage" element
         */
        java.lang.String getOTPMessage();
        
        /**
         * Gets (as xml) the "OTPMessage" element
         */
        org.apache.xmlbeans.XmlString xgetOTPMessage();
        
        /**
         * Sets the "OTPMessage" element
         */
        void setOTPMessage(java.lang.String otpMessage);
        
        /**
         * Sets (as xml) the "OTPMessage" element
         */
        void xsetOTPMessage(org.apache.xmlbeans.XmlString otpMessage);
        
        /**
         * Gets the "Language_Indicator" element
         */
        java.lang.String getLanguageIndicator();
        
        /**
         * Gets (as xml) the "Language_Indicator" element
         */
        org.apache.xmlbeans.XmlString xgetLanguageIndicator();
        
        /**
         * True if has "Language_Indicator" element
         */
        boolean isSetLanguageIndicator();
        
        /**
         * Sets the "Language_Indicator" element
         */
        void setLanguageIndicator(java.lang.String languageIndicator);
        
        /**
         * Sets (as xml) the "Language_Indicator" element
         */
        void xsetLanguageIndicator(org.apache.xmlbeans.XmlString languageIndicator);
        
        /**
         * Unsets the "Language_Indicator" element
         */
        void unsetLanguageIndicator();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static xsd.arcrequesttargetnamespace.OTPSendReqDocument.OTPSendReq newInstance() {
              return (xsd.arcrequesttargetnamespace.OTPSendReqDocument.OTPSendReq) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static xsd.arcrequesttargetnamespace.OTPSendReqDocument.OTPSendReq newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (xsd.arcrequesttargetnamespace.OTPSendReqDocument.OTPSendReq) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static xsd.arcrequesttargetnamespace.OTPSendReqDocument newInstance() {
          return (xsd.arcrequesttargetnamespace.OTPSendReqDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static xsd.arcrequesttargetnamespace.OTPSendReqDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (xsd.arcrequesttargetnamespace.OTPSendReqDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static xsd.arcrequesttargetnamespace.OTPSendReqDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (xsd.arcrequesttargetnamespace.OTPSendReqDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static xsd.arcrequesttargetnamespace.OTPSendReqDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (xsd.arcrequesttargetnamespace.OTPSendReqDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static xsd.arcrequesttargetnamespace.OTPSendReqDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (xsd.arcrequesttargetnamespace.OTPSendReqDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static xsd.arcrequesttargetnamespace.OTPSendReqDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (xsd.arcrequesttargetnamespace.OTPSendReqDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static xsd.arcrequesttargetnamespace.OTPSendReqDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (xsd.arcrequesttargetnamespace.OTPSendReqDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static xsd.arcrequesttargetnamespace.OTPSendReqDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (xsd.arcrequesttargetnamespace.OTPSendReqDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static xsd.arcrequesttargetnamespace.OTPSendReqDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (xsd.arcrequesttargetnamespace.OTPSendReqDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static xsd.arcrequesttargetnamespace.OTPSendReqDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (xsd.arcrequesttargetnamespace.OTPSendReqDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static xsd.arcrequesttargetnamespace.OTPSendReqDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (xsd.arcrequesttargetnamespace.OTPSendReqDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static xsd.arcrequesttargetnamespace.OTPSendReqDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (xsd.arcrequesttargetnamespace.OTPSendReqDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static xsd.arcrequesttargetnamespace.OTPSendReqDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (xsd.arcrequesttargetnamespace.OTPSendReqDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static xsd.arcrequesttargetnamespace.OTPSendReqDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (xsd.arcrequesttargetnamespace.OTPSendReqDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static xsd.arcrequesttargetnamespace.OTPSendReqDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (xsd.arcrequesttargetnamespace.OTPSendReqDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static xsd.arcrequesttargetnamespace.OTPSendReqDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (xsd.arcrequesttargetnamespace.OTPSendReqDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static xsd.arcrequesttargetnamespace.OTPSendReqDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (xsd.arcrequesttargetnamespace.OTPSendReqDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static xsd.arcrequesttargetnamespace.OTPSendReqDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (xsd.arcrequesttargetnamespace.OTPSendReqDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
