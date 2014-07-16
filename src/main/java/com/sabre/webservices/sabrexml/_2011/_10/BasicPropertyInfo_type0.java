
/**
 * BasicPropertyInfo_type0.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.sabre.webservices.sabrexml._2011._10;
            

            /**
            *  BasicPropertyInfo_type0 bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class BasicPropertyInfo_type0
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = BasicPropertyInfo_type0
                Namespace URI = http://webservices.sabre.com/sabreXML/2011/10
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for Address
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.Address_type2 localAddress ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAddressTracker = false ;

                           public boolean isAddressSpecified(){
                               return localAddressTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.sabre.webservices.sabrexml._2011._10.Address_type2
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.Address_type2 getAddress(){
                               return localAddress;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Address
                               */
                               public void setAddress(com.sabre.webservices.sabrexml._2011._10.Address_type2 param){
                            localAddressTracker = param != null;
                                   
                                            this.localAddress=param;
                                    

                               }
                            

                        /**
                        * field for CancelPenalty
                        * This was an Array!
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.CancelPenalty_type0[] localCancelPenalty ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCancelPenaltyTracker = false ;

                           public boolean isCancelPenaltySpecified(){
                               return localCancelPenaltyTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.sabre.webservices.sabrexml._2011._10.CancelPenalty_type0[]
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.CancelPenalty_type0[] getCancelPenalty(){
                               return localCancelPenalty;
                           }

                           
                        


                               
                              /**
                               * validate the array for CancelPenalty
                               */
                              protected void validateCancelPenalty(com.sabre.webservices.sabrexml._2011._10.CancelPenalty_type0[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param CancelPenalty
                              */
                              public void setCancelPenalty(com.sabre.webservices.sabrexml._2011._10.CancelPenalty_type0[] param){
                              
                                   validateCancelPenalty(param);

                               localCancelPenaltyTracker = param != null;
                                      
                                      this.localCancelPenalty=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.sabre.webservices.sabrexml._2011._10.CancelPenalty_type0
                             */
                             public void addCancelPenalty(com.sabre.webservices.sabrexml._2011._10.CancelPenalty_type0 param){
                                   if (localCancelPenalty == null){
                                   localCancelPenalty = new com.sabre.webservices.sabrexml._2011._10.CancelPenalty_type0[]{};
                                   }

                            
                                 //update the setting tracker
                                localCancelPenaltyTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localCancelPenalty);
                               list.add(param);
                               this.localCancelPenalty =
                             (com.sabre.webservices.sabrexml._2011._10.CancelPenalty_type0[])list.toArray(
                            new com.sabre.webservices.sabrexml._2011._10.CancelPenalty_type0[list.size()]);

                             }
                             

                        /**
                        * field for ConfirmationNumber
                        * This was an Array!
                        */

                        
                                    protected java.lang.String[] localConfirmationNumber ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localConfirmationNumberTracker = false ;

                           public boolean isConfirmationNumberSpecified(){
                               return localConfirmationNumberTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String[]
                           */
                           public  java.lang.String[] getConfirmationNumber(){
                               return localConfirmationNumber;
                           }

                           
                        


                               
                              /**
                               * validate the array for ConfirmationNumber
                               */
                              protected void validateConfirmationNumber(java.lang.String[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param ConfirmationNumber
                              */
                              public void setConfirmationNumber(java.lang.String[] param){
                              
                                   validateConfirmationNumber(param);

                               localConfirmationNumberTracker = param != null;
                                      
                                      this.localConfirmationNumber=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param java.lang.String
                             */
                             public void addConfirmationNumber(java.lang.String param){
                                   if (localConfirmationNumber == null){
                                   localConfirmationNumber = new java.lang.String[]{};
                                   }

                            
                                 //update the setting tracker
                                localConfirmationNumberTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localConfirmationNumber);
                               list.add(param);
                               this.localConfirmationNumber =
                             (java.lang.String[])list.toArray(
                            new java.lang.String[list.size()]);

                             }
                             

                        /**
                        * field for ContactNumbers
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.ContactNumbers_type2 localContactNumbers ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localContactNumbersTracker = false ;

                           public boolean isContactNumbersSpecified(){
                               return localContactNumbersTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.sabre.webservices.sabrexml._2011._10.ContactNumbers_type2
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.ContactNumbers_type2 getContactNumbers(){
                               return localContactNumbers;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ContactNumbers
                               */
                               public void setContactNumbers(com.sabre.webservices.sabrexml._2011._10.ContactNumbers_type2 param){
                            localContactNumbersTracker = param != null;
                                   
                                            this.localContactNumbers=param;
                                    

                               }
                            

                        /**
                        * field for ChainCode
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localChainCode ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getChainCode(){
                               return localChainCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ChainCode
                               */
                               public void setChainCode(java.lang.String param){
                            
                                            this.localChainCode=param;
                                    

                               }
                            

                        /**
                        * field for HotelCityCode
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localHotelCityCode ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getHotelCityCode(){
                               return localHotelCityCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param HotelCityCode
                               */
                               public void setHotelCityCode(java.lang.String param){
                            
                                            this.localHotelCityCode=param;
                                    

                               }
                            

                        /**
                        * field for HotelCode
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localHotelCode ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getHotelCode(){
                               return localHotelCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param HotelCode
                               */
                               public void setHotelCode(java.lang.String param){
                            
                                            this.localHotelCode=param;
                                    

                               }
                            

                        /**
                        * field for HotelName
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localHotelName ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getHotelName(){
                               return localHotelName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param HotelName
                               */
                               public void setHotelName(java.lang.String param){
                            
                                            this.localHotelName=param;
                                    

                               }
                            

                        /**
                        * field for ServiceCityName
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localServiceCityName ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getServiceCityName(){
                               return localServiceCityName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ServiceCityName
                               */
                               public void setServiceCityName(java.lang.String param){
                            
                                            this.localServiceCityName=param;
                                    

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
                           namespacePrefix+":BasicPropertyInfo_type0",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "BasicPropertyInfo_type0",
                           xmlWriter);
                   }

               
                   }
               
                                            if (localChainCode != null){
                                        
                                                writeAttribute("",
                                                         "ChainCode",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localChainCode), xmlWriter);

                                            
                                      }
                                    
                                            if (localHotelCityCode != null){
                                        
                                                writeAttribute("",
                                                         "HotelCityCode",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localHotelCityCode), xmlWriter);

                                            
                                      }
                                    
                                            if (localHotelCode != null){
                                        
                                                writeAttribute("",
                                                         "HotelCode",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localHotelCode), xmlWriter);

                                            
                                      }
                                    
                                            if (localHotelName != null){
                                        
                                                writeAttribute("",
                                                         "HotelName",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localHotelName), xmlWriter);

                                            
                                      }
                                    
                                            if (localServiceCityName != null){
                                        
                                                writeAttribute("",
                                                         "ServiceCityName",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localServiceCityName), xmlWriter);

                                            
                                      }
                                     if (localAddressTracker){
                                            if (localAddress==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Address cannot be null!!");
                                            }
                                           localAddress.serialize(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","Address"),
                                               xmlWriter);
                                        } if (localCancelPenaltyTracker){
                                       if (localCancelPenalty!=null){
                                            for (int i = 0;i < localCancelPenalty.length;i++){
                                                if (localCancelPenalty[i] != null){
                                                 localCancelPenalty[i].serialize(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","CancelPenalty"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                        // we don't have to do any thing since minOccures is zero
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("CancelPenalty cannot be null!!");
                                        
                                    }
                                 } if (localConfirmationNumberTracker){
                             if (localConfirmationNumber!=null) {
                                   namespace = "http://webservices.sabre.com/sabreXML/2011/10";
                                   for (int i = 0;i < localConfirmationNumber.length;i++){
                                        
                                            if (localConfirmationNumber[i] != null){
                                        
                                                writeStartElement(null, namespace, "ConfirmationNumber", xmlWriter);

                                            
                                                        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localConfirmationNumber[i]));
                                                    
                                                xmlWriter.writeEndElement();
                                              
                                                } else {
                                                   
                                                           // we have to do nothing since minOccurs is zero
                                                       
                                                }

                                   }
                             } else {
                                 
                                         throw new org.apache.axis2.databinding.ADBException("ConfirmationNumber cannot be null!!");
                                    
                             }

                        } if (localContactNumbersTracker){
                                            if (localContactNumbers==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ContactNumbers cannot be null!!");
                                            }
                                           localContactNumbers.serialize(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","ContactNumbers"),
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

                 if (localAddressTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                      "Address"));
                            
                            
                                    if (localAddress==null){
                                         throw new org.apache.axis2.databinding.ADBException("Address cannot be null!!");
                                    }
                                    elementList.add(localAddress);
                                } if (localCancelPenaltyTracker){
                             if (localCancelPenalty!=null) {
                                 for (int i = 0;i < localCancelPenalty.length;i++){

                                    if (localCancelPenalty[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                          "CancelPenalty"));
                                         elementList.add(localCancelPenalty[i]);
                                    } else {
                                        
                                                // nothing to do
                                            
                                    }

                                 }
                             } else {
                                 
                                        throw new org.apache.axis2.databinding.ADBException("CancelPenalty cannot be null!!");
                                    
                             }

                        } if (localConfirmationNumberTracker){
                            if (localConfirmationNumber!=null){
                                  for (int i = 0;i < localConfirmationNumber.length;i++){
                                      
                                         if (localConfirmationNumber[i] != null){
                                          elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                              "ConfirmationNumber"));
                                          elementList.add(
                                          org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localConfirmationNumber[i]));
                                          } else {
                                             
                                                    // have to do nothing
                                                
                                          }
                                      

                                  }
                            } else {
                              
                                    throw new org.apache.axis2.databinding.ADBException("ConfirmationNumber cannot be null!!");
                                
                            }

                        } if (localContactNumbersTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                      "ContactNumbers"));
                            
                            
                                    if (localContactNumbers==null){
                                         throw new org.apache.axis2.databinding.ADBException("ContactNumbers cannot be null!!");
                                    }
                                    elementList.add(localContactNumbers);
                                }
                            attribList.add(
                            new javax.xml.namespace.QName("","ChainCode"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localChainCode));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","HotelCityCode"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localHotelCityCode));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","HotelCode"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localHotelCode));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","HotelName"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localHotelName));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","ServiceCityName"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localServiceCityName));
                                

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
        public static BasicPropertyInfo_type0 parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            BasicPropertyInfo_type0 object =
                new BasicPropertyInfo_type0();

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
                    
                            if (!"BasicPropertyInfo_type0".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (BasicPropertyInfo_type0)org.xmlsoap.schemas.soap.envelope.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    // handle attribute "ChainCode"
                    java.lang.String tempAttribChainCode =
                        
                                reader.getAttributeValue(null,"ChainCode");
                            
                   if (tempAttribChainCode!=null){
                         java.lang.String content = tempAttribChainCode;
                        
                                                 object.setChainCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribChainCode));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("ChainCode");
                    
                    // handle attribute "HotelCityCode"
                    java.lang.String tempAttribHotelCityCode =
                        
                                reader.getAttributeValue(null,"HotelCityCode");
                            
                   if (tempAttribHotelCityCode!=null){
                         java.lang.String content = tempAttribHotelCityCode;
                        
                                                 object.setHotelCityCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribHotelCityCode));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("HotelCityCode");
                    
                    // handle attribute "HotelCode"
                    java.lang.String tempAttribHotelCode =
                        
                                reader.getAttributeValue(null,"HotelCode");
                            
                   if (tempAttribHotelCode!=null){
                         java.lang.String content = tempAttribHotelCode;
                        
                                                 object.setHotelCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribHotelCode));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("HotelCode");
                    
                    // handle attribute "HotelName"
                    java.lang.String tempAttribHotelName =
                        
                                reader.getAttributeValue(null,"HotelName");
                            
                   if (tempAttribHotelName!=null){
                         java.lang.String content = tempAttribHotelName;
                        
                                                 object.setHotelName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribHotelName));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("HotelName");
                    
                    // handle attribute "ServiceCityName"
                    java.lang.String tempAttribServiceCityName =
                        
                                reader.getAttributeValue(null,"ServiceCityName");
                            
                   if (tempAttribServiceCityName!=null){
                         java.lang.String content = tempAttribServiceCityName;
                        
                                                 object.setServiceCityName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribServiceCityName));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("ServiceCityName");
                    
                    
                    reader.next();
                
                        java.util.ArrayList list2 = new java.util.ArrayList();
                    
                        java.util.ArrayList list3 = new java.util.ArrayList();
                    
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","Address").equals(reader.getName())){
                                
                                                object.setAddress(com.sabre.webservices.sabrexml._2011._10.Address_type2.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","CancelPenalty").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list2.add(com.sabre.webservices.sabrexml._2011._10.CancelPenalty_type0.Factory.parse(reader));
                                                                
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
                                                                if (new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","CancelPenalty").equals(reader.getName())){
                                                                    list2.add(com.sabre.webservices.sabrexml._2011._10.CancelPenalty_type0.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone2 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setCancelPenalty((com.sabre.webservices.sabrexml._2011._10.CancelPenalty_type0[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.sabre.webservices.sabrexml._2011._10.CancelPenalty_type0.class,
                                                                list2));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","ConfirmationNumber").equals(reader.getName())){
                                
                                    
                                    
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
                                                    if (new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","ConfirmationNumber").equals(reader.getName())){
                                                         list3.add(reader.getElementText());
                                                        
                                                    }else{
                                                        loopDone3 = true;
                                                    }
                                                }
                                            }
                                            // call the converter utility  to convert and set the array
                                            
                                                    object.setConfirmationNumber((java.lang.String[])
                                                        list3.toArray(new java.lang.String[list3.size()]));
                                                
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","ContactNumbers").equals(reader.getName())){
                                
                                                object.setContactNumbers(com.sabre.webservices.sabrexml._2011._10.ContactNumbers_type2.Factory.parse(reader));
                                              
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
           
    