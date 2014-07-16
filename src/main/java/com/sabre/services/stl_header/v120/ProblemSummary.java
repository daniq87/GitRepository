
/**
 * ProblemSummary.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.sabre.services.stl_header.v120;
            

            /**
            *  ProblemSummary bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ProblemSummary
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = ProblemSummary
                Namespace URI = http://services.sabre.com/STL_Header/v120
                Namespace Prefix = ns2
                */
            

                        /**
                        * field for Source
                        */

                        
                                    protected com.sabre.services.stl_header.v120.IdentifierSystem localSource ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSourceTracker = false ;

                           public boolean isSourceSpecified(){
                               return localSourceTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.sabre.services.stl_header.v120.IdentifierSystem
                           */
                           public  com.sabre.services.stl_header.v120.IdentifierSystem getSource(){
                               return localSource;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Source
                               */
                               public void setSource(com.sabre.services.stl_header.v120.IdentifierSystem param){
                            localSourceTracker = param != null;
                                   
                                            this.localSource=param;
                                    

                               }
                            

                        /**
                        * field for ReportingSystem
                        */

                        
                                    protected com.sabre.services.stl_header.v120.IdentifierSystem localReportingSystem ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.sabre.services.stl_header.v120.IdentifierSystem
                           */
                           public  com.sabre.services.stl_header.v120.IdentifierSystem getReportingSystem(){
                               return localReportingSystem;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ReportingSystem
                               */
                               public void setReportingSystem(com.sabre.services.stl_header.v120.IdentifierSystem param){
                            
                                            this.localReportingSystem=param;
                                    

                               }
                            

                        /**
                        * field for Message
                        */

                        
                                    protected com.sabre.services.stl_header.v120.MessageCondition localMessage ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMessageTracker = false ;

                           public boolean isMessageSpecified(){
                               return localMessageTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.sabre.services.stl_header.v120.MessageCondition
                           */
                           public  com.sabre.services.stl_header.v120.MessageCondition getMessage(){
                               return localMessage;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Message
                               */
                               public void setMessage(com.sabre.services.stl_header.v120.MessageCondition param){
                            localMessageTracker = param != null;
                                   
                                            this.localMessage=param;
                                    

                               }
                            

                        /**
                        * field for ShortText
                        */

                        
                                    protected com.sabre.services.stl_header.v120.TextShort localShortText ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localShortTextTracker = false ;

                           public boolean isShortTextSpecified(){
                               return localShortTextTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.sabre.services.stl_header.v120.TextShort
                           */
                           public  com.sabre.services.stl_header.v120.TextShort getShortText(){
                               return localShortText;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ShortText
                               */
                               public void setShortText(com.sabre.services.stl_header.v120.TextShort param){
                            localShortTextTracker = param != null;
                                   
                                            this.localShortText=param;
                                    

                               }
                            

                        /**
                        * field for Type
                        * This was an Attribute!
                        */

                        
                                    protected com.sabre.services.stl_header.v120.ErrorType localType ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.sabre.services.stl_header.v120.ErrorType
                           */
                           public  com.sabre.services.stl_header.v120.ErrorType getType(){
                               return localType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Type
                               */
                               public void setType(com.sabre.services.stl_header.v120.ErrorType param){
                            
                                            this.localType=param;
                                    

                               }
                            

                        /**
                        * field for Status
                        * This was an Attribute!
                        */

                        
                                    protected com.sabre.services.stl_header.v120.CompletionCodes localStatus ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.sabre.services.stl_header.v120.CompletionCodes
                           */
                           public  com.sabre.services.stl_header.v120.CompletionCodes getStatus(){
                               return localStatus;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Status
                               */
                               public void setStatus(com.sabre.services.stl_header.v120.CompletionCodes param){
                            
                                            this.localStatus=param;
                                    

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
                           namespacePrefix+":ProblemSummary",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "ProblemSummary",
                           xmlWriter);
                   }

               
                   }
               
                                    
                                    if (localType != null){
                                        writeAttribute("",
                                           "type",
                                           localType.toString(), xmlWriter);
                                    }
                                    
                                      else {
                                          throw new org.apache.axis2.databinding.ADBException("required attribute localType is null");
                                      }
                                    
                                    
                                    if (localStatus != null){
                                        writeAttribute("",
                                           "status",
                                           localStatus.toString(), xmlWriter);
                                    }
                                    
                                      else {
                                          throw new org.apache.axis2.databinding.ADBException("required attribute localStatus is null");
                                      }
                                    
                                            if (localTimeStamp != null){
                                        
                                                writeAttribute("",
                                                         "timeStamp",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTimeStamp), xmlWriter);

                                            
                                      }
                                     if (localSourceTracker){
                                            if (localSource==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Source cannot be null!!");
                                            }
                                           localSource.serialize(new javax.xml.namespace.QName("http://services.sabre.com/STL_Header/v120","Source"),
                                               xmlWriter);
                                        }
                                            if (localReportingSystem==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ReportingSystem cannot be null!!");
                                            }
                                           localReportingSystem.serialize(new javax.xml.namespace.QName("http://services.sabre.com/STL_Header/v120","ReportingSystem"),
                                               xmlWriter);
                                         if (localMessageTracker){
                                            if (localMessage==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Message cannot be null!!");
                                            }
                                           localMessage.serialize(new javax.xml.namespace.QName("http://services.sabre.com/STL_Header/v120","Message"),
                                               xmlWriter);
                                        } if (localShortTextTracker){
                                            if (localShortText==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ShortText cannot be null!!");
                                            }
                                           localShortText.serialize(new javax.xml.namespace.QName("http://services.sabre.com/STL_Header/v120","ShortText"),
                                               xmlWriter);
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

                 if (localSourceTracker){
                            elementList.add(new javax.xml.namespace.QName("http://services.sabre.com/STL_Header/v120",
                                                                      "Source"));
                            
                            
                                    if (localSource==null){
                                         throw new org.apache.axis2.databinding.ADBException("Source cannot be null!!");
                                    }
                                    elementList.add(localSource);
                                }
                            elementList.add(new javax.xml.namespace.QName("http://services.sabre.com/STL_Header/v120",
                                                                      "ReportingSystem"));
                            
                            
                                    if (localReportingSystem==null){
                                         throw new org.apache.axis2.databinding.ADBException("ReportingSystem cannot be null!!");
                                    }
                                    elementList.add(localReportingSystem);
                                 if (localMessageTracker){
                            elementList.add(new javax.xml.namespace.QName("http://services.sabre.com/STL_Header/v120",
                                                                      "Message"));
                            
                            
                                    if (localMessage==null){
                                         throw new org.apache.axis2.databinding.ADBException("Message cannot be null!!");
                                    }
                                    elementList.add(localMessage);
                                } if (localShortTextTracker){
                            elementList.add(new javax.xml.namespace.QName("http://services.sabre.com/STL_Header/v120",
                                                                      "ShortText"));
                            
                            
                                    if (localShortText==null){
                                         throw new org.apache.axis2.databinding.ADBException("ShortText cannot be null!!");
                                    }
                                    elementList.add(localShortText);
                                }
                            attribList.add(
                            new javax.xml.namespace.QName("","type"));
                            
                                      attribList.add(localType.toString());
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","status"));
                            
                                      attribList.add(localStatus.toString());
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","timeStamp"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTimeStamp));
                                

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
        public static ProblemSummary parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            ProblemSummary object =
                new ProblemSummary();

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
                    
                            if (!"ProblemSummary".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (ProblemSummary)org.xmlsoap.schemas.soap.envelope.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    // handle attribute "type"
                    java.lang.String tempAttribType =
                        
                                reader.getAttributeValue(null,"type");
                            
                   if (tempAttribType!=null){
                         java.lang.String content = tempAttribType;
                        
                                                  object.setType(
                                                        com.sabre.services.stl_header.v120.ErrorType.Factory.fromString(reader,tempAttribType));
                                            
                    } else {
                       
                               throw new org.apache.axis2.databinding.ADBException("Required attribute type is missing");
                           
                    }
                    handledAttributes.add("type");
                    
                    // handle attribute "status"
                    java.lang.String tempAttribStatus =
                        
                                reader.getAttributeValue(null,"status");
                            
                   if (tempAttribStatus!=null){
                         java.lang.String content = tempAttribStatus;
                        
                                                  object.setStatus(
                                                        com.sabre.services.stl_header.v120.CompletionCodes.Factory.fromString(reader,tempAttribStatus));
                                            
                    } else {
                       
                               throw new org.apache.axis2.databinding.ADBException("Required attribute status is missing");
                           
                    }
                    handledAttributes.add("status");
                    
                    // handle attribute "timeStamp"
                    java.lang.String tempAttribTimeStamp =
                        
                                reader.getAttributeValue(null,"timeStamp");
                            
                   if (tempAttribTimeStamp!=null){
                         java.lang.String content = tempAttribTimeStamp;
                        
                                                 object.setTimeStamp(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(tempAttribTimeStamp));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("timeStamp");
                    
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://services.sabre.com/STL_Header/v120","Source").equals(reader.getName())){
                                
                                                object.setSource(com.sabre.services.stl_header.v120.IdentifierSystem.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://services.sabre.com/STL_Header/v120","ReportingSystem").equals(reader.getName())){
                                
                                                object.setReportingSystem(com.sabre.services.stl_header.v120.IdentifierSystem.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://services.sabre.com/STL_Header/v120","Message").equals(reader.getName())){
                                
                                                object.setMessage(com.sabre.services.stl_header.v120.MessageCondition.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://services.sabre.com/STL_Header/v120","ShortText").equals(reader.getName())){
                                
                                                object.setShortText(com.sabre.services.stl_header.v120.TextShort.Factory.parse(reader));
                                              
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
           
    