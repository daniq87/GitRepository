
/**
 * Record_type0.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.sabre.webservices.sabrexml._2011._10;
            

            /**
            *  Record_type0 bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class Record_type0
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = Record_type0
                Namespace URI = http://webservices.sabre.com/sabreXML/2011/10
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for Endorsements
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.Endorsements_type0 localEndorsements ;
                                
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
                           * @return com.sabre.webservices.sabrexml._2011._10.Endorsements_type0
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.Endorsements_type0 getEndorsements(){
                               return localEndorsements;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Endorsements
                               */
                               public void setEndorsements(com.sabre.webservices.sabrexml._2011._10.Endorsements_type0 param){
                            localEndorsementsTracker = param != null;
                                   
                                            this.localEndorsements=param;
                                    

                               }
                            

                        /**
                        * field for HemisphereCode
                        */

                        
                                    protected java.lang.String localHemisphereCode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localHemisphereCodeTracker = false ;

                           public boolean isHemisphereCodeSpecified(){
                               return localHemisphereCodeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getHemisphereCode(){
                               return localHemisphereCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param HemisphereCode
                               */
                               public void setHemisphereCode(java.lang.String param){
                            localHemisphereCodeTracker = param != null;
                                   
                                            this.localHemisphereCode=param;
                                    

                               }
                            

                        /**
                        * field for ItinTotalFare
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.ItinTotalFare_type0 localItinTotalFare ;
                                
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
                           * @return com.sabre.webservices.sabrexml._2011._10.ItinTotalFare_type0
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.ItinTotalFare_type0 getItinTotalFare(){
                               return localItinTotalFare;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ItinTotalFare
                               */
                               public void setItinTotalFare(com.sabre.webservices.sabrexml._2011._10.ItinTotalFare_type0 param){
                            localItinTotalFareTracker = param != null;
                                   
                                            this.localItinTotalFare=param;
                                    

                               }
                            

                        /**
                        * field for JourneyCode
                        */

                        
                                    protected java.lang.String localJourneyCode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localJourneyCodeTracker = false ;

                           public boolean isJourneyCodeSpecified(){
                               return localJourneyCodeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getJourneyCode(){
                               return localJourneyCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param JourneyCode
                               */
                               public void setJourneyCode(java.lang.String param){
                            localJourneyCodeTracker = param != null;
                                   
                                            this.localJourneyCode=param;
                                    

                               }
                            

                        /**
                        * field for PTC_FareBreakdown
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.PTC_FareBreakdown_type0 localPTC_FareBreakdown ;
                                
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
                           * @return com.sabre.webservices.sabrexml._2011._10.PTC_FareBreakdown_type0
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.PTC_FareBreakdown_type0 getPTC_FareBreakdown(){
                               return localPTC_FareBreakdown;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PTC_FareBreakdown
                               */
                               public void setPTC_FareBreakdown(com.sabre.webservices.sabrexml._2011._10.PTC_FareBreakdown_type0 param){
                            localPTC_FareBreakdownTracker = param != null;
                                   
                                            this.localPTC_FareBreakdown=param;
                                    

                               }
                            

                        /**
                        * field for TourCode
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.TourCode_type0 localTourCode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTourCodeTracker = false ;

                           public boolean isTourCodeSpecified(){
                               return localTourCodeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.sabre.webservices.sabrexml._2011._10.TourCode_type0
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.TourCode_type0 getTourCode(){
                               return localTourCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TourCode
                               */
                               public void setTourCode(com.sabre.webservices.sabrexml._2011._10.TourCode_type0 param){
                            localTourCodeTracker = param != null;
                                   
                                            this.localTourCode=param;
                                    

                               }
                            

                        /**
                        * field for UpdatedBy
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.UpdatedBy_type0 localUpdatedBy ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUpdatedByTracker = false ;

                           public boolean isUpdatedBySpecified(){
                               return localUpdatedByTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.sabre.webservices.sabrexml._2011._10.UpdatedBy_type0
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.UpdatedBy_type0 getUpdatedBy(){
                               return localUpdatedBy;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UpdatedBy
                               */
                               public void setUpdatedBy(com.sabre.webservices.sabrexml._2011._10.UpdatedBy_type0 param){
                            localUpdatedByTracker = param != null;
                                   
                                            this.localUpdatedBy=param;
                                    

                               }
                            

                        /**
                        * field for Number
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localNumber ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getNumber(){
                               return localNumber;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Number
                               */
                               public void setNumber(java.lang.String param){
                            
                                            this.localNumber=param;
                                    

                               }
                            

                        /**
                        * field for Status
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localStatus ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getStatus(){
                               return localStatus;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Status
                               */
                               public void setStatus(java.lang.String param){
                            
                                            this.localStatus=param;
                                    

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
                           namespacePrefix+":Record_type0",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "Record_type0",
                           xmlWriter);
                   }

               
                   }
               
                                            if (localNumber != null){
                                        
                                                writeAttribute("",
                                                         "Number",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumber), xmlWriter);

                                            
                                      }
                                    
                                            if (localStatus != null){
                                        
                                                writeAttribute("",
                                                         "Status",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStatus), xmlWriter);

                                            
                                      }
                                     if (localEndorsementsTracker){
                                            if (localEndorsements==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Endorsements cannot be null!!");
                                            }
                                           localEndorsements.serialize(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","Endorsements"),
                                               xmlWriter);
                                        } if (localHemisphereCodeTracker){
                                    namespace = "http://webservices.sabre.com/sabreXML/2011/10";
                                    writeStartElement(null, namespace, "HemisphereCode", xmlWriter);
                             

                                          if (localHemisphereCode==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("HemisphereCode cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localHemisphereCode);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localItinTotalFareTracker){
                                            if (localItinTotalFare==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ItinTotalFare cannot be null!!");
                                            }
                                           localItinTotalFare.serialize(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","ItinTotalFare"),
                                               xmlWriter);
                                        } if (localJourneyCodeTracker){
                                    namespace = "http://webservices.sabre.com/sabreXML/2011/10";
                                    writeStartElement(null, namespace, "JourneyCode", xmlWriter);
                             

                                          if (localJourneyCode==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("JourneyCode cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localJourneyCode);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPTC_FareBreakdownTracker){
                                            if (localPTC_FareBreakdown==null){
                                                 throw new org.apache.axis2.databinding.ADBException("PTC_FareBreakdown cannot be null!!");
                                            }
                                           localPTC_FareBreakdown.serialize(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","PTC_FareBreakdown"),
                                               xmlWriter);
                                        } if (localTourCodeTracker){
                                            if (localTourCode==null){
                                                 throw new org.apache.axis2.databinding.ADBException("TourCode cannot be null!!");
                                            }
                                           localTourCode.serialize(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","TourCode"),
                                               xmlWriter);
                                        } if (localUpdatedByTracker){
                                            if (localUpdatedBy==null){
                                                 throw new org.apache.axis2.databinding.ADBException("UpdatedBy cannot be null!!");
                                            }
                                           localUpdatedBy.serialize(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","UpdatedBy"),
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

                 if (localEndorsementsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                      "Endorsements"));
                            
                            
                                    if (localEndorsements==null){
                                         throw new org.apache.axis2.databinding.ADBException("Endorsements cannot be null!!");
                                    }
                                    elementList.add(localEndorsements);
                                } if (localHemisphereCodeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                      "HemisphereCode"));
                                 
                                        if (localHemisphereCode != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localHemisphereCode));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("HemisphereCode cannot be null!!");
                                        }
                                    } if (localItinTotalFareTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                      "ItinTotalFare"));
                            
                            
                                    if (localItinTotalFare==null){
                                         throw new org.apache.axis2.databinding.ADBException("ItinTotalFare cannot be null!!");
                                    }
                                    elementList.add(localItinTotalFare);
                                } if (localJourneyCodeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                      "JourneyCode"));
                                 
                                        if (localJourneyCode != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localJourneyCode));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("JourneyCode cannot be null!!");
                                        }
                                    } if (localPTC_FareBreakdownTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                      "PTC_FareBreakdown"));
                            
                            
                                    if (localPTC_FareBreakdown==null){
                                         throw new org.apache.axis2.databinding.ADBException("PTC_FareBreakdown cannot be null!!");
                                    }
                                    elementList.add(localPTC_FareBreakdown);
                                } if (localTourCodeTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                      "TourCode"));
                            
                            
                                    if (localTourCode==null){
                                         throw new org.apache.axis2.databinding.ADBException("TourCode cannot be null!!");
                                    }
                                    elementList.add(localTourCode);
                                } if (localUpdatedByTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                      "UpdatedBy"));
                            
                            
                                    if (localUpdatedBy==null){
                                         throw new org.apache.axis2.databinding.ADBException("UpdatedBy cannot be null!!");
                                    }
                                    elementList.add(localUpdatedBy);
                                }
                            attribList.add(
                            new javax.xml.namespace.QName("","Number"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumber));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","Status"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStatus));
                                

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
        public static Record_type0 parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            Record_type0 object =
                new Record_type0();

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
                    
                            if (!"Record_type0".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (Record_type0)org.xmlsoap.schemas.soap.envelope.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    // handle attribute "Number"
                    java.lang.String tempAttribNumber =
                        
                                reader.getAttributeValue(null,"Number");
                            
                   if (tempAttribNumber!=null){
                         java.lang.String content = tempAttribNumber;
                        
                                                 object.setNumber(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribNumber));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("Number");
                    
                    // handle attribute "Status"
                    java.lang.String tempAttribStatus =
                        
                                reader.getAttributeValue(null,"Status");
                            
                   if (tempAttribStatus!=null){
                         java.lang.String content = tempAttribStatus;
                        
                                                 object.setStatus(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribStatus));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("Status");
                    
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","Endorsements").equals(reader.getName())){
                                
                                                object.setEndorsements(com.sabre.webservices.sabrexml._2011._10.Endorsements_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","HemisphereCode").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"HemisphereCode" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setHemisphereCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","ItinTotalFare").equals(reader.getName())){
                                
                                                object.setItinTotalFare(com.sabre.webservices.sabrexml._2011._10.ItinTotalFare_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","JourneyCode").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"JourneyCode" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setJourneyCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","PTC_FareBreakdown").equals(reader.getName())){
                                
                                                object.setPTC_FareBreakdown(com.sabre.webservices.sabrexml._2011._10.PTC_FareBreakdown_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","TourCode").equals(reader.getName())){
                                
                                                object.setTourCode(com.sabre.webservices.sabrexml._2011._10.TourCode_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","UpdatedBy").equals(reader.getName())){
                                
                                                object.setUpdatedBy(com.sabre.webservices.sabrexml._2011._10.UpdatedBy_type0.Factory.parse(reader));
                                              
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
           
    