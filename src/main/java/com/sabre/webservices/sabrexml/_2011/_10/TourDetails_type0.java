
/**
 * TourDetails_type0.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.sabre.webservices.sabrexml._2011._10;
            

            /**
            *  TourDetails_type0 bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class TourDetails_type0
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = TourDetails_type0
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
                        * field for Duration
                        * This was an Array!
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.Duration_type0[] localDuration ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDurationTracker = false ;

                           public boolean isDurationSpecified(){
                               return localDurationTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.sabre.webservices.sabrexml._2011._10.Duration_type0[]
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.Duration_type0[] getDuration(){
                               return localDuration;
                           }

                           
                        


                               
                              /**
                               * validate the array for Duration
                               */
                              protected void validateDuration(com.sabre.webservices.sabrexml._2011._10.Duration_type0[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param Duration
                              */
                              public void setDuration(com.sabre.webservices.sabrexml._2011._10.Duration_type0[] param){
                              
                                   validateDuration(param);

                               localDurationTracker = param != null;
                                      
                                      this.localDuration=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.sabre.webservices.sabrexml._2011._10.Duration_type0
                             */
                             public void addDuration(com.sabre.webservices.sabrexml._2011._10.Duration_type0 param){
                                   if (localDuration == null){
                                   localDuration = new com.sabre.webservices.sabrexml._2011._10.Duration_type0[]{};
                                   }

                            
                                 //update the setting tracker
                                localDurationTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localDuration);
                               list.add(param);
                               this.localDuration =
                             (com.sabre.webservices.sabrexml._2011._10.Duration_type0[])list.toArray(
                            new com.sabre.webservices.sabrexml._2011._10.Duration_type0[list.size()]);

                             }
                             

                        /**
                        * field for Extensions
                        * This was an Array!
                        */

                        
                                    protected java.lang.String[] localExtensions ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localExtensionsTracker = false ;

                           public boolean isExtensionsSpecified(){
                               return localExtensionsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String[]
                           */
                           public  java.lang.String[] getExtensions(){
                               return localExtensions;
                           }

                           
                        


                               
                              /**
                               * validate the array for Extensions
                               */
                              protected void validateExtensions(java.lang.String[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param Extensions
                              */
                              public void setExtensions(java.lang.String[] param){
                              
                                   validateExtensions(param);

                               localExtensionsTracker = param != null;
                                      
                                      this.localExtensions=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param java.lang.String
                             */
                             public void addExtensions(java.lang.String param){
                                   if (localExtensions == null){
                                   localExtensions = new java.lang.String[]{};
                                   }

                            
                                 //update the setting tracker
                                localExtensionsTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localExtensions);
                               list.add(param);
                               this.localExtensions =
                             (java.lang.String[])list.toArray(
                            new java.lang.String[list.size()]);

                             }
                             

                        /**
                        * field for Features
                        * This was an Array!
                        */

                        
                                    protected java.lang.String[] localFeatures ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localFeaturesTracker = false ;

                           public boolean isFeaturesSpecified(){
                               return localFeaturesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String[]
                           */
                           public  java.lang.String[] getFeatures(){
                               return localFeatures;
                           }

                           
                        


                               
                              /**
                               * validate the array for Features
                               */
                              protected void validateFeatures(java.lang.String[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param Features
                              */
                              public void setFeatures(java.lang.String[] param){
                              
                                   validateFeatures(param);

                               localFeaturesTracker = param != null;
                                      
                                      this.localFeatures=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param java.lang.String
                             */
                             public void addFeatures(java.lang.String param){
                                   if (localFeatures == null){
                                   localFeatures = new java.lang.String[]{};
                                   }

                            
                                 //update the setting tracker
                                localFeaturesTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localFeatures);
                               list.add(param);
                               this.localFeatures =
                             (java.lang.String[])list.toArray(
                            new java.lang.String[list.size()]);

                             }
                             

                        /**
                        * field for HotelInformation
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.HotelInformation_type0 localHotelInformation ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localHotelInformationTracker = false ;

                           public boolean isHotelInformationSpecified(){
                               return localHotelInformationTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.sabre.webservices.sabrexml._2011._10.HotelInformation_type0
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.HotelInformation_type0 getHotelInformation(){
                               return localHotelInformation;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param HotelInformation
                               */
                               public void setHotelInformation(com.sabre.webservices.sabrexml._2011._10.HotelInformation_type0 param){
                            localHotelInformationTracker = param != null;
                                   
                                            this.localHotelInformation=param;
                                    

                               }
                            

                        /**
                        * field for Location
                        * This was an Array!
                        */

                        
                                    protected java.lang.String[] localLocation ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLocationTracker = false ;

                           public boolean isLocationSpecified(){
                               return localLocationTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String[]
                           */
                           public  java.lang.String[] getLocation(){
                               return localLocation;
                           }

                           
                        


                               
                              /**
                               * validate the array for Location
                               */
                              protected void validateLocation(java.lang.String[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param Location
                              */
                              public void setLocation(java.lang.String[] param){
                              
                                   validateLocation(param);

                               localLocationTracker = param != null;
                                      
                                      this.localLocation=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param java.lang.String
                             */
                             public void addLocation(java.lang.String param){
                                   if (localLocation == null){
                                   localLocation = new java.lang.String[]{};
                                   }

                            
                                 //update the setting tracker
                                localLocationTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localLocation);
                               list.add(param);
                               this.localLocation =
                             (java.lang.String[])list.toArray(
                            new java.lang.String[list.size()]);

                             }
                             

                        /**
                        * field for Meals
                        * This was an Array!
                        */

                        
                                    protected java.lang.String[] localMeals ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMealsTracker = false ;

                           public boolean isMealsSpecified(){
                               return localMealsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String[]
                           */
                           public  java.lang.String[] getMeals(){
                               return localMeals;
                           }

                           
                        


                               
                              /**
                               * validate the array for Meals
                               */
                              protected void validateMeals(java.lang.String[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param Meals
                              */
                              public void setMeals(java.lang.String[] param){
                              
                                   validateMeals(param);

                               localMealsTracker = param != null;
                                      
                                      this.localMeals=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param java.lang.String
                             */
                             public void addMeals(java.lang.String param){
                                   if (localMeals == null){
                                   localMeals = new java.lang.String[]{};
                                   }

                            
                                 //update the setting tracker
                                localMealsTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localMeals);
                               list.add(param);
                               this.localMeals =
                             (java.lang.String[])list.toArray(
                            new java.lang.String[list.size()]);

                             }
                             

                        /**
                        * field for Options
                        * This was an Array!
                        */

                        
                                    protected java.lang.String[] localOptions ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localOptionsTracker = false ;

                           public boolean isOptionsSpecified(){
                               return localOptionsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String[]
                           */
                           public  java.lang.String[] getOptions(){
                               return localOptions;
                           }

                           
                        


                               
                              /**
                               * validate the array for Options
                               */
                              protected void validateOptions(java.lang.String[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param Options
                              */
                              public void setOptions(java.lang.String[] param){
                              
                                   validateOptions(param);

                               localOptionsTracker = param != null;
                                      
                                      this.localOptions=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param java.lang.String
                             */
                             public void addOptions(java.lang.String param){
                                   if (localOptions == null){
                                   localOptions = new java.lang.String[]{};
                                   }

                            
                                 //update the setting tracker
                                localOptionsTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localOptions);
                               list.add(param);
                               this.localOptions =
                             (java.lang.String[])list.toArray(
                            new java.lang.String[list.size()]);

                             }
                             

                        /**
                        * field for Price
                        * This was an Array!
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.Price_type0[] localPrice ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPriceTracker = false ;

                           public boolean isPriceSpecified(){
                               return localPriceTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.sabre.webservices.sabrexml._2011._10.Price_type0[]
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.Price_type0[] getPrice(){
                               return localPrice;
                           }

                           
                        


                               
                              /**
                               * validate the array for Price
                               */
                              protected void validatePrice(com.sabre.webservices.sabrexml._2011._10.Price_type0[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param Price
                              */
                              public void setPrice(com.sabre.webservices.sabrexml._2011._10.Price_type0[] param){
                              
                                   validatePrice(param);

                               localPriceTracker = param != null;
                                      
                                      this.localPrice=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.sabre.webservices.sabrexml._2011._10.Price_type0
                             */
                             public void addPrice(com.sabre.webservices.sabrexml._2011._10.Price_type0 param){
                                   if (localPrice == null){
                                   localPrice = new com.sabre.webservices.sabrexml._2011._10.Price_type0[]{};
                                   }

                            
                                 //update the setting tracker
                                localPriceTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localPrice);
                               list.add(param);
                               this.localPrice =
                             (com.sabre.webservices.sabrexml._2011._10.Price_type0[])list.toArray(
                            new com.sabre.webservices.sabrexml._2011._10.Price_type0[list.size()]);

                             }
                             

                        /**
                        * field for ServiceInformation
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.ServiceInformation_type2 localServiceInformation ;
                                
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
                           * @return com.sabre.webservices.sabrexml._2011._10.ServiceInformation_type2
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.ServiceInformation_type2 getServiceInformation(){
                               return localServiceInformation;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ServiceInformation
                               */
                               public void setServiceInformation(com.sabre.webservices.sabrexml._2011._10.ServiceInformation_type2 param){
                            localServiceInformationTracker = param != null;
                                   
                                            this.localServiceInformation=param;
                                    

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
                        * field for VehicleInformation
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.VehicleInformation_type0 localVehicleInformation ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localVehicleInformationTracker = false ;

                           public boolean isVehicleInformationSpecified(){
                               return localVehicleInformationTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.sabre.webservices.sabrexml._2011._10.VehicleInformation_type0
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.VehicleInformation_type0 getVehicleInformation(){
                               return localVehicleInformation;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param VehicleInformation
                               */
                               public void setVehicleInformation(com.sabre.webservices.sabrexml._2011._10.VehicleInformation_type0 param){
                            localVehicleInformationTracker = param != null;
                                   
                                            this.localVehicleInformation=param;
                                    

                               }
                            

                        /**
                        * field for LocationCode
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localLocationCode ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getLocationCode(){
                               return localLocationCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param LocationCode
                               */
                               public void setLocationCode(java.lang.String param){
                            
                                            this.localLocationCode=param;
                                    

                               }
                            

                        /**
                        * field for Name
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localName ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getName(){
                               return localName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Name
                               */
                               public void setName(java.lang.String param){
                            
                                            this.localName=param;
                                    

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
                        * field for Vendor
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localVendor ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getVendor(){
                               return localVendor;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Vendor
                               */
                               public void setVendor(java.lang.String param){
                            
                                            this.localVendor=param;
                                    

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
                           namespacePrefix+":TourDetails_type0",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "TourDetails_type0",
                           xmlWriter);
                   }

               
                   }
               
                                            if (localLocationCode != null){
                                        
                                                writeAttribute("",
                                                         "LocationCode",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLocationCode), xmlWriter);

                                            
                                      }
                                    
                                            if (localName != null){
                                        
                                                writeAttribute("",
                                                         "Name",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localName), xmlWriter);

                                            
                                      }
                                    
                                            if (localNumber != null){
                                        
                                                writeAttribute("",
                                                         "Number",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumber), xmlWriter);

                                            
                                      }
                                    
                                            if (localServiceCityName != null){
                                        
                                                writeAttribute("",
                                                         "ServiceCityName",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localServiceCityName), xmlWriter);

                                            
                                      }
                                    
                                            if (localVendor != null){
                                        
                                                writeAttribute("",
                                                         "Vendor",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localVendor), xmlWriter);

                                            
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

                        } if (localDurationTracker){
                                       if (localDuration!=null){
                                            for (int i = 0;i < localDuration.length;i++){
                                                if (localDuration[i] != null){
                                                 localDuration[i].serialize(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","Duration"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                        // we don't have to do any thing since minOccures is zero
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("Duration cannot be null!!");
                                        
                                    }
                                 } if (localExtensionsTracker){
                             if (localExtensions!=null) {
                                   namespace = "http://webservices.sabre.com/sabreXML/2011/10";
                                   for (int i = 0;i < localExtensions.length;i++){
                                        
                                            if (localExtensions[i] != null){
                                        
                                                writeStartElement(null, namespace, "Extensions", xmlWriter);

                                            
                                                        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localExtensions[i]));
                                                    
                                                xmlWriter.writeEndElement();
                                              
                                                } else {
                                                   
                                                           // we have to do nothing since minOccurs is zero
                                                       
                                                }

                                   }
                             } else {
                                 
                                         throw new org.apache.axis2.databinding.ADBException("Extensions cannot be null!!");
                                    
                             }

                        } if (localFeaturesTracker){
                             if (localFeatures!=null) {
                                   namespace = "http://webservices.sabre.com/sabreXML/2011/10";
                                   for (int i = 0;i < localFeatures.length;i++){
                                        
                                            if (localFeatures[i] != null){
                                        
                                                writeStartElement(null, namespace, "Features", xmlWriter);

                                            
                                                        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFeatures[i]));
                                                    
                                                xmlWriter.writeEndElement();
                                              
                                                } else {
                                                   
                                                           // we have to do nothing since minOccurs is zero
                                                       
                                                }

                                   }
                             } else {
                                 
                                         throw new org.apache.axis2.databinding.ADBException("Features cannot be null!!");
                                    
                             }

                        } if (localHotelInformationTracker){
                                            if (localHotelInformation==null){
                                                 throw new org.apache.axis2.databinding.ADBException("HotelInformation cannot be null!!");
                                            }
                                           localHotelInformation.serialize(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","HotelInformation"),
                                               xmlWriter);
                                        } if (localLocationTracker){
                             if (localLocation!=null) {
                                   namespace = "http://webservices.sabre.com/sabreXML/2011/10";
                                   for (int i = 0;i < localLocation.length;i++){
                                        
                                            if (localLocation[i] != null){
                                        
                                                writeStartElement(null, namespace, "Location", xmlWriter);

                                            
                                                        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLocation[i]));
                                                    
                                                xmlWriter.writeEndElement();
                                              
                                                } else {
                                                   
                                                           // we have to do nothing since minOccurs is zero
                                                       
                                                }

                                   }
                             } else {
                                 
                                         throw new org.apache.axis2.databinding.ADBException("Location cannot be null!!");
                                    
                             }

                        } if (localMealsTracker){
                             if (localMeals!=null) {
                                   namespace = "http://webservices.sabre.com/sabreXML/2011/10";
                                   for (int i = 0;i < localMeals.length;i++){
                                        
                                            if (localMeals[i] != null){
                                        
                                                writeStartElement(null, namespace, "Meals", xmlWriter);

                                            
                                                        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMeals[i]));
                                                    
                                                xmlWriter.writeEndElement();
                                              
                                                } else {
                                                   
                                                           // we have to do nothing since minOccurs is zero
                                                       
                                                }

                                   }
                             } else {
                                 
                                         throw new org.apache.axis2.databinding.ADBException("Meals cannot be null!!");
                                    
                             }

                        } if (localOptionsTracker){
                             if (localOptions!=null) {
                                   namespace = "http://webservices.sabre.com/sabreXML/2011/10";
                                   for (int i = 0;i < localOptions.length;i++){
                                        
                                            if (localOptions[i] != null){
                                        
                                                writeStartElement(null, namespace, "Options", xmlWriter);

                                            
                                                        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOptions[i]));
                                                    
                                                xmlWriter.writeEndElement();
                                              
                                                } else {
                                                   
                                                           // we have to do nothing since minOccurs is zero
                                                       
                                                }

                                   }
                             } else {
                                 
                                         throw new org.apache.axis2.databinding.ADBException("Options cannot be null!!");
                                    
                             }

                        } if (localPriceTracker){
                                       if (localPrice!=null){
                                            for (int i = 0;i < localPrice.length;i++){
                                                if (localPrice[i] != null){
                                                 localPrice[i].serialize(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","Price"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                        // we don't have to do any thing since minOccures is zero
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("Price cannot be null!!");
                                        
                                    }
                                 } if (localServiceInformationTracker){
                                            if (localServiceInformation==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ServiceInformation cannot be null!!");
                                            }
                                           localServiceInformation.serialize(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","ServiceInformation"),
                                               xmlWriter);
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

                        } if (localVehicleInformationTracker){
                                            if (localVehicleInformation==null){
                                                 throw new org.apache.axis2.databinding.ADBException("VehicleInformation cannot be null!!");
                                            }
                                           localVehicleInformation.serialize(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","VehicleInformation"),
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

                        } if (localDurationTracker){
                             if (localDuration!=null) {
                                 for (int i = 0;i < localDuration.length;i++){

                                    if (localDuration[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                          "Duration"));
                                         elementList.add(localDuration[i]);
                                    } else {
                                        
                                                // nothing to do
                                            
                                    }

                                 }
                             } else {
                                 
                                        throw new org.apache.axis2.databinding.ADBException("Duration cannot be null!!");
                                    
                             }

                        } if (localExtensionsTracker){
                            if (localExtensions!=null){
                                  for (int i = 0;i < localExtensions.length;i++){
                                      
                                         if (localExtensions[i] != null){
                                          elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                              "Extensions"));
                                          elementList.add(
                                          org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localExtensions[i]));
                                          } else {
                                             
                                                    // have to do nothing
                                                
                                          }
                                      

                                  }
                            } else {
                              
                                    throw new org.apache.axis2.databinding.ADBException("Extensions cannot be null!!");
                                
                            }

                        } if (localFeaturesTracker){
                            if (localFeatures!=null){
                                  for (int i = 0;i < localFeatures.length;i++){
                                      
                                         if (localFeatures[i] != null){
                                          elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                              "Features"));
                                          elementList.add(
                                          org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFeatures[i]));
                                          } else {
                                             
                                                    // have to do nothing
                                                
                                          }
                                      

                                  }
                            } else {
                              
                                    throw new org.apache.axis2.databinding.ADBException("Features cannot be null!!");
                                
                            }

                        } if (localHotelInformationTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                      "HotelInformation"));
                            
                            
                                    if (localHotelInformation==null){
                                         throw new org.apache.axis2.databinding.ADBException("HotelInformation cannot be null!!");
                                    }
                                    elementList.add(localHotelInformation);
                                } if (localLocationTracker){
                            if (localLocation!=null){
                                  for (int i = 0;i < localLocation.length;i++){
                                      
                                         if (localLocation[i] != null){
                                          elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                              "Location"));
                                          elementList.add(
                                          org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLocation[i]));
                                          } else {
                                             
                                                    // have to do nothing
                                                
                                          }
                                      

                                  }
                            } else {
                              
                                    throw new org.apache.axis2.databinding.ADBException("Location cannot be null!!");
                                
                            }

                        } if (localMealsTracker){
                            if (localMeals!=null){
                                  for (int i = 0;i < localMeals.length;i++){
                                      
                                         if (localMeals[i] != null){
                                          elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                              "Meals"));
                                          elementList.add(
                                          org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMeals[i]));
                                          } else {
                                             
                                                    // have to do nothing
                                                
                                          }
                                      

                                  }
                            } else {
                              
                                    throw new org.apache.axis2.databinding.ADBException("Meals cannot be null!!");
                                
                            }

                        } if (localOptionsTracker){
                            if (localOptions!=null){
                                  for (int i = 0;i < localOptions.length;i++){
                                      
                                         if (localOptions[i] != null){
                                          elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                              "Options"));
                                          elementList.add(
                                          org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOptions[i]));
                                          } else {
                                             
                                                    // have to do nothing
                                                
                                          }
                                      

                                  }
                            } else {
                              
                                    throw new org.apache.axis2.databinding.ADBException("Options cannot be null!!");
                                
                            }

                        } if (localPriceTracker){
                             if (localPrice!=null) {
                                 for (int i = 0;i < localPrice.length;i++){

                                    if (localPrice[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                          "Price"));
                                         elementList.add(localPrice[i]);
                                    } else {
                                        
                                                // nothing to do
                                            
                                    }

                                 }
                             } else {
                                 
                                        throw new org.apache.axis2.databinding.ADBException("Price cannot be null!!");
                                    
                             }

                        } if (localServiceInformationTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                      "ServiceInformation"));
                            
                            
                                    if (localServiceInformation==null){
                                         throw new org.apache.axis2.databinding.ADBException("ServiceInformation cannot be null!!");
                                    }
                                    elementList.add(localServiceInformation);
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

                        } if (localVehicleInformationTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                      "VehicleInformation"));
                            
                            
                                    if (localVehicleInformation==null){
                                         throw new org.apache.axis2.databinding.ADBException("VehicleInformation cannot be null!!");
                                    }
                                    elementList.add(localVehicleInformation);
                                }
                            attribList.add(
                            new javax.xml.namespace.QName("","LocationCode"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLocationCode));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","Name"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localName));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","Number"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumber));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","ServiceCityName"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localServiceCityName));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","Vendor"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localVendor));
                                

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
        public static TourDetails_type0 parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            TourDetails_type0 object =
                new TourDetails_type0();

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
                    
                            if (!"TourDetails_type0".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (TourDetails_type0)org.xmlsoap.schemas.soap.envelope.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    // handle attribute "LocationCode"
                    java.lang.String tempAttribLocationCode =
                        
                                reader.getAttributeValue(null,"LocationCode");
                            
                   if (tempAttribLocationCode!=null){
                         java.lang.String content = tempAttribLocationCode;
                        
                                                 object.setLocationCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribLocationCode));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("LocationCode");
                    
                    // handle attribute "Name"
                    java.lang.String tempAttribName =
                        
                                reader.getAttributeValue(null,"Name");
                            
                   if (tempAttribName!=null){
                         java.lang.String content = tempAttribName;
                        
                                                 object.setName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribName));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("Name");
                    
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
                    
                    // handle attribute "Vendor"
                    java.lang.String tempAttribVendor =
                        
                                reader.getAttributeValue(null,"Vendor");
                            
                   if (tempAttribVendor!=null){
                         java.lang.String content = tempAttribVendor;
                        
                                                 object.setVendor(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribVendor));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("Vendor");
                    
                    
                    reader.next();
                
                        java.util.ArrayList list1 = new java.util.ArrayList();
                    
                        java.util.ArrayList list2 = new java.util.ArrayList();
                    
                        java.util.ArrayList list3 = new java.util.ArrayList();
                    
                        java.util.ArrayList list4 = new java.util.ArrayList();
                    
                        java.util.ArrayList list6 = new java.util.ArrayList();
                    
                        java.util.ArrayList list7 = new java.util.ArrayList();
                    
                        java.util.ArrayList list8 = new java.util.ArrayList();
                    
                        java.util.ArrayList list9 = new java.util.ArrayList();
                    
                        java.util.ArrayList list11 = new java.util.ArrayList();
                    
                                    
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","Duration").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list2.add(com.sabre.webservices.sabrexml._2011._10.Duration_type0.Factory.parse(reader));
                                                                
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
                                                                if (new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","Duration").equals(reader.getName())){
                                                                    list2.add(com.sabre.webservices.sabrexml._2011._10.Duration_type0.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone2 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setDuration((com.sabre.webservices.sabrexml._2011._10.Duration_type0[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.sabre.webservices.sabrexml._2011._10.Duration_type0.class,
                                                                list2));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","Extensions").equals(reader.getName())){
                                
                                    
                                    
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
                                                    if (new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","Extensions").equals(reader.getName())){
                                                         list3.add(reader.getElementText());
                                                        
                                                    }else{
                                                        loopDone3 = true;
                                                    }
                                                }
                                            }
                                            // call the converter utility  to convert and set the array
                                            
                                                    object.setExtensions((java.lang.String[])
                                                        list3.toArray(new java.lang.String[list3.size()]));
                                                
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","Features").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list4.add(reader.getElementText());
                                            
                                            //loop until we find a start element that is not part of this array
                                            boolean loopDone4 = false;
                                            while(!loopDone4){
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
                                                    loopDone4 = true;
                                                } else {
                                                    if (new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","Features").equals(reader.getName())){
                                                         list4.add(reader.getElementText());
                                                        
                                                    }else{
                                                        loopDone4 = true;
                                                    }
                                                }
                                            }
                                            // call the converter utility  to convert and set the array
                                            
                                                    object.setFeatures((java.lang.String[])
                                                        list4.toArray(new java.lang.String[list4.size()]));
                                                
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","HotelInformation").equals(reader.getName())){
                                
                                                object.setHotelInformation(com.sabre.webservices.sabrexml._2011._10.HotelInformation_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","Location").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list6.add(reader.getElementText());
                                            
                                            //loop until we find a start element that is not part of this array
                                            boolean loopDone6 = false;
                                            while(!loopDone6){
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
                                                    loopDone6 = true;
                                                } else {
                                                    if (new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","Location").equals(reader.getName())){
                                                         list6.add(reader.getElementText());
                                                        
                                                    }else{
                                                        loopDone6 = true;
                                                    }
                                                }
                                            }
                                            // call the converter utility  to convert and set the array
                                            
                                                    object.setLocation((java.lang.String[])
                                                        list6.toArray(new java.lang.String[list6.size()]));
                                                
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","Meals").equals(reader.getName())){
                                
                                    
                                    
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
                                                    if (new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","Meals").equals(reader.getName())){
                                                         list7.add(reader.getElementText());
                                                        
                                                    }else{
                                                        loopDone7 = true;
                                                    }
                                                }
                                            }
                                            // call the converter utility  to convert and set the array
                                            
                                                    object.setMeals((java.lang.String[])
                                                        list7.toArray(new java.lang.String[list7.size()]));
                                                
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","Options").equals(reader.getName())){
                                
                                    
                                    
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
                                                    if (new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","Options").equals(reader.getName())){
                                                         list8.add(reader.getElementText());
                                                        
                                                    }else{
                                                        loopDone8 = true;
                                                    }
                                                }
                                            }
                                            // call the converter utility  to convert and set the array
                                            
                                                    object.setOptions((java.lang.String[])
                                                        list8.toArray(new java.lang.String[list8.size()]));
                                                
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","Price").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list9.add(com.sabre.webservices.sabrexml._2011._10.Price_type0.Factory.parse(reader));
                                                                
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
                                                                if (new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","Price").equals(reader.getName())){
                                                                    list9.add(com.sabre.webservices.sabrexml._2011._10.Price_type0.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone9 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setPrice((com.sabre.webservices.sabrexml._2011._10.Price_type0[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.sabre.webservices.sabrexml._2011._10.Price_type0.class,
                                                                list9));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","ServiceInformation").equals(reader.getName())){
                                
                                                object.setServiceInformation(com.sabre.webservices.sabrexml._2011._10.ServiceInformation_type2.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","Text").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list11.add(reader.getElementText());
                                            
                                            //loop until we find a start element that is not part of this array
                                            boolean loopDone11 = false;
                                            while(!loopDone11){
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
                                                    loopDone11 = true;
                                                } else {
                                                    if (new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","Text").equals(reader.getName())){
                                                         list11.add(reader.getElementText());
                                                        
                                                    }else{
                                                        loopDone11 = true;
                                                    }
                                                }
                                            }
                                            // call the converter utility  to convert and set the array
                                            
                                                    object.setText((java.lang.String[])
                                                        list11.toArray(new java.lang.String[list11.size()]));
                                                
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","VehicleInformation").equals(reader.getName())){
                                
                                                object.setVehicleInformation(com.sabre.webservices.sabrexml._2011._10.VehicleInformation_type0.Factory.parse(reader));
                                              
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
           
    