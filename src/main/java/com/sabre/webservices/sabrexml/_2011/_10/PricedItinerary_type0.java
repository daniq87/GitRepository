
/**
 * PricedItinerary_type0.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.sabre.webservices.sabrexml._2011._10;
            

            /**
            *  PricedItinerary_type0 bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class PricedItinerary_type0
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = PricedItinerary_type0
                Namespace URI = http://webservices.sabre.com/sabreXML/2011/10
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for AirItineraryPricingInfo
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.AirItineraryPricingInfo_type0 localAirItineraryPricingInfo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAirItineraryPricingInfoTracker = false ;

                           public boolean isAirItineraryPricingInfoSpecified(){
                               return localAirItineraryPricingInfoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.sabre.webservices.sabrexml._2011._10.AirItineraryPricingInfo_type0
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.AirItineraryPricingInfo_type0 getAirItineraryPricingInfo(){
                               return localAirItineraryPricingInfo;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AirItineraryPricingInfo
                               */
                               public void setAirItineraryPricingInfo(com.sabre.webservices.sabrexml._2011._10.AirItineraryPricingInfo_type0 param){
                            localAirItineraryPricingInfoTracker = param != null;
                                   
                                            this.localAirItineraryPricingInfo=param;
                                    

                               }
                            

                        /**
                        * field for DeletedBy
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localDeletedBy ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getDeletedBy(){
                               return localDeletedBy;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DeletedBy
                               */
                               public void setDeletedBy(java.lang.String param){
                            
                                            this.localDeletedBy=param;
                                    

                               }
                            

                        /**
                        * field for InputMessage
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localInputMessage ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getInputMessage(){
                               return localInputMessage;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param InputMessage
                               */
                               public void setInputMessage(java.lang.String param){
                            
                                            this.localInputMessage=param;
                                    

                               }
                            

                        /**
                        * field for RPH
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localRPH ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getRPH(){
                               return localRPH;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RPH
                               */
                               public void setRPH(java.lang.String param){
                            
                                            this.localRPH=param;
                                    

                               }
                            

                        /**
                        * field for StatusCode
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localStatusCode ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getStatusCode(){
                               return localStatusCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param StatusCode
                               */
                               public void setStatusCode(java.lang.String param){
                            
                                            this.localStatusCode=param;
                                    

                               }
                            

                        /**
                        * field for TaxExempt
                        * This was an Attribute!
                        */

                        
                                    protected boolean localTaxExempt ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getTaxExempt(){
                               return localTaxExempt;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TaxExempt
                               */
                               public void setTaxExempt(boolean param){
                            
                                            this.localTaxExempt=param;
                                    

                               }
                            

                        /**
                        * field for ValidatingCarrier
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localValidatingCarrier ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getValidatingCarrier(){
                               return localValidatingCarrier;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ValidatingCarrier
                               */
                               public void setValidatingCarrier(java.lang.String param){
                            
                                            this.localValidatingCarrier=param;
                                    

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
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://webservices.sabre.com/sabreXML/2011/10");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":PricedItinerary_type0",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "PricedItinerary_type0",
                           xmlWriter);
                   }

               
                   }
               
                                            if (localDeletedBy != null){
                                        
                                                writeAttribute("",
                                                         "DeletedBy",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDeletedBy), xmlWriter);

                                            
                                      }
                                    
                                            if (localInputMessage != null){
                                        
                                                writeAttribute("",
                                                         "InputMessage",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localInputMessage), xmlWriter);

                                            
                                      }
                                    
                                            if (localRPH != null){
                                        
                                                writeAttribute("",
                                                         "RPH",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRPH), xmlWriter);

                                            
                                      }
                                    
                                            if (localStatusCode != null){
                                        
                                                writeAttribute("",
                                                         "StatusCode",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStatusCode), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "TaxExempt",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTaxExempt), xmlWriter);

                                            
                                      }
                                    
                                            if (localValidatingCarrier != null){
                                        
                                                writeAttribute("",
                                                         "ValidatingCarrier",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localValidatingCarrier), xmlWriter);

                                            
                                      }
                                     if (localAirItineraryPricingInfoTracker){
                                            if (localAirItineraryPricingInfo==null){
                                                 throw new org.apache.axis2.databinding.ADBException("AirItineraryPricingInfo cannot be null!!");
                                            }
                                           localAirItineraryPricingInfo.serialize(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","AirItineraryPricingInfo"),
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

                 if (localAirItineraryPricingInfoTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                      "AirItineraryPricingInfo"));
                            
                            
                                    if (localAirItineraryPricingInfo==null){
                                         throw new org.apache.axis2.databinding.ADBException("AirItineraryPricingInfo cannot be null!!");
                                    }
                                    elementList.add(localAirItineraryPricingInfo);
                                }
                            attribList.add(
                            new javax.xml.namespace.QName("","DeletedBy"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDeletedBy));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","InputMessage"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localInputMessage));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","RPH"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRPH));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","StatusCode"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStatusCode));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","TaxExempt"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTaxExempt));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","ValidatingCarrier"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localValidatingCarrier));
                                

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
        public static PricedItinerary_type0 parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            PricedItinerary_type0 object =
                new PricedItinerary_type0();

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
                    
                            if (!"PricedItinerary_type0".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (PricedItinerary_type0)org.xmlsoap.schemas.soap.envelope.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    // handle attribute "DeletedBy"
                    java.lang.String tempAttribDeletedBy =
                        
                                reader.getAttributeValue(null,"DeletedBy");
                            
                   if (tempAttribDeletedBy!=null){
                         java.lang.String content = tempAttribDeletedBy;
                        
                                                 object.setDeletedBy(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribDeletedBy));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("DeletedBy");
                    
                    // handle attribute "InputMessage"
                    java.lang.String tempAttribInputMessage =
                        
                                reader.getAttributeValue(null,"InputMessage");
                            
                   if (tempAttribInputMessage!=null){
                         java.lang.String content = tempAttribInputMessage;
                        
                                                 object.setInputMessage(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribInputMessage));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("InputMessage");
                    
                    // handle attribute "RPH"
                    java.lang.String tempAttribRPH =
                        
                                reader.getAttributeValue(null,"RPH");
                            
                   if (tempAttribRPH!=null){
                         java.lang.String content = tempAttribRPH;
                        
                                                 object.setRPH(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribRPH));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("RPH");
                    
                    // handle attribute "StatusCode"
                    java.lang.String tempAttribStatusCode =
                        
                                reader.getAttributeValue(null,"StatusCode");
                            
                   if (tempAttribStatusCode!=null){
                         java.lang.String content = tempAttribStatusCode;
                        
                                                 object.setStatusCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribStatusCode));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("StatusCode");
                    
                    // handle attribute "TaxExempt"
                    java.lang.String tempAttribTaxExempt =
                        
                                reader.getAttributeValue(null,"TaxExempt");
                            
                   if (tempAttribTaxExempt!=null){
                         java.lang.String content = tempAttribTaxExempt;
                        
                                                 object.setTaxExempt(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribTaxExempt));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("TaxExempt");
                    
                    // handle attribute "ValidatingCarrier"
                    java.lang.String tempAttribValidatingCarrier =
                        
                                reader.getAttributeValue(null,"ValidatingCarrier");
                            
                   if (tempAttribValidatingCarrier!=null){
                         java.lang.String content = tempAttribValidatingCarrier;
                        
                                                 object.setValidatingCarrier(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribValidatingCarrier));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("ValidatingCarrier");
                    
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","AirItineraryPricingInfo").equals(reader.getName())){
                                
                                                object.setAirItineraryPricingInfo(com.sabre.webservices.sabrexml._2011._10.AirItineraryPricingInfo_type0.Factory.parse(reader));
                                              
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
           
    