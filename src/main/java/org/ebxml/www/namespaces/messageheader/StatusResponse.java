
/**
 * StatusResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package org.ebxml.www.namespaces.messageheader;
            

            /**
            *  StatusResponse bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class StatusResponse
        implements org.apache.axis2.databinding.ADBBean{
        
                public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://www.ebxml.org/namespaces/messageHeader",
                "StatusResponse",
                "ns6");

            

                        /**
                        * field for RefToMessageId
                        */

                        
                                    protected org.ebxml.www.namespaces.messageheader.NonEmptyString localRefToMessageId ;
                                

                           /**
                           * Auto generated getter method
                           * @return org.ebxml.www.namespaces.messageheader.NonEmptyString
                           */
                           public  org.ebxml.www.namespaces.messageheader.NonEmptyString getRefToMessageId(){
                               return localRefToMessageId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RefToMessageId
                               */
                               public void setRefToMessageId(org.ebxml.www.namespaces.messageheader.NonEmptyString param){
                            
                                            this.localRefToMessageId=param;
                                    

                               }
                            

                        /**
                        * field for Timestamp
                        */

                        
                                    protected java.lang.String localTimestamp ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTimestampTracker = false ;

                           public boolean isTimestampSpecified(){
                               return localTimestampTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getTimestamp(){
                               return localTimestamp;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Timestamp
                               */
                               public void setTimestamp(java.lang.String param){
                            localTimestampTracker = param != null;
                                   
                                            this.localTimestamp=param;
                                    

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
                        * field for Id
                        * This was an Attribute!
                        */

                        
                                    protected org.apache.axis2.databinding.types.Id localId ;
                                

                           /**
                           * Auto generated getter method
                           * @return org.apache.axis2.databinding.types.Id
                           */
                           public  org.apache.axis2.databinding.types.Id getId(){
                               return localId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Id
                               */
                               public void setId(org.apache.axis2.databinding.types.Id param){
                            
                                            this.localId=param;
                                    

                               }
                            

                        /**
                        * field for Version
                        * This was an Attribute!
                        */

                        
                                    protected org.ebxml.www.namespaces.messageheader.NonEmptyString localVersion ;
                                

                           /**
                           * Auto generated getter method
                           * @return org.ebxml.www.namespaces.messageheader.NonEmptyString
                           */
                           public  org.ebxml.www.namespaces.messageheader.NonEmptyString getVersion(){
                               return localVersion;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Version
                               */
                               public void setVersion(org.ebxml.www.namespaces.messageheader.NonEmptyString param){
                            
                                            this.localVersion=param;
                                    

                               }
                            

                        /**
                        * field for MessageStatus
                        * This was an Attribute!
                        */

                        
                                    protected org.ebxml.www.namespaces.messageheader.MessageStatusType localMessageStatus ;
                                

                           /**
                           * Auto generated getter method
                           * @return org.ebxml.www.namespaces.messageheader.MessageStatusType
                           */
                           public  org.ebxml.www.namespaces.messageheader.MessageStatusType getMessageStatus(){
                               return localMessageStatus;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MessageStatus
                               */
                               public void setMessageStatus(org.ebxml.www.namespaces.messageheader.MessageStatusType param){
                            
                                            this.localMessageStatus=param;
                                    

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
                       new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME);
               return factory.createOMElement(dataSource,MY_QNAME);
            
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
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://www.ebxml.org/namespaces/messageHeader");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":StatusResponse",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "StatusResponse",
                           xmlWriter);
                   }

               
                   }
               
                                            if (localId != null){
                                        
                                                writeAttribute("http://www.ebxml.org/namespaces/messageHeader",
                                                         "id",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localId), xmlWriter);

                                            
                                      }
                                    
                                    
                                    if (localVersion != null){
                                        writeAttribute("http://www.ebxml.org/namespaces/messageHeader",
                                           "version",
                                           localVersion.toString(), xmlWriter);
                                    }
                                    
                                    
                                    if (localMessageStatus != null){
                                        writeAttribute("http://www.ebxml.org/namespaces/messageHeader",
                                           "messageStatus",
                                           localMessageStatus.toString(), xmlWriter);
                                    }
                                    
                                      else {
                                          throw new org.apache.axis2.databinding.ADBException("required attribute localMessageStatus is null");
                                      }
                                    
                                            if (localRefToMessageId==null){
                                                 throw new org.apache.axis2.databinding.ADBException("RefToMessageId cannot be null!!");
                                            }
                                           localRefToMessageId.serialize(new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader","RefToMessageId"),
                                               xmlWriter);
                                         if (localTimestampTracker){
                                    namespace = "http://www.ebxml.org/namespaces/messageHeader";
                                    writeStartElement(null, namespace, "Timestamp", xmlWriter);
                             

                                          if (localTimestamp==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Timestamp cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localTimestamp);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localExtraElementTracker){
                            
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
            if(namespace.equals("http://www.ebxml.org/namespaces/messageHeader")){
                return "ns6";
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

                
                            elementList.add(new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader",
                                                                      "RefToMessageId"));
                            
                            
                                    if (localRefToMessageId==null){
                                         throw new org.apache.axis2.databinding.ADBException("RefToMessageId cannot be null!!");
                                    }
                                    elementList.add(localRefToMessageId);
                                 if (localTimestampTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader",
                                                                      "Timestamp"));
                                 
                                        if (localTimestamp != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTimestamp));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Timestamp cannot be null!!");
                                        }
                                    } if (localExtraElementTracker){
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
                            attribList.add(
                            new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader","id"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localId));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader","version"));
                            
                                      attribList.add(localVersion.toString());
                                
                            attribList.add(
                            new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader","messageStatus"));
                            
                                      attribList.add(localMessageStatus.toString());
                                

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
        public static StatusResponse parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            StatusResponse object =
                new StatusResponse();

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
                    
                            if (!"StatusResponse".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (StatusResponse)org.xmlsoap.schemas.soap.envelope.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    // handle attribute "id"
                    java.lang.String tempAttribId =
                        
                                reader.getAttributeValue("http://www.ebxml.org/namespaces/messageHeader","id");
                            
                   if (tempAttribId!=null){
                         java.lang.String content = tempAttribId;
                        
                                                 object.setId(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToID(tempAttribId));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("id");
                    
                    // handle attribute "version"
                    java.lang.String tempAttribVersion =
                        
                                reader.getAttributeValue("http://www.ebxml.org/namespaces/messageHeader","version");
                            
                   if (tempAttribVersion!=null){
                         java.lang.String content = tempAttribVersion;
                        
                                                  object.setVersion(
                                                        org.ebxml.www.namespaces.messageheader.NonEmptyString.Factory.fromString(reader,tempAttribVersion));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("version");
                    
                    // handle attribute "messageStatus"
                    java.lang.String tempAttribMessageStatus =
                        
                                reader.getAttributeValue("http://www.ebxml.org/namespaces/messageHeader","messageStatus");
                            
                   if (tempAttribMessageStatus!=null){
                         java.lang.String content = tempAttribMessageStatus;
                        
                                                  object.setMessageStatus(
                                                        org.ebxml.www.namespaces.messageheader.MessageStatusType.Factory.fromString(reader,tempAttribMessageStatus));
                                            
                    } else {
                       
                               throw new org.apache.axis2.databinding.ADBException("Required attribute messageStatus is missing");
                           
                    }
                    handledAttributes.add("messageStatus");
                    
                    
                    reader.next();
                
                        java.util.ArrayList list3 = new java.util.ArrayList();
                    
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader","RefToMessageId").equals(reader.getName())){
                                
                                                object.setRefToMessageId(org.ebxml.www.namespaces.messageheader.NonEmptyString.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader","Timestamp").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Timestamp" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTimestamp(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
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
           
    