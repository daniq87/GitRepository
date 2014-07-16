
/**
 * ItinTotalFare_type0.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.sabre.webservices.sabrexml._2011._10;
            

            /**
            *  ItinTotalFare_type0 bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ItinTotalFare_type0
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = ItinTotalFare_type0
                Namespace URI = http://webservices.sabre.com/sabreXML/2011/10
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for BaseFare
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.BaseFare_type1 localBaseFare ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBaseFareTracker = false ;

                           public boolean isBaseFareSpecified(){
                               return localBaseFareTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.sabre.webservices.sabrexml._2011._10.BaseFare_type1
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.BaseFare_type1 getBaseFare(){
                               return localBaseFare;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BaseFare
                               */
                               public void setBaseFare(com.sabre.webservices.sabrexml._2011._10.BaseFare_type1 param){
                            localBaseFareTracker = param != null;
                                   
                                            this.localBaseFare=param;
                                    

                               }
                            

                        /**
                        * field for Commission
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.Commission_type1 localCommission ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCommissionTracker = false ;

                           public boolean isCommissionSpecified(){
                               return localCommissionTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.sabre.webservices.sabrexml._2011._10.Commission_type1
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.Commission_type1 getCommission(){
                               return localCommission;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Commission
                               */
                               public void setCommission(com.sabre.webservices.sabrexml._2011._10.Commission_type1 param){
                            localCommissionTracker = param != null;
                                   
                                            this.localCommission=param;
                                    

                               }
                            

                        /**
                        * field for EquivFare
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.EquivFare_type0 localEquivFare ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localEquivFareTracker = false ;

                           public boolean isEquivFareSpecified(){
                               return localEquivFareTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.sabre.webservices.sabrexml._2011._10.EquivFare_type0
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.EquivFare_type0 getEquivFare(){
                               return localEquivFare;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param EquivFare
                               */
                               public void setEquivFare(com.sabre.webservices.sabrexml._2011._10.EquivFare_type0 param){
                            localEquivFareTracker = param != null;
                                   
                                            this.localEquivFare=param;
                                    

                               }
                            

                        /**
                        * field for PassengerTypeQuantity
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.PassengerTypeQuantity_type0 localPassengerTypeQuantity ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPassengerTypeQuantityTracker = false ;

                           public boolean isPassengerTypeQuantitySpecified(){
                               return localPassengerTypeQuantityTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.sabre.webservices.sabrexml._2011._10.PassengerTypeQuantity_type0
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.PassengerTypeQuantity_type0 getPassengerTypeQuantity(){
                               return localPassengerTypeQuantity;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PassengerTypeQuantity
                               */
                               public void setPassengerTypeQuantity(com.sabre.webservices.sabrexml._2011._10.PassengerTypeQuantity_type0 param){
                            localPassengerTypeQuantityTracker = param != null;
                                   
                                            this.localPassengerTypeQuantity=param;
                                    

                               }
                            

                        /**
                        * field for Taxes
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.Taxes_type1 localTaxes ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTaxesTracker = false ;

                           public boolean isTaxesSpecified(){
                               return localTaxesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.sabre.webservices.sabrexml._2011._10.Taxes_type1
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.Taxes_type1 getTaxes(){
                               return localTaxes;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Taxes
                               */
                               public void setTaxes(com.sabre.webservices.sabrexml._2011._10.Taxes_type1 param){
                            localTaxesTracker = param != null;
                                   
                                            this.localTaxes=param;
                                    

                               }
                            

                        /**
                        * field for TotalFare
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.TotalFare_type0 localTotalFare ;
                                
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
                           * @return com.sabre.webservices.sabrexml._2011._10.TotalFare_type0
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.TotalFare_type0 getTotalFare(){
                               return localTotalFare;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TotalFare
                               */
                               public void setTotalFare(com.sabre.webservices.sabrexml._2011._10.TotalFare_type0 param){
                            localTotalFareTracker = param != null;
                                   
                                            this.localTotalFare=param;
                                    

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
                           namespacePrefix+":ItinTotalFare_type0",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "ItinTotalFare_type0",
                           xmlWriter);
                   }

               
                   }
                if (localBaseFareTracker){
                                            if (localBaseFare==null){
                                                 throw new org.apache.axis2.databinding.ADBException("BaseFare cannot be null!!");
                                            }
                                           localBaseFare.serialize(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","BaseFare"),
                                               xmlWriter);
                                        } if (localCommissionTracker){
                                            if (localCommission==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Commission cannot be null!!");
                                            }
                                           localCommission.serialize(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","Commission"),
                                               xmlWriter);
                                        } if (localEquivFareTracker){
                                            if (localEquivFare==null){
                                                 throw new org.apache.axis2.databinding.ADBException("EquivFare cannot be null!!");
                                            }
                                           localEquivFare.serialize(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","EquivFare"),
                                               xmlWriter);
                                        } if (localPassengerTypeQuantityTracker){
                                            if (localPassengerTypeQuantity==null){
                                                 throw new org.apache.axis2.databinding.ADBException("PassengerTypeQuantity cannot be null!!");
                                            }
                                           localPassengerTypeQuantity.serialize(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","PassengerTypeQuantity"),
                                               xmlWriter);
                                        } if (localTaxesTracker){
                                            if (localTaxes==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Taxes cannot be null!!");
                                            }
                                           localTaxes.serialize(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","Taxes"),
                                               xmlWriter);
                                        } if (localTotalFareTracker){
                                            if (localTotalFare==null){
                                                 throw new org.apache.axis2.databinding.ADBException("TotalFare cannot be null!!");
                                            }
                                           localTotalFare.serialize(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","TotalFare"),
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

                 if (localBaseFareTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                      "BaseFare"));
                            
                            
                                    if (localBaseFare==null){
                                         throw new org.apache.axis2.databinding.ADBException("BaseFare cannot be null!!");
                                    }
                                    elementList.add(localBaseFare);
                                } if (localCommissionTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                      "Commission"));
                            
                            
                                    if (localCommission==null){
                                         throw new org.apache.axis2.databinding.ADBException("Commission cannot be null!!");
                                    }
                                    elementList.add(localCommission);
                                } if (localEquivFareTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                      "EquivFare"));
                            
                            
                                    if (localEquivFare==null){
                                         throw new org.apache.axis2.databinding.ADBException("EquivFare cannot be null!!");
                                    }
                                    elementList.add(localEquivFare);
                                } if (localPassengerTypeQuantityTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                      "PassengerTypeQuantity"));
                            
                            
                                    if (localPassengerTypeQuantity==null){
                                         throw new org.apache.axis2.databinding.ADBException("PassengerTypeQuantity cannot be null!!");
                                    }
                                    elementList.add(localPassengerTypeQuantity);
                                } if (localTaxesTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                      "Taxes"));
                            
                            
                                    if (localTaxes==null){
                                         throw new org.apache.axis2.databinding.ADBException("Taxes cannot be null!!");
                                    }
                                    elementList.add(localTaxes);
                                } if (localTotalFareTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                      "TotalFare"));
                            
                            
                                    if (localTotalFare==null){
                                         throw new org.apache.axis2.databinding.ADBException("TotalFare cannot be null!!");
                                    }
                                    elementList.add(localTotalFare);
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
        public static ItinTotalFare_type0 parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            ItinTotalFare_type0 object =
                new ItinTotalFare_type0();

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
                    
                            if (!"ItinTotalFare_type0".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (ItinTotalFare_type0)org.xmlsoap.schemas.soap.envelope.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","BaseFare").equals(reader.getName())){
                                
                                                object.setBaseFare(com.sabre.webservices.sabrexml._2011._10.BaseFare_type1.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","Commission").equals(reader.getName())){
                                
                                                object.setCommission(com.sabre.webservices.sabrexml._2011._10.Commission_type1.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","EquivFare").equals(reader.getName())){
                                
                                                object.setEquivFare(com.sabre.webservices.sabrexml._2011._10.EquivFare_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","PassengerTypeQuantity").equals(reader.getName())){
                                
                                                object.setPassengerTypeQuantity(com.sabre.webservices.sabrexml._2011._10.PassengerTypeQuantity_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","Taxes").equals(reader.getName())){
                                
                                                object.setTaxes(com.sabre.webservices.sabrexml._2011._10.Taxes_type1.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","TotalFare").equals(reader.getName())){
                                
                                                object.setTotalFare(com.sabre.webservices.sabrexml._2011._10.TotalFare_type0.Factory.parse(reader));
                                              
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
           
    