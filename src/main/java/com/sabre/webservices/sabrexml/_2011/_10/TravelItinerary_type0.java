
/**
 * TravelItinerary_type0.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.sabre.webservices.sabrexml._2011._10;
            

            /**
            *  TravelItinerary_type0 bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class TravelItinerary_type0
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = TravelItinerary_type0
                Namespace URI = http://webservices.sabre.com/sabreXML/2011/10
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for AccountingInfo
                        * This was an Array!
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.AccountingInfo_type0[] localAccountingInfo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAccountingInfoTracker = false ;

                           public boolean isAccountingInfoSpecified(){
                               return localAccountingInfoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.sabre.webservices.sabrexml._2011._10.AccountingInfo_type0[]
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.AccountingInfo_type0[] getAccountingInfo(){
                               return localAccountingInfo;
                           }

                           
                        


                               
                              /**
                               * validate the array for AccountingInfo
                               */
                              protected void validateAccountingInfo(com.sabre.webservices.sabrexml._2011._10.AccountingInfo_type0[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param AccountingInfo
                              */
                              public void setAccountingInfo(com.sabre.webservices.sabrexml._2011._10.AccountingInfo_type0[] param){
                              
                                   validateAccountingInfo(param);

                               localAccountingInfoTracker = param != null;
                                      
                                      this.localAccountingInfo=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.sabre.webservices.sabrexml._2011._10.AccountingInfo_type0
                             */
                             public void addAccountingInfo(com.sabre.webservices.sabrexml._2011._10.AccountingInfo_type0 param){
                                   if (localAccountingInfo == null){
                                   localAccountingInfo = new com.sabre.webservices.sabrexml._2011._10.AccountingInfo_type0[]{};
                                   }

                            
                                 //update the setting tracker
                                localAccountingInfoTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localAccountingInfo);
                               list.add(param);
                               this.localAccountingInfo =
                             (com.sabre.webservices.sabrexml._2011._10.AccountingInfo_type0[])list.toArray(
                            new com.sabre.webservices.sabrexml._2011._10.AccountingInfo_type0[list.size()]);

                             }
                             

                        /**
                        * field for CustomerInfo
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.CustomerInfo_type0 localCustomerInfo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCustomerInfoTracker = false ;

                           public boolean isCustomerInfoSpecified(){
                               return localCustomerInfoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.sabre.webservices.sabrexml._2011._10.CustomerInfo_type0
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.CustomerInfo_type0 getCustomerInfo(){
                               return localCustomerInfo;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CustomerInfo
                               */
                               public void setCustomerInfo(com.sabre.webservices.sabrexml._2011._10.CustomerInfo_type0 param){
                            localCustomerInfoTracker = param != null;
                                   
                                            this.localCustomerInfo=param;
                                    

                               }
                            

                        /**
                        * field for FileInfo
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.FileInfo_type0 localFileInfo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localFileInfoTracker = false ;

                           public boolean isFileInfoSpecified(){
                               return localFileInfoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.sabre.webservices.sabrexml._2011._10.FileInfo_type0
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.FileInfo_type0 getFileInfo(){
                               return localFileInfo;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param FileInfo
                               */
                               public void setFileInfo(com.sabre.webservices.sabrexml._2011._10.FileInfo_type0 param){
                            localFileInfoTracker = param != null;
                                   
                                            this.localFileInfo=param;
                                    

                               }
                            

                        /**
                        * field for ItineraryInfo
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.ItineraryInfo_type0 localItineraryInfo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localItineraryInfoTracker = false ;

                           public boolean isItineraryInfoSpecified(){
                               return localItineraryInfoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.sabre.webservices.sabrexml._2011._10.ItineraryInfo_type0
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.ItineraryInfo_type0 getItineraryInfo(){
                               return localItineraryInfo;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ItineraryInfo
                               */
                               public void setItineraryInfo(com.sabre.webservices.sabrexml._2011._10.ItineraryInfo_type0 param){
                            localItineraryInfoTracker = param != null;
                                   
                                            this.localItineraryInfo=param;
                                    

                               }
                            

                        /**
                        * field for ItineraryRef
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.ItineraryRef_type0 localItineraryRef ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localItineraryRefTracker = false ;

                           public boolean isItineraryRefSpecified(){
                               return localItineraryRefTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.sabre.webservices.sabrexml._2011._10.ItineraryRef_type0
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.ItineraryRef_type0 getItineraryRef(){
                               return localItineraryRef;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ItineraryRef
                               */
                               public void setItineraryRef(com.sabre.webservices.sabrexml._2011._10.ItineraryRef_type0 param){
                            localItineraryRefTracker = param != null;
                                   
                                            this.localItineraryRef=param;
                                    

                               }
                            

                        /**
                        * field for PayInfo
                        * This was an Array!
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.PayInfo_type0[] localPayInfo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPayInfoTracker = false ;

                           public boolean isPayInfoSpecified(){
                               return localPayInfoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.sabre.webservices.sabrexml._2011._10.PayInfo_type0[]
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.PayInfo_type0[] getPayInfo(){
                               return localPayInfo;
                           }

                           
                        


                               
                              /**
                               * validate the array for PayInfo
                               */
                              protected void validatePayInfo(com.sabre.webservices.sabrexml._2011._10.PayInfo_type0[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param PayInfo
                              */
                              public void setPayInfo(com.sabre.webservices.sabrexml._2011._10.PayInfo_type0[] param){
                              
                                   validatePayInfo(param);

                               localPayInfoTracker = param != null;
                                      
                                      this.localPayInfo=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.sabre.webservices.sabrexml._2011._10.PayInfo_type0
                             */
                             public void addPayInfo(com.sabre.webservices.sabrexml._2011._10.PayInfo_type0 param){
                                   if (localPayInfo == null){
                                   localPayInfo = new com.sabre.webservices.sabrexml._2011._10.PayInfo_type0[]{};
                                   }

                            
                                 //update the setting tracker
                                localPayInfoTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localPayInfo);
                               list.add(param);
                               this.localPayInfo =
                             (com.sabre.webservices.sabrexml._2011._10.PayInfo_type0[])list.toArray(
                            new com.sabre.webservices.sabrexml._2011._10.PayInfo_type0[list.size()]);

                             }
                             

                        /**
                        * field for QueueInfo
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.QueueInfo_type0 localQueueInfo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localQueueInfoTracker = false ;

                           public boolean isQueueInfoSpecified(){
                               return localQueueInfoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.sabre.webservices.sabrexml._2011._10.QueueInfo_type0
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.QueueInfo_type0 getQueueInfo(){
                               return localQueueInfo;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param QueueInfo
                               */
                               public void setQueueInfo(com.sabre.webservices.sabrexml._2011._10.QueueInfo_type0 param){
                            localQueueInfoTracker = param != null;
                                   
                                            this.localQueueInfo=param;
                                    

                               }
                            

                        /**
                        * field for RemarkInfo
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.RemarkInfo_type0 localRemarkInfo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRemarkInfoTracker = false ;

                           public boolean isRemarkInfoSpecified(){
                               return localRemarkInfoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.sabre.webservices.sabrexml._2011._10.RemarkInfo_type0
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.RemarkInfo_type0 getRemarkInfo(){
                               return localRemarkInfo;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RemarkInfo
                               */
                               public void setRemarkInfo(com.sabre.webservices.sabrexml._2011._10.RemarkInfo_type0 param){
                            localRemarkInfoTracker = param != null;
                                   
                                            this.localRemarkInfo=param;
                                    

                               }
                            

                        /**
                        * field for SpecialServiceInfo
                        * This was an Array!
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.SpecialServiceInfo_type0[] localSpecialServiceInfo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSpecialServiceInfoTracker = false ;

                           public boolean isSpecialServiceInfoSpecified(){
                               return localSpecialServiceInfoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.sabre.webservices.sabrexml._2011._10.SpecialServiceInfo_type0[]
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.SpecialServiceInfo_type0[] getSpecialServiceInfo(){
                               return localSpecialServiceInfo;
                           }

                           
                        


                               
                              /**
                               * validate the array for SpecialServiceInfo
                               */
                              protected void validateSpecialServiceInfo(com.sabre.webservices.sabrexml._2011._10.SpecialServiceInfo_type0[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param SpecialServiceInfo
                              */
                              public void setSpecialServiceInfo(com.sabre.webservices.sabrexml._2011._10.SpecialServiceInfo_type0[] param){
                              
                                   validateSpecialServiceInfo(param);

                               localSpecialServiceInfoTracker = param != null;
                                      
                                      this.localSpecialServiceInfo=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.sabre.webservices.sabrexml._2011._10.SpecialServiceInfo_type0
                             */
                             public void addSpecialServiceInfo(com.sabre.webservices.sabrexml._2011._10.SpecialServiceInfo_type0 param){
                                   if (localSpecialServiceInfo == null){
                                   localSpecialServiceInfo = new com.sabre.webservices.sabrexml._2011._10.SpecialServiceInfo_type0[]{};
                                   }

                            
                                 //update the setting tracker
                                localSpecialServiceInfoTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localSpecialServiceInfo);
                               list.add(param);
                               this.localSpecialServiceInfo =
                             (com.sabre.webservices.sabrexml._2011._10.SpecialServiceInfo_type0[])list.toArray(
                            new com.sabre.webservices.sabrexml._2011._10.SpecialServiceInfo_type0[list.size()]);

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
                           namespacePrefix+":TravelItinerary_type0",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "TravelItinerary_type0",
                           xmlWriter);
                   }

               
                   }
                if (localAccountingInfoTracker){
                                       if (localAccountingInfo!=null){
                                            for (int i = 0;i < localAccountingInfo.length;i++){
                                                if (localAccountingInfo[i] != null){
                                                 localAccountingInfo[i].serialize(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","AccountingInfo"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                        // we don't have to do any thing since minOccures is zero
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("AccountingInfo cannot be null!!");
                                        
                                    }
                                 } if (localCustomerInfoTracker){
                                            if (localCustomerInfo==null){
                                                 throw new org.apache.axis2.databinding.ADBException("CustomerInfo cannot be null!!");
                                            }
                                           localCustomerInfo.serialize(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","CustomerInfo"),
                                               xmlWriter);
                                        } if (localFileInfoTracker){
                                            if (localFileInfo==null){
                                                 throw new org.apache.axis2.databinding.ADBException("FileInfo cannot be null!!");
                                            }
                                           localFileInfo.serialize(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","FileInfo"),
                                               xmlWriter);
                                        } if (localItineraryInfoTracker){
                                            if (localItineraryInfo==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ItineraryInfo cannot be null!!");
                                            }
                                           localItineraryInfo.serialize(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","ItineraryInfo"),
                                               xmlWriter);
                                        } if (localItineraryRefTracker){
                                            if (localItineraryRef==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ItineraryRef cannot be null!!");
                                            }
                                           localItineraryRef.serialize(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","ItineraryRef"),
                                               xmlWriter);
                                        } if (localPayInfoTracker){
                                       if (localPayInfo!=null){
                                            for (int i = 0;i < localPayInfo.length;i++){
                                                if (localPayInfo[i] != null){
                                                 localPayInfo[i].serialize(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","PayInfo"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                        // we don't have to do any thing since minOccures is zero
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("PayInfo cannot be null!!");
                                        
                                    }
                                 } if (localQueueInfoTracker){
                                            if (localQueueInfo==null){
                                                 throw new org.apache.axis2.databinding.ADBException("QueueInfo cannot be null!!");
                                            }
                                           localQueueInfo.serialize(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","QueueInfo"),
                                               xmlWriter);
                                        } if (localRemarkInfoTracker){
                                            if (localRemarkInfo==null){
                                                 throw new org.apache.axis2.databinding.ADBException("RemarkInfo cannot be null!!");
                                            }
                                           localRemarkInfo.serialize(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","RemarkInfo"),
                                               xmlWriter);
                                        } if (localSpecialServiceInfoTracker){
                                       if (localSpecialServiceInfo!=null){
                                            for (int i = 0;i < localSpecialServiceInfo.length;i++){
                                                if (localSpecialServiceInfo[i] != null){
                                                 localSpecialServiceInfo[i].serialize(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","SpecialServiceInfo"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                        // we don't have to do any thing since minOccures is zero
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("SpecialServiceInfo cannot be null!!");
                                        
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

                 if (localAccountingInfoTracker){
                             if (localAccountingInfo!=null) {
                                 for (int i = 0;i < localAccountingInfo.length;i++){

                                    if (localAccountingInfo[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                          "AccountingInfo"));
                                         elementList.add(localAccountingInfo[i]);
                                    } else {
                                        
                                                // nothing to do
                                            
                                    }

                                 }
                             } else {
                                 
                                        throw new org.apache.axis2.databinding.ADBException("AccountingInfo cannot be null!!");
                                    
                             }

                        } if (localCustomerInfoTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                      "CustomerInfo"));
                            
                            
                                    if (localCustomerInfo==null){
                                         throw new org.apache.axis2.databinding.ADBException("CustomerInfo cannot be null!!");
                                    }
                                    elementList.add(localCustomerInfo);
                                } if (localFileInfoTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                      "FileInfo"));
                            
                            
                                    if (localFileInfo==null){
                                         throw new org.apache.axis2.databinding.ADBException("FileInfo cannot be null!!");
                                    }
                                    elementList.add(localFileInfo);
                                } if (localItineraryInfoTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                      "ItineraryInfo"));
                            
                            
                                    if (localItineraryInfo==null){
                                         throw new org.apache.axis2.databinding.ADBException("ItineraryInfo cannot be null!!");
                                    }
                                    elementList.add(localItineraryInfo);
                                } if (localItineraryRefTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                      "ItineraryRef"));
                            
                            
                                    if (localItineraryRef==null){
                                         throw new org.apache.axis2.databinding.ADBException("ItineraryRef cannot be null!!");
                                    }
                                    elementList.add(localItineraryRef);
                                } if (localPayInfoTracker){
                             if (localPayInfo!=null) {
                                 for (int i = 0;i < localPayInfo.length;i++){

                                    if (localPayInfo[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                          "PayInfo"));
                                         elementList.add(localPayInfo[i]);
                                    } else {
                                        
                                                // nothing to do
                                            
                                    }

                                 }
                             } else {
                                 
                                        throw new org.apache.axis2.databinding.ADBException("PayInfo cannot be null!!");
                                    
                             }

                        } if (localQueueInfoTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                      "QueueInfo"));
                            
                            
                                    if (localQueueInfo==null){
                                         throw new org.apache.axis2.databinding.ADBException("QueueInfo cannot be null!!");
                                    }
                                    elementList.add(localQueueInfo);
                                } if (localRemarkInfoTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                      "RemarkInfo"));
                            
                            
                                    if (localRemarkInfo==null){
                                         throw new org.apache.axis2.databinding.ADBException("RemarkInfo cannot be null!!");
                                    }
                                    elementList.add(localRemarkInfo);
                                } if (localSpecialServiceInfoTracker){
                             if (localSpecialServiceInfo!=null) {
                                 for (int i = 0;i < localSpecialServiceInfo.length;i++){

                                    if (localSpecialServiceInfo[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                          "SpecialServiceInfo"));
                                         elementList.add(localSpecialServiceInfo[i]);
                                    } else {
                                        
                                                // nothing to do
                                            
                                    }

                                 }
                             } else {
                                 
                                        throw new org.apache.axis2.databinding.ADBException("SpecialServiceInfo cannot be null!!");
                                    
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
        public static TravelItinerary_type0 parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            TravelItinerary_type0 object =
                new TravelItinerary_type0();

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
                    
                            if (!"TravelItinerary_type0".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (TravelItinerary_type0)org.xmlsoap.schemas.soap.envelope.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                        java.util.ArrayList list1 = new java.util.ArrayList();
                    
                        java.util.ArrayList list6 = new java.util.ArrayList();
                    
                        java.util.ArrayList list9 = new java.util.ArrayList();
                    
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","AccountingInfo").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list1.add(com.sabre.webservices.sabrexml._2011._10.AccountingInfo_type0.Factory.parse(reader));
                                                                
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
                                                                if (new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","AccountingInfo").equals(reader.getName())){
                                                                    list1.add(com.sabre.webservices.sabrexml._2011._10.AccountingInfo_type0.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone1 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setAccountingInfo((com.sabre.webservices.sabrexml._2011._10.AccountingInfo_type0[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.sabre.webservices.sabrexml._2011._10.AccountingInfo_type0.class,
                                                                list1));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","CustomerInfo").equals(reader.getName())){
                                
                                                object.setCustomerInfo(com.sabre.webservices.sabrexml._2011._10.CustomerInfo_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","FileInfo").equals(reader.getName())){
                                
                                                object.setFileInfo(com.sabre.webservices.sabrexml._2011._10.FileInfo_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","ItineraryInfo").equals(reader.getName())){
                                
                                                object.setItineraryInfo(com.sabre.webservices.sabrexml._2011._10.ItineraryInfo_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","ItineraryRef").equals(reader.getName())){
                                
                                                object.setItineraryRef(com.sabre.webservices.sabrexml._2011._10.ItineraryRef_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","PayInfo").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list6.add(com.sabre.webservices.sabrexml._2011._10.PayInfo_type0.Factory.parse(reader));
                                                                
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
                                                                if (new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","PayInfo").equals(reader.getName())){
                                                                    list6.add(com.sabre.webservices.sabrexml._2011._10.PayInfo_type0.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone6 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setPayInfo((com.sabre.webservices.sabrexml._2011._10.PayInfo_type0[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.sabre.webservices.sabrexml._2011._10.PayInfo_type0.class,
                                                                list6));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","QueueInfo").equals(reader.getName())){
                                
                                                object.setQueueInfo(com.sabre.webservices.sabrexml._2011._10.QueueInfo_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","RemarkInfo").equals(reader.getName())){
                                
                                                object.setRemarkInfo(com.sabre.webservices.sabrexml._2011._10.RemarkInfo_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","SpecialServiceInfo").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list9.add(com.sabre.webservices.sabrexml._2011._10.SpecialServiceInfo_type0.Factory.parse(reader));
                                                                
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone9 = false;
                                                        while(!loopDone9){
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
                                                                loopDone9 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","SpecialServiceInfo").equals(reader.getName())){
                                                                    list9.add(com.sabre.webservices.sabrexml._2011._10.SpecialServiceInfo_type0.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone9 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setSpecialServiceInfo((com.sabre.webservices.sabrexml._2011._10.SpecialServiceInfo_type0[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.sabre.webservices.sabrexml._2011._10.SpecialServiceInfo_type0.class,
                                                                list9));
                                                            
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
           
    