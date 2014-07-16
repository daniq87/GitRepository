
/**
 * Cruise_type0.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.sabre.webservices.sabrexml._2011._10;
            

            /**
            *  Cruise_type0 bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class Cruise_type0
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = Cruise_type0
                Namespace URI = http://webservices.sabre.com/sabreXML/2011/10
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for Berth
                        * This was an Array!
                        */

                        
                                    protected java.lang.String[] localBerth ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBerthTracker = false ;

                           public boolean isBerthSpecified(){
                               return localBerthTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String[]
                           */
                           public  java.lang.String[] getBerth(){
                               return localBerth;
                           }

                           
                        


                               
                              /**
                               * validate the array for Berth
                               */
                              protected void validateBerth(java.lang.String[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param Berth
                              */
                              public void setBerth(java.lang.String[] param){
                              
                                   validateBerth(param);

                               localBerthTracker = param != null;
                                      
                                      this.localBerth=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param java.lang.String
                             */
                             public void addBerth(java.lang.String param){
                                   if (localBerth == null){
                                   localBerth = new java.lang.String[]{};
                                   }

                            
                                 //update the setting tracker
                                localBerthTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localBerth);
                               list.add(param);
                               this.localBerth =
                             (java.lang.String[])list.toArray(
                            new java.lang.String[list.size()]);

                             }
                             

                        /**
                        * field for Cabin
                        * This was an Array!
                        */

                        
                                    protected java.lang.String[] localCabin ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCabinTracker = false ;

                           public boolean isCabinSpecified(){
                               return localCabinTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String[]
                           */
                           public  java.lang.String[] getCabin(){
                               return localCabin;
                           }

                           
                        


                               
                              /**
                               * validate the array for Cabin
                               */
                              protected void validateCabin(java.lang.String[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param Cabin
                              */
                              public void setCabin(java.lang.String[] param){
                              
                                   validateCabin(param);

                               localCabinTracker = param != null;
                                      
                                      this.localCabin=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param java.lang.String
                             */
                             public void addCabin(java.lang.String param){
                                   if (localCabin == null){
                                   localCabin = new java.lang.String[]{};
                                   }

                            
                                 //update the setting tracker
                                localCabinTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localCabin);
                               list.add(param);
                               this.localCabin =
                             (java.lang.String[])list.toArray(
                            new java.lang.String[list.size()]);

                             }
                             

                        /**
                        * field for CarRate
                        * This was an Array!
                        */

                        
                                    protected java.lang.String[] localCarRate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCarRateTracker = false ;

                           public boolean isCarRateSpecified(){
                               return localCarRateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String[]
                           */
                           public  java.lang.String[] getCarRate(){
                               return localCarRate;
                           }

                           
                        


                               
                              /**
                               * validate the array for CarRate
                               */
                              protected void validateCarRate(java.lang.String[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param CarRate
                              */
                              public void setCarRate(java.lang.String[] param){
                              
                                   validateCarRate(param);

                               localCarRateTracker = param != null;
                                      
                                      this.localCarRate=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param java.lang.String
                             */
                             public void addCarRate(java.lang.String param){
                                   if (localCarRate == null){
                                   localCarRate = new java.lang.String[]{};
                                   }

                            
                                 //update the setting tracker
                                localCarRateTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localCarRate);
                               list.add(param);
                               this.localCarRate =
                             (java.lang.String[])list.toArray(
                            new java.lang.String[list.size()]);

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
                        * field for DestinationLocation
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.DestinationLocation_type1 localDestinationLocation ;
                                
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
                           * @return com.sabre.webservices.sabrexml._2011._10.DestinationLocation_type1
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.DestinationLocation_type1 getDestinationLocation(){
                               return localDestinationLocation;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DestinationLocation
                               */
                               public void setDestinationLocation(com.sabre.webservices.sabrexml._2011._10.DestinationLocation_type1 param){
                            localDestinationLocationTracker = param != null;
                                   
                                            this.localDestinationLocation=param;
                                    

                               }
                            

                        /**
                        * field for OriginLocation
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.OriginLocation_type3 localOriginLocation ;
                                
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
                           * @return com.sabre.webservices.sabrexml._2011._10.OriginLocation_type3
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.OriginLocation_type3 getOriginLocation(){
                               return localOriginLocation;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OriginLocation
                               */
                               public void setOriginLocation(com.sabre.webservices.sabrexml._2011._10.OriginLocation_type3 param){
                            localOriginLocationTracker = param != null;
                                   
                                            this.localOriginLocation=param;
                                    

                               }
                            

                        /**
                        * field for Passenger
                        * This was an Array!
                        */

                        
                                    protected java.lang.String[] localPassenger ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPassengerTracker = false ;

                           public boolean isPassengerSpecified(){
                               return localPassengerTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String[]
                           */
                           public  java.lang.String[] getPassenger(){
                               return localPassenger;
                           }

                           
                        


                               
                              /**
                               * validate the array for Passenger
                               */
                              protected void validatePassenger(java.lang.String[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param Passenger
                              */
                              public void setPassenger(java.lang.String[] param){
                              
                                   validatePassenger(param);

                               localPassengerTracker = param != null;
                                      
                                      this.localPassenger=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param java.lang.String
                             */
                             public void addPassenger(java.lang.String param){
                                   if (localPassenger == null){
                                   localPassenger = new java.lang.String[]{};
                                   }

                            
                                 //update the setting tracker
                                localPassengerTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localPassenger);
                               list.add(param);
                               this.localPassenger =
                             (java.lang.String[])list.toArray(
                            new java.lang.String[list.size()]);

                             }
                             

                        /**
                        * field for Seat
                        * This was an Array!
                        */

                        
                                    protected java.lang.String[] localSeat ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeatTracker = false ;

                           public boolean isSeatSpecified(){
                               return localSeatTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String[]
                           */
                           public  java.lang.String[] getSeat(){
                               return localSeat;
                           }

                           
                        


                               
                              /**
                               * validate the array for Seat
                               */
                              protected void validateSeat(java.lang.String[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param Seat
                              */
                              public void setSeat(java.lang.String[] param){
                              
                                   validateSeat(param);

                               localSeatTracker = param != null;
                                      
                                      this.localSeat=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param java.lang.String
                             */
                             public void addSeat(java.lang.String param){
                                   if (localSeat == null){
                                   localSeat = new java.lang.String[]{};
                                   }

                            
                                 //update the setting tracker
                                localSeatTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localSeat);
                               list.add(param);
                               this.localSeat =
                             (java.lang.String[])list.toArray(
                            new java.lang.String[list.size()]);

                             }
                             

                        /**
                        * field for ServiceInformation
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.ServiceInformation_type0 localServiceInformation ;
                                
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
                           * @return com.sabre.webservices.sabrexml._2011._10.ServiceInformation_type0
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.ServiceInformation_type0 getServiceInformation(){
                               return localServiceInformation;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ServiceInformation
                               */
                               public void setServiceInformation(com.sabre.webservices.sabrexml._2011._10.ServiceInformation_type0 param){
                            localServiceInformationTracker = param != null;
                                   
                                            this.localServiceInformation=param;
                                    

                               }
                            

                        /**
                        * field for ShipName
                        * This was an Array!
                        */

                        
                                    protected java.lang.String[] localShipName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localShipNameTracker = false ;

                           public boolean isShipNameSpecified(){
                               return localShipNameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String[]
                           */
                           public  java.lang.String[] getShipName(){
                               return localShipName;
                           }

                           
                        


                               
                              /**
                               * validate the array for ShipName
                               */
                              protected void validateShipName(java.lang.String[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param ShipName
                              */
                              public void setShipName(java.lang.String[] param){
                              
                                   validateShipName(param);

                               localShipNameTracker = param != null;
                                      
                                      this.localShipName=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param java.lang.String
                             */
                             public void addShipName(java.lang.String param){
                                   if (localShipName == null){
                                   localShipName = new java.lang.String[]{};
                                   }

                            
                                 //update the setting tracker
                                localShipNameTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localShipName);
                               list.add(param);
                               this.localShipName =
                             (java.lang.String[])list.toArray(
                            new java.lang.String[list.size()]);

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
                        * field for TotalFare
                        * This was an Array!
                        */

                        
                                    protected java.lang.String[] localTotalFare ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTotalFareTracker = false ;

                           public boolean isTotalFareSpecified(){
                               return localTotalFareTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String[]
                           */
                           public  java.lang.String[] getTotalFare(){
                               return localTotalFare;
                           }

                           
                        


                               
                              /**
                               * validate the array for TotalFare
                               */
                              protected void validateTotalFare(java.lang.String[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param TotalFare
                              */
                              public void setTotalFare(java.lang.String[] param){
                              
                                   validateTotalFare(param);

                               localTotalFareTracker = param != null;
                                      
                                      this.localTotalFare=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param java.lang.String
                             */
                             public void addTotalFare(java.lang.String param){
                                   if (localTotalFare == null){
                                   localTotalFare = new java.lang.String[]{};
                                   }

                            
                                 //update the setting tracker
                                localTotalFareTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localTotalFare);
                               list.add(param);
                               this.localTotalFare =
                             (java.lang.String[])list.toArray(
                            new java.lang.String[list.size()]);

                             }
                             

                        /**
                        * field for TrailerPrice
                        * This was an Array!
                        */

                        
                                    protected java.lang.String[] localTrailerPrice ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTrailerPriceTracker = false ;

                           public boolean isTrailerPriceSpecified(){
                               return localTrailerPriceTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String[]
                           */
                           public  java.lang.String[] getTrailerPrice(){
                               return localTrailerPrice;
                           }

                           
                        


                               
                              /**
                               * validate the array for TrailerPrice
                               */
                              protected void validateTrailerPrice(java.lang.String[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param TrailerPrice
                              */
                              public void setTrailerPrice(java.lang.String[] param){
                              
                                   validateTrailerPrice(param);

                               localTrailerPriceTracker = param != null;
                                      
                                      this.localTrailerPrice=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param java.lang.String
                             */
                             public void addTrailerPrice(java.lang.String param){
                                   if (localTrailerPrice == null){
                                   localTrailerPrice = new java.lang.String[]{};
                                   }

                            
                                 //update the setting tracker
                                localTrailerPriceTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localTrailerPrice);
                               list.add(param);
                               this.localTrailerPrice =
                             (java.lang.String[])list.toArray(
                            new java.lang.String[list.size()]);

                             }
                             

                        /**
                        * field for Vendor
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.Vendor_type1 localVendor ;
                                
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
                           * @return com.sabre.webservices.sabrexml._2011._10.Vendor_type1
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.Vendor_type1 getVendor(){
                               return localVendor;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Vendor
                               */
                               public void setVendor(com.sabre.webservices.sabrexml._2011._10.Vendor_type1 param){
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
                           namespacePrefix+":Cruise_type0",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "Cruise_type0",
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
                                     if (localBerthTracker){
                             if (localBerth!=null) {
                                   namespace = "http://webservices.sabre.com/sabreXML/2011/10";
                                   for (int i = 0;i < localBerth.length;i++){
                                        
                                            if (localBerth[i] != null){
                                        
                                                writeStartElement(null, namespace, "Berth", xmlWriter);

                                            
                                                        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBerth[i]));
                                                    
                                                xmlWriter.writeEndElement();
                                              
                                                } else {
                                                   
                                                           // we have to do nothing since minOccurs is zero
                                                       
                                                }

                                   }
                             } else {
                                 
                                         throw new org.apache.axis2.databinding.ADBException("Berth cannot be null!!");
                                    
                             }

                        } if (localCabinTracker){
                             if (localCabin!=null) {
                                   namespace = "http://webservices.sabre.com/sabreXML/2011/10";
                                   for (int i = 0;i < localCabin.length;i++){
                                        
                                            if (localCabin[i] != null){
                                        
                                                writeStartElement(null, namespace, "Cabin", xmlWriter);

                                            
                                                        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCabin[i]));
                                                    
                                                xmlWriter.writeEndElement();
                                              
                                                } else {
                                                   
                                                           // we have to do nothing since minOccurs is zero
                                                       
                                                }

                                   }
                             } else {
                                 
                                         throw new org.apache.axis2.databinding.ADBException("Cabin cannot be null!!");
                                    
                             }

                        } if (localCarRateTracker){
                             if (localCarRate!=null) {
                                   namespace = "http://webservices.sabre.com/sabreXML/2011/10";
                                   for (int i = 0;i < localCarRate.length;i++){
                                        
                                            if (localCarRate[i] != null){
                                        
                                                writeStartElement(null, namespace, "CarRate", xmlWriter);

                                            
                                                        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCarRate[i]));
                                                    
                                                xmlWriter.writeEndElement();
                                              
                                                } else {
                                                   
                                                           // we have to do nothing since minOccurs is zero
                                                       
                                                }

                                   }
                             } else {
                                 
                                         throw new org.apache.axis2.databinding.ADBException("CarRate cannot be null!!");
                                    
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

                        } if (localDestinationLocationTracker){
                                            if (localDestinationLocation==null){
                                                 throw new org.apache.axis2.databinding.ADBException("DestinationLocation cannot be null!!");
                                            }
                                           localDestinationLocation.serialize(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","DestinationLocation"),
                                               xmlWriter);
                                        } if (localOriginLocationTracker){
                                            if (localOriginLocation==null){
                                                 throw new org.apache.axis2.databinding.ADBException("OriginLocation cannot be null!!");
                                            }
                                           localOriginLocation.serialize(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","OriginLocation"),
                                               xmlWriter);
                                        } if (localPassengerTracker){
                             if (localPassenger!=null) {
                                   namespace = "http://webservices.sabre.com/sabreXML/2011/10";
                                   for (int i = 0;i < localPassenger.length;i++){
                                        
                                            if (localPassenger[i] != null){
                                        
                                                writeStartElement(null, namespace, "Passenger", xmlWriter);

                                            
                                                        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPassenger[i]));
                                                    
                                                xmlWriter.writeEndElement();
                                              
                                                } else {
                                                   
                                                           // we have to do nothing since minOccurs is zero
                                                       
                                                }

                                   }
                             } else {
                                 
                                         throw new org.apache.axis2.databinding.ADBException("Passenger cannot be null!!");
                                    
                             }

                        } if (localSeatTracker){
                             if (localSeat!=null) {
                                   namespace = "http://webservices.sabre.com/sabreXML/2011/10";
                                   for (int i = 0;i < localSeat.length;i++){
                                        
                                            if (localSeat[i] != null){
                                        
                                                writeStartElement(null, namespace, "Seat", xmlWriter);

                                            
                                                        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSeat[i]));
                                                    
                                                xmlWriter.writeEndElement();
                                              
                                                } else {
                                                   
                                                           // we have to do nothing since minOccurs is zero
                                                       
                                                }

                                   }
                             } else {
                                 
                                         throw new org.apache.axis2.databinding.ADBException("Seat cannot be null!!");
                                    
                             }

                        } if (localServiceInformationTracker){
                                            if (localServiceInformation==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ServiceInformation cannot be null!!");
                                            }
                                           localServiceInformation.serialize(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","ServiceInformation"),
                                               xmlWriter);
                                        } if (localShipNameTracker){
                             if (localShipName!=null) {
                                   namespace = "http://webservices.sabre.com/sabreXML/2011/10";
                                   for (int i = 0;i < localShipName.length;i++){
                                        
                                            if (localShipName[i] != null){
                                        
                                                writeStartElement(null, namespace, "ShipName", xmlWriter);

                                            
                                                        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localShipName[i]));
                                                    
                                                xmlWriter.writeEndElement();
                                              
                                                } else {
                                                   
                                                           // we have to do nothing since minOccurs is zero
                                                       
                                                }

                                   }
                             } else {
                                 
                                         throw new org.apache.axis2.databinding.ADBException("ShipName cannot be null!!");
                                    
                             }

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

                        } if (localTotalFareTracker){
                             if (localTotalFare!=null) {
                                   namespace = "http://webservices.sabre.com/sabreXML/2011/10";
                                   for (int i = 0;i < localTotalFare.length;i++){
                                        
                                            if (localTotalFare[i] != null){
                                        
                                                writeStartElement(null, namespace, "TotalFare", xmlWriter);

                                            
                                                        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTotalFare[i]));
                                                    
                                                xmlWriter.writeEndElement();
                                              
                                                } else {
                                                   
                                                           // we have to do nothing since minOccurs is zero
                                                       
                                                }

                                   }
                             } else {
                                 
                                         throw new org.apache.axis2.databinding.ADBException("TotalFare cannot be null!!");
                                    
                             }

                        } if (localTrailerPriceTracker){
                             if (localTrailerPrice!=null) {
                                   namespace = "http://webservices.sabre.com/sabreXML/2011/10";
                                   for (int i = 0;i < localTrailerPrice.length;i++){
                                        
                                            if (localTrailerPrice[i] != null){
                                        
                                                writeStartElement(null, namespace, "TrailerPrice", xmlWriter);

                                            
                                                        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTrailerPrice[i]));
                                                    
                                                xmlWriter.writeEndElement();
                                              
                                                } else {
                                                   
                                                           // we have to do nothing since minOccurs is zero
                                                       
                                                }

                                   }
                             } else {
                                 
                                         throw new org.apache.axis2.databinding.ADBException("TrailerPrice cannot be null!!");
                                    
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

                 if (localBerthTracker){
                            if (localBerth!=null){
                                  for (int i = 0;i < localBerth.length;i++){
                                      
                                         if (localBerth[i] != null){
                                          elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                              "Berth"));
                                          elementList.add(
                                          org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBerth[i]));
                                          } else {
                                             
                                                    // have to do nothing
                                                
                                          }
                                      

                                  }
                            } else {
                              
                                    throw new org.apache.axis2.databinding.ADBException("Berth cannot be null!!");
                                
                            }

                        } if (localCabinTracker){
                            if (localCabin!=null){
                                  for (int i = 0;i < localCabin.length;i++){
                                      
                                         if (localCabin[i] != null){
                                          elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                              "Cabin"));
                                          elementList.add(
                                          org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCabin[i]));
                                          } else {
                                             
                                                    // have to do nothing
                                                
                                          }
                                      

                                  }
                            } else {
                              
                                    throw new org.apache.axis2.databinding.ADBException("Cabin cannot be null!!");
                                
                            }

                        } if (localCarRateTracker){
                            if (localCarRate!=null){
                                  for (int i = 0;i < localCarRate.length;i++){
                                      
                                         if (localCarRate[i] != null){
                                          elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                              "CarRate"));
                                          elementList.add(
                                          org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCarRate[i]));
                                          } else {
                                             
                                                    // have to do nothing
                                                
                                          }
                                      

                                  }
                            } else {
                              
                                    throw new org.apache.axis2.databinding.ADBException("CarRate cannot be null!!");
                                
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

                        } if (localDestinationLocationTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                      "DestinationLocation"));
                            
                            
                                    if (localDestinationLocation==null){
                                         throw new org.apache.axis2.databinding.ADBException("DestinationLocation cannot be null!!");
                                    }
                                    elementList.add(localDestinationLocation);
                                } if (localOriginLocationTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                      "OriginLocation"));
                            
                            
                                    if (localOriginLocation==null){
                                         throw new org.apache.axis2.databinding.ADBException("OriginLocation cannot be null!!");
                                    }
                                    elementList.add(localOriginLocation);
                                } if (localPassengerTracker){
                            if (localPassenger!=null){
                                  for (int i = 0;i < localPassenger.length;i++){
                                      
                                         if (localPassenger[i] != null){
                                          elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                              "Passenger"));
                                          elementList.add(
                                          org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPassenger[i]));
                                          } else {
                                             
                                                    // have to do nothing
                                                
                                          }
                                      

                                  }
                            } else {
                              
                                    throw new org.apache.axis2.databinding.ADBException("Passenger cannot be null!!");
                                
                            }

                        } if (localSeatTracker){
                            if (localSeat!=null){
                                  for (int i = 0;i < localSeat.length;i++){
                                      
                                         if (localSeat[i] != null){
                                          elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                              "Seat"));
                                          elementList.add(
                                          org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSeat[i]));
                                          } else {
                                             
                                                    // have to do nothing
                                                
                                          }
                                      

                                  }
                            } else {
                              
                                    throw new org.apache.axis2.databinding.ADBException("Seat cannot be null!!");
                                
                            }

                        } if (localServiceInformationTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                      "ServiceInformation"));
                            
                            
                                    if (localServiceInformation==null){
                                         throw new org.apache.axis2.databinding.ADBException("ServiceInformation cannot be null!!");
                                    }
                                    elementList.add(localServiceInformation);
                                } if (localShipNameTracker){
                            if (localShipName!=null){
                                  for (int i = 0;i < localShipName.length;i++){
                                      
                                         if (localShipName[i] != null){
                                          elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                              "ShipName"));
                                          elementList.add(
                                          org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localShipName[i]));
                                          } else {
                                             
                                                    // have to do nothing
                                                
                                          }
                                      

                                  }
                            } else {
                              
                                    throw new org.apache.axis2.databinding.ADBException("ShipName cannot be null!!");
                                
                            }

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

                        } if (localTotalFareTracker){
                            if (localTotalFare!=null){
                                  for (int i = 0;i < localTotalFare.length;i++){
                                      
                                         if (localTotalFare[i] != null){
                                          elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                              "TotalFare"));
                                          elementList.add(
                                          org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTotalFare[i]));
                                          } else {
                                             
                                                    // have to do nothing
                                                
                                          }
                                      

                                  }
                            } else {
                              
                                    throw new org.apache.axis2.databinding.ADBException("TotalFare cannot be null!!");
                                
                            }

                        } if (localTrailerPriceTracker){
                            if (localTrailerPrice!=null){
                                  for (int i = 0;i < localTrailerPrice.length;i++){
                                      
                                         if (localTrailerPrice[i] != null){
                                          elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                              "TrailerPrice"));
                                          elementList.add(
                                          org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTrailerPrice[i]));
                                          } else {
                                             
                                                    // have to do nothing
                                                
                                          }
                                      

                                  }
                            } else {
                              
                                    throw new org.apache.axis2.databinding.ADBException("TrailerPrice cannot be null!!");
                                
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
        public static Cruise_type0 parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            Cruise_type0 object =
                new Cruise_type0();

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
                    
                            if (!"Cruise_type0".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (Cruise_type0)org.xmlsoap.schemas.soap.envelope.ExtensionMapper.getTypeObject(
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
                    
                        java.util.ArrayList list2 = new java.util.ArrayList();
                    
                        java.util.ArrayList list3 = new java.util.ArrayList();
                    
                        java.util.ArrayList list4 = new java.util.ArrayList();
                    
                        java.util.ArrayList list7 = new java.util.ArrayList();
                    
                        java.util.ArrayList list8 = new java.util.ArrayList();
                    
                        java.util.ArrayList list10 = new java.util.ArrayList();
                    
                        java.util.ArrayList list11 = new java.util.ArrayList();
                    
                        java.util.ArrayList list12 = new java.util.ArrayList();
                    
                        java.util.ArrayList list13 = new java.util.ArrayList();
                    
                        java.util.ArrayList list14 = new java.util.ArrayList();
                    
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","Berth").equals(reader.getName())){
                                
                                    
                                    
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
                                                    if (new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","Berth").equals(reader.getName())){
                                                         list1.add(reader.getElementText());
                                                        
                                                    }else{
                                                        loopDone1 = true;
                                                    }
                                                }
                                            }
                                            // call the converter utility  to convert and set the array
                                            
                                                    object.setBerth((java.lang.String[])
                                                        list1.toArray(new java.lang.String[list1.size()]));
                                                
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","Cabin").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list2.add(reader.getElementText());
                                            
                                            //loop until we find a start element that is not part of this array
                                            boolean loopDone2 = false;
                                            while(!loopDone2){
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
                                                    loopDone2 = true;
                                                } else {
                                                    if (new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","Cabin").equals(reader.getName())){
                                                         list2.add(reader.getElementText());
                                                        
                                                    }else{
                                                        loopDone2 = true;
                                                    }
                                                }
                                            }
                                            // call the converter utility  to convert and set the array
                                            
                                                    object.setCabin((java.lang.String[])
                                                        list2.toArray(new java.lang.String[list2.size()]));
                                                
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","CarRate").equals(reader.getName())){
                                
                                    
                                    
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
                                                    if (new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","CarRate").equals(reader.getName())){
                                                         list3.add(reader.getElementText());
                                                        
                                                    }else{
                                                        loopDone3 = true;
                                                    }
                                                }
                                            }
                                            // call the converter utility  to convert and set the array
                                            
                                                    object.setCarRate((java.lang.String[])
                                                        list3.toArray(new java.lang.String[list3.size()]));
                                                
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","ConfirmationNumber").equals(reader.getName())){
                                
                                    
                                    
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
                                                    if (new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","ConfirmationNumber").equals(reader.getName())){
                                                         list4.add(reader.getElementText());
                                                        
                                                    }else{
                                                        loopDone4 = true;
                                                    }
                                                }
                                            }
                                            // call the converter utility  to convert and set the array
                                            
                                                    object.setConfirmationNumber((java.lang.String[])
                                                        list4.toArray(new java.lang.String[list4.size()]));
                                                
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","DestinationLocation").equals(reader.getName())){
                                
                                                object.setDestinationLocation(com.sabre.webservices.sabrexml._2011._10.DestinationLocation_type1.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","OriginLocation").equals(reader.getName())){
                                
                                                object.setOriginLocation(com.sabre.webservices.sabrexml._2011._10.OriginLocation_type3.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","Passenger").equals(reader.getName())){
                                
                                    
                                    
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
                                                    if (new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","Passenger").equals(reader.getName())){
                                                         list7.add(reader.getElementText());
                                                        
                                                    }else{
                                                        loopDone7 = true;
                                                    }
                                                }
                                            }
                                            // call the converter utility  to convert and set the array
                                            
                                                    object.setPassenger((java.lang.String[])
                                                        list7.toArray(new java.lang.String[list7.size()]));
                                                
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","Seat").equals(reader.getName())){
                                
                                    
                                    
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
                                                    if (new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","Seat").equals(reader.getName())){
                                                         list8.add(reader.getElementText());
                                                        
                                                    }else{
                                                        loopDone8 = true;
                                                    }
                                                }
                                            }
                                            // call the converter utility  to convert and set the array
                                            
                                                    object.setSeat((java.lang.String[])
                                                        list8.toArray(new java.lang.String[list8.size()]));
                                                
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","ServiceInformation").equals(reader.getName())){
                                
                                                object.setServiceInformation(com.sabre.webservices.sabrexml._2011._10.ServiceInformation_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","ShipName").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list10.add(reader.getElementText());
                                            
                                            //loop until we find a start element that is not part of this array
                                            boolean loopDone10 = false;
                                            while(!loopDone10){
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
                                                    loopDone10 = true;
                                                } else {
                                                    if (new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","ShipName").equals(reader.getName())){
                                                         list10.add(reader.getElementText());
                                                        
                                                    }else{
                                                        loopDone10 = true;
                                                    }
                                                }
                                            }
                                            // call the converter utility  to convert and set the array
                                            
                                                    object.setShipName((java.lang.String[])
                                                        list10.toArray(new java.lang.String[list10.size()]));
                                                
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","SpaceReserved").equals(reader.getName())){
                                
                                    
                                    
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
                                                    if (new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","SpaceReserved").equals(reader.getName())){
                                                         list11.add(reader.getElementText());
                                                        
                                                    }else{
                                                        loopDone11 = true;
                                                    }
                                                }
                                            }
                                            // call the converter utility  to convert and set the array
                                            
                                                    object.setSpaceReserved((java.lang.String[])
                                                        list11.toArray(new java.lang.String[list11.size()]));
                                                
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","Text").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list12.add(reader.getElementText());
                                            
                                            //loop until we find a start element that is not part of this array
                                            boolean loopDone12 = false;
                                            while(!loopDone12){
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
                                                    loopDone12 = true;
                                                } else {
                                                    if (new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","Text").equals(reader.getName())){
                                                         list12.add(reader.getElementText());
                                                        
                                                    }else{
                                                        loopDone12 = true;
                                                    }
                                                }
                                            }
                                            // call the converter utility  to convert and set the array
                                            
                                                    object.setText((java.lang.String[])
                                                        list12.toArray(new java.lang.String[list12.size()]));
                                                
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","TotalFare").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list13.add(reader.getElementText());
                                            
                                            //loop until we find a start element that is not part of this array
                                            boolean loopDone13 = false;
                                            while(!loopDone13){
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
                                                    loopDone13 = true;
                                                } else {
                                                    if (new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","TotalFare").equals(reader.getName())){
                                                         list13.add(reader.getElementText());
                                                        
                                                    }else{
                                                        loopDone13 = true;
                                                    }
                                                }
                                            }
                                            // call the converter utility  to convert and set the array
                                            
                                                    object.setTotalFare((java.lang.String[])
                                                        list13.toArray(new java.lang.String[list13.size()]));
                                                
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","TrailerPrice").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list14.add(reader.getElementText());
                                            
                                            //loop until we find a start element that is not part of this array
                                            boolean loopDone14 = false;
                                            while(!loopDone14){
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
                                                    loopDone14 = true;
                                                } else {
                                                    if (new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","TrailerPrice").equals(reader.getName())){
                                                         list14.add(reader.getElementText());
                                                        
                                                    }else{
                                                        loopDone14 = true;
                                                    }
                                                }
                                            }
                                            // call the converter utility  to convert and set the array
                                            
                                                    object.setTrailerPrice((java.lang.String[])
                                                        list14.toArray(new java.lang.String[list14.size()]));
                                                
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","Vendor").equals(reader.getName())){
                                
                                                object.setVendor(com.sabre.webservices.sabrexml._2011._10.Vendor_type1.Factory.parse(reader));
                                              
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
           
    