
/**
 * AccountingInfo_type0.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.sabre.webservices.sabrexml._2011._10;
            

            /**
            *  AccountingInfo_type0 bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class AccountingInfo_type0
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = AccountingInfo_type0
                Namespace URI = http://webservices.sabre.com/sabreXML/2011/10
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for AccountVendor
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.AccountVendor_type0 localAccountVendor ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAccountVendorTracker = false ;

                           public boolean isAccountVendorSpecified(){
                               return localAccountVendorTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.sabre.webservices.sabrexml._2011._10.AccountVendor_type0
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.AccountVendor_type0 getAccountVendor(){
                               return localAccountVendor;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AccountVendor
                               */
                               public void setAccountVendor(com.sabre.webservices.sabrexml._2011._10.AccountVendor_type0 param){
                            localAccountVendorTracker = param != null;
                                   
                                            this.localAccountVendor=param;
                                    

                               }
                            

                        /**
                        * field for Airline
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.Airline_type0 localAirline ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAirlineTracker = false ;

                           public boolean isAirlineSpecified(){
                               return localAirlineTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.sabre.webservices.sabrexml._2011._10.Airline_type0
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.Airline_type0 getAirline(){
                               return localAirline;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Airline
                               */
                               public void setAirline(com.sabre.webservices.sabrexml._2011._10.Airline_type0 param){
                            localAirlineTracker = param != null;
                                   
                                            this.localAirline=param;
                                    

                               }
                            

                        /**
                        * field for BaseFare
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.BaseFare_type0 localBaseFare ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBaseFareTracker = false ;

                           public boolean isBaseFareSpecified(){
                               return localBaseFareTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.sabre.webservices.sabrexml._2011._10.BaseFare_type0
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.BaseFare_type0 getBaseFare(){
                               return localBaseFare;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BaseFare
                               */
                               public void setBaseFare(com.sabre.webservices.sabrexml._2011._10.BaseFare_type0 param){
                            localBaseFareTracker = param != null;
                                   
                                            this.localBaseFare=param;
                                    

                               }
                            

                        /**
                        * field for ChargeCategory
                        */

                        
                                    protected java.lang.String localChargeCategory ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localChargeCategoryTracker = false ;

                           public boolean isChargeCategorySpecified(){
                               return localChargeCategoryTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getChargeCategory(){
                               return localChargeCategory;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ChargeCategory
                               */
                               public void setChargeCategory(java.lang.String param){
                            localChargeCategoryTracker = param != null;
                                   
                                            this.localChargeCategory=param;
                                    

                               }
                            

                        /**
                        * field for DocumentInfo
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.DocumentInfo_type0 localDocumentInfo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDocumentInfoTracker = false ;

                           public boolean isDocumentInfoSpecified(){
                               return localDocumentInfoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.sabre.webservices.sabrexml._2011._10.DocumentInfo_type0
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.DocumentInfo_type0 getDocumentInfo(){
                               return localDocumentInfo;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DocumentInfo
                               */
                               public void setDocumentInfo(com.sabre.webservices.sabrexml._2011._10.DocumentInfo_type0 param){
                            localDocumentInfoTracker = param != null;
                                   
                                            this.localDocumentInfo=param;
                                    

                               }
                            

                        /**
                        * field for FareApplication
                        */

                        
                                    protected java.lang.String localFareApplication ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localFareApplicationTracker = false ;

                           public boolean isFareApplicationSpecified(){
                               return localFareApplicationTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getFareApplication(){
                               return localFareApplication;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param FareApplication
                               */
                               public void setFareApplication(java.lang.String param){
                            localFareApplicationTracker = param != null;
                                   
                                            this.localFareApplication=param;
                                    

                               }
                            

                        /**
                        * field for PaymentInfo
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.PaymentInfo_type0 localPaymentInfo ;
                                
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
                           * @return com.sabre.webservices.sabrexml._2011._10.PaymentInfo_type0
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.PaymentInfo_type0 getPaymentInfo(){
                               return localPaymentInfo;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PaymentInfo
                               */
                               public void setPaymentInfo(com.sabre.webservices.sabrexml._2011._10.PaymentInfo_type0 param){
                            localPaymentInfoTracker = param != null;
                                   
                                            this.localPaymentInfo=param;
                                    

                               }
                            

                        /**
                        * field for PersonName
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.PersonName_type0 localPersonName ;
                                
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
                           * @return com.sabre.webservices.sabrexml._2011._10.PersonName_type0
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.PersonName_type0 getPersonName(){
                               return localPersonName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PersonName
                               */
                               public void setPersonName(com.sabre.webservices.sabrexml._2011._10.PersonName_type0 param){
                            localPersonNameTracker = param != null;
                                   
                                            this.localPersonName=param;
                                    

                               }
                            

                        /**
                        * field for Taxes
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.Taxes_type0 localTaxes ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTaxesTracker = false ;

                           public boolean isTaxesSpecified(){
                               return localTaxesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.sabre.webservices.sabrexml._2011._10.Taxes_type0
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.Taxes_type0 getTaxes(){
                               return localTaxes;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Taxes
                               */
                               public void setTaxes(com.sabre.webservices.sabrexml._2011._10.Taxes_type0 param){
                            localTaxesTracker = param != null;
                                   
                                            this.localTaxes=param;
                                    

                               }
                            

                        /**
                        * field for Text
                        */

                        
                                    protected java.lang.String localText ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTextTracker = false ;

                           public boolean isTextSpecified(){
                               return localTextTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getText(){
                               return localText;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Text
                               */
                               public void setText(java.lang.String param){
                            localTextTracker = param != null;
                                   
                                            this.localText=param;
                                    

                               }
                            

                        /**
                        * field for TicketingInfo
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.TicketingInfo_type0 localTicketingInfo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTicketingInfoTracker = false ;

                           public boolean isTicketingInfoSpecified(){
                               return localTicketingInfoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.sabre.webservices.sabrexml._2011._10.TicketingInfo_type0
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.TicketingInfo_type0 getTicketingInfo(){
                               return localTicketingInfo;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TicketingInfo
                               */
                               public void setTicketingInfo(com.sabre.webservices.sabrexml._2011._10.TicketingInfo_type0 param){
                            localTicketingInfoTracker = param != null;
                                   
                                            this.localTicketingInfo=param;
                                    

                               }
                            

                        /**
                        * field for LinkCode
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localLinkCode ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getLinkCode(){
                               return localLinkCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param LinkCode
                               */
                               public void setLinkCode(java.lang.String param){
                            
                                            this.localLinkCode=param;
                                    

                               }
                            

                        /**
                        * field for Type
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localType ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getType(){
                               return localType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Type
                               */
                               public void setType(java.lang.String param){
                            
                                            this.localType=param;
                                    

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
                           namespacePrefix+":AccountingInfo_type0",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "AccountingInfo_type0",
                           xmlWriter);
                   }

               
                   }
               
                                            if (localLinkCode != null){
                                        
                                                writeAttribute("",
                                                         "LinkCode",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLinkCode), xmlWriter);

                                            
                                      }
                                    
                                            if (localType != null){
                                        
                                                writeAttribute("",
                                                         "Type",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localType), xmlWriter);

                                            
                                      }
                                     if (localAccountVendorTracker){
                                            if (localAccountVendor==null){
                                                 throw new org.apache.axis2.databinding.ADBException("AccountVendor cannot be null!!");
                                            }
                                           localAccountVendor.serialize(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","AccountVendor"),
                                               xmlWriter);
                                        } if (localAirlineTracker){
                                            if (localAirline==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Airline cannot be null!!");
                                            }
                                           localAirline.serialize(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","Airline"),
                                               xmlWriter);
                                        } if (localBaseFareTracker){
                                            if (localBaseFare==null){
                                                 throw new org.apache.axis2.databinding.ADBException("BaseFare cannot be null!!");
                                            }
                                           localBaseFare.serialize(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","BaseFare"),
                                               xmlWriter);
                                        } if (localChargeCategoryTracker){
                                    namespace = "http://webservices.sabre.com/sabreXML/2011/10";
                                    writeStartElement(null, namespace, "ChargeCategory", xmlWriter);
                             

                                          if (localChargeCategory==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("ChargeCategory cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localChargeCategory);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localDocumentInfoTracker){
                                            if (localDocumentInfo==null){
                                                 throw new org.apache.axis2.databinding.ADBException("DocumentInfo cannot be null!!");
                                            }
                                           localDocumentInfo.serialize(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","DocumentInfo"),
                                               xmlWriter);
                                        } if (localFareApplicationTracker){
                                    namespace = "http://webservices.sabre.com/sabreXML/2011/10";
                                    writeStartElement(null, namespace, "FareApplication", xmlWriter);
                             

                                          if (localFareApplication==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("FareApplication cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localFareApplication);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPaymentInfoTracker){
                                            if (localPaymentInfo==null){
                                                 throw new org.apache.axis2.databinding.ADBException("PaymentInfo cannot be null!!");
                                            }
                                           localPaymentInfo.serialize(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","PaymentInfo"),
                                               xmlWriter);
                                        } if (localPersonNameTracker){
                                            if (localPersonName==null){
                                                 throw new org.apache.axis2.databinding.ADBException("PersonName cannot be null!!");
                                            }
                                           localPersonName.serialize(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","PersonName"),
                                               xmlWriter);
                                        } if (localTaxesTracker){
                                            if (localTaxes==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Taxes cannot be null!!");
                                            }
                                           localTaxes.serialize(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","Taxes"),
                                               xmlWriter);
                                        } if (localTextTracker){
                                    namespace = "http://webservices.sabre.com/sabreXML/2011/10";
                                    writeStartElement(null, namespace, "Text", xmlWriter);
                             

                                          if (localText==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Text cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localText);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTicketingInfoTracker){
                                            if (localTicketingInfo==null){
                                                 throw new org.apache.axis2.databinding.ADBException("TicketingInfo cannot be null!!");
                                            }
                                           localTicketingInfo.serialize(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","TicketingInfo"),
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

                 if (localAccountVendorTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                      "AccountVendor"));
                            
                            
                                    if (localAccountVendor==null){
                                         throw new org.apache.axis2.databinding.ADBException("AccountVendor cannot be null!!");
                                    }
                                    elementList.add(localAccountVendor);
                                } if (localAirlineTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                      "Airline"));
                            
                            
                                    if (localAirline==null){
                                         throw new org.apache.axis2.databinding.ADBException("Airline cannot be null!!");
                                    }
                                    elementList.add(localAirline);
                                } if (localBaseFareTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                      "BaseFare"));
                            
                            
                                    if (localBaseFare==null){
                                         throw new org.apache.axis2.databinding.ADBException("BaseFare cannot be null!!");
                                    }
                                    elementList.add(localBaseFare);
                                } if (localChargeCategoryTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                      "ChargeCategory"));
                                 
                                        if (localChargeCategory != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localChargeCategory));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("ChargeCategory cannot be null!!");
                                        }
                                    } if (localDocumentInfoTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                      "DocumentInfo"));
                            
                            
                                    if (localDocumentInfo==null){
                                         throw new org.apache.axis2.databinding.ADBException("DocumentInfo cannot be null!!");
                                    }
                                    elementList.add(localDocumentInfo);
                                } if (localFareApplicationTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                      "FareApplication"));
                                 
                                        if (localFareApplication != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFareApplication));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("FareApplication cannot be null!!");
                                        }
                                    } if (localPaymentInfoTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                      "PaymentInfo"));
                            
                            
                                    if (localPaymentInfo==null){
                                         throw new org.apache.axis2.databinding.ADBException("PaymentInfo cannot be null!!");
                                    }
                                    elementList.add(localPaymentInfo);
                                } if (localPersonNameTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                      "PersonName"));
                            
                            
                                    if (localPersonName==null){
                                         throw new org.apache.axis2.databinding.ADBException("PersonName cannot be null!!");
                                    }
                                    elementList.add(localPersonName);
                                } if (localTaxesTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                      "Taxes"));
                            
                            
                                    if (localTaxes==null){
                                         throw new org.apache.axis2.databinding.ADBException("Taxes cannot be null!!");
                                    }
                                    elementList.add(localTaxes);
                                } if (localTextTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                      "Text"));
                                 
                                        if (localText != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localText));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Text cannot be null!!");
                                        }
                                    } if (localTicketingInfoTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                      "TicketingInfo"));
                            
                            
                                    if (localTicketingInfo==null){
                                         throw new org.apache.axis2.databinding.ADBException("TicketingInfo cannot be null!!");
                                    }
                                    elementList.add(localTicketingInfo);
                                }
                            attribList.add(
                            new javax.xml.namespace.QName("","LinkCode"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLinkCode));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","Type"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localType));
                                

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
        public static AccountingInfo_type0 parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            AccountingInfo_type0 object =
                new AccountingInfo_type0();

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
                    
                            if (!"AccountingInfo_type0".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (AccountingInfo_type0)org.xmlsoap.schemas.soap.envelope.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    // handle attribute "LinkCode"
                    java.lang.String tempAttribLinkCode =
                        
                                reader.getAttributeValue(null,"LinkCode");
                            
                   if (tempAttribLinkCode!=null){
                         java.lang.String content = tempAttribLinkCode;
                        
                                                 object.setLinkCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribLinkCode));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("LinkCode");
                    
                    // handle attribute "Type"
                    java.lang.String tempAttribType =
                        
                                reader.getAttributeValue(null,"Type");
                            
                   if (tempAttribType!=null){
                         java.lang.String content = tempAttribType;
                        
                                                 object.setType(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribType));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("Type");
                    
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","AccountVendor").equals(reader.getName())){
                                
                                                object.setAccountVendor(com.sabre.webservices.sabrexml._2011._10.AccountVendor_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","Airline").equals(reader.getName())){
                                
                                                object.setAirline(com.sabre.webservices.sabrexml._2011._10.Airline_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","BaseFare").equals(reader.getName())){
                                
                                                object.setBaseFare(com.sabre.webservices.sabrexml._2011._10.BaseFare_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","ChargeCategory").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"ChargeCategory" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setChargeCategory(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","DocumentInfo").equals(reader.getName())){
                                
                                                object.setDocumentInfo(com.sabre.webservices.sabrexml._2011._10.DocumentInfo_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","FareApplication").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"FareApplication" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setFareApplication(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","PaymentInfo").equals(reader.getName())){
                                
                                                object.setPaymentInfo(com.sabre.webservices.sabrexml._2011._10.PaymentInfo_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","PersonName").equals(reader.getName())){
                                
                                                object.setPersonName(com.sabre.webservices.sabrexml._2011._10.PersonName_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","Taxes").equals(reader.getName())){
                                
                                                object.setTaxes(com.sabre.webservices.sabrexml._2011._10.Taxes_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","Text").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Text" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setText(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","TicketingInfo").equals(reader.getName())){
                                
                                                object.setTicketingInfo(com.sabre.webservices.sabrexml._2011._10.TicketingInfo_type0.Factory.parse(reader));
                                              
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
           
    