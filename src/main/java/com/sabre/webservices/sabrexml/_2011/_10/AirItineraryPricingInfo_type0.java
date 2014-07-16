
/**
 * AirItineraryPricingInfo_type0.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.sabre.webservices.sabrexml._2011._10;
            

            /**
            *  AirItineraryPricingInfo_type0 bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class AirItineraryPricingInfo_type0
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = AirItineraryPricingInfo_type0
                Namespace URI = http://webservices.sabre.com/sabreXML/2011/10
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for ItinTotalFare
                        * This was an Array!
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.ItinTotalFare_type1[] localItinTotalFare ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localItinTotalFareTracker = false ;

                           public boolean isItinTotalFareSpecified(){
                               return localItinTotalFareTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.sabre.webservices.sabrexml._2011._10.ItinTotalFare_type1[]
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.ItinTotalFare_type1[] getItinTotalFare(){
                               return localItinTotalFare;
                           }

                           
                        


                               
                              /**
                               * validate the array for ItinTotalFare
                               */
                              protected void validateItinTotalFare(com.sabre.webservices.sabrexml._2011._10.ItinTotalFare_type1[] param){
                             
                              if ((param != null) && (param.length > 7)){
                                throw new java.lang.RuntimeException();
                              }
                              
                              }


                             /**
                              * Auto generated setter method
                              * @param param ItinTotalFare
                              */
                              public void setItinTotalFare(com.sabre.webservices.sabrexml._2011._10.ItinTotalFare_type1[] param){
                              
                                   validateItinTotalFare(param);

                               localItinTotalFareTracker = param != null;
                                      
                                      this.localItinTotalFare=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.sabre.webservices.sabrexml._2011._10.ItinTotalFare_type1
                             */
                             public void addItinTotalFare(com.sabre.webservices.sabrexml._2011._10.ItinTotalFare_type1 param){
                                   if (localItinTotalFare == null){
                                   localItinTotalFare = new com.sabre.webservices.sabrexml._2011._10.ItinTotalFare_type1[]{};
                                   }

                            
                                 //update the setting tracker
                                localItinTotalFareTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localItinTotalFare);
                               list.add(param);
                               this.localItinTotalFare =
                             (com.sabre.webservices.sabrexml._2011._10.ItinTotalFare_type1[])list.toArray(
                            new com.sabre.webservices.sabrexml._2011._10.ItinTotalFare_type1[list.size()]);

                             }
                             

                        /**
                        * field for PassengerTypeQuantity
                        * This was an Array!
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.PassengerTypeQuantity_type1[] localPassengerTypeQuantity ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPassengerTypeQuantityTracker = false ;

                           public boolean isPassengerTypeQuantitySpecified(){
                               return localPassengerTypeQuantityTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.sabre.webservices.sabrexml._2011._10.PassengerTypeQuantity_type1[]
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.PassengerTypeQuantity_type1[] getPassengerTypeQuantity(){
                               return localPassengerTypeQuantity;
                           }

                           
                        


                               
                              /**
                               * validate the array for PassengerTypeQuantity
                               */
                              protected void validatePassengerTypeQuantity(com.sabre.webservices.sabrexml._2011._10.PassengerTypeQuantity_type1[] param){
                             
                              if ((param != null) && (param.length > 7)){
                                throw new java.lang.RuntimeException();
                              }
                              
                              }


                             /**
                              * Auto generated setter method
                              * @param param PassengerTypeQuantity
                              */
                              public void setPassengerTypeQuantity(com.sabre.webservices.sabrexml._2011._10.PassengerTypeQuantity_type1[] param){
                              
                                   validatePassengerTypeQuantity(param);

                               localPassengerTypeQuantityTracker = param != null;
                                      
                                      this.localPassengerTypeQuantity=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.sabre.webservices.sabrexml._2011._10.PassengerTypeQuantity_type1
                             */
                             public void addPassengerTypeQuantity(com.sabre.webservices.sabrexml._2011._10.PassengerTypeQuantity_type1 param){
                                   if (localPassengerTypeQuantity == null){
                                   localPassengerTypeQuantity = new com.sabre.webservices.sabrexml._2011._10.PassengerTypeQuantity_type1[]{};
                                   }

                            
                                 //update the setting tracker
                                localPassengerTypeQuantityTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localPassengerTypeQuantity);
                               list.add(param);
                               this.localPassengerTypeQuantity =
                             (com.sabre.webservices.sabrexml._2011._10.PassengerTypeQuantity_type1[])list.toArray(
                            new com.sabre.webservices.sabrexml._2011._10.PassengerTypeQuantity_type1[list.size()]);

                             }
                             

                        /**
                        * field for PrivateFareInformation
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.PrivateFareInformation_type0 localPrivateFareInformation ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPrivateFareInformationTracker = false ;

                           public boolean isPrivateFareInformationSpecified(){
                               return localPrivateFareInformationTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.sabre.webservices.sabrexml._2011._10.PrivateFareInformation_type0
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.PrivateFareInformation_type0 getPrivateFareInformation(){
                               return localPrivateFareInformation;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PrivateFareInformation
                               */
                               public void setPrivateFareInformation(com.sabre.webservices.sabrexml._2011._10.PrivateFareInformation_type0 param){
                            localPrivateFareInformationTracker = param != null;
                                   
                                            this.localPrivateFareInformation=param;
                                    

                               }
                            

                        /**
                        * field for PTC_FareBreakdown
                        * This was an Array!
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.PTC_FareBreakdown_type1[] localPTC_FareBreakdown ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPTC_FareBreakdownTracker = false ;

                           public boolean isPTC_FareBreakdownSpecified(){
                               return localPTC_FareBreakdownTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.sabre.webservices.sabrexml._2011._10.PTC_FareBreakdown_type1[]
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.PTC_FareBreakdown_type1[] getPTC_FareBreakdown(){
                               return localPTC_FareBreakdown;
                           }

                           
                        


                               
                              /**
                               * validate the array for PTC_FareBreakdown
                               */
                              protected void validatePTC_FareBreakdown(com.sabre.webservices.sabrexml._2011._10.PTC_FareBreakdown_type1[] param){
                             
                              if ((param != null) && (param.length > 7)){
                                throw new java.lang.RuntimeException();
                              }
                              
                              }


                             /**
                              * Auto generated setter method
                              * @param param PTC_FareBreakdown
                              */
                              public void setPTC_FareBreakdown(com.sabre.webservices.sabrexml._2011._10.PTC_FareBreakdown_type1[] param){
                              
                                   validatePTC_FareBreakdown(param);

                               localPTC_FareBreakdownTracker = param != null;
                                      
                                      this.localPTC_FareBreakdown=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.sabre.webservices.sabrexml._2011._10.PTC_FareBreakdown_type1
                             */
                             public void addPTC_FareBreakdown(com.sabre.webservices.sabrexml._2011._10.PTC_FareBreakdown_type1 param){
                                   if (localPTC_FareBreakdown == null){
                                   localPTC_FareBreakdown = new com.sabre.webservices.sabrexml._2011._10.PTC_FareBreakdown_type1[]{};
                                   }

                            
                                 //update the setting tracker
                                localPTC_FareBreakdownTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localPTC_FareBreakdown);
                               list.add(param);
                               this.localPTC_FareBreakdown =
                             (com.sabre.webservices.sabrexml._2011._10.PTC_FareBreakdown_type1[])list.toArray(
                            new com.sabre.webservices.sabrexml._2011._10.PTC_FareBreakdown_type1[list.size()]);

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
                           namespacePrefix+":AirItineraryPricingInfo_type0",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "AirItineraryPricingInfo_type0",
                           xmlWriter);
                   }

               
                   }
                if (localItinTotalFareTracker){
                                       if (localItinTotalFare!=null){
                                            for (int i = 0;i < localItinTotalFare.length;i++){
                                                if (localItinTotalFare[i] != null){
                                                 localItinTotalFare[i].serialize(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","ItinTotalFare"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                        // we don't have to do any thing since minOccures is zero
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("ItinTotalFare cannot be null!!");
                                        
                                    }
                                 } if (localPassengerTypeQuantityTracker){
                                       if (localPassengerTypeQuantity!=null){
                                            for (int i = 0;i < localPassengerTypeQuantity.length;i++){
                                                if (localPassengerTypeQuantity[i] != null){
                                                 localPassengerTypeQuantity[i].serialize(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","PassengerTypeQuantity"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                        // we don't have to do any thing since minOccures is zero
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("PassengerTypeQuantity cannot be null!!");
                                        
                                    }
                                 } if (localPrivateFareInformationTracker){
                                            if (localPrivateFareInformation==null){
                                                 throw new org.apache.axis2.databinding.ADBException("PrivateFareInformation cannot be null!!");
                                            }
                                           localPrivateFareInformation.serialize(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","PrivateFareInformation"),
                                               xmlWriter);
                                        } if (localPTC_FareBreakdownTracker){
                                       if (localPTC_FareBreakdown!=null){
                                            for (int i = 0;i < localPTC_FareBreakdown.length;i++){
                                                if (localPTC_FareBreakdown[i] != null){
                                                 localPTC_FareBreakdown[i].serialize(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","PTC_FareBreakdown"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                        // we don't have to do any thing since minOccures is zero
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("PTC_FareBreakdown cannot be null!!");
                                        
                                    }
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

                 if (localItinTotalFareTracker){
                             if (localItinTotalFare!=null) {
                                 for (int i = 0;i < localItinTotalFare.length;i++){

                                    if (localItinTotalFare[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                          "ItinTotalFare"));
                                         elementList.add(localItinTotalFare[i]);
                                    } else {
                                        
                                                // nothing to do
                                            
                                    }

                                 }
                             } else {
                                 
                                        throw new org.apache.axis2.databinding.ADBException("ItinTotalFare cannot be null!!");
                                    
                             }

                        } if (localPassengerTypeQuantityTracker){
                             if (localPassengerTypeQuantity!=null) {
                                 for (int i = 0;i < localPassengerTypeQuantity.length;i++){

                                    if (localPassengerTypeQuantity[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                          "PassengerTypeQuantity"));
                                         elementList.add(localPassengerTypeQuantity[i]);
                                    } else {
                                        
                                                // nothing to do
                                            
                                    }

                                 }
                             } else {
                                 
                                        throw new org.apache.axis2.databinding.ADBException("PassengerTypeQuantity cannot be null!!");
                                    
                             }

                        } if (localPrivateFareInformationTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                      "PrivateFareInformation"));
                            
                            
                                    if (localPrivateFareInformation==null){
                                         throw new org.apache.axis2.databinding.ADBException("PrivateFareInformation cannot be null!!");
                                    }
                                    elementList.add(localPrivateFareInformation);
                                } if (localPTC_FareBreakdownTracker){
                             if (localPTC_FareBreakdown!=null) {
                                 for (int i = 0;i < localPTC_FareBreakdown.length;i++){

                                    if (localPTC_FareBreakdown[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                          "PTC_FareBreakdown"));
                                         elementList.add(localPTC_FareBreakdown[i]);
                                    } else {
                                        
                                                // nothing to do
                                            
                                    }

                                 }
                             } else {
                                 
                                        throw new org.apache.axis2.databinding.ADBException("PTC_FareBreakdown cannot be null!!");
                                    
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
        public static AirItineraryPricingInfo_type0 parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            AirItineraryPricingInfo_type0 object =
                new AirItineraryPricingInfo_type0();

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
                    
                            if (!"AirItineraryPricingInfo_type0".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (AirItineraryPricingInfo_type0)org.xmlsoap.schemas.soap.envelope.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                        java.util.ArrayList list1 = new java.util.ArrayList();
                    
                        java.util.ArrayList list2 = new java.util.ArrayList();
                    
                        java.util.ArrayList list4 = new java.util.ArrayList();
                    
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","ItinTotalFare").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list1.add(com.sabre.webservices.sabrexml._2011._10.ItinTotalFare_type1.Factory.parse(reader));
                                                                
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
                                                                if (new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","ItinTotalFare").equals(reader.getName())){
                                                                    list1.add(com.sabre.webservices.sabrexml._2011._10.ItinTotalFare_type1.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone1 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setItinTotalFare((com.sabre.webservices.sabrexml._2011._10.ItinTotalFare_type1[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.sabre.webservices.sabrexml._2011._10.ItinTotalFare_type1.class,
                                                                list1));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","PassengerTypeQuantity").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list2.add(com.sabre.webservices.sabrexml._2011._10.PassengerTypeQuantity_type1.Factory.parse(reader));
                                                                
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone2 = false;
                                                        while(!loopDone2){
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
                                                                loopDone2 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","PassengerTypeQuantity").equals(reader.getName())){
                                                                    list2.add(com.sabre.webservices.sabrexml._2011._10.PassengerTypeQuantity_type1.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone2 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setPassengerTypeQuantity((com.sabre.webservices.sabrexml._2011._10.PassengerTypeQuantity_type1[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.sabre.webservices.sabrexml._2011._10.PassengerTypeQuantity_type1.class,
                                                                list2));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","PrivateFareInformation").equals(reader.getName())){
                                
                                                object.setPrivateFareInformation(com.sabre.webservices.sabrexml._2011._10.PrivateFareInformation_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","PTC_FareBreakdown").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list4.add(com.sabre.webservices.sabrexml._2011._10.PTC_FareBreakdown_type1.Factory.parse(reader));
                                                                
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone4 = false;
                                                        while(!loopDone4){
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
                                                                loopDone4 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","PTC_FareBreakdown").equals(reader.getName())){
                                                                    list4.add(com.sabre.webservices.sabrexml._2011._10.PTC_FareBreakdown_type1.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone4 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setPTC_FareBreakdown((com.sabre.webservices.sabrexml._2011._10.PTC_FareBreakdown_type1[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.sabre.webservices.sabrexml._2011._10.PTC_FareBreakdown_type1.class,
                                                                list4));
                                                            
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
           
    