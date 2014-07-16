
/**
 * PTC_FareBreakdown_type1.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.sabre.webservices.sabrexml._2011._10;
            

            /**
            *  PTC_FareBreakdown_type1 bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class PTC_FareBreakdown_type1
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = PTC_FareBreakdown_type1
                Namespace URI = http://webservices.sabre.com/sabreXML/2011/10
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for Endorsements
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.Endorsements_type1 localEndorsements ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localEndorsementsTracker = false ;

                           public boolean isEndorsementsSpecified(){
                               return localEndorsementsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.sabre.webservices.sabrexml._2011._10.Endorsements_type1
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.Endorsements_type1 getEndorsements(){
                               return localEndorsements;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Endorsements
                               */
                               public void setEndorsements(com.sabre.webservices.sabrexml._2011._10.Endorsements_type1 param){
                            localEndorsementsTracker = param != null;
                                   
                                            this.localEndorsements=param;
                                    

                               }
                            

                        /**
                        * field for FareBasis
                        * This was an Array!
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.FareBasis_type2[] localFareBasis ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localFareBasisTracker = false ;

                           public boolean isFareBasisSpecified(){
                               return localFareBasisTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.sabre.webservices.sabrexml._2011._10.FareBasis_type2[]
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.FareBasis_type2[] getFareBasis(){
                               return localFareBasis;
                           }

                           
                        


                               
                              /**
                               * validate the array for FareBasis
                               */
                              protected void validateFareBasis(com.sabre.webservices.sabrexml._2011._10.FareBasis_type2[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param FareBasis
                              */
                              public void setFareBasis(com.sabre.webservices.sabrexml._2011._10.FareBasis_type2[] param){
                              
                                   validateFareBasis(param);

                               localFareBasisTracker = param != null;
                                      
                                      this.localFareBasis=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.sabre.webservices.sabrexml._2011._10.FareBasis_type2
                             */
                             public void addFareBasis(com.sabre.webservices.sabrexml._2011._10.FareBasis_type2 param){
                                   if (localFareBasis == null){
                                   localFareBasis = new com.sabre.webservices.sabrexml._2011._10.FareBasis_type2[]{};
                                   }

                            
                                 //update the setting tracker
                                localFareBasisTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localFareBasis);
                               list.add(param);
                               this.localFareBasis =
                             (com.sabre.webservices.sabrexml._2011._10.FareBasis_type2[])list.toArray(
                            new com.sabre.webservices.sabrexml._2011._10.FareBasis_type2[list.size()]);

                             }
                             

                        /**
                        * field for FareCalculation
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.FareCalculation_type1 localFareCalculation ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localFareCalculationTracker = false ;

                           public boolean isFareCalculationSpecified(){
                               return localFareCalculationTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.sabre.webservices.sabrexml._2011._10.FareCalculation_type1
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.FareCalculation_type1 getFareCalculation(){
                               return localFareCalculation;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param FareCalculation
                               */
                               public void setFareCalculation(com.sabre.webservices.sabrexml._2011._10.FareCalculation_type1 param){
                            localFareCalculationTracker = param != null;
                                   
                                            this.localFareCalculation=param;
                                    

                               }
                            

                        /**
                        * field for FlightSegment
                        * This was an Array!
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.FlightSegment_type1[] localFlightSegment ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localFlightSegmentTracker = false ;

                           public boolean isFlightSegmentSpecified(){
                               return localFlightSegmentTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.sabre.webservices.sabrexml._2011._10.FlightSegment_type1[]
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.FlightSegment_type1[] getFlightSegment(){
                               return localFlightSegment;
                           }

                           
                        


                               
                              /**
                               * validate the array for FlightSegment
                               */
                              protected void validateFlightSegment(com.sabre.webservices.sabrexml._2011._10.FlightSegment_type1[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param FlightSegment
                              */
                              public void setFlightSegment(com.sabre.webservices.sabrexml._2011._10.FlightSegment_type1[] param){
                              
                                   validateFlightSegment(param);

                               localFlightSegmentTracker = param != null;
                                      
                                      this.localFlightSegment=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.sabre.webservices.sabrexml._2011._10.FlightSegment_type1
                             */
                             public void addFlightSegment(com.sabre.webservices.sabrexml._2011._10.FlightSegment_type1 param){
                                   if (localFlightSegment == null){
                                   localFlightSegment = new com.sabre.webservices.sabrexml._2011._10.FlightSegment_type1[]{};
                                   }

                            
                                 //update the setting tracker
                                localFlightSegmentTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localFlightSegment);
                               list.add(param);
                               this.localFlightSegment =
                             (com.sabre.webservices.sabrexml._2011._10.FlightSegment_type1[])list.toArray(
                            new com.sabre.webservices.sabrexml._2011._10.FlightSegment_type1[list.size()]);

                             }
                             

                        /**
                        * field for ResTicketingRestrictions
                        * This was an Array!
                        */

                        
                                    protected java.lang.String[] localResTicketingRestrictions ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localResTicketingRestrictionsTracker = false ;

                           public boolean isResTicketingRestrictionsSpecified(){
                               return localResTicketingRestrictionsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String[]
                           */
                           public  java.lang.String[] getResTicketingRestrictions(){
                               return localResTicketingRestrictions;
                           }

                           
                        


                               
                              /**
                               * validate the array for ResTicketingRestrictions
                               */
                              protected void validateResTicketingRestrictions(java.lang.String[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param ResTicketingRestrictions
                              */
                              public void setResTicketingRestrictions(java.lang.String[] param){
                              
                                   validateResTicketingRestrictions(param);

                               localResTicketingRestrictionsTracker = param != null;
                                      
                                      this.localResTicketingRestrictions=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param java.lang.String
                             */
                             public void addResTicketingRestrictions(java.lang.String param){
                                   if (localResTicketingRestrictions == null){
                                   localResTicketingRestrictions = new java.lang.String[]{};
                                   }

                            
                                 //update the setting tracker
                                localResTicketingRestrictionsTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localResTicketingRestrictions);
                               list.add(param);
                               this.localResTicketingRestrictions =
                             (java.lang.String[])list.toArray(
                            new java.lang.String[list.size()]);

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
                           namespacePrefix+":PTC_FareBreakdown_type1",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "PTC_FareBreakdown_type1",
                           xmlWriter);
                   }

               
                   }
                if (localEndorsementsTracker){
                                            if (localEndorsements==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Endorsements cannot be null!!");
                                            }
                                           localEndorsements.serialize(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","Endorsements"),
                                               xmlWriter);
                                        } if (localFareBasisTracker){
                                       if (localFareBasis!=null){
                                            for (int i = 0;i < localFareBasis.length;i++){
                                                if (localFareBasis[i] != null){
                                                 localFareBasis[i].serialize(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","FareBasis"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                        // we don't have to do any thing since minOccures is zero
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("FareBasis cannot be null!!");
                                        
                                    }
                                 } if (localFareCalculationTracker){
                                            if (localFareCalculation==null){
                                                 throw new org.apache.axis2.databinding.ADBException("FareCalculation cannot be null!!");
                                            }
                                           localFareCalculation.serialize(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","FareCalculation"),
                                               xmlWriter);
                                        } if (localFlightSegmentTracker){
                                       if (localFlightSegment!=null){
                                            for (int i = 0;i < localFlightSegment.length;i++){
                                                if (localFlightSegment[i] != null){
                                                 localFlightSegment[i].serialize(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","FlightSegment"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                        // we don't have to do any thing since minOccures is zero
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("FlightSegment cannot be null!!");
                                        
                                    }
                                 } if (localResTicketingRestrictionsTracker){
                             if (localResTicketingRestrictions!=null) {
                                   namespace = "http://webservices.sabre.com/sabreXML/2011/10";
                                   for (int i = 0;i < localResTicketingRestrictions.length;i++){
                                        
                                            if (localResTicketingRestrictions[i] != null){
                                        
                                                writeStartElement(null, namespace, "ResTicketingRestrictions", xmlWriter);

                                            
                                                        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localResTicketingRestrictions[i]));
                                                    
                                                xmlWriter.writeEndElement();
                                              
                                                } else {
                                                   
                                                           // we have to do nothing since minOccurs is zero
                                                       
                                                }

                                   }
                             } else {
                                 
                                         throw new org.apache.axis2.databinding.ADBException("ResTicketingRestrictions cannot be null!!");
                                    
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

                 if (localEndorsementsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                      "Endorsements"));
                            
                            
                                    if (localEndorsements==null){
                                         throw new org.apache.axis2.databinding.ADBException("Endorsements cannot be null!!");
                                    }
                                    elementList.add(localEndorsements);
                                } if (localFareBasisTracker){
                             if (localFareBasis!=null) {
                                 for (int i = 0;i < localFareBasis.length;i++){

                                    if (localFareBasis[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                          "FareBasis"));
                                         elementList.add(localFareBasis[i]);
                                    } else {
                                        
                                                // nothing to do
                                            
                                    }

                                 }
                             } else {
                                 
                                        throw new org.apache.axis2.databinding.ADBException("FareBasis cannot be null!!");
                                    
                             }

                        } if (localFareCalculationTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                      "FareCalculation"));
                            
                            
                                    if (localFareCalculation==null){
                                         throw new org.apache.axis2.databinding.ADBException("FareCalculation cannot be null!!");
                                    }
                                    elementList.add(localFareCalculation);
                                } if (localFlightSegmentTracker){
                             if (localFlightSegment!=null) {
                                 for (int i = 0;i < localFlightSegment.length;i++){

                                    if (localFlightSegment[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                          "FlightSegment"));
                                         elementList.add(localFlightSegment[i]);
                                    } else {
                                        
                                                // nothing to do
                                            
                                    }

                                 }
                             } else {
                                 
                                        throw new org.apache.axis2.databinding.ADBException("FlightSegment cannot be null!!");
                                    
                             }

                        } if (localResTicketingRestrictionsTracker){
                            if (localResTicketingRestrictions!=null){
                                  for (int i = 0;i < localResTicketingRestrictions.length;i++){
                                      
                                         if (localResTicketingRestrictions[i] != null){
                                          elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                              "ResTicketingRestrictions"));
                                          elementList.add(
                                          org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localResTicketingRestrictions[i]));
                                          } else {
                                             
                                                    // have to do nothing
                                                
                                          }
                                      

                                  }
                            } else {
                              
                                    throw new org.apache.axis2.databinding.ADBException("ResTicketingRestrictions cannot be null!!");
                                
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
        public static PTC_FareBreakdown_type1 parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            PTC_FareBreakdown_type1 object =
                new PTC_FareBreakdown_type1();

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
                    
                            if (!"PTC_FareBreakdown_type1".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (PTC_FareBreakdown_type1)org.xmlsoap.schemas.soap.envelope.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                        java.util.ArrayList list2 = new java.util.ArrayList();
                    
                        java.util.ArrayList list4 = new java.util.ArrayList();
                    
                        java.util.ArrayList list5 = new java.util.ArrayList();
                    
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","Endorsements").equals(reader.getName())){
                                
                                                object.setEndorsements(com.sabre.webservices.sabrexml._2011._10.Endorsements_type1.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","FareBasis").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list2.add(com.sabre.webservices.sabrexml._2011._10.FareBasis_type2.Factory.parse(reader));
                                                                
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
                                                                if (new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","FareBasis").equals(reader.getName())){
                                                                    list2.add(com.sabre.webservices.sabrexml._2011._10.FareBasis_type2.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone2 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setFareBasis((com.sabre.webservices.sabrexml._2011._10.FareBasis_type2[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.sabre.webservices.sabrexml._2011._10.FareBasis_type2.class,
                                                                list2));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","FareCalculation").equals(reader.getName())){
                                
                                                object.setFareCalculation(com.sabre.webservices.sabrexml._2011._10.FareCalculation_type1.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","FlightSegment").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list4.add(com.sabre.webservices.sabrexml._2011._10.FlightSegment_type1.Factory.parse(reader));
                                                                
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
                                                                if (new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","FlightSegment").equals(reader.getName())){
                                                                    list4.add(com.sabre.webservices.sabrexml._2011._10.FlightSegment_type1.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone4 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setFlightSegment((com.sabre.webservices.sabrexml._2011._10.FlightSegment_type1[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.sabre.webservices.sabrexml._2011._10.FlightSegment_type1.class,
                                                                list4));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","ResTicketingRestrictions").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list5.add(reader.getElementText());
                                            
                                            //loop until we find a start element that is not part of this array
                                            boolean loopDone5 = false;
                                            while(!loopDone5){
                                                // Ensure we are at the EndElement
                                                while (!reader.isEndElement()){
                                                    reader.next();
                                                }
                                                // Step out of this element
                                                reader.next();
                                                // Step to next element event.
                                                while (!reader.isStartElement() && !reader.isEndElement())
                                                    reader.next();
                                                if (reader.isEndElement()){
                                                    //two continuous end elements means we are exiting the xml structure
                                                    loopDone5 = true;
                                                } else {
                                                    if (new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","ResTicketingRestrictions").equals(reader.getName())){
                                                         list5.add(reader.getElementText());
                                                        
                                                    }else{
                                                        loopDone5 = true;
                                                    }
                                                }
                                            }
                                            // call the converter utility  to convert and set the array
                                            
                                                    object.setResTicketingRestrictions((java.lang.String[])
                                                        list5.toArray(new java.lang.String[list5.size()]));
                                                
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
           
    