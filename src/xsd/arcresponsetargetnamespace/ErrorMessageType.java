/*
 * XML Type:  ErrorMessageType
 * Namespace: ARCResponseTargetNamespace.xsd
 * Java type: xsd.arcresponsetargetnamespace.ErrorMessageType
 *
 * Automatically generated - do not modify.
 */
package xsd.arcresponsetargetnamespace;


/**
 * An XML ErrorMessageType(@ARCResponseTargetNamespace.xsd).
 *
 * This is a complex type.
 */
public interface ErrorMessageType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ErrorMessageType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1383480092BB3B3330B840625D6C3273").resolveHandle("errormessagetypedad0type");
    
    /**
     * Gets the "ApplicationName" element
     */
    java.lang.String getApplicationName();
    
    /**
     * Gets (as xml) the "ApplicationName" element
     */
    org.apache.xmlbeans.XmlString xgetApplicationName();
    
    /**
     * Sets the "ApplicationName" element
     */
    void setApplicationName(java.lang.String applicationName);
    
    /**
     * Sets (as xml) the "ApplicationName" element
     */
    void xsetApplicationName(org.apache.xmlbeans.XmlString applicationName);
    
    /**
     * Gets the "DateTime" element
     */
    java.lang.String getDateTime();
    
    /**
     * Gets (as xml) the "DateTime" element
     */
    org.apache.xmlbeans.XmlString xgetDateTime();
    
    /**
     * Sets the "DateTime" element
     */
    void setDateTime(java.lang.String dateTime);
    
    /**
     * Sets (as xml) the "DateTime" element
     */
    void xsetDateTime(org.apache.xmlbeans.XmlString dateTime);
    
    /**
     * Gets the "Status" element
     */
    java.lang.String getStatus();
    
    /**
     * Gets (as xml) the "Status" element
     */
    org.apache.xmlbeans.XmlString xgetStatus();
    
    /**
     * Sets the "Status" element
     */
    void setStatus(java.lang.String status);
    
    /**
     * Sets (as xml) the "Status" element
     */
    void xsetStatus(org.apache.xmlbeans.XmlString status);
    
    /**
     * Gets the "ErrorCode" element
     */
    java.lang.String getErrorCode();
    
    /**
     * Gets (as xml) the "ErrorCode" element
     */
    org.apache.xmlbeans.XmlString xgetErrorCode();
    
    /**
     * Sets the "ErrorCode" element
     */
    void setErrorCode(java.lang.String errorCode);
    
    /**
     * Sets (as xml) the "ErrorCode" element
     */
    void xsetErrorCode(org.apache.xmlbeans.XmlString errorCode);
    
    /**
     * Gets the "ErrorDescription" element
     */
    java.lang.String getErrorDescription();
    
    /**
     * Gets (as xml) the "ErrorDescription" element
     */
    org.apache.xmlbeans.XmlString xgetErrorDescription();
    
    /**
     * Sets the "ErrorDescription" element
     */
    void setErrorDescription(java.lang.String errorDescription);
    
    /**
     * Sets (as xml) the "ErrorDescription" element
     */
    void xsetErrorDescription(org.apache.xmlbeans.XmlString errorDescription);
    
    /**
     * Gets the "Trace" element
     */
    java.lang.String getTrace();
    
    /**
     * Gets (as xml) the "Trace" element
     */
    org.apache.xmlbeans.XmlString xgetTrace();
    
    /**
     * True if has "Trace" element
     */
    boolean isSetTrace();
    
    /**
     * Sets the "Trace" element
     */
    void setTrace(java.lang.String trace);
    
    /**
     * Sets (as xml) the "Trace" element
     */
    void xsetTrace(org.apache.xmlbeans.XmlString trace);
    
    /**
     * Unsets the "Trace" element
     */
    void unsetTrace();
    
    /**
     * Gets the "Data" element
     */
    java.lang.String getData();
    
    /**
     * Gets (as xml) the "Data" element
     */
    org.apache.xmlbeans.XmlString xgetData();
    
    /**
     * True if has "Data" element
     */
    boolean isSetData();
    
    /**
     * Sets the "Data" element
     */
    void setData(java.lang.String data);
    
    /**
     * Sets (as xml) the "Data" element
     */
    void xsetData(org.apache.xmlbeans.XmlString data);
    
    /**
     * Unsets the "Data" element
     */
    void unsetData();
    
    /**
     * Gets the "Type" element
     */
    java.lang.String getType();
    
    /**
     * Gets (as xml) the "Type" element
     */
    org.apache.xmlbeans.XmlString xgetType();
    
    /**
     * True if has "Type" element
     */
    boolean isSetType();
    
    /**
     * Sets the "Type" element
     */
    void setType(java.lang.String type);
    
    /**
     * Sets (as xml) the "Type" element
     */
    void xsetType(org.apache.xmlbeans.XmlString type);
    
    /**
     * Unsets the "Type" element
     */
    void unsetType();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static xsd.arcresponsetargetnamespace.ErrorMessageType newInstance() {
          return (xsd.arcresponsetargetnamespace.ErrorMessageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static xsd.arcresponsetargetnamespace.ErrorMessageType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (xsd.arcresponsetargetnamespace.ErrorMessageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static xsd.arcresponsetargetnamespace.ErrorMessageType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (xsd.arcresponsetargetnamespace.ErrorMessageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static xsd.arcresponsetargetnamespace.ErrorMessageType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (xsd.arcresponsetargetnamespace.ErrorMessageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static xsd.arcresponsetargetnamespace.ErrorMessageType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (xsd.arcresponsetargetnamespace.ErrorMessageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static xsd.arcresponsetargetnamespace.ErrorMessageType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (xsd.arcresponsetargetnamespace.ErrorMessageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static xsd.arcresponsetargetnamespace.ErrorMessageType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (xsd.arcresponsetargetnamespace.ErrorMessageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static xsd.arcresponsetargetnamespace.ErrorMessageType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (xsd.arcresponsetargetnamespace.ErrorMessageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static xsd.arcresponsetargetnamespace.ErrorMessageType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (xsd.arcresponsetargetnamespace.ErrorMessageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static xsd.arcresponsetargetnamespace.ErrorMessageType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (xsd.arcresponsetargetnamespace.ErrorMessageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static xsd.arcresponsetargetnamespace.ErrorMessageType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (xsd.arcresponsetargetnamespace.ErrorMessageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static xsd.arcresponsetargetnamespace.ErrorMessageType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (xsd.arcresponsetargetnamespace.ErrorMessageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static xsd.arcresponsetargetnamespace.ErrorMessageType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (xsd.arcresponsetargetnamespace.ErrorMessageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static xsd.arcresponsetargetnamespace.ErrorMessageType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (xsd.arcresponsetargetnamespace.ErrorMessageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static xsd.arcresponsetargetnamespace.ErrorMessageType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (xsd.arcresponsetargetnamespace.ErrorMessageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static xsd.arcresponsetargetnamespace.ErrorMessageType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (xsd.arcresponsetargetnamespace.ErrorMessageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static xsd.arcresponsetargetnamespace.ErrorMessageType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (xsd.arcresponsetargetnamespace.ErrorMessageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static xsd.arcresponsetargetnamespace.ErrorMessageType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (xsd.arcresponsetargetnamespace.ErrorMessageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
