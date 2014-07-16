
/**
 * TravelItineraryReadRQ.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.sabre.webservices.sabrexml._2011._10;
            

            /**
            *  TravelItineraryReadRQ bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class TravelItineraryReadRQ
        implements org.apache.axis2.databinding.ADBBean{
        
                public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://webservices.sabre.com/sabreXML/2011/10",
                "TravelItineraryReadRQ",
                "ns1");

            

                        /**
                        * field for MessagingDetails
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.MessagingDetails_type0 localMessagingDetails ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.sabre.webservices.sabrexml._2011._10.MessagingDetails_type0
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.MessagingDetails_type0 getMessagingDetails(){
                               return localMessagingDetails;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MessagingDetails
                               */
                               public void setMessagingDetails(com.sabre.webservices.sabrexml._2011._10.MessagingDetails_type0 param){
                            
                                            this.localMessagingDetails=param;
                                    

                               }
                            

                        /**
                        * field for UniqueID
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.UniqueID_type0 localUniqueID ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUniqueIDTracker = false ;

                           public boolean isUniqueIDSpecified(){
                               return localUniqueIDTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.sabre.webservices.sabrexml._2011._10.UniqueID_type0
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.UniqueID_type0 getUniqueID(){
                               return localUniqueID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UniqueID
                               */
                               public void setUniqueID(com.sabre.webservices.sabrexml._2011._10.UniqueID_type0 param){
                            localUniqueIDTracker = param != null;
                                   
                                            this.localUniqueID=param;
                                    

                               }
                            

                        /**
                        * field for ReturnHostCommand
                        * This was an Attribute!
                        */

                        
                                    protected boolean localReturnHostCommand ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getReturnHostCommand(){
                               return localReturnHostCommand;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ReturnHostCommand
                               */
                               public void setReturnHostCommand(boolean param){
                            
                                            this.localReturnHostCommand=param;
                                    

                               }
                            

                        /**
                        * field for TimeStamp
                        * This was an Attribute!
                        */

                        
                                    protected java.util.Calendar localTimeStamp ;
                                

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
                            
                                            this.localTimeStamp=param;
                                    

                               }
                            

                        /**
                        * field for Version
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localVersion ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getVersion(){
                               return localVersion;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Version
                               */
                               public void setVersion(java.lang.String param){
                            
                                            this.localVersion=param;
                                    

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
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://webservices.sabre.com/sabreXML/2011/10");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":TravelItineraryReadRQ",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "TravelItineraryReadRQ",
                           xmlWriter);
                   }

               
                   }
               
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "ReturnHostCommand",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReturnHostCommand), xmlWriter);

                                            
                                      }
                                    
                                            if (localTimeStamp != null){
                                        
                                                writeAttribute("",
                                                         "TimeStamp",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTimeStamp), xmlWriter);

                                            
                                      }
                                    
                                            if (localVersion != null){
                                        
                                                writeAttribute("",
                                                         "Version",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localVersion), xmlWriter);

                                            
                                      }
                                    
                                      else {
                                          throw new org.apache.axis2.databinding.ADBException("required attribute localVersion is null");
                                      }
                                    
                                            if (localMessagingDetails==null){
                                                 throw new org.apache.axis2.databinding.ADBException("MessagingDetails cannot be null!!");
                                            }
                                           localMessagingDetails.serialize(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","MessagingDetails"),
                                               xmlWriter);
                                         if (localUniqueIDTracker){
                                            if (localUniqueID==null){
                                                 throw new org.apache.axis2.databinding.ADBException("UniqueID cannot be null!!");
                                            }
                                           localUniqueID.serialize(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","UniqueID"),
                                               xmlWriter);
                                        }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://webservices.sabre.com/sabreXML/2011/10")){
                return "ns1";
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

                
                            elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                      "MessagingDetails"));
                            
                            
                                    if (localMessagingDetails==null){
                                         throw new org.apache.axis2.databinding.ADBException("MessagingDetails cannot be null!!");
                                    }
                                    elementList.add(localMessagingDetails);
                                 if (localUniqueIDTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                      "UniqueID"));
                            
                            
                                    if (localUniqueID==null){
                                         throw new org.apache.axis2.databinding.ADBException("UniqueID cannot be null!!");
                                    }
                                    elementList.add(localUniqueID);
                                }
                            attribList.add(
                            new javax.xml.namespace.QName("","ReturnHostCommand"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReturnHostCommand));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","TimeStamp"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTimeStamp));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","Version"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localVersion));
                                

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
        public static TravelItineraryReadRQ parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            TravelItineraryReadRQ object =
                new TravelItineraryReadRQ();

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
                    
                            if (!"TravelItineraryReadRQ".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (TravelItineraryReadRQ)org.xmlsoap.schemas.soap.envelope.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    // handle attribute "ReturnHostCommand"
                    java.lang.String tempAttribReturnHostCommand =
                        
                                reader.getAttributeValue(null,"ReturnHostCommand");
                            
                   if (tempAttribReturnHostCommand!=null){
                         java.lang.String content = tempAttribReturnHostCommand;
                        
                                                 object.setReturnHostCommand(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribReturnHostCommand));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("ReturnHostCommand");
                    
                    // handle attribute "TimeStamp"
                    java.lang.String tempAttribTimeStamp =
                        
                                reader.getAttributeValue(null,"TimeStamp");
                            
                   if (tempAttribTimeStamp!=null){
                         java.lang.String content = tempAttribTimeStamp;
                        
                                                 object.setTimeStamp(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(tempAttribTimeStamp));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("TimeStamp");
                    
                    // handle attribute "Version"
                    java.lang.String tempAttribVersion =
                        
                                reader.getAttributeValue(null,"Version");
                            
                   if (tempAttribVersion!=null){
                         java.lang.String content = tempAttribVersion;
                        
                                                 object.setVersion(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribVersion));
                                            
                    } else {
                       
                               throw new org.apache.axis2.databinding.ADBException("Required attribute Version is missing");
                           
                    }
                    handledAttributes.add("Version");
                    
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","MessagingDetails").equals(reader.getName())){
                                
                                                object.setMessagingDetails(com.sabre.webservices.sabrexml._2011._10.MessagingDetails_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","UniqueID").equals(reader.getName())){
                                
                                                object.setUniqueID(com.sabre.webservices.sabrexml._2011._10.UniqueID_type0.Factory.parse(reader));
                                              
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
           
    