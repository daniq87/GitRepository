
/**
 * Item_type0.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.sabre.webservices.sabrexml._2011._10;
            

            /**
            *  Item_type0 bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class Item_type0
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = Item_type0
                Namespace URI = http://webservices.sabre.com/sabreXML/2011/10
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for AirTaxi
                        * This was an Array!
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.AirTaxi_type0[] localAirTaxi ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAirTaxiTracker = false ;

                           public boolean isAirTaxiSpecified(){
                               return localAirTaxiTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.sabre.webservices.sabrexml._2011._10.AirTaxi_type0[]
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.AirTaxi_type0[] getAirTaxi(){
                               return localAirTaxi;
                           }

                           
                        


                               
                              /**
                               * validate the array for AirTaxi
                               */
                              protected void validateAirTaxi(com.sabre.webservices.sabrexml._2011._10.AirTaxi_type0[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param AirTaxi
                              */
                              public void setAirTaxi(com.sabre.webservices.sabrexml._2011._10.AirTaxi_type0[] param){
                              
                                   validateAirTaxi(param);

                               localAirTaxiTracker = param != null;
                                      
                                      this.localAirTaxi=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.sabre.webservices.sabrexml._2011._10.AirTaxi_type0
                             */
                             public void addAirTaxi(com.sabre.webservices.sabrexml._2011._10.AirTaxi_type0 param){
                                   if (localAirTaxi == null){
                                   localAirTaxi = new com.sabre.webservices.sabrexml._2011._10.AirTaxi_type0[]{};
                                   }

                            
                                 //update the setting tracker
                                localAirTaxiTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localAirTaxi);
                               list.add(param);
                               this.localAirTaxi =
                             (com.sabre.webservices.sabrexml._2011._10.AirTaxi_type0[])list.toArray(
                            new com.sabre.webservices.sabrexml._2011._10.AirTaxi_type0[list.size()]);

                             }
                             

                        /**
                        * field for Arunk
                        * This was an Array!
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.Arunk_type0[] localArunk ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localArunkTracker = false ;

                           public boolean isArunkSpecified(){
                               return localArunkTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.sabre.webservices.sabrexml._2011._10.Arunk_type0[]
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.Arunk_type0[] getArunk(){
                               return localArunk;
                           }

                           
                        


                               
                              /**
                               * validate the array for Arunk
                               */
                              protected void validateArunk(com.sabre.webservices.sabrexml._2011._10.Arunk_type0[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param Arunk
                              */
                              public void setArunk(com.sabre.webservices.sabrexml._2011._10.Arunk_type0[] param){
                              
                                   validateArunk(param);

                               localArunkTracker = param != null;
                                      
                                      this.localArunk=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.sabre.webservices.sabrexml._2011._10.Arunk_type0
                             */
                             public void addArunk(com.sabre.webservices.sabrexml._2011._10.Arunk_type0 param){
                                   if (localArunk == null){
                                   localArunk = new com.sabre.webservices.sabrexml._2011._10.Arunk_type0[]{};
                                   }

                            
                                 //update the setting tracker
                                localArunkTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localArunk);
                               list.add(param);
                               this.localArunk =
                             (com.sabre.webservices.sabrexml._2011._10.Arunk_type0[])list.toArray(
                            new com.sabre.webservices.sabrexml._2011._10.Arunk_type0[list.size()]);

                             }
                             

                        /**
                        * field for Cruise
                        * This was an Array!
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.Cruise_type0[] localCruise ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCruiseTracker = false ;

                           public boolean isCruiseSpecified(){
                               return localCruiseTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.sabre.webservices.sabrexml._2011._10.Cruise_type0[]
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.Cruise_type0[] getCruise(){
                               return localCruise;
                           }

                           
                        


                               
                              /**
                               * validate the array for Cruise
                               */
                              protected void validateCruise(com.sabre.webservices.sabrexml._2011._10.Cruise_type0[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param Cruise
                              */
                              public void setCruise(com.sabre.webservices.sabrexml._2011._10.Cruise_type0[] param){
                              
                                   validateCruise(param);

                               localCruiseTracker = param != null;
                                      
                                      this.localCruise=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.sabre.webservices.sabrexml._2011._10.Cruise_type0
                             */
                             public void addCruise(com.sabre.webservices.sabrexml._2011._10.Cruise_type0 param){
                                   if (localCruise == null){
                                   localCruise = new com.sabre.webservices.sabrexml._2011._10.Cruise_type0[]{};
                                   }

                            
                                 //update the setting tracker
                                localCruiseTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localCruise);
                               list.add(param);
                               this.localCruise =
                             (com.sabre.webservices.sabrexml._2011._10.Cruise_type0[])list.toArray(
                            new com.sabre.webservices.sabrexml._2011._10.Cruise_type0[list.size()]);

                             }
                             

                        /**
                        * field for FlightSegment
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.FlightSegment_type2 localFlightSegment ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localFlightSegmentTracker = false ;

                           public boolean isFlightSegmentSpecified(){
                               return localFlightSegmentTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.sabre.webservices.sabrexml._2011._10.FlightSegment_type2
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.FlightSegment_type2 getFlightSegment(){
                               return localFlightSegment;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param FlightSegment
                               */
                               public void setFlightSegment(com.sabre.webservices.sabrexml._2011._10.FlightSegment_type2 param){
                            localFlightSegmentTracker = param != null;
                                   
                                            this.localFlightSegment=param;
                                    

                               }
                            

                        /**
                        * field for Hotel
                        * This was an Array!
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.Hotel_type0[] localHotel ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localHotelTracker = false ;

                           public boolean isHotelSpecified(){
                               return localHotelTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.sabre.webservices.sabrexml._2011._10.Hotel_type0[]
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.Hotel_type0[] getHotel(){
                               return localHotel;
                           }

                           
                        


                               
                              /**
                               * validate the array for Hotel
                               */
                              protected void validateHotel(com.sabre.webservices.sabrexml._2011._10.Hotel_type0[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param Hotel
                              */
                              public void setHotel(com.sabre.webservices.sabrexml._2011._10.Hotel_type0[] param){
                              
                                   validateHotel(param);

                               localHotelTracker = param != null;
                                      
                                      this.localHotel=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.sabre.webservices.sabrexml._2011._10.Hotel_type0
                             */
                             public void addHotel(com.sabre.webservices.sabrexml._2011._10.Hotel_type0 param){
                                   if (localHotel == null){
                                   localHotel = new com.sabre.webservices.sabrexml._2011._10.Hotel_type0[]{};
                                   }

                            
                                 //update the setting tracker
                                localHotelTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localHotel);
                               list.add(param);
                               this.localHotel =
                             (com.sabre.webservices.sabrexml._2011._10.Hotel_type0[])list.toArray(
                            new com.sabre.webservices.sabrexml._2011._10.Hotel_type0[list.size()]);

                             }
                             

                        /**
                        * field for Insurance
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.Insurance_type0 localInsurance ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localInsuranceTracker = false ;

                           public boolean isInsuranceSpecified(){
                               return localInsuranceTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.sabre.webservices.sabrexml._2011._10.Insurance_type0
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.Insurance_type0 getInsurance(){
                               return localInsurance;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Insurance
                               */
                               public void setInsurance(com.sabre.webservices.sabrexml._2011._10.Insurance_type0 param){
                            localInsuranceTracker = param != null;
                                   
                                            this.localInsurance=param;
                                    

                               }
                            

                        /**
                        * field for Misc
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.Misc_type0 localMisc ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMiscTracker = false ;

                           public boolean isMiscSpecified(){
                               return localMiscTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.sabre.webservices.sabrexml._2011._10.Misc_type0
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.Misc_type0 getMisc(){
                               return localMisc;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Misc
                               */
                               public void setMisc(com.sabre.webservices.sabrexml._2011._10.Misc_type0 param){
                            localMiscTracker = param != null;
                                   
                                            this.localMisc=param;
                                    

                               }
                            

                        /**
                        * field for Rail
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.Rail_type0 localRail ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRailTracker = false ;

                           public boolean isRailSpecified(){
                               return localRailTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.sabre.webservices.sabrexml._2011._10.Rail_type0
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.Rail_type0 getRail(){
                               return localRail;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Rail
                               */
                               public void setRail(com.sabre.webservices.sabrexml._2011._10.Rail_type0 param){
                            localRailTracker = param != null;
                                   
                                            this.localRail=param;
                                    

                               }
                            

                        /**
                        * field for Seats
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.Seats_type0 localSeats ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeatsTracker = false ;

                           public boolean isSeatsSpecified(){
                               return localSeatsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.sabre.webservices.sabrexml._2011._10.Seats_type0
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.Seats_type0 getSeats(){
                               return localSeats;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Seats
                               */
                               public void setSeats(com.sabre.webservices.sabrexml._2011._10.Seats_type0 param){
                            localSeatsTracker = param != null;
                                   
                                            this.localSeats=param;
                                    

                               }
                            

                        /**
                        * field for Surface
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.Surface_type0 localSurface ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSurfaceTracker = false ;

                           public boolean isSurfaceSpecified(){
                               return localSurfaceTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.sabre.webservices.sabrexml._2011._10.Surface_type0
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.Surface_type0 getSurface(){
                               return localSurface;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Surface
                               */
                               public void setSurface(com.sabre.webservices.sabrexml._2011._10.Surface_type0 param){
                            localSurfaceTracker = param != null;
                                   
                                            this.localSurface=param;
                                    

                               }
                            

                        /**
                        * field for Tour
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.Tour_type0 localTour ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTourTracker = false ;

                           public boolean isTourSpecified(){
                               return localTourTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.sabre.webservices.sabrexml._2011._10.Tour_type0
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.Tour_type0 getTour(){
                               return localTour;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Tour
                               */
                               public void setTour(com.sabre.webservices.sabrexml._2011._10.Tour_type0 param){
                            localTourTracker = param != null;
                                   
                                            this.localTour=param;
                                    

                               }
                            

                        /**
                        * field for Vehicle
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.Vehicle_type1 localVehicle ;
                                
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
                           * @return com.sabre.webservices.sabrexml._2011._10.Vehicle_type1
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.Vehicle_type1 getVehicle(){
                               return localVehicle;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Vehicle
                               */
                               public void setVehicle(com.sabre.webservices.sabrexml._2011._10.Vehicle_type1 param){
                            localVehicleTracker = param != null;
                                   
                                            this.localVehicle=param;
                                    

                               }
                            

                        /**
                        * field for RPH
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localRPH ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getRPH(){
                               return localRPH;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RPH
                               */
                               public void setRPH(java.lang.String param){
                            
                                            this.localRPH=param;
                                    

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
                           namespacePrefix+":Item_type0",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "Item_type0",
                           xmlWriter);
                   }

               
                   }
               
                                            if (localRPH != null){
                                        
                                                writeAttribute("",
                                                         "RPH",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRPH), xmlWriter);

                                            
                                      }
                                     if (localAirTaxiTracker){
                                       if (localAirTaxi!=null){
                                            for (int i = 0;i < localAirTaxi.length;i++){
                                                if (localAirTaxi[i] != null){
                                                 localAirTaxi[i].serialize(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","AirTaxi"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                        // we don't have to do any thing since minOccures is zero
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("AirTaxi cannot be null!!");
                                        
                                    }
                                 } if (localArunkTracker){
                                       if (localArunk!=null){
                                            for (int i = 0;i < localArunk.length;i++){
                                                if (localArunk[i] != null){
                                                 localArunk[i].serialize(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","Arunk"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                        // we don't have to do any thing since minOccures is zero
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("Arunk cannot be null!!");
                                        
                                    }
                                 } if (localCruiseTracker){
                                       if (localCruise!=null){
                                            for (int i = 0;i < localCruise.length;i++){
                                                if (localCruise[i] != null){
                                                 localCruise[i].serialize(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","Cruise"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                        // we don't have to do any thing since minOccures is zero
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("Cruise cannot be null!!");
                                        
                                    }
                                 } if (localFlightSegmentTracker){
                                            if (localFlightSegment==null){
                                                 throw new org.apache.axis2.databinding.ADBException("FlightSegment cannot be null!!");
                                            }
                                           localFlightSegment.serialize(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","FlightSegment"),
                                               xmlWriter);
                                        } if (localHotelTracker){
                                       if (localHotel!=null){
                                            for (int i = 0;i < localHotel.length;i++){
                                                if (localHotel[i] != null){
                                                 localHotel[i].serialize(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","Hotel"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                        // we don't have to do any thing since minOccures is zero
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("Hotel cannot be null!!");
                                        
                                    }
                                 } if (localInsuranceTracker){
                                            if (localInsurance==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Insurance cannot be null!!");
                                            }
                                           localInsurance.serialize(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","Insurance"),
                                               xmlWriter);
                                        } if (localMiscTracker){
                                            if (localMisc==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Misc cannot be null!!");
                                            }
                                           localMisc.serialize(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","Misc"),
                                               xmlWriter);
                                        } if (localRailTracker){
                                            if (localRail==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Rail cannot be null!!");
                                            }
                                           localRail.serialize(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","Rail"),
                                               xmlWriter);
                                        } if (localSeatsTracker){
                                            if (localSeats==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Seats cannot be null!!");
                                            }
                                           localSeats.serialize(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","Seats"),
                                               xmlWriter);
                                        } if (localSurfaceTracker){
                                            if (localSurface==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Surface cannot be null!!");
                                            }
                                           localSurface.serialize(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","Surface"),
                                               xmlWriter);
                                        } if (localTourTracker){
                                            if (localTour==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Tour cannot be null!!");
                                            }
                                           localTour.serialize(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","Tour"),
                                               xmlWriter);
                                        } if (localVehicleTracker){
                                            if (localVehicle==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Vehicle cannot be null!!");
                                            }
                                           localVehicle.serialize(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","Vehicle"),
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

                 if (localAirTaxiTracker){
                             if (localAirTaxi!=null) {
                                 for (int i = 0;i < localAirTaxi.length;i++){

                                    if (localAirTaxi[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                          "AirTaxi"));
                                         elementList.add(localAirTaxi[i]);
                                    } else {
                                        
                                                // nothing to do
                                            
                                    }

                                 }
                             } else {
                                 
                                        throw new org.apache.axis2.databinding.ADBException("AirTaxi cannot be null!!");
                                    
                             }

                        } if (localArunkTracker){
                             if (localArunk!=null) {
                                 for (int i = 0;i < localArunk.length;i++){

                                    if (localArunk[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                          "Arunk"));
                                         elementList.add(localArunk[i]);
                                    } else {
                                        
                                                // nothing to do
                                            
                                    }

                                 }
                             } else {
                                 
                                        throw new org.apache.axis2.databinding.ADBException("Arunk cannot be null!!");
                                    
                             }

                        } if (localCruiseTracker){
                             if (localCruise!=null) {
                                 for (int i = 0;i < localCruise.length;i++){

                                    if (localCruise[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                          "Cruise"));
                                         elementList.add(localCruise[i]);
                                    } else {
                                        
                                                // nothing to do
                                            
                                    }

                                 }
                             } else {
                                 
                                        throw new org.apache.axis2.databinding.ADBException("Cruise cannot be null!!");
                                    
                             }

                        } if (localFlightSegmentTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                      "FlightSegment"));
                            
                            
                                    if (localFlightSegment==null){
                                         throw new org.apache.axis2.databinding.ADBException("FlightSegment cannot be null!!");
                                    }
                                    elementList.add(localFlightSegment);
                                } if (localHotelTracker){
                             if (localHotel!=null) {
                                 for (int i = 0;i < localHotel.length;i++){

                                    if (localHotel[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                          "Hotel"));
                                         elementList.add(localHotel[i]);
                                    } else {
                                        
                                                // nothing to do
                                            
                                    }

                                 }
                             } else {
                                 
                                        throw new org.apache.axis2.databinding.ADBException("Hotel cannot be null!!");
                                    
                             }

                        } if (localInsuranceTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                      "Insurance"));
                            
                            
                                    if (localInsurance==null){
                                         throw new org.apache.axis2.databinding.ADBException("Insurance cannot be null!!");
                                    }
                                    elementList.add(localInsurance);
                                } if (localMiscTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                      "Misc"));
                            
                            
                                    if (localMisc==null){
                                         throw new org.apache.axis2.databinding.ADBException("Misc cannot be null!!");
                                    }
                                    elementList.add(localMisc);
                                } if (localRailTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                      "Rail"));
                            
                            
                                    if (localRail==null){
                                         throw new org.apache.axis2.databinding.ADBException("Rail cannot be null!!");
                                    }
                                    elementList.add(localRail);
                                } if (localSeatsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                      "Seats"));
                            
                            
                                    if (localSeats==null){
                                         throw new org.apache.axis2.databinding.ADBException("Seats cannot be null!!");
                                    }
                                    elementList.add(localSeats);
                                } if (localSurfaceTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                      "Surface"));
                            
                            
                                    if (localSurface==null){
                                         throw new org.apache.axis2.databinding.ADBException("Surface cannot be null!!");
                                    }
                                    elementList.add(localSurface);
                                } if (localTourTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                      "Tour"));
                            
                            
                                    if (localTour==null){
                                         throw new org.apache.axis2.databinding.ADBException("Tour cannot be null!!");
                                    }
                                    elementList.add(localTour);
                                } if (localVehicleTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                      "Vehicle"));
                            
                            
                                    if (localVehicle==null){
                                         throw new org.apache.axis2.databinding.ADBException("Vehicle cannot be null!!");
                                    }
                                    elementList.add(localVehicle);
                                }
                            attribList.add(
                            new javax.xml.namespace.QName("","RPH"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRPH));
                                

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
        public static Item_type0 parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            Item_type0 object =
                new Item_type0();

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
                    
                            if (!"Item_type0".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (Item_type0)org.xmlsoap.schemas.soap.envelope.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    // handle attribute "RPH"
                    java.lang.String tempAttribRPH =
                        
                                reader.getAttributeValue(null,"RPH");
                            
                   if (tempAttribRPH!=null){
                         java.lang.String content = tempAttribRPH;
                        
                                                 object.setRPH(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribRPH));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("RPH");
                    
                    
                    reader.next();
                
                        java.util.ArrayList list1 = new java.util.ArrayList();
                    
                        java.util.ArrayList list2 = new java.util.ArrayList();
                    
                        java.util.ArrayList list3 = new java.util.ArrayList();
                    
                        java.util.ArrayList list5 = new java.util.ArrayList();
                    
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","AirTaxi").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list1.add(com.sabre.webservices.sabrexml._2011._10.AirTaxi_type0.Factory.parse(reader));
                                                                
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
                                                                if (new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","AirTaxi").equals(reader.getName())){
                                                                    list1.add(com.sabre.webservices.sabrexml._2011._10.AirTaxi_type0.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone1 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setAirTaxi((com.sabre.webservices.sabrexml._2011._10.AirTaxi_type0[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.sabre.webservices.sabrexml._2011._10.AirTaxi_type0.class,
                                                                list1));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","Arunk").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list2.add(com.sabre.webservices.sabrexml._2011._10.Arunk_type0.Factory.parse(reader));
                                                                
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
                                                                if (new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","Arunk").equals(reader.getName())){
                                                                    list2.add(com.sabre.webservices.sabrexml._2011._10.Arunk_type0.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone2 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setArunk((com.sabre.webservices.sabrexml._2011._10.Arunk_type0[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.sabre.webservices.sabrexml._2011._10.Arunk_type0.class,
                                                                list2));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","Cruise").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list3.add(com.sabre.webservices.sabrexml._2011._10.Cruise_type0.Factory.parse(reader));
                                                                
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
                                                                if (new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","Cruise").equals(reader.getName())){
                                                                    list3.add(com.sabre.webservices.sabrexml._2011._10.Cruise_type0.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone3 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setCruise((com.sabre.webservices.sabrexml._2011._10.Cruise_type0[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.sabre.webservices.sabrexml._2011._10.Cruise_type0.class,
                                                                list3));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","FlightSegment").equals(reader.getName())){
                                
                                                object.setFlightSegment(com.sabre.webservices.sabrexml._2011._10.FlightSegment_type2.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","Hotel").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list5.add(com.sabre.webservices.sabrexml._2011._10.Hotel_type0.Factory.parse(reader));
                                                                
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone5 = false;
                                                        while(!loopDone5){
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
                                                                loopDone5 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","Hotel").equals(reader.getName())){
                                                                    list5.add(com.sabre.webservices.sabrexml._2011._10.Hotel_type0.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone5 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setHotel((com.sabre.webservices.sabrexml._2011._10.Hotel_type0[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.sabre.webservices.sabrexml._2011._10.Hotel_type0.class,
                                                                list5));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","Insurance").equals(reader.getName())){
                                
                                                object.setInsurance(com.sabre.webservices.sabrexml._2011._10.Insurance_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","Misc").equals(reader.getName())){
                                
                                                object.setMisc(com.sabre.webservices.sabrexml._2011._10.Misc_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","Rail").equals(reader.getName())){
                                
                                                object.setRail(com.sabre.webservices.sabrexml._2011._10.Rail_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","Seats").equals(reader.getName())){
                                
                                                object.setSeats(com.sabre.webservices.sabrexml._2011._10.Seats_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","Surface").equals(reader.getName())){
                                
                                                object.setSurface(com.sabre.webservices.sabrexml._2011._10.Surface_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","Tour").equals(reader.getName())){
                                
                                                object.setTour(com.sabre.webservices.sabrexml._2011._10.Tour_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","Vehicle").equals(reader.getName())){
                                
                                                object.setVehicle(com.sabre.webservices.sabrexml._2011._10.Vehicle_type1.Factory.parse(reader));
                                              
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
           
    