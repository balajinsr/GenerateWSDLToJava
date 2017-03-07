/*
 * An XML document type.
 * Localname: ARCResponse
 * Namespace: ARCResponseTargetNamespace.xsd
 * Java type: xsd.arcresponsetargetnamespace.ARCResponseDocument
 *
 * Automatically generated - do not modify.
 */
package xsd.arcresponsetargetnamespace;


/**
 * A document containing one ARCResponse(@ARCResponseTargetNamespace.xsd) element.
 *
 * This is a complex type.
 */
public interface ARCResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ARCResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1383480092BB3B3330B840625D6C3273").resolveHandle("arcresponse3298doctype");
    
    /**
     * Gets the "ARCResponse" element
     */
    xsd.arcresponsetargetnamespace.ARCResponseDocument.ARCResponse getARCResponse();
    
    /**
     * Sets the "ARCResponse" element
     */
    void setARCResponse(xsd.arcresponsetargetnamespace.ARCResponseDocument.ARCResponse arcResponse);
    
    /**
     * Appends and returns a new empty "ARCResponse" element
     */
    xsd.arcresponsetargetnamespace.ARCResponseDocument.ARCResponse addNewARCResponse();
    
    /**
     * An XML ARCResponse(@ARCResponseTargetNamespace.xsd).
     *
     * This is a complex type.
     */
    public interface ARCResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ARCResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1383480092BB3B3330B840625D6C3273").resolveHandle("arcresponse77f9elemtype");
        
        /**
         * Gets the "Header" element
         */
        xsd.arcresponsetargetnamespace.HeaderDocument.Header getHeader();
        
        /**
         * True if has "Header" element
         */
        boolean isSetHeader();
        
        /**
         * Sets the "Header" element
         */
        void setHeader(xsd.arcresponsetargetnamespace.HeaderDocument.Header header);
        
        /**
         * Appends and returns a new empty "Header" element
         */
        xsd.arcresponsetargetnamespace.HeaderDocument.Header addNewHeader();
        
        /**
         * Unsets the "Header" element
         */
        void unsetHeader();
        
        /**
         * Gets the "Body" element
         */
        xsd.arcresponsetargetnamespace.ARCResponseDocument.ARCResponse.Body getBody();
        
        /**
         * Sets the "Body" element
         */
        void setBody(xsd.arcresponsetargetnamespace.ARCResponseDocument.ARCResponse.Body body);
        
        /**
         * Appends and returns a new empty "Body" element
         */
        xsd.arcresponsetargetnamespace.ARCResponseDocument.ARCResponse.Body addNewBody();
        
        /**
         * An XML Body(@ARCResponseTargetNamespace.xsd).
         *
         * This is a complex type.
         */
        public interface Body extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Body.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1383480092BB3B3330B840625D6C3273").resolveHandle("body3adbelemtype");
            
            /**
             * Gets the "ExceptionDetails" element
             */
            xsd.arcresponsetargetnamespace.ErrorMessageType getExceptionDetails();
            
            /**
             * Sets the "ExceptionDetails" element
             */
            void setExceptionDetails(xsd.arcresponsetargetnamespace.ErrorMessageType exceptionDetails);
            
            /**
             * Appends and returns a new empty "ExceptionDetails" element
             */
            xsd.arcresponsetargetnamespace.ErrorMessageType addNewExceptionDetails();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static xsd.arcresponsetargetnamespace.ARCResponseDocument.ARCResponse.Body newInstance() {
                  return (xsd.arcresponsetargetnamespace.ARCResponseDocument.ARCResponse.Body) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static xsd.arcresponsetargetnamespace.ARCResponseDocument.ARCResponse.Body newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (xsd.arcresponsetargetnamespace.ARCResponseDocument.ARCResponse.Body) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static xsd.arcresponsetargetnamespace.ARCResponseDocument.ARCResponse newInstance() {
              return (xsd.arcresponsetargetnamespace.ARCResponseDocument.ARCResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static xsd.arcresponsetargetnamespace.ARCResponseDocument.ARCResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (xsd.arcresponsetargetnamespace.ARCResponseDocument.ARCResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static xsd.arcresponsetargetnamespace.ARCResponseDocument newInstance() {
          return (xsd.arcresponsetargetnamespace.ARCResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static xsd.arcresponsetargetnamespace.ARCResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (xsd.arcresponsetargetnamespace.ARCResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static xsd.arcresponsetargetnamespace.ARCResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (xsd.arcresponsetargetnamespace.ARCResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static xsd.arcresponsetargetnamespace.ARCResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (xsd.arcresponsetargetnamespace.ARCResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static xsd.arcresponsetargetnamespace.ARCResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (xsd.arcresponsetargetnamespace.ARCResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static xsd.arcresponsetargetnamespace.ARCResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (xsd.arcresponsetargetnamespace.ARCResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static xsd.arcresponsetargetnamespace.ARCResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (xsd.arcresponsetargetnamespace.ARCResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static xsd.arcresponsetargetnamespace.ARCResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (xsd.arcresponsetargetnamespace.ARCResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static xsd.arcresponsetargetnamespace.ARCResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (xsd.arcresponsetargetnamespace.ARCResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static xsd.arcresponsetargetnamespace.ARCResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (xsd.arcresponsetargetnamespace.ARCResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static xsd.arcresponsetargetnamespace.ARCResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (xsd.arcresponsetargetnamespace.ARCResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static xsd.arcresponsetargetnamespace.ARCResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (xsd.arcresponsetargetnamespace.ARCResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static xsd.arcresponsetargetnamespace.ARCResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (xsd.arcresponsetargetnamespace.ARCResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static xsd.arcresponsetargetnamespace.ARCResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (xsd.arcresponsetargetnamespace.ARCResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static xsd.arcresponsetargetnamespace.ARCResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (xsd.arcresponsetargetnamespace.ARCResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static xsd.arcresponsetargetnamespace.ARCResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (xsd.arcresponsetargetnamespace.ARCResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static xsd.arcresponsetargetnamespace.ARCResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (xsd.arcresponsetargetnamespace.ARCResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static xsd.arcresponsetargetnamespace.ARCResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (xsd.arcresponsetargetnamespace.ARCResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
