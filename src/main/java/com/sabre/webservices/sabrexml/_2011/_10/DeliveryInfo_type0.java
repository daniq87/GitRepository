
/**
 * DeliveryInfo_type0.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.sabre.webservices.sabrexml._2011._10;
            

            /**
            *  DeliveryInfo_type0 bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class DeliveryInfo_type0
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = DeliveryInfo_type0
                Namespace URI = http://webservices.sabre.com/sabreXML/2011/10
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for Address
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.Address_type4 localAddress ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAddressTracker = false ;

                           public boolean isAddressSpecified(){
                               return localAddressTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.sabre.webservices.sabrexml._2011._10.Address_type4
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.Address_type4 getAddress(){
                               return localAddress;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Address
                               */
                               public void setAddress(com.sabre.webservices.sabrexml._2011._10.Address_type4 param){
                            localAddressTracker = param != null;
                                   
                                            this.localAddress=param;
                                    

                               }
                            

                        /**
                        * field for CollectionFee
                        */

                        
                                    protected java.lang.String localCollectionFee ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCollectionFeeTracker = false ;

                           public boolean isCollectionFeeSpecified(){
                               return localCollectionFeeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCollectionFee(){
                               return localCollectionFee;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CollectionFee
                               */
                               public void setCollectionFee(java.lang.String param){
                            localCollectionFeeTracker = param != null;
                                   
                                            this.localCollectionFee=param;
                                    

                               }
                            

                        /**
                        * field for ContactNumbers
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.ContactNumbers_type5 localContactNumbers ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localContactNumbersTracker = false ;

                           public boolean isContactNumbersSpecified(){
                               return localContactNumbersTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.sabre.webservices.sabrexml._2011._10.ContactNumbers_type5
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.ContactNumbers_type5 getContactNumbers(){
                               return localContactNumbers;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ContactNumbers
                               */
                               public void setContactNumbers(com.sabre.webservices.sabrexml._2011._10.ContactNumbers_type5 param){
                            localContactNumbersTracker = param != null;
                                   
                                            this.localContactNumbers=param;
                                    

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
                        * field for SiteID
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localSiteID ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSiteID(){
                               return localSiteID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SiteID
                               */
                               public void setSiteID(java.lang.String param){
                            
                                            this.localSiteID=param;
                                    

                               }
                            

                        /**
                        * field for SiteName
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localSiteName ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSiteName(){
                               return localSiteName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SiteName
                               */
                               public void setSiteName(java.lang.String param){
                            
                                            this.localSiteName=param;
                                    

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
                           namespacePrefix+":DeliveryInfo_type0",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "DeliveryInfo_type0",
                           xmlWriter);
                   }

               
                   }
               
                                            if (localSiteID != null){
                                        
                                                writeAttribute("",
                                                         "SiteID",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSiteID), xmlWriter);

                                            
                                      }
                                    
                                            if (localSiteName != null){
                                        
                                                writeAttribute("",
                                                         "SiteName",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSiteName), xmlWriter);

                                            
                                      }
                                     if (localAddressTracker){
                                            if (localAddress==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Address cannot be null!!");
                                            }
                                           localAddress.serialize(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","Address"),
                                               xmlWriter);
                                        } if (localCollectionFeeTracker){
                                    namespace = "http://webservices.sabre.com/sabreXML/2011/10";
                                    writeStartElement(null, namespace, "CollectionFee", xmlWriter);
                             

                                          if (localCollectionFee==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("CollectionFee cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCollectionFee);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localContactNumbersTracker){
                                            if (localContactNumbers==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ContactNumbers cannot be null!!");
                                            }
                                           localContactNumbers.serialize(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","ContactNumbers"),
                                               xmlWriter);
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

                 if (localAddressTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                      "Address"));
                            
                            
                                    if (localAddress==null){
                                         throw new org.apache.axis2.databinding.ADBException("Address cannot be null!!");
                                    }
                                    elementList.add(localAddress);
                                } if (localCollectionFeeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                      "CollectionFee"));
                                 
                                        if (localCollectionFee != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCollectionFee));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("CollectionFee cannot be null!!");
                                        }
                                    } if (localContactNumbersTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                      "ContactNumbers"));
                            
                            
                                    if (localContactNumbers==null){
                                         throw new org.apache.axis2.databinding.ADBException("ContactNumbers cannot be null!!");
                                    }
                                    elementList.add(localContactNumbers);
                                } if (localTextTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                      "Text"));
                                 
                                        if (localText != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localText));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Text cannot be null!!");
                                        }
                                    }
                            attribList.add(
                            new javax.xml.namespace.QName("","SiteID"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSiteID));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","SiteName"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSiteName));
                                

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
        public static DeliveryInfo_type0 parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            DeliveryInfo_type0 object =
                new DeliveryInfo_type0();

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
                    
                            if (!"DeliveryInfo_type0".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (DeliveryInfo_type0)org.xmlsoap.schemas.soap.envelope.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    // handle attribute "SiteID"
                    java.lang.String tempAttribSiteID =
                        
                                reader.getAttributeValue(null,"SiteID");
                            
                   if (tempAttribSiteID!=null){
                         java.lang.String content = tempAttribSiteID;
                        
                                                 object.setSiteID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribSiteID));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("SiteID");
                    
                    // handle attribute "SiteName"
                    java.lang.String tempAttribSiteName =
                        
                                reader.getAttributeValue(null,"SiteName");
                            
                   if (tempAttribSiteName!=null){
                         java.lang.String content = tempAttribSiteName;
                        
                                                 object.setSiteName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribSiteName));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("SiteName");
                    
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","Address").equals(reader.getName())){
                                
                                                object.setAddress(com.sabre.webservices.sabrexml._2011._10.Address_type4.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","CollectionFee").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"CollectionFee" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCollectionFee(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","ContactNumbers").equals(reader.getName())){
                                
                                                object.setContactNumbers(com.sabre.webservices.sabrexml._2011._10.ContactNumbers_type5.Factory.parse(reader));
                                              
                                        reader.next();
                                    
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
           
    