
/**
 * GuaranteePrepaid_type0.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.sabre.webservices.sabrexml._2011._10;
            

            /**
            *  GuaranteePrepaid_type0 bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class GuaranteePrepaid_type0
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = GuaranteePrepaid_type0
                Namespace URI = http://webservices.sabre.com/sabreXML/2011/10
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for CancellationRefundAmount
                        * This was an Array!
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.CancellationRefundAmount_type0[] localCancellationRefundAmount ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCancellationRefundAmountTracker = false ;

                           public boolean isCancellationRefundAmountSpecified(){
                               return localCancellationRefundAmountTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.sabre.webservices.sabrexml._2011._10.CancellationRefundAmount_type0[]
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.CancellationRefundAmount_type0[] getCancellationRefundAmount(){
                               return localCancellationRefundAmount;
                           }

                           
                        


                               
                              /**
                               * validate the array for CancellationRefundAmount
                               */
                              protected void validateCancellationRefundAmount(com.sabre.webservices.sabrexml._2011._10.CancellationRefundAmount_type0[] param){
                             
                              if ((param != null) && (param.length > 4)){
                                throw new java.lang.RuntimeException();
                              }
                              
                              }


                             /**
                              * Auto generated setter method
                              * @param param CancellationRefundAmount
                              */
                              public void setCancellationRefundAmount(com.sabre.webservices.sabrexml._2011._10.CancellationRefundAmount_type0[] param){
                              
                                   validateCancellationRefundAmount(param);

                               localCancellationRefundAmountTracker = param != null;
                                      
                                      this.localCancellationRefundAmount=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.sabre.webservices.sabrexml._2011._10.CancellationRefundAmount_type0
                             */
                             public void addCancellationRefundAmount(com.sabre.webservices.sabrexml._2011._10.CancellationRefundAmount_type0 param){
                                   if (localCancellationRefundAmount == null){
                                   localCancellationRefundAmount = new com.sabre.webservices.sabrexml._2011._10.CancellationRefundAmount_type0[]{};
                                   }

                            
                                 //update the setting tracker
                                localCancellationRefundAmountTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localCancellationRefundAmount);
                               list.add(param);
                               this.localCancellationRefundAmount =
                             (com.sabre.webservices.sabrexml._2011._10.CancellationRefundAmount_type0[])list.toArray(
                            new com.sabre.webservices.sabrexml._2011._10.CancellationRefundAmount_type0[list.size()]);

                             }
                             

                        /**
                        * field for Amount
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localAmount ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getAmount(){
                               return localAmount;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Amount
                               */
                               public void setAmount(java.lang.String param){
                            
                                            this.localAmount=param;
                                    

                               }
                            

                        /**
                        * field for AmountPercentage
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localAmountPercentage ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getAmountPercentage(){
                               return localAmountPercentage;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AmountPercentage
                               */
                               public void setAmountPercentage(java.lang.String param){
                            
                                            this.localAmountPercentage=param;
                                    

                               }
                            

                        /**
                        * field for CurrencyCode
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localCurrencyCode ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCurrencyCode(){
                               return localCurrencyCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CurrencyCode
                               */
                               public void setCurrencyCode(java.lang.String param){
                            
                                            this.localCurrencyCode=param;
                                    

                               }
                            

                        /**
                        * field for Ind
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localInd ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getInd(){
                               return localInd;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Ind
                               */
                               public void setInd(java.lang.String param){
                            
                                            this.localInd=param;
                                    

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
                           namespacePrefix+":GuaranteePrepaid_type0",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "GuaranteePrepaid_type0",
                           xmlWriter);
                   }

               
                   }
               
                                            if (localAmount != null){
                                        
                                                writeAttribute("",
                                                         "Amount",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAmount), xmlWriter);

                                            
                                      }
                                    
                                            if (localAmountPercentage != null){
                                        
                                                writeAttribute("",
                                                         "AmountPercentage",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAmountPercentage), xmlWriter);

                                            
                                      }
                                    
                                            if (localCurrencyCode != null){
                                        
                                                writeAttribute("",
                                                         "CurrencyCode",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCurrencyCode), xmlWriter);

                                            
                                      }
                                    
                                            if (localInd != null){
                                        
                                                writeAttribute("",
                                                         "Ind",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localInd), xmlWriter);

                                            
                                      }
                                     if (localCancellationRefundAmountTracker){
                                       if (localCancellationRefundAmount!=null){
                                            for (int i = 0;i < localCancellationRefundAmount.length;i++){
                                                if (localCancellationRefundAmount[i] != null){
                                                 localCancellationRefundAmount[i].serialize(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","CancellationRefundAmount"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                        // we don't have to do any thing since minOccures is zero
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("CancellationRefundAmount cannot be null!!");
                                        
                                    }
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

                 if (localCancellationRefundAmountTracker){
                             if (localCancellationRefundAmount!=null) {
                                 for (int i = 0;i < localCancellationRefundAmount.length;i++){

                                    if (localCancellationRefundAmount[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                          "CancellationRefundAmount"));
                                         elementList.add(localCancellationRefundAmount[i]);
                                    } else {
                                        
                                                // nothing to do
                                            
                                    }

                                 }
                             } else {
                                 
                                        throw new org.apache.axis2.databinding.ADBException("CancellationRefundAmount cannot be null!!");
                                    
                             }

                        }
                            attribList.add(
                            new javax.xml.namespace.QName("","Amount"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAmount));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","AmountPercentage"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAmountPercentage));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","CurrencyCode"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCurrencyCode));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","Ind"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localInd));
                                

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
        public static GuaranteePrepaid_type0 parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            GuaranteePrepaid_type0 object =
                new GuaranteePrepaid_type0();

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
                    
                            if (!"GuaranteePrepaid_type0".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (GuaranteePrepaid_type0)org.xmlsoap.schemas.soap.envelope.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    // handle attribute "Amount"
                    java.lang.String tempAttribAmount =
                        
                                reader.getAttributeValue(null,"Amount");
                            
                   if (tempAttribAmount!=null){
                         java.lang.String content = tempAttribAmount;
                        
                                                 object.setAmount(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribAmount));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("Amount");
                    
                    // handle attribute "AmountPercentage"
                    java.lang.String tempAttribAmountPercentage =
                        
                                reader.getAttributeValue(null,"AmountPercentage");
                            
                   if (tempAttribAmountPercentage!=null){
                         java.lang.String content = tempAttribAmountPercentage;
                        
                                                 object.setAmountPercentage(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribAmountPercentage));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("AmountPercentage");
                    
                    // handle attribute "CurrencyCode"
                    java.lang.String tempAttribCurrencyCode =
                        
                                reader.getAttributeValue(null,"CurrencyCode");
                            
                   if (tempAttribCurrencyCode!=null){
                         java.lang.String content = tempAttribCurrencyCode;
                        
                                                 object.setCurrencyCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribCurrencyCode));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("CurrencyCode");
                    
                    // handle attribute "Ind"
                    java.lang.String tempAttribInd =
                        
                                reader.getAttributeValue(null,"Ind");
                            
                   if (tempAttribInd!=null){
                         java.lang.String content = tempAttribInd;
                        
                                                 object.setInd(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribInd));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("Ind");
                    
                    
                    reader.next();
                
                        java.util.ArrayList list1 = new java.util.ArrayList();
                    
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","CancellationRefundAmount").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list1.add(com.sabre.webservices.sabrexml._2011._10.CancellationRefundAmount_type0.Factory.parse(reader));
                                                                
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
                                                                if (new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","CancellationRefundAmount").equals(reader.getName())){
                                                                    list1.add(com.sabre.webservices.sabrexml._2011._10.CancellationRefundAmount_type0.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone1 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setCancellationRefundAmount((com.sabre.webservices.sabrexml._2011._10.CancellationRefundAmount_type0[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.sabre.webservices.sabrexml._2011._10.CancellationRefundAmount_type0.class,
                                                                list1));
                                                            
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
           
    