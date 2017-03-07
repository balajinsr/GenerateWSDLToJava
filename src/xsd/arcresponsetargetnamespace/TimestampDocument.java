/*
 * An XML document type.
 * Localname: Timestamp
 * Namespace: ARCResponseTargetNamespace.xsd
 * Java type: xsd.arcresponsetargetnamespace.TimestampDocument
 *
 * Automatically generated - do not modify.
 */
package xsd.arcresponsetargetnamespace;


/**
 * A document containing one Timestamp(@ARCResponseTargetNamespace.xsd) element.
 *
 * This is a complex type.
 */
public interface TimestampDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TimestampDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1383480092BB3B3330B840625D6C3273").resolveHandle("timestamp3c15doctype");
    
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
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static xsd.arcresponsetargetnamespace.TimestampDocument newInstance() {
          return (xsd.arcresponsetargetnamespace.TimestampDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static xsd.arcresponsetargetnamespace.TimestampDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (xsd.arcresponsetargetnamespace.TimestampDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static xsd.arcresponsetargetnamespace.TimestampDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (xsd.arcresponsetargetnamespace.TimestampDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static xsd.arcresponsetargetnamespace.TimestampDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (xsd.arcresponsetargetnamespace.TimestampDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static xsd.arcresponsetargetnamespace.TimestampDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (xsd.arcresponsetargetnamespace.TimestampDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static xsd.arcresponsetargetnamespace.TimestampDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (xsd.arcresponsetargetnamespace.TimestampDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static xsd.arcresponsetargetnamespace.TimestampDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (xsd.arcresponsetargetnamespace.TimestampDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static xsd.arcresponsetargetnamespace.TimestampDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (xsd.arcresponsetargetnamespace.TimestampDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static xsd.arcresponsetargetnamespace.TimestampDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (xsd.arcresponsetargetnamespace.TimestampDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static xsd.arcresponsetargetnamespace.TimestampDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (xsd.arcresponsetargetnamespace.TimestampDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static xsd.arcresponsetargetnamespace.TimestampDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (xsd.arcresponsetargetnamespace.TimestampDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static xsd.arcresponsetargetnamespace.TimestampDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (xsd.arcresponsetargetnamespace.TimestampDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static xsd.arcresponsetargetnamespace.TimestampDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (xsd.arcresponsetargetnamespace.TimestampDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static xsd.arcresponsetargetnamespace.TimestampDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (xsd.arcresponsetargetnamespace.TimestampDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static xsd.arcresponsetargetnamespace.TimestampDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (xsd.arcresponsetargetnamespace.TimestampDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static xsd.arcresponsetargetnamespace.TimestampDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (xsd.arcresponsetargetnamespace.TimestampDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static xsd.arcresponsetargetnamespace.TimestampDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (xsd.arcresponsetargetnamespace.TimestampDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static xsd.arcresponsetargetnamespace.TimestampDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (xsd.arcresponsetargetnamespace.TimestampDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
