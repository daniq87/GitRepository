
/**
 * Seat_type0.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.sabre.webservices.sabrexml._2011._10;
            

            /**
            *  Seat_type0 bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class Seat_type0
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = Seat_type0
                Namespace URI = http://webservices.sabre.com/sabreXML/2011/10
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for FlightSegment
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.FlightSegment_type3 localFlightSegment ;
                                
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
                           * @return com.sabre.webservices.sabrexml._2011._10.FlightSegment_type3
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.FlightSegment_type3 getFlightSegment(){
                               return localFlightSegment;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param FlightSegment
                               */
                               public void setFlightSegment(com.sabre.webservices.sabrexml._2011._10.FlightSegment_type3 param){
                            localFlightSegmentTracker = param != null;
                                   
                                            this.localFlightSegment=param;
                                    

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
                        * field for NameNumber
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localNameNumber ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getNameNumber(){
                               return localNameNumber;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NameNumber
                               */
                               public void setNameNumber(java.lang.String param){
                            
                                            this.localNameNumber=param;
                                    

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
                        * field for SegmentStatus
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localSegmentStatus ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSegmentStatus(){
                               return localSegmentStatus;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SegmentStatus
                               */
                               public void setSegmentStatus(java.lang.String param){
                            
                                            this.localSegmentStatus=param;
                                    

                               }
                            

                        /**
                        * field for SmokingPreference
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localSmokingPreference ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSmokingPreference(){
                               return localSmokingPreference;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SmokingPreference
                               */
                               public void setSmokingPreference(java.lang.String param){
                            
                                            this.localSmokingPreference=param;
                                    

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
                        * field for TypeTwo
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localTypeTwo ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getTypeTwo(){
                               return localTypeTwo;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TypeTwo
                               */
                               public void setTypeTwo(java.lang.String param){
                            
                                            this.localTypeTwo=param;
                                    

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
                           namespacePrefix+":Seat_type0",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "Seat_type0",
                           xmlWriter);
                   }

               
                   }
               
                                            if (localChanged != null){
                                        
                                                writeAttribute("",
                                                         "Changed",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localChanged), xmlWriter);

                                            
                                      }
                                    
                                            if (localNameNumber != null){
                                        
                                                writeAttribute("",
                                                         "NameNumber",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNameNumber), xmlWriter);

                                            
                                      }
                                    
                                            if (localNumber != null){
                                        
                                                writeAttribute("",
                                                         "Number",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumber), xmlWriter);

                                            
                                      }
                                    
                                            if (localSegmentNumber != null){
                                        
                                                writeAttribute("",
                                                         "SegmentNumber",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSegmentNumber), xmlWriter);

                                            
                                      }
                                    
                                            if (localSegmentStatus != null){
                                        
                                                writeAttribute("",
                                                         "SegmentStatus",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSegmentStatus), xmlWriter);

                                            
                                      }
                                    
                                            if (localSmokingPreference != null){
                                        
                                                writeAttribute("",
                                                         "SmokingPreference",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSmokingPreference), xmlWriter);

                                            
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
                                    
                                            if (localTypeTwo != null){
                                        
                                                writeAttribute("",
                                                         "TypeTwo",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTypeTwo), xmlWriter);

                                            
                                      }
                                     if (localFlightSegmentTracker){
                                            if (localFlightSegment==null){
                                                 throw new org.apache.axis2.databinding.ADBException("FlightSegment cannot be null!!");
                                            }
                                           localFlightSegment.serialize(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","FlightSegment"),
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

                 if (localFlightSegmentTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                      "FlightSegment"));
                            
                            
                                    if (localFlightSegment==null){
                                         throw new org.apache.axis2.databinding.ADBException("FlightSegment cannot be null!!");
                                    }
                                    elementList.add(localFlightSegment);
                                }
                            attribList.add(
                            new javax.xml.namespace.QName("","Changed"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localChanged));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","NameNumber"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNameNumber));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","Number"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumber));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","SegmentNumber"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSegmentNumber));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","SegmentStatus"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSegmentStatus));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","SmokingPreference"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSmokingPreference));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","Status"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStatus));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","Type"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localType));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","TypeTwo"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTypeTwo));
                                

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
        public static Seat_type0 parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            Seat_type0 object =
                new Seat_type0();

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
                    
                            if (!"Seat_type0".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (Seat_type0)org.xmlsoap.schemas.soap.envelope.ExtensionMapper.getTypeObject(
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
                    
                    // handle attribute "NameNumber"
                    java.lang.String tempAttribNameNumber =
                        
                                reader.getAttributeValue(null,"NameNumber");
                            
                   if (tempAttribNameNumber!=null){
                         java.lang.String content = tempAttribNameNumber;
                        
                                                 object.setNameNumber(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribNameNumber));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("NameNumber");
                    
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
                    
                    // handle attribute "SegmentStatus"
                    java.lang.String tempAttribSegmentStatus =
                        
                                reader.getAttributeValue(null,"SegmentStatus");
                            
                   if (tempAttribSegmentStatus!=null){
                         java.lang.String content = tempAttribSegmentStatus;
                        
                                                 object.setSegmentStatus(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribSegmentStatus));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("SegmentStatus");
                    
                    // handle attribute "SmokingPreference"
                    java.lang.String tempAttribSmokingPreference =
                        
                                reader.getAttributeValue(null,"SmokingPreference");
                            
                   if (tempAttribSmokingPreference!=null){
                         java.lang.String content = tempAttribSmokingPreference;
                        
                                                 object.setSmokingPreference(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribSmokingPreference));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("SmokingPreference");
                    
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
                    
                    // handle attribute "TypeTwo"
                    java.lang.String tempAttribTypeTwo =
                        
                                reader.getAttributeValue(null,"TypeTwo");
                            
                   if (tempAttribTypeTwo!=null){
                         java.lang.String content = tempAttribTypeTwo;
                        
                                                 object.setTypeTwo(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribTypeTwo));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("TypeTwo");
                    
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","FlightSegment").equals(reader.getName())){
                                
                                                object.setFlightSegment(com.sabre.webservices.sabrexml._2011._10.FlightSegment_type3.Factory.parse(reader));
                                              
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
           
    