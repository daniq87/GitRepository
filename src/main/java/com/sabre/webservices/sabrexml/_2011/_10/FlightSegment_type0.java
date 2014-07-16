
/**
 * FlightSegment_type0.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.sabre.webservices.sabrexml._2011._10;
            

            /**
            *  FlightSegment_type0 bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class FlightSegment_type0
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = FlightSegment_type0
                Namespace URI = http://webservices.sabre.com/sabreXML/2011/10
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for BaggageAllowance
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.BaggageAllowance_type0 localBaggageAllowance ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBaggageAllowanceTracker = false ;

                           public boolean isBaggageAllowanceSpecified(){
                               return localBaggageAllowanceTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.sabre.webservices.sabrexml._2011._10.BaggageAllowance_type0
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.BaggageAllowance_type0 getBaggageAllowance(){
                               return localBaggageAllowance;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BaggageAllowance
                               */
                               public void setBaggageAllowance(com.sabre.webservices.sabrexml._2011._10.BaggageAllowance_type0 param){
                            localBaggageAllowanceTracker = param != null;
                                   
                                            this.localBaggageAllowance=param;
                                    

                               }
                            

                        /**
                        * field for FareBasis
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.FareBasis_type1 localFareBasis ;
                                
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
                           * @return com.sabre.webservices.sabrexml._2011._10.FareBasis_type1
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.FareBasis_type1 getFareBasis(){
                               return localFareBasis;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param FareBasis
                               */
                               public void setFareBasis(com.sabre.webservices.sabrexml._2011._10.FareBasis_type1 param){
                            localFareBasisTracker = param != null;
                                   
                                            this.localFareBasis=param;
                                    

                               }
                            

                        /**
                        * field for MarketingAirline
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.MarketingAirline_type0 localMarketingAirline ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMarketingAirlineTracker = false ;

                           public boolean isMarketingAirlineSpecified(){
                               return localMarketingAirlineTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.sabre.webservices.sabrexml._2011._10.MarketingAirline_type0
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.MarketingAirline_type0 getMarketingAirline(){
                               return localMarketingAirline;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MarketingAirline
                               */
                               public void setMarketingAirline(com.sabre.webservices.sabrexml._2011._10.MarketingAirline_type0 param){
                            localMarketingAirlineTracker = param != null;
                                   
                                            this.localMarketingAirline=param;
                                    

                               }
                            

                        /**
                        * field for OriginLocation
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.OriginLocation_type0 localOriginLocation ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localOriginLocationTracker = false ;

                           public boolean isOriginLocationSpecified(){
                               return localOriginLocationTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.sabre.webservices.sabrexml._2011._10.OriginLocation_type0
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.OriginLocation_type0 getOriginLocation(){
                               return localOriginLocation;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OriginLocation
                               */
                               public void setOriginLocation(com.sabre.webservices.sabrexml._2011._10.OriginLocation_type0 param){
                            localOriginLocationTracker = param != null;
                                   
                                            this.localOriginLocation=param;
                                    

                               }
                            

                        /**
                        * field for ValidityDates
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.ValidityDates_type0 localValidityDates ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localValidityDatesTracker = false ;

                           public boolean isValidityDatesSpecified(){
                               return localValidityDatesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.sabre.webservices.sabrexml._2011._10.ValidityDates_type0
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.ValidityDates_type0 getValidityDates(){
                               return localValidityDates;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ValidityDates
                               */
                               public void setValidityDates(com.sabre.webservices.sabrexml._2011._10.ValidityDates_type0 param){
                            localValidityDatesTracker = param != null;
                                   
                                            this.localValidityDates=param;
                                    

                               }
                            

                        /**
                        * field for ConnectionInd
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localConnectionInd ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getConnectionInd(){
                               return localConnectionInd;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ConnectionInd
                               */
                               public void setConnectionInd(java.lang.String param){
                            
                                            this.localConnectionInd=param;
                                    

                               }
                            

                        /**
                        * field for DepartureDateTime
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localDepartureDateTime ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getDepartureDateTime(){
                               return localDepartureDateTime;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DepartureDateTime
                               */
                               public void setDepartureDateTime(java.lang.String param){
                            
                                            this.localDepartureDateTime=param;
                                    

                               }
                            

                        /**
                        * field for FlightNumber
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localFlightNumber ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getFlightNumber(){
                               return localFlightNumber;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param FlightNumber
                               */
                               public void setFlightNumber(java.lang.String param){
                            
                                            this.localFlightNumber=param;
                                    

                               }
                            

                        /**
                        * field for ResBookDesigCode
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localResBookDesigCode ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getResBookDesigCode(){
                               return localResBookDesigCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ResBookDesigCode
                               */
                               public void setResBookDesigCode(java.lang.String param){
                            
                                            this.localResBookDesigCode=param;
                                    

                               }
                            

                        /**
                        * field for SegmentNumber
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localSegmentNumber ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSegmentNumber(){
                               return localSegmentNumber;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SegmentNumber
                               */
                               public void setSegmentNumber(java.lang.String param){
                            
                                            this.localSegmentNumber=param;
                                    

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
                           namespacePrefix+":FlightSegment_type0",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "FlightSegment_type0",
                           xmlWriter);
                   }

               
                   }
               
                                            if (localConnectionInd != null){
                                        
                                                writeAttribute("",
                                                         "ConnectionInd",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localConnectionInd), xmlWriter);

                                            
                                      }
                                    
                                            if (localDepartureDateTime != null){
                                        
                                                writeAttribute("",
                                                         "DepartureDateTime",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDepartureDateTime), xmlWriter);

                                            
                                      }
                                    
                                            if (localFlightNumber != null){
                                        
                                                writeAttribute("",
                                                         "FlightNumber",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFlightNumber), xmlWriter);

                                            
                                      }
                                    
                                            if (localResBookDesigCode != null){
                                        
                                                writeAttribute("",
                                                         "ResBookDesigCode",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localResBookDesigCode), xmlWriter);

                                            
                                      }
                                    
                                            if (localSegmentNumber != null){
                                        
                                                writeAttribute("",
                                                         "SegmentNumber",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSegmentNumber), xmlWriter);

                                            
                                      }
                                    
                                            if (localStatus != null){
                                        
                                                writeAttribute("",
                                                         "Status",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStatus), xmlWriter);

                                            
                                      }
                                     if (localBaggageAllowanceTracker){
                                            if (localBaggageAllowance==null){
                                                 throw new org.apache.axis2.databinding.ADBException("BaggageAllowance cannot be null!!");
                                            }
                                           localBaggageAllowance.serialize(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","BaggageAllowance"),
                                               xmlWriter);
                                        } if (localFareBasisTracker){
                                            if (localFareBasis==null){
                                                 throw new org.apache.axis2.databinding.ADBException("FareBasis cannot be null!!");
                                            }
                                           localFareBasis.serialize(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","FareBasis"),
                                               xmlWriter);
                                        } if (localMarketingAirlineTracker){
                                            if (localMarketingAirline==null){
                                                 throw new org.apache.axis2.databinding.ADBException("MarketingAirline cannot be null!!");
                                            }
                                           localMarketingAirline.serialize(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","MarketingAirline"),
                                               xmlWriter);
                                        } if (localOriginLocationTracker){
                                            if (localOriginLocation==null){
                                                 throw new org.apache.axis2.databinding.ADBException("OriginLocation cannot be null!!");
                                            }
                                           localOriginLocation.serialize(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","OriginLocation"),
                                               xmlWriter);
                                        } if (localValidityDatesTracker){
                                            if (localValidityDates==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ValidityDates cannot be null!!");
                                            }
                                           localValidityDates.serialize(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","ValidityDates"),
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

                 if (localBaggageAllowanceTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                      "BaggageAllowance"));
                            
                            
                                    if (localBaggageAllowance==null){
                                         throw new org.apache.axis2.databinding.ADBException("BaggageAllowance cannot be null!!");
                                    }
                                    elementList.add(localBaggageAllowance);
                                } if (localFareBasisTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                      "FareBasis"));
                            
                            
                                    if (localFareBasis==null){
                                         throw new org.apache.axis2.databinding.ADBException("FareBasis cannot be null!!");
                                    }
                                    elementList.add(localFareBasis);
                                } if (localMarketingAirlineTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                      "MarketingAirline"));
                            
                            
                                    if (localMarketingAirline==null){
                                         throw new org.apache.axis2.databinding.ADBException("MarketingAirline cannot be null!!");
                                    }
                                    elementList.add(localMarketingAirline);
                                } if (localOriginLocationTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                      "OriginLocation"));
                            
                            
                                    if (localOriginLocation==null){
                                         throw new org.apache.axis2.databinding.ADBException("OriginLocation cannot be null!!");
                                    }
                                    elementList.add(localOriginLocation);
                                } if (localValidityDatesTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                      "ValidityDates"));
                            
                            
                                    if (localValidityDates==null){
                                         throw new org.apache.axis2.databinding.ADBException("ValidityDates cannot be null!!");
                                    }
                                    elementList.add(localValidityDates);
                                }
                            attribList.add(
                            new javax.xml.namespace.QName("","ConnectionInd"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localConnectionInd));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","DepartureDateTime"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDepartureDateTime));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","FlightNumber"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFlightNumber));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","ResBookDesigCode"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localResBookDesigCode));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","SegmentNumber"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSegmentNumber));
                                
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
        public static FlightSegment_type0 parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            FlightSegment_type0 object =
                new FlightSegment_type0();

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
                    
                            if (!"FlightSegment_type0".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (FlightSegment_type0)org.xmlsoap.schemas.soap.envelope.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    // handle attribute "ConnectionInd"
                    java.lang.String tempAttribConnectionInd =
                        
                                reader.getAttributeValue(null,"ConnectionInd");
                            
                   if (tempAttribConnectionInd!=null){
                         java.lang.String content = tempAttribConnectionInd;
                        
                                                 object.setConnectionInd(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribConnectionInd));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("ConnectionInd");
                    
                    // handle attribute "DepartureDateTime"
                    java.lang.String tempAttribDepartureDateTime =
                        
                                reader.getAttributeValue(null,"DepartureDateTime");
                            
                   if (tempAttribDepartureDateTime!=null){
                         java.lang.String content = tempAttribDepartureDateTime;
                        
                                                 object.setDepartureDateTime(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribDepartureDateTime));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("DepartureDateTime");
                    
                    // handle attribute "FlightNumber"
                    java.lang.String tempAttribFlightNumber =
                        
                                reader.getAttributeValue(null,"FlightNumber");
                            
                   if (tempAttribFlightNumber!=null){
                         java.lang.String content = tempAttribFlightNumber;
                        
                                                 object.setFlightNumber(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribFlightNumber));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("FlightNumber");
                    
                    // handle attribute "ResBookDesigCode"
                    java.lang.String tempAttribResBookDesigCode =
                        
                                reader.getAttributeValue(null,"ResBookDesigCode");
                            
                   if (tempAttribResBookDesigCode!=null){
                         java.lang.String content = tempAttribResBookDesigCode;
                        
                                                 object.setResBookDesigCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribResBookDesigCode));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("ResBookDesigCode");
                    
                    // handle attribute "SegmentNumber"
                    java.lang.String tempAttribSegmentNumber =
                        
                                reader.getAttributeValue(null,"SegmentNumber");
                            
                   if (tempAttribSegmentNumber!=null){
                         java.lang.String content = tempAttribSegmentNumber;
                        
                                                 object.setSegmentNumber(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribSegmentNumber));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("SegmentNumber");
                    
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","BaggageAllowance").equals(reader.getName())){
                                
                                                object.setBaggageAllowance(com.sabre.webservices.sabrexml._2011._10.BaggageAllowance_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","FareBasis").equals(reader.getName())){
                                
                                                object.setFareBasis(com.sabre.webservices.sabrexml._2011._10.FareBasis_type1.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","MarketingAirline").equals(reader.getName())){
                                
                                                object.setMarketingAirline(com.sabre.webservices.sabrexml._2011._10.MarketingAirline_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","OriginLocation").equals(reader.getName())){
                                
                                                object.setOriginLocation(com.sabre.webservices.sabrexml._2011._10.OriginLocation_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","ValidityDates").equals(reader.getName())){
                                
                                                object.setValidityDates(com.sabre.webservices.sabrexml._2011._10.ValidityDates_type0.Factory.parse(reader));
                                              
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
           
    