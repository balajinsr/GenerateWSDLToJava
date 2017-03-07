/*
 * An XML document type.
 * Localname: OrgId
 * Namespace: ARCResponseTargetNamespace.xsd
 * Java type: xsd.arcresponsetargetnamespace.OrgIdDocument
 *
 * Automatically generated - do not modify.
 */
package xsd.arcresponsetargetnamespace;


/**
 * A document containing one OrgId(@ARCResponseTargetNamespace.xsd) element.
 *
 * This is a complex type.
 */
public interface OrgIdDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OrgIdDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1383480092BB3B3330B840625D6C3273").resolveHandle("orgid096cdoctype");
    
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
        public static xsd.arcresponsetargetnamespace.OrgIdDocument newInstance() {
          return (xsd.arcresponsetargetnamespace.OrgIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static xsd.arcresponsetargetnamespace.OrgIdDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (xsd.arcresponsetargetnamespace.OrgIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static xsd.arcresponsetargetnamespace.OrgIdDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (xsd.arcresponsetargetnamespace.OrgIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static xsd.arcresponsetargetnamespace.OrgIdDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (xsd.arcresponsetargetnamespace.OrgIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static xsd.arcresponsetargetnamespace.OrgIdDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (xsd.arcresponsetargetnamespace.OrgIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static xsd.arcresponsetargetnamespace.OrgIdDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (xsd.arcresponsetargetnamespace.OrgIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static xsd.arcresponsetargetnamespace.OrgIdDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (xsd.arcresponsetargetnamespace.OrgIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static xsd.arcresponsetargetnamespace.OrgIdDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (xsd.arcresponsetargetnamespace.OrgIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static xsd.arcresponsetargetnamespace.OrgIdDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (xsd.arcresponsetargetnamespace.OrgIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static xsd.arcresponsetargetnamespace.OrgIdDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (xsd.arcresponsetargetnamespace.OrgIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static xsd.arcresponsetargetnamespace.OrgIdDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (xsd.arcresponsetargetnamespace.OrgIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static xsd.arcresponsetargetnamespace.OrgIdDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (xsd.arcresponsetargetnamespace.OrgIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static xsd.arcresponsetargetnamespace.OrgIdDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (xsd.arcresponsetargetnamespace.OrgIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static xsd.arcresponsetargetnamespace.OrgIdDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (xsd.arcresponsetargetnamespace.OrgIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static xsd.arcresponsetargetnamespace.OrgIdDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (xsd.arcresponsetargetnamespace.OrgIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static xsd.arcresponsetargetnamespace.OrgIdDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (xsd.arcresponsetargetnamespace.OrgIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static xsd.arcresponsetargetnamespace.OrgIdDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (xsd.arcresponsetargetnamespace.OrgIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static xsd.arcresponsetargetnamespace.OrgIdDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (xsd.arcresponsetargetnamespace.OrgIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
