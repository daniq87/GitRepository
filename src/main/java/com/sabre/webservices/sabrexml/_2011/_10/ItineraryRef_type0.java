
/**
 * ItineraryRef_type0.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.sabre.webservices.sabrexml._2011._10;
            

            /**
            *  ItineraryRef_type0 bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ItineraryRef_type0
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = ItineraryRef_type0
                Namespace URI = http://webservices.sabre.com/sabreXML/2011/10
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for Header
                        * This was an Array!
                        */

                        
                                    protected java.lang.String[] localHeader ;
                                
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
                           * @return java.lang.String[]
                           */
                           public  java.lang.String[] getHeader(){
                               return localHeader;
                           }

                           
                        


                               
                              /**
                               * validate the array for Header
                               */
                              protected void validateHeader(java.lang.String[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param Header
                              */
                              public void setHeader(java.lang.String[] param){
                              
                                   validateHeader(param);

                               localHeaderTracker = param != null;
                                      
                                      this.localHeader=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param java.lang.String
                             */
                             public void addHeader(java.lang.String param){
                                   if (localHeader == null){
                                   localHeader = new java.lang.String[]{};
                                   }

                            
                                 //update the setting tracker
                                localHeaderTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localHeader);
                               list.add(param);
                               this.localHeader =
                             (java.lang.String[])list.toArray(
                            new java.lang.String[list.size()]);

                             }
                             

                        /**
                        * field for Source
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.Source_type3 localSource ;
                                
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
                           * @return com.sabre.webservices.sabrexml._2011._10.Source_type3
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.Source_type3 getSource(){
                               return localSource;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Source
                               */
                               public void setSource(com.sabre.webservices.sabrexml._2011._10.Source_type3 param){
                            localSourceTracker = param != null;
                                   
                                            this.localSource=param;
                                    

                               }
                            

                        /**
                        * field for TravelPolicy
                        * This was an Array!
                        */

                        
                                    protected java.lang.String[] localTravelPolicy ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTravelPolicyTracker = false ;

                           public boolean isTravelPolicySpecified(){
                               return localTravelPolicyTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String[]
                           */
                           public  java.lang.String[] getTravelPolicy(){
                               return localTravelPolicy;
                           }

                           
                        


                               
                              /**
                               * validate the array for TravelPolicy
                               */
                              protected void validateTravelPolicy(java.lang.String[] param){
                             
                              if ((param != null) && (param.length > 2)){
                                throw new java.lang.RuntimeException();
                              }
                              
                              }


                             /**
                              * Auto generated setter method
                              * @param param TravelPolicy
                              */
                              public void setTravelPolicy(java.lang.String[] param){
                              
                                   validateTravelPolicy(param);

                               localTravelPolicyTracker = param != null;
                                      
                                      this.localTravelPolicy=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param java.lang.String
                             */
                             public void addTravelPolicy(java.lang.String param){
                                   if (localTravelPolicy == null){
                                   localTravelPolicy = new java.lang.String[]{};
                                   }

                            
                                 //update the setting tracker
                                localTravelPolicyTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localTravelPolicy);
                               list.add(param);
                               this.localTravelPolicy =
                             (java.lang.String[])list.toArray(
                            new java.lang.String[list.size()]);

                             }
                             

                        /**
                        * field for AccountingCity
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localAccountingCity ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getAccountingCity(){
                               return localAccountingCity;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AccountingCity
                               */
                               public void setAccountingCity(java.lang.String param){
                            
                                            this.localAccountingCity=param;
                                    

                               }
                            

                        /**
                        * field for AccountingCode
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localAccountingCode ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getAccountingCode(){
                               return localAccountingCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AccountingCode
                               */
                               public void setAccountingCode(java.lang.String param){
                            
                                            this.localAccountingCode=param;
                                    

                               }
                            

                        /**
                        * field for AirExtras
                        * This was an Attribute!
                        */

                        
                                    protected boolean localAirExtras ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getAirExtras(){
                               return localAirExtras;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AirExtras
                               */
                               public void setAirExtras(boolean param){
                            
                                            this.localAirExtras=param;
                                    

                               }
                            

                        /**
                        * field for CustomerIdentifier
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localCustomerIdentifier ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCustomerIdentifier(){
                               return localCustomerIdentifier;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CustomerIdentifier
                               */
                               public void setCustomerIdentifier(java.lang.String param){
                            
                                            this.localCustomerIdentifier=param;
                                    

                               }
                            

                        /**
                        * field for ID
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localID ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getID(){
                               return localID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ID
                               */
                               public void setID(java.lang.String param){
                            
                                            this.localID=param;
                                    

                               }
                            

                        /**
                        * field for InhibitCode
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localInhibitCode ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getInhibitCode(){
                               return localInhibitCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param InhibitCode
                               */
                               public void setInhibitCode(java.lang.String param){
                            
                                            this.localInhibitCode=param;
                                    

                               }
                            

                        /**
                        * field for OfficeStationCode
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localOfficeStationCode ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getOfficeStationCode(){
                               return localOfficeStationCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OfficeStationCode
                               */
                               public void setOfficeStationCode(java.lang.String param){
                            
                                            this.localOfficeStationCode=param;
                                    

                               }
                            

                        /**
                        * field for OtherSystemID
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localOtherSystemID ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getOtherSystemID(){
                               return localOtherSystemID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OtherSystemID
                               */
                               public void setOtherSystemID(java.lang.String param){
                            
                                            this.localOtherSystemID=param;
                                    

                               }
                            

                        /**
                        * field for PartitionID
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localPartitionID ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPartitionID(){
                               return localPartitionID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PartitionID
                               */
                               public void setPartitionID(java.lang.String param){
                            
                                            this.localPartitionID=param;
                                    

                               }
                            

                        /**
                        * field for PrimeHostID
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localPrimeHostID ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPrimeHostID(){
                               return localPrimeHostID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PrimeHostID
                               */
                               public void setPrimeHostID(java.lang.String param){
                            
                                            this.localPrimeHostID=param;
                                    

                               }
                            

                        /**
                        * field for TicketingCarrier
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localTicketingCarrier ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getTicketingCarrier(){
                               return localTicketingCarrier;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TicketingCarrier
                               */
                               public void setTicketingCarrier(java.lang.String param){
                            
                                            this.localTicketingCarrier=param;
                                    

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
                           namespacePrefix+":ItineraryRef_type0",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "ItineraryRef_type0",
                           xmlWriter);
                   }

               
                   }
               
                                            if (localAccountingCity != null){
                                        
                                                writeAttribute("",
                                                         "AccountingCity",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAccountingCity), xmlWriter);

                                            
                                      }
                                    
                                            if (localAccountingCode != null){
                                        
                                                writeAttribute("",
                                                         "AccountingCode",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAccountingCode), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "AirExtras",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAirExtras), xmlWriter);

                                            
                                      }
                                    
                                            if (localCustomerIdentifier != null){
                                        
                                                writeAttribute("",
                                                         "CustomerIdentifier",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCustomerIdentifier), xmlWriter);

                                            
                                      }
                                    
                                            if (localID != null){
                                        
                                                writeAttribute("",
                                                         "ID",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localID), xmlWriter);

                                            
                                      }
                                    
                                            if (localInhibitCode != null){
                                        
                                                writeAttribute("",
                                                         "InhibitCode",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localInhibitCode), xmlWriter);

                                            
                                      }
                                    
                                            if (localOfficeStationCode != null){
                                        
                                                writeAttribute("",
                                                         "OfficeStationCode",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOfficeStationCode), xmlWriter);

                                            
                                      }
                                    
                                            if (localOtherSystemID != null){
                                        
                                                writeAttribute("",
                                                         "OtherSystemID",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOtherSystemID), xmlWriter);

                                            
                                      }
                                    
                                            if (localPartitionID != null){
                                        
                                                writeAttribute("",
                                                         "PartitionID",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPartitionID), xmlWriter);

                                            
                                      }
                                    
                                            if (localPrimeHostID != null){
                                        
                                                writeAttribute("",
                                                         "PrimeHostID",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPrimeHostID), xmlWriter);

                                            
                                      }
                                    
                                            if (localTicketingCarrier != null){
                                        
                                                writeAttribute("",
                                                         "TicketingCarrier",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTicketingCarrier), xmlWriter);

                                            
                                      }
                                     if (localHeaderTracker){
                             if (localHeader!=null) {
                                   namespace = "http://webservices.sabre.com/sabreXML/2011/10";
                                   for (int i = 0;i < localHeader.length;i++){
                                        
                                            if (localHeader[i] != null){
                                        
                                                writeStartElement(null, namespace, "Header", xmlWriter);

                                            
                                                        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localHeader[i]));
                                                    
                                                xmlWriter.writeEndElement();
                                              
                                                } else {
                                                   
                                                           // we have to do nothing since minOccurs is zero
                                                       
                                                }

                                   }
                             } else {
                                 
                                         throw new org.apache.axis2.databinding.ADBException("Header cannot be null!!");
                                    
                             }

                        } if (localSourceTracker){
                                            if (localSource==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Source cannot be null!!");
                                            }
                                           localSource.serialize(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","Source"),
                                               xmlWriter);
                                        } if (localTravelPolicyTracker){
                             if (localTravelPolicy!=null) {
                                   namespace = "http://webservices.sabre.com/sabreXML/2011/10";
                                   for (int i = 0;i < localTravelPolicy.length;i++){
                                        
                                            if (localTravelPolicy[i] != null){
                                        
                                                writeStartElement(null, namespace, "TravelPolicy", xmlWriter);

                                            
                                                        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTravelPolicy[i]));
                                                    
                                                xmlWriter.writeEndElement();
                                              
                                                } else {
                                                   
                                                           // we have to do nothing since minOccurs is zero
                                                       
                                                }

                                   }
                             } else {
                                 
                                         throw new org.apache.axis2.databinding.ADBException("TravelPolicy cannot be null!!");
                                    
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

                 if (localHeaderTracker){
                            if (localHeader!=null){
                                  for (int i = 0;i < localHeader.length;i++){
                                      
                                         if (localHeader[i] != null){
                                          elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                              "Header"));
                                          elementList.add(
                                          org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localHeader[i]));
                                          } else {
                                             
                                                    // have to do nothing
                                                
                                          }
                                      

                                  }
                            } else {
                              
                                    throw new org.apache.axis2.databinding.ADBException("Header cannot be null!!");
                                
                            }

                        } if (localSourceTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                      "Source"));
                            
                            
                                    if (localSource==null){
                                         throw new org.apache.axis2.databinding.ADBException("Source cannot be null!!");
                                    }
                                    elementList.add(localSource);
                                } if (localTravelPolicyTracker){
                            if (localTravelPolicy!=null){
                                  for (int i = 0;i < localTravelPolicy.length;i++){
                                      
                                         if (localTravelPolicy[i] != null){
                                          elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                              "TravelPolicy"));
                                          elementList.add(
                                          org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTravelPolicy[i]));
                                          } else {
                                             
                                                    // have to do nothing
                                                
                                          }
                                      

                                  }
                            } else {
                              
                                    throw new org.apache.axis2.databinding.ADBException("TravelPolicy cannot be null!!");
                                
                            }

                        }
                            attribList.add(
                            new javax.xml.namespace.QName("","AccountingCity"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAccountingCity));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","AccountingCode"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAccountingCode));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","AirExtras"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAirExtras));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","CustomerIdentifier"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCustomerIdentifier));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","ID"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localID));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","InhibitCode"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localInhibitCode));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","OfficeStationCode"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOfficeStationCode));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","OtherSystemID"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOtherSystemID));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","PartitionID"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPartitionID));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","PrimeHostID"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPrimeHostID));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","TicketingCarrier"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTicketingCarrier));
                                

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
        public static ItineraryRef_type0 parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            ItineraryRef_type0 object =
                new ItineraryRef_type0();

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
                    
                            if (!"ItineraryRef_type0".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (ItineraryRef_type0)org.xmlsoap.schemas.soap.envelope.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    // handle attribute "AccountingCity"
                    java.lang.String tempAttribAccountingCity =
                        
                                reader.getAttributeValue(null,"AccountingCity");
                            
                   if (tempAttribAccountingCity!=null){
                         java.lang.String content = tempAttribAccountingCity;
                        
                                                 object.setAccountingCity(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribAccountingCity));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("AccountingCity");
                    
                    // handle attribute "AccountingCode"
                    java.lang.String tempAttribAccountingCode =
                        
                                reader.getAttributeValue(null,"AccountingCode");
                            
                   if (tempAttribAccountingCode!=null){
                         java.lang.String content = tempAttribAccountingCode;
                        
                                                 object.setAccountingCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribAccountingCode));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("AccountingCode");
                    
                    // handle attribute "AirExtras"
                    java.lang.String tempAttribAirExtras =
                        
                                reader.getAttributeValue(null,"AirExtras");
                            
                   if (tempAttribAirExtras!=null){
                         java.lang.String content = tempAttribAirExtras;
                        
                                                 object.setAirExtras(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribAirExtras));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("AirExtras");
                    
                    // handle attribute "CustomerIdentifier"
                    java.lang.String tempAttribCustomerIdentifier =
                        
                                reader.getAttributeValue(null,"CustomerIdentifier");
                            
                   if (tempAttribCustomerIdentifier!=null){
                         java.lang.String content = tempAttribCustomerIdentifier;
                        
                                                 object.setCustomerIdentifier(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribCustomerIdentifier));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("CustomerIdentifier");
                    
                    // handle attribute "ID"
                    java.lang.String tempAttribID =
                        
                                reader.getAttributeValue(null,"ID");
                            
                   if (tempAttribID!=null){
                         java.lang.String content = tempAttribID;
                        
                                                 object.setID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribID));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("ID");
                    
                    // handle attribute "InhibitCode"
                    java.lang.String tempAttribInhibitCode =
                        
                                reader.getAttributeValue(null,"InhibitCode");
                            
                   if (tempAttribInhibitCode!=null){
                         java.lang.String content = tempAttribInhibitCode;
                        
                                                 object.setInhibitCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribInhibitCode));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("InhibitCode");
                    
                    // handle attribute "OfficeStationCode"
                    java.lang.String tempAttribOfficeStationCode =
                        
                                reader.getAttributeValue(null,"OfficeStationCode");
                            
                   if (tempAttribOfficeStationCode!=null){
                         java.lang.String content = tempAttribOfficeStationCode;
                        
                                                 object.setOfficeStationCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribOfficeStationCode));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("OfficeStationCode");
                    
                    // handle attribute "OtherSystemID"
                    java.lang.String tempAttribOtherSystemID =
                        
                                reader.getAttributeValue(null,"OtherSystemID");
                            
                   if (tempAttribOtherSystemID!=null){
                         java.lang.String content = tempAttribOtherSystemID;
                        
                                                 object.setOtherSystemID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribOtherSystemID));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("OtherSystemID");
                    
                    // handle attribute "PartitionID"
                    java.lang.String tempAttribPartitionID =
                        
                                reader.getAttributeValue(null,"PartitionID");
                            
                   if (tempAttribPartitionID!=null){
                         java.lang.String content = tempAttribPartitionID;
                        
                                                 object.setPartitionID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribPartitionID));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("PartitionID");
                    
                    // handle attribute "PrimeHostID"
                    java.lang.String tempAttribPrimeHostID =
                        
                                reader.getAttributeValue(null,"PrimeHostID");
                            
                   if (tempAttribPrimeHostID!=null){
                         java.lang.String content = tempAttribPrimeHostID;
                        
                                                 object.setPrimeHostID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribPrimeHostID));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("PrimeHostID");
                    
                    // handle attribute "TicketingCarrier"
                    java.lang.String tempAttribTicketingCarrier =
                        
                                reader.getAttributeValue(null,"TicketingCarrier");
                            
                   if (tempAttribTicketingCarrier!=null){
                         java.lang.String content = tempAttribTicketingCarrier;
                        
                                                 object.setTicketingCarrier(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribTicketingCarrier));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("TicketingCarrier");
                    
                    
                    reader.next();
                
                        java.util.ArrayList list1 = new java.util.ArrayList();
                    
                        java.util.ArrayList list3 = new java.util.ArrayList();
                    
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","Header").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list1.add(reader.getElementText());
                                            
                                            //loop until we find a start element that is not part of this array
                                            boolean loopDone1 = false;
                                            while(!loopDone1){
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
                                                    loopDone1 = true;
                                                } else {
                                                    if (new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","Header").equals(reader.getName())){
                                                         list1.add(reader.getElementText());
                                                        
                                                    }else{
                                                        loopDone1 = true;
                                                    }
                                                }
                                            }
                                            // call the converter utility  to convert and set the array
                                            
                                                    object.setHeader((java.lang.String[])
                                                        list1.toArray(new java.lang.String[list1.size()]));
                                                
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","Source").equals(reader.getName())){
                                
                                                object.setSource(com.sabre.webservices.sabrexml._2011._10.Source_type3.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","TravelPolicy").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list3.add(reader.getElementText());
                                            
                                            //loop until we find a start element that is not part of this array
                                            boolean loopDone3 = false;
                                            while(!loopDone3){
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
                                                    loopDone3 = true;
                                                } else {
                                                    if (new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","TravelPolicy").equals(reader.getName())){
                                                         list3.add(reader.getElementText());
                                                        
                                                    }else{
                                                        loopDone3 = true;
                                                    }
                                                }
                                            }
                                            // call the converter utility  to convert and set the array
                                            
                                                    object.setTravelPolicy((java.lang.String[])
                                                        list3.toArray(new java.lang.String[list3.size()]));
                                                
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
           
    