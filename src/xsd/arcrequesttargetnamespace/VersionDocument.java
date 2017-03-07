/*
 * An XML document type.
 * Localname: Version
 * Namespace: ARCRequestTargetNamespace.xsd
 * Java type: xsd.arcrequesttargetnamespace.VersionDocument
 *
 * Automatically generated - do not modify.
 */
package xsd.arcrequesttargetnamespace;


/**
 * A document containing one Version(@ARCRequestTargetNamespace.xsd) element.
 *
 * This is a complex type.
 */
public interface VersionDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(VersionDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1383480092BB3B3330B840625D6C3273").resolveHandle("versionba07doctype");
    
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
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static xsd.arcrequesttargetnamespace.VersionDocument newInstance() {
          return (xsd.arcrequesttargetnamespace.VersionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static xsd.arcrequesttargetnamespace.VersionDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (xsd.arcrequesttargetnamespace.VersionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static xsd.arcrequesttargetnamespace.VersionDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (xsd.arcrequesttargetnamespace.VersionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static xsd.arcrequesttargetnamespace.VersionDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (xsd.arcrequesttargetnamespace.VersionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static xsd.arcrequesttargetnamespace.VersionDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (xsd.arcrequesttargetnamespace.VersionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static xsd.arcrequesttargetnamespace.VersionDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (xsd.arcrequesttargetnamespace.VersionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static xsd.arcrequesttargetnamespace.VersionDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (xsd.arcrequesttargetnamespace.VersionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static xsd.arcrequesttargetnamespace.VersionDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (xsd.arcrequesttargetnamespace.VersionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static xsd.arcrequesttargetnamespace.VersionDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (xsd.arcrequesttargetnamespace.VersionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static xsd.arcrequesttargetnamespace.VersionDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (xsd.arcrequesttargetnamespace.VersionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static xsd.arcrequesttargetnamespace.VersionDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (xsd.arcrequesttargetnamespace.VersionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static xsd.arcrequesttargetnamespace.VersionDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (xsd.arcrequesttargetnamespace.VersionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static xsd.arcrequesttargetnamespace.VersionDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (xsd.arcrequesttargetnamespace.VersionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static xsd.arcrequesttargetnamespace.VersionDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (xsd.arcrequesttargetnamespace.VersionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static xsd.arcrequesttargetnamespace.VersionDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (xsd.arcrequesttargetnamespace.VersionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static xsd.arcrequesttargetnamespace.VersionDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (xsd.arcrequesttargetnamespace.VersionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static xsd.arcrequesttargetnamespace.VersionDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (xsd.arcrequesttargetnamespace.VersionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static xsd.arcrequesttargetnamespace.VersionDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (xsd.arcrequesttargetnamespace.VersionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
