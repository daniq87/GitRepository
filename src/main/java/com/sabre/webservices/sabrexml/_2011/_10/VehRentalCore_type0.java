
/**
 * VehRentalCore_type0.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.sabre.webservices.sabrexml._2011._10;
            

            /**
            *  VehRentalCore_type0 bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class VehRentalCore_type0
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = VehRentalCore_type0
                Namespace URI = http://webservices.sabre.com/sabreXML/2011/10
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for DropOffLocationDetails
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.DropOffLocationDetails_type0 localDropOffLocationDetails ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDropOffLocationDetailsTracker = false ;

                           public boolean isDropOffLocationDetailsSpecified(){
                               return localDropOffLocationDetailsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.sabre.webservices.sabrexml._2011._10.DropOffLocationDetails_type0
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.DropOffLocationDetails_type0 getDropOffLocationDetails(){
                               return localDropOffLocationDetails;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DropOffLocationDetails
                               */
                               public void setDropOffLocationDetails(com.sabre.webservices.sabrexml._2011._10.DropOffLocationDetails_type0 param){
                            localDropOffLocationDetailsTracker = param != null;
                                   
                                            this.localDropOffLocationDetails=param;
                                    

                               }
                            

                        /**
                        * field for FlightSegment
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.FlightSegment_type5 localFlightSegment ;
                                
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
                           * @return com.sabre.webservices.sabrexml._2011._10.FlightSegment_type5
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.FlightSegment_type5 getFlightSegment(){
                               return localFlightSegment;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param FlightSegment
                               */
                               public void setFlightSegment(com.sabre.webservices.sabrexml._2011._10.FlightSegment_type5 param){
                            localFlightSegmentTracker = param != null;
                                   
                                            this.localFlightSegment=param;
                                    

                               }
                            

                        /**
                        * field for LocationDetails
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.LocationDetails_type0 localLocationDetails ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLocationDetailsTracker = false ;

                           public boolean isLocationDetailsSpecified(){
                               return localLocationDetailsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.sabre.webservices.sabrexml._2011._10.LocationDetails_type0
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.LocationDetails_type0 getLocationDetails(){
                               return localLocationDetails;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param LocationDetails
                               */
                               public void setLocationDetails(com.sabre.webservices.sabrexml._2011._10.LocationDetails_type0 param){
                            localLocationDetailsTracker = param != null;
                                   
                                            this.localLocationDetails=param;
                                    

                               }
                            

                        /**
                        * field for PickUpDateTime
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localPickUpDateTime ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPickUpDateTime(){
                               return localPickUpDateTime;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PickUpDateTime
                               */
                               public void setPickUpDateTime(java.lang.String param){
                            
                                            this.localPickUpDateTime=param;
                                    

                               }
                            

                        /**
                        * field for PickUpDay
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localPickUpDay ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPickUpDay(){
                               return localPickUpDay;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PickUpDay
                               */
                               public void setPickUpDay(java.lang.String param){
                            
                                            this.localPickUpDay=param;
                                    

                               }
                            

                        /**
                        * field for ReturnDateTime
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localReturnDateTime ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getReturnDateTime(){
                               return localReturnDateTime;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ReturnDateTime
                               */
                               public void setReturnDateTime(java.lang.String param){
                            
                                            this.localReturnDateTime=param;
                                    

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
                           namespacePrefix+":VehRentalCore_type0",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "VehRentalCore_type0",
                           xmlWriter);
                   }

               
                   }
               
                                            if (localPickUpDateTime != null){
                                        
                                                writeAttribute("",
                                                         "PickUpDateTime",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPickUpDateTime), xmlWriter);

                                            
                                      }
                                    
                                            if (localPickUpDay != null){
                                        
                                                writeAttribute("",
                                                         "PickUpDay",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPickUpDay), xmlWriter);

                                            
                                      }
                                    
                                            if (localReturnDateTime != null){
                                        
                                                writeAttribute("",
                                                         "ReturnDateTime",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReturnDateTime), xmlWriter);

                                            
                                      }
                                     if (localDropOffLocationDetailsTracker){
                                            if (localDropOffLocationDetails==null){
                                                 throw new org.apache.axis2.databinding.ADBException("DropOffLocationDetails cannot be null!!");
                                            }
                                           localDropOffLocationDetails.serialize(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","DropOffLocationDetails"),
                                               xmlWriter);
                                        } if (localFlightSegmentTracker){
                                            if (localFlightSegment==null){
                                                 throw new org.apache.axis2.databinding.ADBException("FlightSegment cannot be null!!");
                                            }
                                           localFlightSegment.serialize(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","FlightSegment"),
                                               xmlWriter);
                                        } if (localLocationDetailsTracker){
                                            if (localLocationDetails==null){
                                                 throw new org.apache.axis2.databinding.ADBException("LocationDetails cannot be null!!");
                                            }
                                           localLocationDetails.serialize(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","LocationDetails"),
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

                 if (localDropOffLocationDetailsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                      "DropOffLocationDetails"));
                            
                            
                                    if (localDropOffLocationDetails==null){
                                         throw new org.apache.axis2.databinding.ADBException("DropOffLocationDetails cannot be null!!");
                                    }
                                    elementList.add(localDropOffLocationDetails);
                                } if (localFlightSegmentTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                      "FlightSegment"));
                            
                            
                                    if (localFlightSegment==null){
                                         throw new org.apache.axis2.databinding.ADBException("FlightSegment cannot be null!!");
                                    }
                                    elementList.add(localFlightSegment);
                                } if (localLocationDetailsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                      "LocationDetails"));
                            
                            
                                    if (localLocationDetails==null){
                                         throw new org.apache.axis2.databinding.ADBException("LocationDetails cannot be null!!");
                                    }
                                    elementList.add(localLocationDetails);
                                }
                            attribList.add(
                            new javax.xml.namespace.QName("","PickUpDateTime"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPickUpDateTime));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","PickUpDay"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPickUpDay));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","ReturnDateTime"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReturnDateTime));
                                

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
        public static VehRentalCore_type0 parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            VehRentalCore_type0 object =
                new VehRentalCore_type0();

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
                    
                            if (!"VehRentalCore_type0".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (VehRentalCore_type0)org.xmlsoap.schemas.soap.envelope.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    // handle attribute "PickUpDateTime"
                    java.lang.String tempAttribPickUpDateTime =
                        
                                reader.getAttributeValue(null,"PickUpDateTime");
                            
                   if (tempAttribPickUpDateTime!=null){
                         java.lang.String content = tempAttribPickUpDateTime;
                        
                                                 object.setPickUpDateTime(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribPickUpDateTime));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("PickUpDateTime");
                    
                    // handle attribute "PickUpDay"
                    java.lang.String tempAttribPickUpDay =
                        
                                reader.getAttributeValue(null,"PickUpDay");
                            
                   if (tempAttribPickUpDay!=null){
                         java.lang.String content = tempAttribPickUpDay;
                        
                                                 object.setPickUpDay(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribPickUpDay));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("PickUpDay");
                    
                    // handle attribute "ReturnDateTime"
                    java.lang.String tempAttribReturnDateTime =
                        
                                reader.getAttributeValue(null,"ReturnDateTime");
                            
                   if (tempAttribReturnDateTime!=null){
                         java.lang.String content = tempAttribReturnDateTime;
                        
                                                 object.setReturnDateTime(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribReturnDateTime));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("ReturnDateTime");
                    
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","DropOffLocationDetails").equals(reader.getName())){
                                
                                                object.setDropOffLocationDetails(com.sabre.webservices.sabrexml._2011._10.DropOffLocationDetails_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","FlightSegment").equals(reader.getName())){
                                
                                                object.setFlightSegment(com.sabre.webservices.sabrexml._2011._10.FlightSegment_type5.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","LocationDetails").equals(reader.getName())){
                                
                                                object.setLocationDetails(com.sabre.webservices.sabrexml._2011._10.LocationDetails_type0.Factory.parse(reader));
                                              
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
           
    