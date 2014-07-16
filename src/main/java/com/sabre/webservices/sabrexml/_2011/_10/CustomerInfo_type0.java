
/**
 * CustomerInfo_type0.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.sabre.webservices.sabrexml._2011._10;
            

            /**
            *  CustomerInfo_type0 bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class CustomerInfo_type0
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = CustomerInfo_type0
                Namespace URI = http://webservices.sabre.com/sabreXML/2011/10
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for Address
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.Address_type0 localAddress ;
                                
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
                           * @return com.sabre.webservices.sabrexml._2011._10.Address_type0
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.Address_type0 getAddress(){
                               return localAddress;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Address
                               */
                               public void setAddress(com.sabre.webservices.sabrexml._2011._10.Address_type0 param){
                            localAddressTracker = param != null;
                                   
                                            this.localAddress=param;
                                    

                               }
                            

                        /**
                        * field for ContactNumbers
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.ContactNumbers_type0 localContactNumbers ;
                                
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
                           * @return com.sabre.webservices.sabrexml._2011._10.ContactNumbers_type0
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.ContactNumbers_type0 getContactNumbers(){
                               return localContactNumbers;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ContactNumbers
                               */
                               public void setContactNumbers(com.sabre.webservices.sabrexml._2011._10.ContactNumbers_type0 param){
                            localContactNumbersTracker = param != null;
                                   
                                            this.localContactNumbers=param;
                                    

                               }
                            

                        /**
                        * field for CustLoyalty
                        * This was an Array!
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.CustLoyalty_type0[] localCustLoyalty ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCustLoyaltyTracker = false ;

                           public boolean isCustLoyaltySpecified(){
                               return localCustLoyaltyTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.sabre.webservices.sabrexml._2011._10.CustLoyalty_type0[]
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.CustLoyalty_type0[] getCustLoyalty(){
                               return localCustLoyalty;
                           }

                           
                        


                               
                              /**
                               * validate the array for CustLoyalty
                               */
                              protected void validateCustLoyalty(com.sabre.webservices.sabrexml._2011._10.CustLoyalty_type0[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param CustLoyalty
                              */
                              public void setCustLoyalty(com.sabre.webservices.sabrexml._2011._10.CustLoyalty_type0[] param){
                              
                                   validateCustLoyalty(param);

                               localCustLoyaltyTracker = param != null;
                                      
                                      this.localCustLoyalty=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.sabre.webservices.sabrexml._2011._10.CustLoyalty_type0
                             */
                             public void addCustLoyalty(com.sabre.webservices.sabrexml._2011._10.CustLoyalty_type0 param){
                                   if (localCustLoyalty == null){
                                   localCustLoyalty = new com.sabre.webservices.sabrexml._2011._10.CustLoyalty_type0[]{};
                                   }

                            
                                 //update the setting tracker
                                localCustLoyaltyTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localCustLoyalty);
                               list.add(param);
                               this.localCustLoyalty =
                             (com.sabre.webservices.sabrexml._2011._10.CustLoyalty_type0[])list.toArray(
                            new com.sabre.webservices.sabrexml._2011._10.CustLoyalty_type0[list.size()]);

                             }
                             

                        /**
                        * field for Passport
                        * This was an Array!
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.Passport_type0[] localPassport ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPassportTracker = false ;

                           public boolean isPassportSpecified(){
                               return localPassportTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.sabre.webservices.sabrexml._2011._10.Passport_type0[]
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.Passport_type0[] getPassport(){
                               return localPassport;
                           }

                           
                        


                               
                              /**
                               * validate the array for Passport
                               */
                              protected void validatePassport(com.sabre.webservices.sabrexml._2011._10.Passport_type0[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param Passport
                              */
                              public void setPassport(com.sabre.webservices.sabrexml._2011._10.Passport_type0[] param){
                              
                                   validatePassport(param);

                               localPassportTracker = param != null;
                                      
                                      this.localPassport=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.sabre.webservices.sabrexml._2011._10.Passport_type0
                             */
                             public void addPassport(com.sabre.webservices.sabrexml._2011._10.Passport_type0 param){
                                   if (localPassport == null){
                                   localPassport = new com.sabre.webservices.sabrexml._2011._10.Passport_type0[]{};
                                   }

                            
                                 //update the setting tracker
                                localPassportTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localPassport);
                               list.add(param);
                               this.localPassport =
                             (com.sabre.webservices.sabrexml._2011._10.Passport_type0[])list.toArray(
                            new com.sabre.webservices.sabrexml._2011._10.Passport_type0[list.size()]);

                             }
                             

                        /**
                        * field for PaymentInfo
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.PaymentInfo_type1 localPaymentInfo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPaymentInfoTracker = false ;

                           public boolean isPaymentInfoSpecified(){
                               return localPaymentInfoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.sabre.webservices.sabrexml._2011._10.PaymentInfo_type1
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.PaymentInfo_type1 getPaymentInfo(){
                               return localPaymentInfo;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PaymentInfo
                               */
                               public void setPaymentInfo(com.sabre.webservices.sabrexml._2011._10.PaymentInfo_type1 param){
                            localPaymentInfoTracker = param != null;
                                   
                                            this.localPaymentInfo=param;
                                    

                               }
                            

                        /**
                        * field for PersonName
                        * This was an Array!
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.PersonName_type1[] localPersonName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPersonNameTracker = false ;

                           public boolean isPersonNameSpecified(){
                               return localPersonNameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.sabre.webservices.sabrexml._2011._10.PersonName_type1[]
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.PersonName_type1[] getPersonName(){
                               return localPersonName;
                           }

                           
                        


                               
                              /**
                               * validate the array for PersonName
                               */
                              protected void validatePersonName(com.sabre.webservices.sabrexml._2011._10.PersonName_type1[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param PersonName
                              */
                              public void setPersonName(com.sabre.webservices.sabrexml._2011._10.PersonName_type1[] param){
                              
                                   validatePersonName(param);

                               localPersonNameTracker = param != null;
                                      
                                      this.localPersonName=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.sabre.webservices.sabrexml._2011._10.PersonName_type1
                             */
                             public void addPersonName(com.sabre.webservices.sabrexml._2011._10.PersonName_type1 param){
                                   if (localPersonName == null){
                                   localPersonName = new com.sabre.webservices.sabrexml._2011._10.PersonName_type1[]{};
                                   }

                            
                                 //update the setting tracker
                                localPersonNameTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localPersonName);
                               list.add(param);
                               this.localPersonName =
                             (com.sabre.webservices.sabrexml._2011._10.PersonName_type1[])list.toArray(
                            new com.sabre.webservices.sabrexml._2011._10.PersonName_type1[list.size()]);

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
                           namespacePrefix+":CustomerInfo_type0",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "CustomerInfo_type0",
                           xmlWriter);
                   }

               
                   }
                if (localAddressTracker){
                                            if (localAddress==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Address cannot be null!!");
                                            }
                                           localAddress.serialize(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","Address"),
                                               xmlWriter);
                                        } if (localContactNumbersTracker){
                                            if (localContactNumbers==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ContactNumbers cannot be null!!");
                                            }
                                           localContactNumbers.serialize(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","ContactNumbers"),
                                               xmlWriter);
                                        } if (localCustLoyaltyTracker){
                                       if (localCustLoyalty!=null){
                                            for (int i = 0;i < localCustLoyalty.length;i++){
                                                if (localCustLoyalty[i] != null){
                                                 localCustLoyalty[i].serialize(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","CustLoyalty"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                        // we don't have to do any thing since minOccures is zero
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("CustLoyalty cannot be null!!");
                                        
                                    }
                                 } if (localPassportTracker){
                                       if (localPassport!=null){
                                            for (int i = 0;i < localPassport.length;i++){
                                                if (localPassport[i] != null){
                                                 localPassport[i].serialize(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","Passport"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                        // we don't have to do any thing since minOccures is zero
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("Passport cannot be null!!");
                                        
                                    }
                                 } if (localPaymentInfoTracker){
                                            if (localPaymentInfo==null){
                                                 throw new org.apache.axis2.databinding.ADBException("PaymentInfo cannot be null!!");
                                            }
                                           localPaymentInfo.serialize(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","PaymentInfo"),
                                               xmlWriter);
                                        } if (localPersonNameTracker){
                                       if (localPersonName!=null){
                                            for (int i = 0;i < localPersonName.length;i++){
                                                if (localPersonName[i] != null){
                                                 localPersonName[i].serialize(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","PersonName"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                        // we don't have to do any thing since minOccures is zero
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("PersonName cannot be null!!");
                                        
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

                 if (localAddressTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                      "Address"));
                            
                            
                                    if (localAddress==null){
                                         throw new org.apache.axis2.databinding.ADBException("Address cannot be null!!");
                                    }
                                    elementList.add(localAddress);
                                } if (localContactNumbersTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                      "ContactNumbers"));
                            
                            
                                    if (localContactNumbers==null){
                                         throw new org.apache.axis2.databinding.ADBException("ContactNumbers cannot be null!!");
                                    }
                                    elementList.add(localContactNumbers);
                                } if (localCustLoyaltyTracker){
                             if (localCustLoyalty!=null) {
                                 for (int i = 0;i < localCustLoyalty.length;i++){

                                    if (localCustLoyalty[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                          "CustLoyalty"));
                                         elementList.add(localCustLoyalty[i]);
                                    } else {
                                        
                                                // nothing to do
                                            
                                    }

                                 }
                             } else {
                                 
                                        throw new org.apache.axis2.databinding.ADBException("CustLoyalty cannot be null!!");
                                    
                             }

                        } if (localPassportTracker){
                             if (localPassport!=null) {
                                 for (int i = 0;i < localPassport.length;i++){

                                    if (localPassport[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                          "Passport"));
                                         elementList.add(localPassport[i]);
                                    } else {
                                        
                                                // nothing to do
                                            
                                    }

                                 }
                             } else {
                                 
                                        throw new org.apache.axis2.databinding.ADBException("Passport cannot be null!!");
                                    
                             }

                        } if (localPaymentInfoTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                      "PaymentInfo"));
                            
                            
                                    if (localPaymentInfo==null){
                                         throw new org.apache.axis2.databinding.ADBException("PaymentInfo cannot be null!!");
                                    }
                                    elementList.add(localPaymentInfo);
                                } if (localPersonNameTracker){
                             if (localPersonName!=null) {
                                 for (int i = 0;i < localPersonName.length;i++){

                                    if (localPersonName[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                          "PersonName"));
                                         elementList.add(localPersonName[i]);
                                    } else {
                                        
                                                // nothing to do
                                            
                                    }

                                 }
                             } else {
                                 
                                        throw new org.apache.axis2.databinding.ADBException("PersonName cannot be null!!");
                                    
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
        public static CustomerInfo_type0 parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            CustomerInfo_type0 object =
                new CustomerInfo_type0();

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
                    
                            if (!"CustomerInfo_type0".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (CustomerInfo_type0)org.xmlsoap.schemas.soap.envelope.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                        java.util.ArrayList list3 = new java.util.ArrayList();
                    
                        java.util.ArrayList list4 = new java.util.ArrayList();
                    
                        java.util.ArrayList list6 = new java.util.ArrayList();
                    
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","Address").equals(reader.getName())){
                                
                                                object.setAddress(com.sabre.webservices.sabrexml._2011._10.Address_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","ContactNumbers").equals(reader.getName())){
                                
                                                object.setContactNumbers(com.sabre.webservices.sabrexml._2011._10.ContactNumbers_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","CustLoyalty").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list3.add(com.sabre.webservices.sabrexml._2011._10.CustLoyalty_type0.Factory.parse(reader));
                                                                
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone3 = false;
                                                        while(!loopDone3){
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
                                                                loopDone3 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","CustLoyalty").equals(reader.getName())){
                                                                    list3.add(com.sabre.webservices.sabrexml._2011._10.CustLoyalty_type0.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone3 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setCustLoyalty((com.sabre.webservices.sabrexml._2011._10.CustLoyalty_type0[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.sabre.webservices.sabrexml._2011._10.CustLoyalty_type0.class,
                                                                list3));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","Passport").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list4.add(com.sabre.webservices.sabrexml._2011._10.Passport_type0.Factory.parse(reader));
                                                                
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
                                                                if (new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","Passport").equals(reader.getName())){
                                                                    list4.add(com.sabre.webservices.sabrexml._2011._10.Passport_type0.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone4 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setPassport((com.sabre.webservices.sabrexml._2011._10.Passport_type0[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.sabre.webservices.sabrexml._2011._10.Passport_type0.class,
                                                                list4));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","PaymentInfo").equals(reader.getName())){
                                
                                                object.setPaymentInfo(com.sabre.webservices.sabrexml._2011._10.PaymentInfo_type1.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","PersonName").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list6.add(com.sabre.webservices.sabrexml._2011._10.PersonName_type1.Factory.parse(reader));
                                                                
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone6 = false;
                                                        while(!loopDone6){
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
                                                                loopDone6 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","PersonName").equals(reader.getName())){
                                                                    list6.add(com.sabre.webservices.sabrexml._2011._10.PersonName_type1.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone6 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setPersonName((com.sabre.webservices.sabrexml._2011._10.PersonName_type1[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.sabre.webservices.sabrexml._2011._10.PersonName_type1.class,
                                                                list6));
                                                            
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
           
    