
/**
 * SignatureLine_type0.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.sabre.webservices.sabrexml._2011._10;
            

            /**
            *  SignatureLine_type0 bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class SignatureLine_type0
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = SignatureLine_type0
                Namespace URI = http://webservices.sabre.com/sabreXML/2011/10
                Namespace Prefix = ns1
                */
            

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
                        * field for Banner
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localBanner ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getBanner(){
                               return localBanner;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Banner
                               */
                               public void setBanner(java.lang.String param){
                            
                                            this.localBanner=param;
                                    

                               }
                            

                        /**
                        * field for CommissionAmount
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localCommissionAmount ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCommissionAmount(){
                               return localCommissionAmount;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CommissionAmount
                               */
                               public void setCommissionAmount(java.lang.String param){
                            
                                            this.localCommissionAmount=param;
                                    

                               }
                            

                        /**
                        * field for CommissionID
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localCommissionID ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCommissionID(){
                               return localCommissionID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CommissionID
                               */
                               public void setCommissionID(java.lang.String param){
                            
                                            this.localCommissionID=param;
                                    

                               }
                            

                        /**
                        * field for ExpirationDateTime
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localExpirationDateTime ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getExpirationDateTime(){
                               return localExpirationDateTime;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ExpirationDateTime
                               */
                               public void setExpirationDateTime(java.lang.String param){
                            
                                            this.localExpirationDateTime=param;
                                    

                               }
                            

                        /**
                        * field for PQR_Ind
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localPQR_Ind ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPQR_Ind(){
                               return localPQR_Ind;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PQR_Ind
                               */
                               public void setPQR_Ind(java.lang.String param){
                            
                                            this.localPQR_Ind=param;
                                    

                               }
                            

                        /**
                        * field for Source
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localSource ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSource(){
                               return localSource;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Source
                               */
                               public void setSource(java.lang.String param){
                            
                                            this.localSource=param;
                                    

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
                           namespacePrefix+":SignatureLine_type0",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "SignatureLine_type0",
                           xmlWriter);
                   }

               
                   }
               
                                            if (localBanner != null){
                                        
                                                writeAttribute("",
                                                         "Banner",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBanner), xmlWriter);

                                            
                                      }
                                    
                                            if (localCommissionAmount != null){
                                        
                                                writeAttribute("",
                                                         "CommissionAmount",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCommissionAmount), xmlWriter);

                                            
                                      }
                                    
                                            if (localCommissionID != null){
                                        
                                                writeAttribute("",
                                                         "CommissionID",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCommissionID), xmlWriter);

                                            
                                      }
                                    
                                            if (localExpirationDateTime != null){
                                        
                                                writeAttribute("",
                                                         "ExpirationDateTime",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localExpirationDateTime), xmlWriter);

                                            
                                      }
                                    
                                            if (localPQR_Ind != null){
                                        
                                                writeAttribute("",
                                                         "PQR_Ind",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPQR_Ind), xmlWriter);

                                            
                                      }
                                    
                                            if (localSource != null){
                                        
                                                writeAttribute("",
                                                         "Source",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSource), xmlWriter);

                                            
                                      }
                                    
                                            if (localStatus != null){
                                        
                                                writeAttribute("",
                                                         "Status",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStatus), xmlWriter);

                                            
                                      }
                                     if (localTextTracker){
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

                 if (localTextTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                      "Text"));
                                 
                                        if (localText != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localText));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Text cannot be null!!");
                                        }
                                    }
                            attribList.add(
                            new javax.xml.namespace.QName("","Banner"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBanner));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","CommissionAmount"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCommissionAmount));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","CommissionID"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCommissionID));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","ExpirationDateTime"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localExpirationDateTime));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","PQR_Ind"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPQR_Ind));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","Source"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSource));
                                
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
        public static SignatureLine_type0 parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            SignatureLine_type0 object =
                new SignatureLine_type0();

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
                    
                            if (!"SignatureLine_type0".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (SignatureLine_type0)org.xmlsoap.schemas.soap.envelope.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    // handle attribute "Banner"
                    java.lang.String tempAttribBanner =
                        
                                reader.getAttributeValue(null,"Banner");
                            
                   if (tempAttribBanner!=null){
                         java.lang.String content = tempAttribBanner;
                        
                                                 object.setBanner(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribBanner));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("Banner");
                    
                    // handle attribute "CommissionAmount"
                    java.lang.String tempAttribCommissionAmount =
                        
                                reader.getAttributeValue(null,"CommissionAmount");
                            
                   if (tempAttribCommissionAmount!=null){
                         java.lang.String content = tempAttribCommissionAmount;
                        
                                                 object.setCommissionAmount(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribCommissionAmount));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("CommissionAmount");
                    
                    // handle attribute "CommissionID"
                    java.lang.String tempAttribCommissionID =
                        
                                reader.getAttributeValue(null,"CommissionID");
                            
                   if (tempAttribCommissionID!=null){
                         java.lang.String content = tempAttribCommissionID;
                        
                                                 object.setCommissionID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribCommissionID));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("CommissionID");
                    
                    // handle attribute "ExpirationDateTime"
                    java.lang.String tempAttribExpirationDateTime =
                        
                                reader.getAttributeValue(null,"ExpirationDateTime");
                            
                   if (tempAttribExpirationDateTime!=null){
                         java.lang.String content = tempAttribExpirationDateTime;
                        
                                                 object.setExpirationDateTime(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribExpirationDateTime));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("ExpirationDateTime");
                    
                    // handle attribute "PQR_Ind"
                    java.lang.String tempAttribPQR_Ind =
                        
                                reader.getAttributeValue(null,"PQR_Ind");
                            
                   if (tempAttribPQR_Ind!=null){
                         java.lang.String content = tempAttribPQR_Ind;
                        
                                                 object.setPQR_Ind(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribPQR_Ind));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("PQR_Ind");
                    
                    // handle attribute "Source"
                    java.lang.String tempAttribSource =
                        
                                reader.getAttributeValue(null,"Source");
                            
                   if (tempAttribSource!=null){
                         java.lang.String content = tempAttribSource;
                        
                                                 object.setSource(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribSource));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("Source");
                    
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
           
    