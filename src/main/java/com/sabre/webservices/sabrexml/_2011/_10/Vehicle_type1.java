
/**
 * Vehicle_type1.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.sabre.webservices.sabrexml._2011._10;
            

            /**
            *  Vehicle_type1 bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class Vehicle_type1
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = Vehicle_type1
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
                        * field for DirectConnect
                        */

                        
                                    protected java.lang.String localDirectConnect ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDirectConnectTracker = false ;

                           public boolean isDirectConnectSpecified(){
                               return localDirectConnectTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getDirectConnect(){
                               return localDirectConnect;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DirectConnect
                               */
                               public void setDirectConnect(java.lang.String param){
                            localDirectConnectTracker = param != null;
                                   
                                            this.localDirectConnect=param;
                                    

                               }
                            

                        /**
                        * field for POS
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.POS_type1 localPOS ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPOSTracker = false ;

                           public boolean isPOSSpecified(){
                               return localPOSTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.sabre.webservices.sabrexml._2011._10.POS_type1
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.POS_type1 getPOS(){
                               return localPOS;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param POS
                               */
                               public void setPOS(com.sabre.webservices.sabrexml._2011._10.POS_type1 param){
                            localPOSTracker = param != null;
                                   
                                            this.localPOS=param;
                                    

                               }
                            

                        /**
                        * field for VehRentalCore
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.VehRentalCore_type0 localVehRentalCore ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localVehRentalCoreTracker = false ;

                           public boolean isVehRentalCoreSpecified(){
                               return localVehRentalCoreTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.sabre.webservices.sabrexml._2011._10.VehRentalCore_type0
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.VehRentalCore_type0 getVehRentalCore(){
                               return localVehRentalCore;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param VehRentalCore
                               */
                               public void setVehRentalCore(com.sabre.webservices.sabrexml._2011._10.VehRentalCore_type0 param){
                            localVehRentalCoreTracker = param != null;
                                   
                                            this.localVehRentalCore=param;
                                    

                               }
                            

                        /**
                        * field for VehVendorAvail
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.VehVendorAvail_type0 localVehVendorAvail ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localVehVendorAvailTracker = false ;

                           public boolean isVehVendorAvailSpecified(){
                               return localVehVendorAvailTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.sabre.webservices.sabrexml._2011._10.VehVendorAvail_type0
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.VehVendorAvail_type0 getVehVendorAvail(){
                               return localVehVendorAvail;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param VehVendorAvail
                               */
                               public void setVehVendorAvail(com.sabre.webservices.sabrexml._2011._10.VehVendorAvail_type0 param){
                            localVehVendorAvailTracker = param != null;
                                   
                                            this.localVehVendorAvail=param;
                                    

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
                           namespacePrefix+":Vehicle_type1",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "Vehicle_type1",
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
                             } if (localDirectConnectTracker){
                                    namespace = "http://webservices.sabre.com/sabreXML/2011/10";
                                    writeStartElement(null, namespace, "DirectConnect", xmlWriter);
                             

                                          if (localDirectConnect==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("DirectConnect cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localDirectConnect);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPOSTracker){
                                            if (localPOS==null){
                                                 throw new org.apache.axis2.databinding.ADBException("POS cannot be null!!");
                                            }
                                           localPOS.serialize(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","POS"),
                                               xmlWriter);
                                        } if (localVehRentalCoreTracker){
                                            if (localVehRentalCore==null){
                                                 throw new org.apache.axis2.databinding.ADBException("VehRentalCore cannot be null!!");
                                            }
                                           localVehRentalCore.serialize(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","VehRentalCore"),
                                               xmlWriter);
                                        } if (localVehVendorAvailTracker){
                                            if (localVehVendorAvail==null){
                                                 throw new org.apache.axis2.databinding.ADBException("VehVendorAvail cannot be null!!");
                                            }
                                           localVehVendorAvail.serialize(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","VehVendorAvail"),
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
                                    } if (localDirectConnectTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                      "DirectConnect"));
                                 
                                        if (localDirectConnect != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDirectConnect));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("DirectConnect cannot be null!!");
                                        }
                                    } if (localPOSTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                      "POS"));
                            
                            
                                    if (localPOS==null){
                                         throw new org.apache.axis2.databinding.ADBException("POS cannot be null!!");
                                    }
                                    elementList.add(localPOS);
                                } if (localVehRentalCoreTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                      "VehRentalCore"));
                            
                            
                                    if (localVehRentalCore==null){
                                         throw new org.apache.axis2.databinding.ADBException("VehRentalCore cannot be null!!");
                                    }
                                    elementList.add(localVehRentalCore);
                                } if (localVehVendorAvailTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                      "VehVendorAvail"));
                            
                            
                                    if (localVehVendorAvail==null){
                                         throw new org.apache.axis2.databinding.ADBException("VehVendorAvail cannot be null!!");
                                    }
                                    elementList.add(localVehVendorAvail);
                                }
                            attribList.add(
                            new javax.xml.namespace.QName("","LinkCode"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLinkCode));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","MergedSegmentInd"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMergedSegmentInd));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","SegmentNumber"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSegmentNumber));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","Status"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStatus));
                                

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
        public static Vehicle_type1 parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            Vehicle_type1 object =
                new Vehicle_type1();

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
                    
                            if (!"Vehicle_type1".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (Vehicle_type1)org.xmlsoap.schemas.soap.envelope.ExtensionMapper.getTypeObject(
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
                    
                    
                    reader.next();
                
                                    
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","DirectConnect").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"DirectConnect" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDirectConnect(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","POS").equals(reader.getName())){
                                
                                                object.setPOS(com.sabre.webservices.sabrexml._2011._10.POS_type1.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","VehRentalCore").equals(reader.getName())){
                                
                                                object.setVehRentalCore(com.sabre.webservices.sabrexml._2011._10.VehRentalCore_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","VehVendorAvail").equals(reader.getName())){
                                
                                                object.setVehVendorAvail(com.sabre.webservices.sabrexml._2011._10.VehVendorAvail_type0.Factory.parse(reader));
                                              
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
           
    