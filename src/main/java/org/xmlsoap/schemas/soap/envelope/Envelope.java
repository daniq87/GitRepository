
/**
 * Envelope.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package org.xmlsoap.schemas.soap.envelope;
            

            /**
            *  Envelope bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class Envelope
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = Envelope
                Namespace URI = http://schemas.xmlsoap.org/soap/envelope/
                Namespace Prefix = ns5
                */
            

                        /**
                        * field for Header
                        * This was an Array!
                        */

                        
                                    protected org.xmlsoap.schemas.soap.envelope.Header[] localHeader ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localHeaderTracker = false ;

                           public boolean isHeaderSpecified(){
                               return localHeaderTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return org.xmlsoap.schemas.soap.envelope.Header[]
                           */
                           public  org.xmlsoap.schemas.soap.envelope.Header[] getHeader(){
                               return localHeader;
                           }

                           
                        


                               
                              /**
                               * validate the array for Header
                               */
                              protected void validateHeader(org.xmlsoap.schemas.soap.envelope.Header[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param Header
                              */
                              public void setHeader(org.xmlsoap.schemas.soap.envelope.Header[] param){
                              
                                   validateHeader(param);

                               localHeaderTracker = param != null;
                                      
                                      this.localHeader=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param org.xmlsoap.schemas.soap.envelope.Header
                             */
                             public void addHeader(org.xmlsoap.schemas.soap.envelope.Header param){
                                   if (localHeader == null){
                                   localHeader = new org.xmlsoap.schemas.soap.envelope.Header[]{};
                                   }

                            
                                 //update the setting tracker
                                localHeaderTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localHeader);
                               list.add(param);
                               this.localHeader =
                             (org.xmlsoap.schemas.soap.envelope.Header[])list.toArray(
                            new org.xmlsoap.schemas.soap.envelope.Header[list.size()]);

                             }
                             

                        /**
                        * field for Body
                        */

                        
                                    protected org.xmlsoap.schemas.soap.envelope.Body localBody ;
                                

                           /**
                           * Auto generated getter method
                           * @return org.xmlsoap.schemas.soap.envelope.Body
                           */
                           public  org.xmlsoap.schemas.soap.envelope.Body getBody(){
                               return localBody;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Body
                               */
                               public void setBody(org.xmlsoap.schemas.soap.envelope.Body param){
                            
                                            this.localBody=param;
                                    

                               }
                            

                        /**
                        * field for ExtraElement
                        * This was an Array!
                        */

                        
                                    protected org.apache.axiom.om.OMElement[] localExtraElement ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localExtraElementTracker = false ;

                           public boolean isExtraElementSpecified(){
                               return localExtraElementTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return org.apache.axiom.om.OMElement[]
                           */
                           public  org.apache.axiom.om.OMElement[] getExtraElement(){
                               return localExtraElement;
                           }

                           
                        


                               
                              /**
                               * validate the array for ExtraElement
                               */
                              protected void validateExtraElement(org.apache.axiom.om.OMElement[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param ExtraElement
                              */
                              public void setExtraElement(org.apache.axiom.om.OMElement[] param){
                              
                                   validateExtraElement(param);

                               localExtraElementTracker = param != null;
                                      
                                      this.localExtraElement=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param org.apache.axiom.om.OMElement
                             */
                             public void addExtraElement(org.apache.axiom.om.OMElement param){
                                   if (localExtraElement == null){
                                   localExtraElement = new org.apache.axiom.om.OMElement[]{};
                                   }

                            
                                 //update the setting tracker
                                localExtraElementTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localExtraElement);
                               list.add(param);
                               this.localExtraElement =
                             (org.apache.axiom.om.OMElement[])list.toArray(
                            new org.apache.axiom.om.OMElement[list.size()]);

                             }
                             

                        /**
                        * field for ExtraAttributes
                        * This was an Attribute!
                        * This was an Array!
                        */

                        
                                    protected org.apache.axiom.om.OMAttribute[] localExtraAttributes ;
                                

                           /**
                           * Auto generated getter method
                           * @return org.apache.axiom.om.OMAttribute[]
                           */
                           public  org.apache.axiom.om.OMAttribute[] getExtraAttributes(){
                               return localExtraAttributes;
                           }

                           
                        


                               
                              /**
                               * validate the array for ExtraAttributes
                               */
                              protected void validateExtraAttributes(org.apache.axiom.om.OMAttribute[] param){
                             
                              if ((param != null) && (param.length > 1)){
                                throw new java.lang.RuntimeException();
                              }
                              
                              if ((param != null) && (param.length < 1)){
                                throw new java.lang.RuntimeException();
                              }
                              
                              }


                             /**
                              * Auto generated setter method
                              * @param param ExtraAttributes
                              */
                              public void setExtraAttributes(org.apache.axiom.om.OMAttribute[] param){
                              
                                   validateExtraAttributes(param);

                               
                                      this.localExtraAttributes=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param org.apache.axiom.om.OMAttribute
                             */
                             public void addExtraAttributes(org.apache.axiom.om.OMAttribute param){
                                   if (localExtraAttributes == null){
                                   localExtraAttributes = new org.apache.axiom.om.OMAttribute[]{};
                                   }

                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localExtraAttributes);
                               list.add(param);
                               this.localExtraAttributes =
                             (org.apache.axiom.om.OMAttribute[])list.toArray(
                            new org.apache.axiom.om.OMAttribute[list.size()]);

                             }
                             

     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement (
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{


        
               org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,parentQName);
               return factory.createOMElement(dataSource,parentQName);
            
        }

         public void serialize(final javax.xml.namespace.QName parentQName,
                                       javax.xml.stream.XMLStreamWriter xmlWriter)
                                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                           serialize(parentQName,xmlWriter,false);
         }

         public void serialize(final javax.xml.namespace.QName parentQName,
                               javax.xml.stream.XMLStreamWriter xmlWriter,
                               boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
            
                


                java.lang.String prefix = null;
                java.lang.String namespace = null;
                

                    prefix = parentQName.getPrefix();
                    namespace = parentQName.getNamespaceURI();
                    writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
                
                  if (serializeType){
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://schemas.xmlsoap.org/soap/envelope/");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":Envelope",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "Envelope",
                           xmlWriter);
                   }

               
                   }
               
                             if (localExtraAttributes != null) {
                                 for (int i=0;i <localExtraAttributes.length;i++){
                                     writeAttribute(localExtraAttributes[i].getNamespace().getName(),
                                                    localExtraAttributes[i].getLocalName(),
                                                    localExtraAttributes[i].getAttributeValue(),xmlWriter);
                                     }
                             }
                         if (localHeaderTracker){
                                       if (localHeader!=null){
                                            for (int i = 0;i < localHeader.length;i++){
                                                if (localHeader[i] != null){
                                                 localHeader[i].serialize(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/envelope/","Header"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                        // we don't have to do any thing since minOccures is zero
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("Header cannot be null!!");
                                        
                                    }
                                 }
                                            if (localBody==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Body cannot be null!!");
                                            }
                                           localBody.serialize(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/envelope/","Body"),
                                               xmlWriter);
                                         if (localExtraElementTracker){
                            
                            if (localExtraElement != null){
                                for (int i = 0;i < localExtraElement.length;i++){
                                    if (localExtraElement[i] != null){
                                        localExtraElement[i].serialize(xmlWriter);
                                    } else {
                                        
                                                // we have to do nothing since minOccures zero
                                            
                                    }
                                }
                            } else {
                                throw new org.apache.axis2.databinding.ADBException("extraElement cannot be null!!");
                            }
                        }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://schemas.xmlsoap.org/soap/envelope/")){
                return "ns5";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }
        
        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                                    java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace,attName,attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                                    java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName,attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace,attName,attValue);
            }
        }


           /**
             * Util method to write an attribute without the ns prefix
             */
            private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                             javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

                java.lang.String attributeNamespace = qname.getNamespaceURI();
                java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
                if (attributePrefix == null) {
                    attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
                }
                java.lang.String attributeValue;
                if (attributePrefix.trim().length() > 0) {
                    attributeValue = attributePrefix + ":" + qname.getLocalPart();
                } else {
                    attributeValue = qname.getLocalPart();
                }

                if (namespace.equals("")) {
                    xmlWriter.writeAttribute(attName, attributeValue);
                } else {
                    registerPrefix(xmlWriter, namespace);
                    xmlWriter.writeAttribute(namespace, attName, attributeValue);
                }
            }
        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }

                        if (prefix.trim().length() > 0){
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }


  
        /**
        * databinding method to get an XML representation of this object
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                    throws org.apache.axis2.databinding.ADBException{


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                 if (localHeaderTracker){
                             if (localHeader!=null) {
                                 for (int i = 0;i < localHeader.length;i++){

                                    if (localHeader[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/envelope/",
                                                                          "Header"));
                                         elementList.add(localHeader[i]);
                                    } else {
                                        
                                                // nothing to do
                                            
                                    }

                                 }
                             } else {
                                 
                                        throw new org.apache.axis2.databinding.ADBException("Header cannot be null!!");
                                    
                             }

                        }
                            elementList.add(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/envelope/",
                                                                      "Body"));
                            
                            
                                    if (localBody==null){
                                         throw new org.apache.axis2.databinding.ADBException("Body cannot be null!!");
                                    }
                                    elementList.add(localBody);
                                 if (localExtraElementTracker){
                            if (localExtraElement != null) {
                                for (int i = 0;i < localExtraElement.length;i++){
                                    if (localExtraElement[i] != null){
                                       elementList.add(new javax.xml.namespace.QName("",
                                                                          "extraElement"));
                                      elementList.add(
                                      org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localExtraElement[i]));
                                    } else {
                                        
                                                // have to do nothing
                                            
                                    }

                                }
                            } else {
                               throw new org.apache.axis2.databinding.ADBException("extraElement cannot be null!!");
                            }
                        }
                             for (int i=0;i <localExtraAttributes.length;i++){
                               attribList.add(org.apache.axis2.databinding.utils.Constants.OM_ATTRIBUTE_KEY);
                               attribList.add(localExtraAttributes[i]);
                             }
                         

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static Envelope parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            Envelope object =
                new Envelope();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    java.lang.String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"Envelope".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (Envelope)org.xmlsoap.schemas.soap.envelope.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                        // now run through all any or extra attributes
                        // which were not reflected until now
                        for (int i=0; i < reader.getAttributeCount(); i++) {
                            if (!handledAttributes.contains(reader.getAttributeLocalName(i))) {
                                // this is an anyAttribute and we create
                                // an OMAttribute for this
                                org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();
                                org.apache.axiom.om.OMAttribute attr =
                                    factory.createOMAttribute(
                                            reader.getAttributeLocalName(i),
                                            factory.createOMNamespace(
                                                reader.getAttributeNamespace(i), reader.getAttributePrefix(i)),
                                            reader.getAttributeValue(i));

                                // and add it to the extra attributes
                                
                                         object.addExtraAttributes(attr);
                                    

                            }
                        }
                    
                    
                    reader.next();
                
                        java.util.ArrayList list1 = new java.util.ArrayList();
                    
                        java.util.ArrayList list3 = new java.util.ArrayList();
                    
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/envelope/","Header").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list1.add(org.xmlsoap.schemas.soap.envelope.Header.Factory.parse(reader));
                                                                
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone1 = false;
                                                        while(!loopDone1){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone1 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/envelope/","Header").equals(reader.getName())){
                                                                    list1.add(org.xmlsoap.schemas.soap.envelope.Header.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone1 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setHeader((org.xmlsoap.schemas.soap.envelope.Header[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                org.xmlsoap.schemas.soap.envelope.Header.class,
                                                                list1));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/envelope/","Body").equals(reader.getName())){
                                
                                                object.setBody(org.xmlsoap.schemas.soap.envelope.Body.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                   if (reader.isStartElement()){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                           boolean loopDone3=false;

                                             while (!loopDone3){
                                                 event = reader.getEventType();
                                                 if (javax.xml.stream.XMLStreamConstants.START_ELEMENT == event){

                                                      // We need to wrap the reader so that it produces a fake START_DOCUEMENT event
                                                      org.apache.axis2.databinding.utils.NamedStaxOMBuilder builder3
                                                         = new org.apache.axis2.databinding.utils.NamedStaxOMBuilder(
                                                              new org.apache.axis2.util.StreamWrapper(reader), reader.getName());

                                                       list3.add(builder3.getOMElement());
                                                        reader.next();
                                                        if (reader.isEndElement()) {
                                                            // we have two countinuos end elements
                                                           loopDone3 = true;
                                                        }

                                                 }else if (javax.xml.stream.XMLStreamConstants.END_ELEMENT == event){
                                                     loopDone3 = true;
                                                 }else{
                                                     reader.next();
                                                 }

                                             }

                                            
                                             object.setExtraElement((org.apache.axiom.om.OMElement[])
                                                 org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                     org.apache.axiom.om.OMElement.class,list3));
                                                
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                  
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            
                                if (reader.isStartElement())
                                // A start element we are not expecting indicates a trailing invalid property
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                            



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
    