
/**
 * RentalRate_type0.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.sabre.webservices.sabrexml._2011._10;
            

            /**
            *  RentalRate_type0 bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class RentalRate_type0
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = RentalRate_type0
                Namespace URI = http://webservices.sabre.com/sabreXML/2011/10
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for Billing
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.Billing_type0 localBilling ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBillingTracker = false ;

                           public boolean isBillingSpecified(){
                               return localBillingTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.sabre.webservices.sabrexml._2011._10.Billing_type0
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.Billing_type0 getBilling(){
                               return localBilling;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Billing
                               */
                               public void setBilling(com.sabre.webservices.sabrexml._2011._10.Billing_type0 param){
                            localBillingTracker = param != null;
                                   
                                            this.localBilling=param;
                                    

                               }
                            

                        /**
                        * field for Client
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.Client_type0 localClient ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localClientTracker = false ;

                           public boolean isClientSpecified(){
                               return localClientTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.sabre.webservices.sabrexml._2011._10.Client_type0
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.Client_type0 getClient(){
                               return localClient;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Client
                               */
                               public void setClient(com.sabre.webservices.sabrexml._2011._10.Client_type0 param){
                            localClientTracker = param != null;
                                   
                                            this.localClient=param;
                                    

                               }
                            

                        /**
                        * field for Corporate
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.Corporate_type1 localCorporate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCorporateTracker = false ;

                           public boolean isCorporateSpecified(){
                               return localCorporateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.sabre.webservices.sabrexml._2011._10.Corporate_type1
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.Corporate_type1 getCorporate(){
                               return localCorporate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Corporate
                               */
                               public void setCorporate(com.sabre.webservices.sabrexml._2011._10.Corporate_type1 param){
                            localCorporateTracker = param != null;
                                   
                                            this.localCorporate=param;
                                    

                               }
                            

                        /**
                        * field for CustLoyalty
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.CustLoyalty_type2 localCustLoyalty ;
                                
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
                           * @return com.sabre.webservices.sabrexml._2011._10.CustLoyalty_type2
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.CustLoyalty_type2 getCustLoyalty(){
                               return localCustLoyalty;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CustLoyalty
                               */
                               public void setCustLoyalty(com.sabre.webservices.sabrexml._2011._10.CustLoyalty_type2 param){
                            localCustLoyaltyTracker = param != null;
                                   
                                            this.localCustLoyalty=param;
                                    

                               }
                            

                        /**
                        * field for InvoiceRemarks
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.InvoiceRemarks_type0 localInvoiceRemarks ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localInvoiceRemarksTracker = false ;

                           public boolean isInvoiceRemarksSpecified(){
                               return localInvoiceRemarksTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.sabre.webservices.sabrexml._2011._10.InvoiceRemarks_type0
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.InvoiceRemarks_type0 getInvoiceRemarks(){
                               return localInvoiceRemarks;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param InvoiceRemarks
                               */
                               public void setInvoiceRemarks(com.sabre.webservices.sabrexml._2011._10.InvoiceRemarks_type0 param){
                            localInvoiceRemarksTracker = param != null;
                                   
                                            this.localInvoiceRemarks=param;
                                    

                               }
                            

                        /**
                        * field for Remarks
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.Remarks_type0 localRemarks ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRemarksTracker = false ;

                           public boolean isRemarksSpecified(){
                               return localRemarksTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.sabre.webservices.sabrexml._2011._10.Remarks_type0
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.Remarks_type0 getRemarks(){
                               return localRemarks;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Remarks
                               */
                               public void setRemarks(com.sabre.webservices.sabrexml._2011._10.Remarks_type0 param){
                            localRemarksTracker = param != null;
                                   
                                            this.localRemarks=param;
                                    

                               }
                            

                        /**
                        * field for ReserveUnderName
                        */

                        
                                    protected java.lang.String localReserveUnderName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localReserveUnderNameTracker = false ;

                           public boolean isReserveUnderNameSpecified(){
                               return localReserveUnderNameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getReserveUnderName(){
                               return localReserveUnderName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ReserveUnderName
                               */
                               public void setReserveUnderName(java.lang.String param){
                            localReserveUnderNameTracker = param != null;
                                   
                                            this.localReserveUnderName=param;
                                    

                               }
                            

                        /**
                        * field for ServiceInformation
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.ServiceInformation_type3 localServiceInformation ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localServiceInformationTracker = false ;

                           public boolean isServiceInformationSpecified(){
                               return localServiceInformationTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.sabre.webservices.sabrexml._2011._10.ServiceInformation_type3
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.ServiceInformation_type3 getServiceInformation(){
                               return localServiceInformation;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ServiceInformation
                               */
                               public void setServiceInformation(com.sabre.webservices.sabrexml._2011._10.ServiceInformation_type3 param){
                            localServiceInformationTracker = param != null;
                                   
                                            this.localServiceInformation=param;
                                    

                               }
                            

                        /**
                        * field for TourCode
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.TourCode_type1 localTourCode ;
                                
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
                           * @return com.sabre.webservices.sabrexml._2011._10.TourCode_type1
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.TourCode_type1 getTourCode(){
                               return localTourCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TourCode
                               */
                               public void setTourCode(com.sabre.webservices.sabrexml._2011._10.TourCode_type1 param){
                            localTourCodeTracker = param != null;
                                   
                                            this.localTourCode=param;
                                    

                               }
                            

                        /**
                        * field for Vehicle
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.Vehicle_type0 localVehicle ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localVehicleTracker = false ;

                           public boolean isVehicleSpecified(){
                               return localVehicleTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.sabre.webservices.sabrexml._2011._10.Vehicle_type0
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.Vehicle_type0 getVehicle(){
                               return localVehicle;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Vehicle
                               */
                               public void setVehicle(com.sabre.webservices.sabrexml._2011._10.Vehicle_type0 param){
                            localVehicleTracker = param != null;
                                   
                                            this.localVehicle=param;
                                    

                               }
                            

                        /**
                        * field for Voucher
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.Voucher_type0 localVoucher ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localVoucherTracker = false ;

                           public boolean isVoucherSpecified(){
                               return localVoucherTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.sabre.webservices.sabrexml._2011._10.Voucher_type0
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.Voucher_type0 getVoucher(){
                               return localVoucher;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Voucher
                               */
                               public void setVoucher(com.sabre.webservices.sabrexml._2011._10.Voucher_type0 param){
                            localVoucherTracker = param != null;
                                   
                                            this.localVoucher=param;
                                    

                               }
                            

                        /**
                        * field for Changed
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localChanged ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getChanged(){
                               return localChanged;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Changed
                               */
                               public void setChanged(java.lang.String param){
                            
                                            this.localChanged=param;
                                    

                               }
                            

                        /**
                        * field for GuaranteedQuoted
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localGuaranteedQuoted ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getGuaranteedQuoted(){
                               return localGuaranteedQuoted;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GuaranteedQuoted
                               */
                               public void setGuaranteedQuoted(java.lang.String param){
                            
                                            this.localGuaranteedQuoted=param;
                                    

                               }
                            

                        /**
                        * field for RateCode
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localRateCode ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getRateCode(){
                               return localRateCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RateCode
                               */
                               public void setRateCode(java.lang.String param){
                            
                                            this.localRateCode=param;
                                    

                               }
                            

                        /**
                        * field for STM_RatePlan
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localSTM_RatePlan ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSTM_RatePlan(){
                               return localSTM_RatePlan;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param STM_RatePlan
                               */
                               public void setSTM_RatePlan(java.lang.String param){
                            
                                            this.localSTM_RatePlan=param;
                                    

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
                           namespacePrefix+":RentalRate_type0",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "RentalRate_type0",
                           xmlWriter);
                   }

               
                   }
               
                                            if (localChanged != null){
                                        
                                                writeAttribute("",
                                                         "Changed",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localChanged), xmlWriter);

                                            
                                      }
                                    
                                            if (localGuaranteedQuoted != null){
                                        
                                                writeAttribute("",
                                                         "GuaranteedQuoted",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGuaranteedQuoted), xmlWriter);

                                            
                                      }
                                    
                                            if (localRateCode != null){
                                        
                                                writeAttribute("",
                                                         "RateCode",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRateCode), xmlWriter);

                                            
                                      }
                                    
                                            if (localSTM_RatePlan != null){
                                        
                                                writeAttribute("",
                                                         "STM_RatePlan",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSTM_RatePlan), xmlWriter);

                                            
                                      }
                                     if (localBillingTracker){
                                            if (localBilling==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Billing cannot be null!!");
                                            }
                                           localBilling.serialize(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","Billing"),
                                               xmlWriter);
                                        } if (localClientTracker){
                                            if (localClient==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Client cannot be null!!");
                                            }
                                           localClient.serialize(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","Client"),
                                               xmlWriter);
                                        } if (localCorporateTracker){
                                            if (localCorporate==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Corporate cannot be null!!");
                                            }
                                           localCorporate.serialize(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","Corporate"),
                                               xmlWriter);
                                        } if (localCustLoyaltyTracker){
                                            if (localCustLoyalty==null){
                                                 throw new org.apache.axis2.databinding.ADBException("CustLoyalty cannot be null!!");
                                            }
                                           localCustLoyalty.serialize(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","CustLoyalty"),
                                               xmlWriter);
                                        } if (localInvoiceRemarksTracker){
                                            if (localInvoiceRemarks==null){
                                                 throw new org.apache.axis2.databinding.ADBException("InvoiceRemarks cannot be null!!");
                                            }
                                           localInvoiceRemarks.serialize(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","InvoiceRemarks"),
                                               xmlWriter);
                                        } if (localRemarksTracker){
                                            if (localRemarks==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Remarks cannot be null!!");
                                            }
                                           localRemarks.serialize(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","Remarks"),
                                               xmlWriter);
                                        } if (localReserveUnderNameTracker){
                                    namespace = "http://webservices.sabre.com/sabreXML/2011/10";
                                    writeStartElement(null, namespace, "ReserveUnderName", xmlWriter);
                             

                                          if (localReserveUnderName==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("ReserveUnderName cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localReserveUnderName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localServiceInformationTracker){
                                            if (localServiceInformation==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ServiceInformation cannot be null!!");
                                            }
                                           localServiceInformation.serialize(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","ServiceInformation"),
                                               xmlWriter);
                                        } if (localTourCodeTracker){
                                            if (localTourCode==null){
                                                 throw new org.apache.axis2.databinding.ADBException("TourCode cannot be null!!");
                                            }
                                           localTourCode.serialize(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","TourCode"),
                                               xmlWriter);
                                        } if (localVehicleTracker){
                                            if (localVehicle==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Vehicle cannot be null!!");
                                            }
                                           localVehicle.serialize(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","Vehicle"),
                                               xmlWriter);
                                        } if (localVoucherTracker){
                                            if (localVoucher==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Voucher cannot be null!!");
                                            }
                                           localVoucher.serialize(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","Voucher"),
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

                 if (localBillingTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                      "Billing"));
                            
                            
                                    if (localBilling==null){
                                         throw new org.apache.axis2.databinding.ADBException("Billing cannot be null!!");
                                    }
                                    elementList.add(localBilling);
                                } if (localClientTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                      "Client"));
                            
                            
                                    if (localClient==null){
                                         throw new org.apache.axis2.databinding.ADBException("Client cannot be null!!");
                                    }
                                    elementList.add(localClient);
                                } if (localCorporateTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                      "Corporate"));
                            
                            
                                    if (localCorporate==null){
                                         throw new org.apache.axis2.databinding.ADBException("Corporate cannot be null!!");
                                    }
                                    elementList.add(localCorporate);
                                } if (localCustLoyaltyTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                      "CustLoyalty"));
                            
                            
                                    if (localCustLoyalty==null){
                                         throw new org.apache.axis2.databinding.ADBException("CustLoyalty cannot be null!!");
                                    }
                                    elementList.add(localCustLoyalty);
                                } if (localInvoiceRemarksTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                      "InvoiceRemarks"));
                            
                            
                                    if (localInvoiceRemarks==null){
                                         throw new org.apache.axis2.databinding.ADBException("InvoiceRemarks cannot be null!!");
                                    }
                                    elementList.add(localInvoiceRemarks);
                                } if (localRemarksTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                      "Remarks"));
                            
                            
                                    if (localRemarks==null){
                                         throw new org.apache.axis2.databinding.ADBException("Remarks cannot be null!!");
                                    }
                                    elementList.add(localRemarks);
                                } if (localReserveUnderNameTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                      "ReserveUnderName"));
                                 
                                        if (localReserveUnderName != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReserveUnderName));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("ReserveUnderName cannot be null!!");
                                        }
                                    } if (localServiceInformationTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                      "ServiceInformation"));
                            
                            
                                    if (localServiceInformation==null){
                                         throw new org.apache.axis2.databinding.ADBException("ServiceInformation cannot be null!!");
                                    }
                                    elementList.add(localServiceInformation);
                                } if (localTourCodeTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                      "TourCode"));
                            
                            
                                    if (localTourCode==null){
                                         throw new org.apache.axis2.databinding.ADBException("TourCode cannot be null!!");
                                    }
                                    elementList.add(localTourCode);
                                } if (localVehicleTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                      "Vehicle"));
                            
                            
                                    if (localVehicle==null){
                                         throw new org.apache.axis2.databinding.ADBException("Vehicle cannot be null!!");
                                    }
                                    elementList.add(localVehicle);
                                } if (localVoucherTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                      "Voucher"));
                            
                            
                                    if (localVoucher==null){
                                         throw new org.apache.axis2.databinding.ADBException("Voucher cannot be null!!");
                                    }
                                    elementList.add(localVoucher);
                                }
                            attribList.add(
                            new javax.xml.namespace.QName("","Changed"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localChanged));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","GuaranteedQuoted"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGuaranteedQuoted));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","RateCode"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRateCode));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","STM_RatePlan"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSTM_RatePlan));
                                

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
        public static RentalRate_type0 parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            RentalRate_type0 object =
                new RentalRate_type0();

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
                    
                            if (!"RentalRate_type0".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (RentalRate_type0)org.xmlsoap.schemas.soap.envelope.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    // handle attribute "Changed"
                    java.lang.String tempAttribChanged =
                        
                                reader.getAttributeValue(null,"Changed");
                            
                   if (tempAttribChanged!=null){
                         java.lang.String content = tempAttribChanged;
                        
                                                 object.setChanged(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribChanged));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("Changed");
                    
                    // handle attribute "GuaranteedQuoted"
                    java.lang.String tempAttribGuaranteedQuoted =
                        
                                reader.getAttributeValue(null,"GuaranteedQuoted");
                            
                   if (tempAttribGuaranteedQuoted!=null){
                         java.lang.String content = tempAttribGuaranteedQuoted;
                        
                                                 object.setGuaranteedQuoted(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribGuaranteedQuoted));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("GuaranteedQuoted");
                    
                    // handle attribute "RateCode"
                    java.lang.String tempAttribRateCode =
                        
                                reader.getAttributeValue(null,"RateCode");
                            
                   if (tempAttribRateCode!=null){
                         java.lang.String content = tempAttribRateCode;
                        
                                                 object.setRateCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribRateCode));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("RateCode");
                    
                    // handle attribute "STM_RatePlan"
                    java.lang.String tempAttribSTM_RatePlan =
                        
                                reader.getAttributeValue(null,"STM_RatePlan");
                            
                   if (tempAttribSTM_RatePlan!=null){
                         java.lang.String content = tempAttribSTM_RatePlan;
                        
                                                 object.setSTM_RatePlan(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribSTM_RatePlan));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("STM_RatePlan");
                    
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","Billing").equals(reader.getName())){
                                
                                                object.setBilling(com.sabre.webservices.sabrexml._2011._10.Billing_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","Client").equals(reader.getName())){
                                
                                                object.setClient(com.sabre.webservices.sabrexml._2011._10.Client_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","Corporate").equals(reader.getName())){
                                
                                                object.setCorporate(com.sabre.webservices.sabrexml._2011._10.Corporate_type1.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","CustLoyalty").equals(reader.getName())){
                                
                                                object.setCustLoyalty(com.sabre.webservices.sabrexml._2011._10.CustLoyalty_type2.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","InvoiceRemarks").equals(reader.getName())){
                                
                                                object.setInvoiceRemarks(com.sabre.webservices.sabrexml._2011._10.InvoiceRemarks_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","Remarks").equals(reader.getName())){
                                
                                                object.setRemarks(com.sabre.webservices.sabrexml._2011._10.Remarks_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","ReserveUnderName").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"ReserveUnderName" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setReserveUnderName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","ServiceInformation").equals(reader.getName())){
                                
                                                object.setServiceInformation(com.sabre.webservices.sabrexml._2011._10.ServiceInformation_type3.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","TourCode").equals(reader.getName())){
                                
                                                object.setTourCode(com.sabre.webservices.sabrexml._2011._10.TourCode_type1.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","Vehicle").equals(reader.getName())){
                                
                                                object.setVehicle(com.sabre.webservices.sabrexml._2011._10.Vehicle_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","Voucher").equals(reader.getName())){
                                
                                                object.setVoucher(com.sabre.webservices.sabrexml._2011._10.Voucher_type0.Factory.parse(reader));
                                              
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
           
    