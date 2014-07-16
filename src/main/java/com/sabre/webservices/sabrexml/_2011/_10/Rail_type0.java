
/**
 * Rail_type0.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.sabre.webservices.sabrexml._2011._10;
            

            /**
            *  Rail_type0 bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class Rail_type0
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = Rail_type0
                Namespace URI = http://webservices.sabre.com/sabreXML/2011/10
                Namespace Prefix = ns1
                */
            

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
                        * field for DestinationLocation
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.DestinationLocation_type4 localDestinationLocation ;
                                
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
                           * @return com.sabre.webservices.sabrexml._2011._10.DestinationLocation_type4
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.DestinationLocation_type4 getDestinationLocation(){
                               return localDestinationLocation;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DestinationLocation
                               */
                               public void setDestinationLocation(com.sabre.webservices.sabrexml._2011._10.DestinationLocation_type4 param){
                            localDestinationLocationTracker = param != null;
                                   
                                            this.localDestinationLocation=param;
                                    

                               }
                            

                        /**
                        * field for IssueDate
                        * This was an Array!
                        */

                        
                                    protected java.lang.String[] localIssueDate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localIssueDateTracker = false ;

                           public boolean isIssueDateSpecified(){
                               return localIssueDateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String[]
                           */
                           public  java.lang.String[] getIssueDate(){
                               return localIssueDate;
                           }

                           
                        


                               
                              /**
                               * validate the array for IssueDate
                               */
                              protected void validateIssueDate(java.lang.String[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param IssueDate
                              */
                              public void setIssueDate(java.lang.String[] param){
                              
                                   validateIssueDate(param);

                               localIssueDateTracker = param != null;
                                      
                                      this.localIssueDate=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param java.lang.String
                             */
                             public void addIssueDate(java.lang.String param){
                                   if (localIssueDate == null){
                                   localIssueDate = new java.lang.String[]{};
                                   }

                            
                                 //update the setting tracker
                                localIssueDateTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localIssueDate);
                               list.add(param);
                               this.localIssueDate =
                             (java.lang.String[])list.toArray(
                            new java.lang.String[list.size()]);

                             }
                             

                        /**
                        * field for OriginLocation
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.OriginLocation_type7 localOriginLocation ;
                                
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
                           * @return com.sabre.webservices.sabrexml._2011._10.OriginLocation_type7
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.OriginLocation_type7 getOriginLocation(){
                               return localOriginLocation;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OriginLocation
                               */
                               public void setOriginLocation(com.sabre.webservices.sabrexml._2011._10.OriginLocation_type7 param){
                            localOriginLocationTracker = param != null;
                                   
                                            this.localOriginLocation=param;
                                    

                               }
                            

                        /**
                        * field for ServiceInformation
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.ServiceInformation_type1 localServiceInformation ;
                                
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
                           * @return com.sabre.webservices.sabrexml._2011._10.ServiceInformation_type1
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.ServiceInformation_type1 getServiceInformation(){
                               return localServiceInformation;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ServiceInformation
                               */
                               public void setServiceInformation(com.sabre.webservices.sabrexml._2011._10.ServiceInformation_type1 param){
                            localServiceInformationTracker = param != null;
                                   
                                            this.localServiceInformation=param;
                                    

                               }
                            

                        /**
                        * field for SNCF_Information
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.SNCF_Information_type0 localSNCF_Information ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSNCF_InformationTracker = false ;

                           public boolean isSNCF_InformationSpecified(){
                               return localSNCF_InformationTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.sabre.webservices.sabrexml._2011._10.SNCF_Information_type0
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.SNCF_Information_type0 getSNCF_Information(){
                               return localSNCF_Information;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SNCF_Information
                               */
                               public void setSNCF_Information(com.sabre.webservices.sabrexml._2011._10.SNCF_Information_type0 param){
                            localSNCF_InformationTracker = param != null;
                                   
                                            this.localSNCF_Information=param;
                                    

                               }
                            

                        /**
                        * field for SpaceReserved
                        * This was an Array!
                        */

                        
                                    protected java.lang.String[] localSpaceReserved ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSpaceReservedTracker = false ;

                           public boolean isSpaceReservedSpecified(){
                               return localSpaceReservedTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String[]
                           */
                           public  java.lang.String[] getSpaceReserved(){
                               return localSpaceReserved;
                           }

                           
                        


                               
                              /**
                               * validate the array for SpaceReserved
                               */
                              protected void validateSpaceReserved(java.lang.String[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param SpaceReserved
                              */
                              public void setSpaceReserved(java.lang.String[] param){
                              
                                   validateSpaceReserved(param);

                               localSpaceReservedTracker = param != null;
                                      
                                      this.localSpaceReserved=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param java.lang.String
                             */
                             public void addSpaceReserved(java.lang.String param){
                                   if (localSpaceReserved == null){
                                   localSpaceReserved = new java.lang.String[]{};
                                   }

                            
                                 //update the setting tracker
                                localSpaceReservedTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localSpaceReserved);
                               list.add(param);
                               this.localSpaceReserved =
                             (java.lang.String[])list.toArray(
                            new java.lang.String[list.size()]);

                             }
                             

                        /**
                        * field for Text
                        * This was an Array!
                        */

                        
                                    protected java.lang.String[] localText ;
                                
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
                           * @return java.lang.String[]
                           */
                           public  java.lang.String[] getText(){
                               return localText;
                           }

                           
                        


                               
                              /**
                               * validate the array for Text
                               */
                              protected void validateText(java.lang.String[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param Text
                              */
                              public void setText(java.lang.String[] param){
                              
                                   validateText(param);

                               localTextTracker = param != null;
                                      
                                      this.localText=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param java.lang.String
                             */
                             public void addText(java.lang.String param){
                                   if (localText == null){
                                   localText = new java.lang.String[]{};
                                   }

                            
                                 //update the setting tracker
                                localTextTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localText);
                               list.add(param);
                               this.localText =
                             (java.lang.String[])list.toArray(
                            new java.lang.String[list.size()]);

                             }
                             

                        /**
                        * field for TicketControlNumber
                        * This was an Array!
                        */

                        
                                    protected java.lang.String[] localTicketControlNumber ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTicketControlNumberTracker = false ;

                           public boolean isTicketControlNumberSpecified(){
                               return localTicketControlNumberTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String[]
                           */
                           public  java.lang.String[] getTicketControlNumber(){
                               return localTicketControlNumber;
                           }

                           
                        


                               
                              /**
                               * validate the array for TicketControlNumber
                               */
                              protected void validateTicketControlNumber(java.lang.String[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param TicketControlNumber
                              */
                              public void setTicketControlNumber(java.lang.String[] param){
                              
                                   validateTicketControlNumber(param);

                               localTicketControlNumberTracker = param != null;
                                      
                                      this.localTicketControlNumber=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param java.lang.String
                             */
                             public void addTicketControlNumber(java.lang.String param){
                                   if (localTicketControlNumber == null){
                                   localTicketControlNumber = new java.lang.String[]{};
                                   }

                            
                                 //update the setting tracker
                                localTicketControlNumberTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localTicketControlNumber);
                               list.add(param);
                               this.localTicketControlNumber =
                             (java.lang.String[])list.toArray(
                            new java.lang.String[list.size()]);

                             }
                             

                        /**
                        * field for Train
                        * This was an Array!
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.Train_type0[] localTrain ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTrainTracker = false ;

                           public boolean isTrainSpecified(){
                               return localTrainTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.sabre.webservices.sabrexml._2011._10.Train_type0[]
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.Train_type0[] getTrain(){
                               return localTrain;
                           }

                           
                        


                               
                              /**
                               * validate the array for Train
                               */
                              protected void validateTrain(com.sabre.webservices.sabrexml._2011._10.Train_type0[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param Train
                              */
                              public void setTrain(com.sabre.webservices.sabrexml._2011._10.Train_type0[] param){
                              
                                   validateTrain(param);

                               localTrainTracker = param != null;
                                      
                                      this.localTrain=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.sabre.webservices.sabrexml._2011._10.Train_type0
                             */
                             public void addTrain(com.sabre.webservices.sabrexml._2011._10.Train_type0 param){
                                   if (localTrain == null){
                                   localTrain = new com.sabre.webservices.sabrexml._2011._10.Train_type0[]{};
                                   }

                            
                                 //update the setting tracker
                                localTrainTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localTrain);
                               list.add(param);
                               this.localTrain =
                             (com.sabre.webservices.sabrexml._2011._10.Train_type0[])list.toArray(
                            new com.sabre.webservices.sabrexml._2011._10.Train_type0[list.size()]);

                             }
                             

                        /**
                        * field for Vendor
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.Vendor_type4 localVendor ;
                                
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
                           * @return com.sabre.webservices.sabrexml._2011._10.Vendor_type4
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.Vendor_type4 getVendor(){
                               return localVendor;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Vendor
                               */
                               public void setVendor(com.sabre.webservices.sabrexml._2011._10.Vendor_type4 param){
                            localVendorTracker = param != null;
                                   
                                            this.localVendor=param;
                                    

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
                        * field for MergedSegmentInd
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localMergedSegmentInd ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getMergedSegmentInd(){
                               return localMergedSegmentInd;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MergedSegmentInd
                               */
                               public void setMergedSegmentInd(java.lang.String param){
                            
                                            this.localMergedSegmentInd=param;
                                    

                               }
                            

                        /**
                        * field for NumberInParty
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localNumberInParty ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getNumberInParty(){
                               return localNumberInParty;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NumberInParty
                               */
                               public void setNumberInParty(java.lang.String param){
                            
                                            this.localNumberInParty=param;
                                    

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
                           namespacePrefix+":Rail_type0",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "Rail_type0",
                           xmlWriter);
                   }

               
                   }
               
                                            if (localLinkCode != null){
                                        
                                                writeAttribute("",
                                                         "LinkCode",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLinkCode), xmlWriter);

                                            
                                      }
                                    
                                            if (localMergedSegmentInd != null){
                                        
                                                writeAttribute("",
                                                         "MergedSegmentInd",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMergedSegmentInd), xmlWriter);

                                            
                                      }
                                    
                                            if (localNumberInParty != null){
                                        
                                                writeAttribute("",
                                                         "NumberInParty",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumberInParty), xmlWriter);

                                            
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
                                    
                                            if (localType != null){
                                        
                                                writeAttribute("",
                                                         "Type",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localType), xmlWriter);

                                            
                                      }
                                     if (localConfirmationNumberTracker){
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

                        } if (localDestinationLocationTracker){
                                            if (localDestinationLocation==null){
                                                 throw new org.apache.axis2.databinding.ADBException("DestinationLocation cannot be null!!");
                                            }
                                           localDestinationLocation.serialize(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","DestinationLocation"),
                                               xmlWriter);
                                        } if (localIssueDateTracker){
                             if (localIssueDate!=null) {
                                   namespace = "http://webservices.sabre.com/sabreXML/2011/10";
                                   for (int i = 0;i < localIssueDate.length;i++){
                                        
                                            if (localIssueDate[i] != null){
                                        
                                                writeStartElement(null, namespace, "IssueDate", xmlWriter);

                                            
                                                        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIssueDate[i]));
                                                    
                                                xmlWriter.writeEndElement();
                                              
                                                } else {
                                                   
                                                           // we have to do nothing since minOccurs is zero
                                                       
                                                }

                                   }
                             } else {
                                 
                                         throw new org.apache.axis2.databinding.ADBException("IssueDate cannot be null!!");
                                    
                             }

                        } if (localOriginLocationTracker){
                                            if (localOriginLocation==null){
                                                 throw new org.apache.axis2.databinding.ADBException("OriginLocation cannot be null!!");
                                            }
                                           localOriginLocation.serialize(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","OriginLocation"),
                                               xmlWriter);
                                        } if (localServiceInformationTracker){
                                            if (localServiceInformation==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ServiceInformation cannot be null!!");
                                            }
                                           localServiceInformation.serialize(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","ServiceInformation"),
                                               xmlWriter);
                                        } if (localSNCF_InformationTracker){
                                            if (localSNCF_Information==null){
                                                 throw new org.apache.axis2.databinding.ADBException("SNCF_Information cannot be null!!");
                                            }
                                           localSNCF_Information.serialize(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","SNCF_Information"),
                                               xmlWriter);
                                        } if (localSpaceReservedTracker){
                             if (localSpaceReserved!=null) {
                                   namespace = "http://webservices.sabre.com/sabreXML/2011/10";
                                   for (int i = 0;i < localSpaceReserved.length;i++){
                                        
                                            if (localSpaceReserved[i] != null){
                                        
                                                writeStartElement(null, namespace, "SpaceReserved", xmlWriter);

                                            
                                                        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSpaceReserved[i]));
                                                    
                                                xmlWriter.writeEndElement();
                                              
                                                } else {
                                                   
                                                           // we have to do nothing since minOccurs is zero
                                                       
                                                }

                                   }
                             } else {
                                 
                                         throw new org.apache.axis2.databinding.ADBException("SpaceReserved cannot be null!!");
                                    
                             }

                        } if (localTextTracker){
                             if (localText!=null) {
                                   namespace = "http://webservices.sabre.com/sabreXML/2011/10";
                                   for (int i = 0;i < localText.length;i++){
                                        
                                            if (localText[i] != null){
                                        
                                                writeStartElement(null, namespace, "Text", xmlWriter);

                                            
                                                        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localText[i]));
                                                    
                                                xmlWriter.writeEndElement();
                                              
                                                } else {
                                                   
                                                           // we have to do nothing since minOccurs is zero
                                                       
                                                }

                                   }
                             } else {
                                 
                                         throw new org.apache.axis2.databinding.ADBException("Text cannot be null!!");
                                    
                             }

                        } if (localTicketControlNumberTracker){
                             if (localTicketControlNumber!=null) {
                                   namespace = "http://webservices.sabre.com/sabreXML/2011/10";
                                   for (int i = 0;i < localTicketControlNumber.length;i++){
                                        
                                            if (localTicketControlNumber[i] != null){
                                        
                                                writeStartElement(null, namespace, "TicketControlNumber", xmlWriter);

                                            
                                                        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTicketControlNumber[i]));
                                                    
                                                xmlWriter.writeEndElement();
                                              
                                                } else {
                                                   
                                                           // we have to do nothing since minOccurs is zero
                                                       
                                                }

                                   }
                             } else {
                                 
                                         throw new org.apache.axis2.databinding.ADBException("TicketControlNumber cannot be null!!");
                                    
                             }

                        } if (localTrainTracker){
                                       if (localTrain!=null){
                                            for (int i = 0;i < localTrain.length;i++){
                                                if (localTrain[i] != null){
                                                 localTrain[i].serialize(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","Train"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                        // we don't have to do any thing since minOccures is zero
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("Train cannot be null!!");
                                        
                                    }
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

                        } if (localDestinationLocationTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                      "DestinationLocation"));
                            
                            
                                    if (localDestinationLocation==null){
                                         throw new org.apache.axis2.databinding.ADBException("DestinationLocation cannot be null!!");
                                    }
                                    elementList.add(localDestinationLocation);
                                } if (localIssueDateTracker){
                            if (localIssueDate!=null){
                                  for (int i = 0;i < localIssueDate.length;i++){
                                      
                                         if (localIssueDate[i] != null){
                                          elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                              "IssueDate"));
                                          elementList.add(
                                          org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIssueDate[i]));
                                          } else {
                                             
                                                    // have to do nothing
                                                
                                          }
                                      

                                  }
                            } else {
                              
                                    throw new org.apache.axis2.databinding.ADBException("IssueDate cannot be null!!");
                                
                            }

                        } if (localOriginLocationTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                      "OriginLocation"));
                            
                            
                                    if (localOriginLocation==null){
                                         throw new org.apache.axis2.databinding.ADBException("OriginLocation cannot be null!!");
                                    }
                                    elementList.add(localOriginLocation);
                                } if (localServiceInformationTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                      "ServiceInformation"));
                            
                            
                                    if (localServiceInformation==null){
                                         throw new org.apache.axis2.databinding.ADBException("ServiceInformation cannot be null!!");
                                    }
                                    elementList.add(localServiceInformation);
                                } if (localSNCF_InformationTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                      "SNCF_Information"));
                            
                            
                                    if (localSNCF_Information==null){
                                         throw new org.apache.axis2.databinding.ADBException("SNCF_Information cannot be null!!");
                                    }
                                    elementList.add(localSNCF_Information);
                                } if (localSpaceReservedTracker){
                            if (localSpaceReserved!=null){
                                  for (int i = 0;i < localSpaceReserved.length;i++){
                                      
                                         if (localSpaceReserved[i] != null){
                                          elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                              "SpaceReserved"));
                                          elementList.add(
                                          org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSpaceReserved[i]));
                                          } else {
                                             
                                                    // have to do nothing
                                                
                                          }
                                      

                                  }
                            } else {
                              
                                    throw new org.apache.axis2.databinding.ADBException("SpaceReserved cannot be null!!");
                                
                            }

                        } if (localTextTracker){
                            if (localText!=null){
                                  for (int i = 0;i < localText.length;i++){
                                      
                                         if (localText[i] != null){
                                          elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                              "Text"));
                                          elementList.add(
                                          org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localText[i]));
                                          } else {
                                             
                                                    // have to do nothing
                                                
                                          }
                                      

                                  }
                            } else {
                              
                                    throw new org.apache.axis2.databinding.ADBException("Text cannot be null!!");
                                
                            }

                        } if (localTicketControlNumberTracker){
                            if (localTicketControlNumber!=null){
                                  for (int i = 0;i < localTicketControlNumber.length;i++){
                                      
                                         if (localTicketControlNumber[i] != null){
                                          elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                              "TicketControlNumber"));
                                          elementList.add(
                                          org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTicketControlNumber[i]));
                                          } else {
                                             
                                                    // have to do nothing
                                                
                                          }
                                      

                                  }
                            } else {
                              
                                    throw new org.apache.axis2.databinding.ADBException("TicketControlNumber cannot be null!!");
                                
                            }

                        } if (localTrainTracker){
                             if (localTrain!=null) {
                                 for (int i = 0;i < localTrain.length;i++){

                                    if (localTrain[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                          "Train"));
                                         elementList.add(localTrain[i]);
                                    } else {
                                        
                                                // nothing to do
                                            
                                    }

                                 }
                             } else {
                                 
                                        throw new org.apache.axis2.databinding.ADBException("Train cannot be null!!");
                                    
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
                            new javax.xml.namespace.QName("","LinkCode"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLinkCode));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","MergedSegmentInd"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMergedSegmentInd));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","NumberInParty"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumberInParty));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","ResBookDesigCode"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localResBookDesigCode));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","SegmentNumber"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSegmentNumber));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","Status"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStatus));
                                
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
        public static Rail_type0 parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            Rail_type0 object =
                new Rail_type0();

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
                    
                            if (!"Rail_type0".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (Rail_type0)org.xmlsoap.schemas.soap.envelope.ExtensionMapper.getTypeObject(
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
                    
                    // handle attribute "MergedSegmentInd"
                    java.lang.String tempAttribMergedSegmentInd =
                        
                                reader.getAttributeValue(null,"MergedSegmentInd");
                            
                   if (tempAttribMergedSegmentInd!=null){
                         java.lang.String content = tempAttribMergedSegmentInd;
                        
                                                 object.setMergedSegmentInd(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribMergedSegmentInd));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("MergedSegmentInd");
                    
                    // handle attribute "NumberInParty"
                    java.lang.String tempAttribNumberInParty =
                        
                                reader.getAttributeValue(null,"NumberInParty");
                            
                   if (tempAttribNumberInParty!=null){
                         java.lang.String content = tempAttribNumberInParty;
                        
                                                 object.setNumberInParty(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribNumberInParty));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("NumberInParty");
                    
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
                
                        java.util.ArrayList list1 = new java.util.ArrayList();
                    
                        java.util.ArrayList list3 = new java.util.ArrayList();
                    
                        java.util.ArrayList list7 = new java.util.ArrayList();
                    
                        java.util.ArrayList list8 = new java.util.ArrayList();
                    
                        java.util.ArrayList list9 = new java.util.ArrayList();
                    
                        java.util.ArrayList list10 = new java.util.ArrayList();
                    
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","ConfirmationNumber").equals(reader.getName())){
                                
                                    
                                    
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
                                                    if (new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","ConfirmationNumber").equals(reader.getName())){
                                                         list1.add(reader.getElementText());
                                                        
                                                    }else{
                                                        loopDone1 = true;
                                                    }
                                                }
                                            }
                                            // call the converter utility  to convert and set the array
                                            
                                                    object.setConfirmationNumber((java.lang.String[])
                                                        list1.toArray(new java.lang.String[list1.size()]));
                                                
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","DestinationLocation").equals(reader.getName())){
                                
                                                object.setDestinationLocation(com.sabre.webservices.sabrexml._2011._10.DestinationLocation_type4.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","IssueDate").equals(reader.getName())){
                                
                                    
                                    
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
                                                    if (new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","IssueDate").equals(reader.getName())){
                                                         list3.add(reader.getElementText());
                                                        
                                                    }else{
                                                        loopDone3 = true;
                                                    }
                                                }
                                            }
                                            // call the converter utility  to convert and set the array
                                            
                                                    object.setIssueDate((java.lang.String[])
                                                        list3.toArray(new java.lang.String[list3.size()]));
                                                
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","OriginLocation").equals(reader.getName())){
                                
                                                object.setOriginLocation(com.sabre.webservices.sabrexml._2011._10.OriginLocation_type7.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","ServiceInformation").equals(reader.getName())){
                                
                                                object.setServiceInformation(com.sabre.webservices.sabrexml._2011._10.ServiceInformation_type1.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","SNCF_Information").equals(reader.getName())){
                                
                                                object.setSNCF_Information(com.sabre.webservices.sabrexml._2011._10.SNCF_Information_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","SpaceReserved").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list7.add(reader.getElementText());
                                            
                                            //loop until we find a start element that is not part of this array
                                            boolean loopDone7 = false;
                                            while(!loopDone7){
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
                                                    loopDone7 = true;
                                                } else {
                                                    if (new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","SpaceReserved").equals(reader.getName())){
                                                         list7.add(reader.getElementText());
                                                        
                                                    }else{
                                                        loopDone7 = true;
                                                    }
                                                }
                                            }
                                            // call the converter utility  to convert and set the array
                                            
                                                    object.setSpaceReserved((java.lang.String[])
                                                        list7.toArray(new java.lang.String[list7.size()]));
                                                
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","Text").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list8.add(reader.getElementText());
                                            
                                            //loop until we find a start element that is not part of this array
                                            boolean loopDone8 = false;
                                            while(!loopDone8){
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
                                                    loopDone8 = true;
                                                } else {
                                                    if (new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","Text").equals(reader.getName())){
                                                         list8.add(reader.getElementText());
                                                        
                                                    }else{
                                                        loopDone8 = true;
                                                    }
                                                }
                                            }
                                            // call the converter utility  to convert and set the array
                                            
                                                    object.setText((java.lang.String[])
                                                        list8.toArray(new java.lang.String[list8.size()]));
                                                
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","TicketControlNumber").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list9.add(reader.getElementText());
                                            
                                            //loop until we find a start element that is not part of this array
                                            boolean loopDone9 = false;
                                            while(!loopDone9){
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
                                                    loopDone9 = true;
                                                } else {
                                                    if (new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","TicketControlNumber").equals(reader.getName())){
                                                         list9.add(reader.getElementText());
                                                        
                                                    }else{
                                                        loopDone9 = true;
                                                    }
                                                }
                                            }
                                            // call the converter utility  to convert and set the array
                                            
                                                    object.setTicketControlNumber((java.lang.String[])
                                                        list9.toArray(new java.lang.String[list9.size()]));
                                                
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","Train").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list10.add(com.sabre.webservices.sabrexml._2011._10.Train_type0.Factory.parse(reader));
                                                                
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone10 = false;
                                                        while(!loopDone10){
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
                                                                loopDone10 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","Train").equals(reader.getName())){
                                                                    list10.add(com.sabre.webservices.sabrexml._2011._10.Train_type0.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone10 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setTrain((com.sabre.webservices.sabrexml._2011._10.Train_type0[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.sabre.webservices.sabrexml._2011._10.Train_type0.class,
                                                                list10));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","Vendor").equals(reader.getName())){
                                
                                                object.setVendor(com.sabre.webservices.sabrexml._2011._10.Vendor_type4.Factory.parse(reader));
                                              
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
           
    