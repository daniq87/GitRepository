
/**
 * Identification.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.sabre.services.stl_header.v120;
            

            /**
            *  Identification bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class Identification
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = Identification
                Namespace URI = http://services.sabre.com/STL_Header/v120
                Namespace Prefix = ns2
                */
            

                        /**
                        * field for CustomerID
                        */

                        
                                    protected com.sabre.services.stl_header.v120.PseudoCityCodeOrOAC localCustomerID ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.sabre.services.stl_header.v120.PseudoCityCodeOrOAC
                           */
                           public  com.sabre.services.stl_header.v120.PseudoCityCodeOrOAC getCustomerID(){
                               return localCustomerID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CustomerID
                               */
                               public void setCustomerID(com.sabre.services.stl_header.v120.PseudoCityCodeOrOAC param){
                            
                                            this.localCustomerID=param;
                                    

                               }
                            

                        /**
                        * field for CustomerAppID
                        */

                        
                                    protected com.sabre.services.stl_header.v120.TextShort localCustomerAppID ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCustomerAppIDTracker = false ;

                           public boolean isCustomerAppIDSpecified(){
                               return localCustomerAppIDTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.sabre.services.stl_header.v120.TextShort
                           */
                           public  com.sabre.services.stl_header.v120.TextShort getCustomerAppID(){
                               return localCustomerAppID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CustomerAppID
                               */
                               public void setCustomerAppID(com.sabre.services.stl_header.v120.TextShort param){
                            localCustomerAppIDTracker = param != null;
                                   
                                            this.localCustomerAppID=param;
                                    

                               }
                            

                        /**
                        * field for ConversationID
                        */

                        
                                    protected com.sabre.services.stl_header.v120.TrackingID localConversationID ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.sabre.services.stl_header.v120.TrackingID
                           */
                           public  com.sabre.services.stl_header.v120.TrackingID getConversationID(){
                               return localConversationID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ConversationID
                               */
                               public void setConversationID(com.sabre.services.stl_header.v120.TrackingID param){
                            
                                            this.localConversationID=param;
                                    

                               }
                            

                        /**
                        * field for MessageID
                        */

                        
                                    protected com.sabre.services.stl_header.v120.Identifier localMessageID ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.sabre.services.stl_header.v120.Identifier
                           */
                           public  com.sabre.services.stl_header.v120.Identifier getMessageID(){
                               return localMessageID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MessageID
                               */
                               public void setMessageID(com.sabre.services.stl_header.v120.Identifier param){
                            
                                            this.localMessageID=param;
                                    

                               }
                            

                        /**
                        * field for TimeStamp
                        */

                        
                                    protected java.util.Calendar localTimeStamp ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTimeStampTracker = false ;

                           public boolean isTimeStampSpecified(){
                               return localTimeStampTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Calendar
                           */
                           public  java.util.Calendar getTimeStamp(){
                               return localTimeStamp;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TimeStamp
                               */
                               public void setTimeStamp(java.util.Calendar param){
                            localTimeStampTracker = param != null;
                                   
                                            this.localTimeStamp=param;
                                    

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
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://services.sabre.com/STL_Header/v120");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":Identification",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "Identification",
                           xmlWriter);
                   }

               
                   }
               
                                            if (localCustomerID==null){
                                                 throw new org.apache.axis2.databinding.ADBException("CustomerID cannot be null!!");
                                            }
                                           localCustomerID.serialize(new javax.xml.namespace.QName("http://services.sabre.com/STL_Header/v120","CustomerID"),
                                               xmlWriter);
                                         if (localCustomerAppIDTracker){
                                            if (localCustomerAppID==null){
                                                 throw new org.apache.axis2.databinding.ADBException("CustomerAppID cannot be null!!");
                                            }
                                           localCustomerAppID.serialize(new javax.xml.namespace.QName("http://services.sabre.com/STL_Header/v120","CustomerAppID"),
                                               xmlWriter);
                                        }
                                            if (localConversationID==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ConversationID cannot be null!!");
                                            }
                                           localConversationID.serialize(new javax.xml.namespace.QName("http://services.sabre.com/STL_Header/v120","ConversationID"),
                                               xmlWriter);
                                        
                                            if (localMessageID==null){
                                                 throw new org.apache.axis2.databinding.ADBException("MessageID cannot be null!!");
                                            }
                                           localMessageID.serialize(new javax.xml.namespace.QName("http://services.sabre.com/STL_Header/v120","MessageID"),
                                               xmlWriter);
                                         if (localTimeStampTracker){
                                    namespace = "http://services.sabre.com/STL_Header/v120";
                                    writeStartElement(null, namespace, "TimeStamp", xmlWriter);
                             

                                          if (localTimeStamp==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("TimeStamp cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTimeStamp));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://services.sabre.com/STL_Header/v120")){
                return "ns2";
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

                
                            elementList.add(new javax.xml.namespace.QName("http://services.sabre.com/STL_Header/v120",
                                                                      "CustomerID"));
                            
                            
                                    if (localCustomerID==null){
                                         throw new org.apache.axis2.databinding.ADBException("CustomerID cannot be null!!");
                                    }
                                    elementList.add(localCustomerID);
                                 if (localCustomerAppIDTracker){
                            elementList.add(new javax.xml.namespace.QName("http://services.sabre.com/STL_Header/v120",
                                                                      "CustomerAppID"));
                            
                            
                                    if (localCustomerAppID==null){
                                         throw new org.apache.axis2.databinding.ADBException("CustomerAppID cannot be null!!");
                                    }
                                    elementList.add(localCustomerAppID);
                                }
                            elementList.add(new javax.xml.namespace.QName("http://services.sabre.com/STL_Header/v120",
                                                                      "ConversationID"));
                            
                            
                                    if (localConversationID==null){
                                         throw new org.apache.axis2.databinding.ADBException("ConversationID cannot be null!!");
                                    }
                                    elementList.add(localConversationID);
                                
                            elementList.add(new javax.xml.namespace.QName("http://services.sabre.com/STL_Header/v120",
                                                                      "MessageID"));
                            
                            
                                    if (localMessageID==null){
                                         throw new org.apache.axis2.databinding.ADBException("MessageID cannot be null!!");
                                    }
                                    elementList.add(localMessageID);
                                 if (localTimeStampTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://services.sabre.com/STL_Header/v120",
                                                                      "TimeStamp"));
                                 
                                        if (localTimeStamp != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTimeStamp));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("TimeStamp cannot be null!!");
                                        }
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
        public static Identification parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            Identification object =
                new Identification();

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
                    
                            if (!"Identification".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (Identification)org.xmlsoap.schemas.soap.envelope.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://services.sabre.com/STL_Header/v120","CustomerID").equals(reader.getName())){
                                
                                                object.setCustomerID(com.sabre.services.stl_header.v120.PseudoCityCodeOrOAC.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://services.sabre.com/STL_Header/v120","CustomerAppID").equals(reader.getName())){
                                
                                                object.setCustomerAppID(com.sabre.services.stl_header.v120.TextShort.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://services.sabre.com/STL_Header/v120","ConversationID").equals(reader.getName())){
                                
                                                object.setConversationID(com.sabre.services.stl_header.v120.TrackingID.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://services.sabre.com/STL_Header/v120","MessageID").equals(reader.getName())){
                                
                                                object.setMessageID(com.sabre.services.stl_header.v120.Identifier.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://services.sabre.com/STL_Header/v120","TimeStamp").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"TimeStamp" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTimeStamp(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                              
                                        reader.next();
                                    
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
           
    