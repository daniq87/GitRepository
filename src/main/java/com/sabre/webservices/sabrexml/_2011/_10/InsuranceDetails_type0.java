
/**
 * InsuranceDetails_type0.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.sabre.webservices.sabrexml._2011._10;
            

            /**
            *  InsuranceDetails_type0 bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class InsuranceDetails_type0
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = InsuranceDetails_type0
                Namespace URI = http://webservices.sabre.com/sabreXML/2011/10
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for ConfirmationNumber
                        */

                        
                                    protected java.lang.String localConfirmationNumber ;
                                
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
                           * @return java.lang.String
                           */
                           public  java.lang.String getConfirmationNumber(){
                               return localConfirmationNumber;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ConfirmationNumber
                               */
                               public void setConfirmationNumber(java.lang.String param){
                            localConfirmationNumberTracker = param != null;
                                   
                                            this.localConfirmationNumber=param;
                                    

                               }
                            

                        /**
                        * field for Coverage
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.Coverage_type0 localCoverage ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCoverageTracker = false ;

                           public boolean isCoverageSpecified(){
                               return localCoverageTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.sabre.webservices.sabrexml._2011._10.Coverage_type0
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.Coverage_type0 getCoverage(){
                               return localCoverage;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Coverage
                               */
                               public void setCoverage(com.sabre.webservices.sabrexml._2011._10.Coverage_type0 param){
                            localCoverageTracker = param != null;
                                   
                                            this.localCoverage=param;
                                    

                               }
                            

                        /**
                        * field for DestinationLocation
                        * This was an Array!
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.DestinationLocation_type3[] localDestinationLocation ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDestinationLocationTracker = false ;

                           public boolean isDestinationLocationSpecified(){
                               return localDestinationLocationTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.sabre.webservices.sabrexml._2011._10.DestinationLocation_type3[]
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.DestinationLocation_type3[] getDestinationLocation(){
                               return localDestinationLocation;
                           }

                           
                        


                               
                              /**
                               * validate the array for DestinationLocation
                               */
                              protected void validateDestinationLocation(com.sabre.webservices.sabrexml._2011._10.DestinationLocation_type3[] param){
                             
                              if ((param != null) && (param.length > 2)){
                                throw new java.lang.RuntimeException();
                              }
                              
                              }


                             /**
                              * Auto generated setter method
                              * @param param DestinationLocation
                              */
                              public void setDestinationLocation(com.sabre.webservices.sabrexml._2011._10.DestinationLocation_type3[] param){
                              
                                   validateDestinationLocation(param);

                               localDestinationLocationTracker = param != null;
                                      
                                      this.localDestinationLocation=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.sabre.webservices.sabrexml._2011._10.DestinationLocation_type3
                             */
                             public void addDestinationLocation(com.sabre.webservices.sabrexml._2011._10.DestinationLocation_type3 param){
                                   if (localDestinationLocation == null){
                                   localDestinationLocation = new com.sabre.webservices.sabrexml._2011._10.DestinationLocation_type3[]{};
                                   }

                            
                                 //update the setting tracker
                                localDestinationLocationTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localDestinationLocation);
                               list.add(param);
                               this.localDestinationLocation =
                             (com.sabre.webservices.sabrexml._2011._10.DestinationLocation_type3[])list.toArray(
                            new com.sabre.webservices.sabrexml._2011._10.DestinationLocation_type3[list.size()]);

                             }
                             

                        /**
                        * field for OriginLocation
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.OriginLocation_type5 localOriginLocation ;
                                
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
                           * @return com.sabre.webservices.sabrexml._2011._10.OriginLocation_type5
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.OriginLocation_type5 getOriginLocation(){
                               return localOriginLocation;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OriginLocation
                               */
                               public void setOriginLocation(com.sabre.webservices.sabrexml._2011._10.OriginLocation_type5 param){
                            localOriginLocationTracker = param != null;
                                   
                                            this.localOriginLocation=param;
                                    

                               }
                            

                        /**
                        * field for Payment
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.Payment_type2 localPayment ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPaymentTracker = false ;

                           public boolean isPaymentSpecified(){
                               return localPaymentTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.sabre.webservices.sabrexml._2011._10.Payment_type2
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.Payment_type2 getPayment(){
                               return localPayment;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Payment
                               */
                               public void setPayment(com.sabre.webservices.sabrexml._2011._10.Payment_type2 param){
                            localPaymentTracker = param != null;
                                   
                                            this.localPayment=param;
                                    

                               }
                            

                        /**
                        * field for PersonName
                        * This was an Array!
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.PersonName_type2[] localPersonName ;
                                
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
                           * @return com.sabre.webservices.sabrexml._2011._10.PersonName_type2[]
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.PersonName_type2[] getPersonName(){
                               return localPersonName;
                           }

                           
                        


                               
                              /**
                               * validate the array for PersonName
                               */
                              protected void validatePersonName(com.sabre.webservices.sabrexml._2011._10.PersonName_type2[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param PersonName
                              */
                              public void setPersonName(com.sabre.webservices.sabrexml._2011._10.PersonName_type2[] param){
                              
                                   validatePersonName(param);

                               localPersonNameTracker = param != null;
                                      
                                      this.localPersonName=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.sabre.webservices.sabrexml._2011._10.PersonName_type2
                             */
                             public void addPersonName(com.sabre.webservices.sabrexml._2011._10.PersonName_type2 param){
                                   if (localPersonName == null){
                                   localPersonName = new com.sabre.webservices.sabrexml._2011._10.PersonName_type2[]{};
                                   }

                            
                                 //update the setting tracker
                                localPersonNameTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localPersonName);
                               list.add(param);
                               this.localPersonName =
                             (com.sabre.webservices.sabrexml._2011._10.PersonName_type2[])list.toArray(
                            new com.sabre.webservices.sabrexml._2011._10.PersonName_type2[list.size()]);

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
                        * field for Vendor
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.Vendor_type2 localVendor ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localVendorTracker = false ;

                           public boolean isVendorSpecified(){
                               return localVendorTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.sabre.webservices.sabrexml._2011._10.Vendor_type2
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.Vendor_type2 getVendor(){
                               return localVendor;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Vendor
                               */
                               public void setVendor(com.sabre.webservices.sabrexml._2011._10.Vendor_type2 param){
                            localVendorTracker = param != null;
                                   
                                            this.localVendor=param;
                                    

                               }
                            

                        /**
                        * field for CurrencyCode
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localCurrencyCode ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCurrencyCode(){
                               return localCurrencyCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CurrencyCode
                               */
                               public void setCurrencyCode(java.lang.String param){
                            
                                            this.localCurrencyCode=param;
                                    

                               }
                            

                        /**
                        * field for End
                        * This was an Attribute!
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.Date localEnd ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.sabre.webservices.sabrexml._2011._10.Date
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.Date getEnd(){
                               return localEnd;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param End
                               */
                               public void setEnd(com.sabre.webservices.sabrexml._2011._10.Date param){
                            
                                            this.localEnd=param;
                                    

                               }
                            

                        /**
                        * field for NumPolicies
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localNumPolicies ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getNumPolicies(){
                               return localNumPolicies;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NumPolicies
                               */
                               public void setNumPolicies(java.lang.String param){
                            
                                            this.localNumPolicies=param;
                                    

                               }
                            

                        /**
                        * field for PlanType
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localPlanType ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPlanType(){
                               return localPlanType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PlanType
                               */
                               public void setPlanType(java.lang.String param){
                            
                                            this.localPlanType=param;
                                    

                               }
                            

                        /**
                        * field for PremiumAmount
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localPremiumAmount ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPremiumAmount(){
                               return localPremiumAmount;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PremiumAmount
                               */
                               public void setPremiumAmount(java.lang.String param){
                            
                                            this.localPremiumAmount=param;
                                    

                               }
                            

                        /**
                        * field for PurchaseDate
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localPurchaseDate ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPurchaseDate(){
                               return localPurchaseDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PurchaseDate
                               */
                               public void setPurchaseDate(java.lang.String param){
                            
                                            this.localPurchaseDate=param;
                                    

                               }
                            

                        /**
                        * field for Start
                        * This was an Attribute!
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.Date localStart ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.sabre.webservices.sabrexml._2011._10.Date
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.Date getStart(){
                               return localStart;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Start
                               */
                               public void setStart(com.sabre.webservices.sabrexml._2011._10.Date param){
                            
                                            this.localStart=param;
                                    

                               }
                            

                        /**
                        * field for StatusCode
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localStatusCode ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getStatusCode(){
                               return localStatusCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param StatusCode
                               */
                               public void setStatusCode(java.lang.String param){
                            
                                            this.localStatusCode=param;
                                    

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
                           namespacePrefix+":InsuranceDetails_type0",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "InsuranceDetails_type0",
                           xmlWriter);
                   }

               
                   }
               
                                            if (localCurrencyCode != null){
                                        
                                                writeAttribute("",
                                                         "CurrencyCode",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCurrencyCode), xmlWriter);

                                            
                                      }
                                    
                                    
                                    if (localEnd != null){
                                        writeAttribute("",
                                           "End",
                                           localEnd.toString(), xmlWriter);
                                    }
                                    
                                            if (localNumPolicies != null){
                                        
                                                writeAttribute("",
                                                         "NumPolicies",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumPolicies), xmlWriter);

                                            
                                      }
                                    
                                            if (localPlanType != null){
                                        
                                                writeAttribute("",
                                                         "PlanType",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPlanType), xmlWriter);

                                            
                                      }
                                    
                                            if (localPremiumAmount != null){
                                        
                                                writeAttribute("",
                                                         "PremiumAmount",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPremiumAmount), xmlWriter);

                                            
                                      }
                                    
                                            if (localPurchaseDate != null){
                                        
                                                writeAttribute("",
                                                         "PurchaseDate",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPurchaseDate), xmlWriter);

                                            
                                      }
                                    
                                    
                                    if (localStart != null){
                                        writeAttribute("",
                                           "Start",
                                           localStart.toString(), xmlWriter);
                                    }
                                    
                                            if (localStatusCode != null){
                                        
                                                writeAttribute("",
                                                         "StatusCode",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStatusCode), xmlWriter);

                                            
                                      }
                                     if (localConfirmationNumberTracker){
                                    namespace = "http://webservices.sabre.com/sabreXML/2011/10";
                                    writeStartElement(null, namespace, "ConfirmationNumber", xmlWriter);
                             

                                          if (localConfirmationNumber==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("ConfirmationNumber cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localConfirmationNumber);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCoverageTracker){
                                            if (localCoverage==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Coverage cannot be null!!");
                                            }
                                           localCoverage.serialize(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","Coverage"),
                                               xmlWriter);
                                        } if (localDestinationLocationTracker){
                                       if (localDestinationLocation!=null){
                                            for (int i = 0;i < localDestinationLocation.length;i++){
                                                if (localDestinationLocation[i] != null){
                                                 localDestinationLocation[i].serialize(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","DestinationLocation"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                        // we don't have to do any thing since minOccures is zero
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("DestinationLocation cannot be null!!");
                                        
                                    }
                                 } if (localOriginLocationTracker){
                                            if (localOriginLocation==null){
                                                 throw new org.apache.axis2.databinding.ADBException("OriginLocation cannot be null!!");
                                            }
                                           localOriginLocation.serialize(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","OriginLocation"),
                                               xmlWriter);
                                        } if (localPaymentTracker){
                                            if (localPayment==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Payment cannot be null!!");
                                            }
                                           localPayment.serialize(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","Payment"),
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
                             } if (localVendorTracker){
                                            if (localVendor==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Vendor cannot be null!!");
                                            }
                                           localVendor.serialize(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","Vendor"),
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

                 if (localConfirmationNumberTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                      "ConfirmationNumber"));
                                 
                                        if (localConfirmationNumber != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localConfirmationNumber));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("ConfirmationNumber cannot be null!!");
                                        }
                                    } if (localCoverageTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                      "Coverage"));
                            
                            
                                    if (localCoverage==null){
                                         throw new org.apache.axis2.databinding.ADBException("Coverage cannot be null!!");
                                    }
                                    elementList.add(localCoverage);
                                } if (localDestinationLocationTracker){
                             if (localDestinationLocation!=null) {
                                 for (int i = 0;i < localDestinationLocation.length;i++){

                                    if (localDestinationLocation[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                          "DestinationLocation"));
                                         elementList.add(localDestinationLocation[i]);
                                    } else {
                                        
                                                // nothing to do
                                            
                                    }

                                 }
                             } else {
                                 
                                        throw new org.apache.axis2.databinding.ADBException("DestinationLocation cannot be null!!");
                                    
                             }

                        } if (localOriginLocationTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                      "OriginLocation"));
                            
                            
                                    if (localOriginLocation==null){
                                         throw new org.apache.axis2.databinding.ADBException("OriginLocation cannot be null!!");
                                    }
                                    elementList.add(localOriginLocation);
                                } if (localPaymentTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                      "Payment"));
                            
                            
                                    if (localPayment==null){
                                         throw new org.apache.axis2.databinding.ADBException("Payment cannot be null!!");
                                    }
                                    elementList.add(localPayment);
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

                        } if (localTextTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                      "Text"));
                                 
                                        if (localText != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localText));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Text cannot be null!!");
                                        }
                                    } if (localVendorTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                      "Vendor"));
                            
                            
                                    if (localVendor==null){
                                         throw new org.apache.axis2.databinding.ADBException("Vendor cannot be null!!");
                                    }
                                    elementList.add(localVendor);
                                }
                            attribList.add(
                            new javax.xml.namespace.QName("","CurrencyCode"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCurrencyCode));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","End"));
                            
                                      attribList.add(localEnd.toString());
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","NumPolicies"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumPolicies));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","PlanType"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPlanType));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","PremiumAmount"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPremiumAmount));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","PurchaseDate"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPurchaseDate));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","Start"));
                            
                                      attribList.add(localStart.toString());
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","StatusCode"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStatusCode));
                                

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
        public static InsuranceDetails_type0 parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            InsuranceDetails_type0 object =
                new InsuranceDetails_type0();

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
                    
                            if (!"InsuranceDetails_type0".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (InsuranceDetails_type0)org.xmlsoap.schemas.soap.envelope.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    // handle attribute "CurrencyCode"
                    java.lang.String tempAttribCurrencyCode =
                        
                                reader.getAttributeValue(null,"CurrencyCode");
                            
                   if (tempAttribCurrencyCode!=null){
                         java.lang.String content = tempAttribCurrencyCode;
                        
                                                 object.setCurrencyCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribCurrencyCode));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("CurrencyCode");
                    
                    // handle attribute "End"
                    java.lang.String tempAttribEnd =
                        
                                reader.getAttributeValue(null,"End");
                            
                   if (tempAttribEnd!=null){
                         java.lang.String content = tempAttribEnd;
                        
                                                  object.setEnd(
                                                        com.sabre.webservices.sabrexml._2011._10.Date.Factory.fromString(reader,tempAttribEnd));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("End");
                    
                    // handle attribute "NumPolicies"
                    java.lang.String tempAttribNumPolicies =
                        
                                reader.getAttributeValue(null,"NumPolicies");
                            
                   if (tempAttribNumPolicies!=null){
                         java.lang.String content = tempAttribNumPolicies;
                        
                                                 object.setNumPolicies(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribNumPolicies));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("NumPolicies");
                    
                    // handle attribute "PlanType"
                    java.lang.String tempAttribPlanType =
                        
                                reader.getAttributeValue(null,"PlanType");
                            
                   if (tempAttribPlanType!=null){
                         java.lang.String content = tempAttribPlanType;
                        
                                                 object.setPlanType(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribPlanType));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("PlanType");
                    
                    // handle attribute "PremiumAmount"
                    java.lang.String tempAttribPremiumAmount =
                        
                                reader.getAttributeValue(null,"PremiumAmount");
                            
                   if (tempAttribPremiumAmount!=null){
                         java.lang.String content = tempAttribPremiumAmount;
                        
                                                 object.setPremiumAmount(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribPremiumAmount));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("PremiumAmount");
                    
                    // handle attribute "PurchaseDate"
                    java.lang.String tempAttribPurchaseDate =
                        
                                reader.getAttributeValue(null,"PurchaseDate");
                            
                   if (tempAttribPurchaseDate!=null){
                         java.lang.String content = tempAttribPurchaseDate;
                        
                                                 object.setPurchaseDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribPurchaseDate));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("PurchaseDate");
                    
                    // handle attribute "Start"
                    java.lang.String tempAttribStart =
                        
                                reader.getAttributeValue(null,"Start");
                            
                   if (tempAttribStart!=null){
                         java.lang.String content = tempAttribStart;
                        
                                                  object.setStart(
                                                        com.sabre.webservices.sabrexml._2011._10.Date.Factory.fromString(reader,tempAttribStart));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("Start");
                    
                    // handle attribute "StatusCode"
                    java.lang.String tempAttribStatusCode =
                        
                                reader.getAttributeValue(null,"StatusCode");
                            
                   if (tempAttribStatusCode!=null){
                         java.lang.String content = tempAttribStatusCode;
                        
                                                 object.setStatusCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribStatusCode));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("StatusCode");
                    
                    
                    reader.next();
                
                        java.util.ArrayList list3 = new java.util.ArrayList();
                    
                        java.util.ArrayList list6 = new java.util.ArrayList();
                    
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","ConfirmationNumber").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"ConfirmationNumber" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setConfirmationNumber(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","Coverage").equals(reader.getName())){
                                
                                                object.setCoverage(com.sabre.webservices.sabrexml._2011._10.Coverage_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","DestinationLocation").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list3.add(com.sabre.webservices.sabrexml._2011._10.DestinationLocation_type3.Factory.parse(reader));
                                                                
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
                                                                if (new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","DestinationLocation").equals(reader.getName())){
                                                                    list3.add(com.sabre.webservices.sabrexml._2011._10.DestinationLocation_type3.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone3 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setDestinationLocation((com.sabre.webservices.sabrexml._2011._10.DestinationLocation_type3[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.sabre.webservices.sabrexml._2011._10.DestinationLocation_type3.class,
                                                                list3));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","OriginLocation").equals(reader.getName())){
                                
                                                object.setOriginLocation(com.sabre.webservices.sabrexml._2011._10.OriginLocation_type5.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","Payment").equals(reader.getName())){
                                
                                                object.setPayment(com.sabre.webservices.sabrexml._2011._10.Payment_type2.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","PersonName").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list6.add(com.sabre.webservices.sabrexml._2011._10.PersonName_type2.Factory.parse(reader));
                                                                
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
                                                                    list6.add(com.sabre.webservices.sabrexml._2011._10.PersonName_type2.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone6 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setPersonName((com.sabre.webservices.sabrexml._2011._10.PersonName_type2[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.sabre.webservices.sabrexml._2011._10.PersonName_type2.class,
                                                                list6));
                                                            
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","Vendor").equals(reader.getName())){
                                
                                                object.setVendor(com.sabre.webservices.sabrexml._2011._10.Vendor_type2.Factory.parse(reader));
                                              
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
           
    