
/**
 * ApproximateTotalCharge_type0.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.sabre.webservices.sabrexml._2011._10;
            

            /**
            *  ApproximateTotalCharge_type0 bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ApproximateTotalCharge_type0
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = ApproximateTotalCharge_type0
                Namespace URI = http://webservices.sabre.com/sabreXML/2011/10
                Namespace Prefix = ns1
                */
            

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
                        * field for MileageAllowance
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localMileageAllowance ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getMileageAllowance(){
                               return localMileageAllowance;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MileageAllowance
                               */
                               public void setMileageAllowance(java.lang.String param){
                            
                                            this.localMileageAllowance=param;
                                    

                               }
                            

                        /**
                        * field for NumDays
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localNumDays ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getNumDays(){
                               return localNumDays;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NumDays
                               */
                               public void setNumDays(java.lang.String param){
                            
                                            this.localNumDays=param;
                                    

                               }
                            

                        /**
                        * field for NumHours
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localNumHours ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getNumHours(){
                               return localNumHours;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NumHours
                               */
                               public void setNumHours(java.lang.String param){
                            
                                            this.localNumHours=param;
                                    

                               }
                            

                        /**
                        * field for RateType
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localRateType ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getRateType(){
                               return localRateType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RateType
                               */
                               public void setRateType(java.lang.String param){
                            
                                            this.localRateType=param;
                                    

                               }
                            

                        /**
                        * field for TotalMandatoryCharges
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localTotalMandatoryCharges ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getTotalMandatoryCharges(){
                               return localTotalMandatoryCharges;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TotalMandatoryCharges
                               */
                               public void setTotalMandatoryCharges(java.lang.String param){
                            
                                            this.localTotalMandatoryCharges=param;
                                    

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
                           namespacePrefix+":ApproximateTotalCharge_type0",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "ApproximateTotalCharge_type0",
                           xmlWriter);
                   }

               
                   }
               
                                            if (localAmount != null){
                                        
                                                writeAttribute("",
                                                         "Amount",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAmount), xmlWriter);

                                            
                                      }
                                    
                                            if (localMileageAllowance != null){
                                        
                                                writeAttribute("",
                                                         "MileageAllowance",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMileageAllowance), xmlWriter);

                                            
                                      }
                                    
                                            if (localNumDays != null){
                                        
                                                writeAttribute("",
                                                         "NumDays",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumDays), xmlWriter);

                                            
                                      }
                                    
                                            if (localNumHours != null){
                                        
                                                writeAttribute("",
                                                         "NumHours",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumHours), xmlWriter);

                                            
                                      }
                                    
                                            if (localRateType != null){
                                        
                                                writeAttribute("",
                                                         "RateType",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRateType), xmlWriter);

                                            
                                      }
                                    
                                            if (localTotalMandatoryCharges != null){
                                        
                                                writeAttribute("",
                                                         "TotalMandatoryCharges",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTotalMandatoryCharges), xmlWriter);

                                            
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

                
                            attribList.add(
                            new javax.xml.namespace.QName("","Amount"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAmount));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","MileageAllowance"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMileageAllowance));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","NumDays"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumDays));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","NumHours"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumHours));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","RateType"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRateType));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","TotalMandatoryCharges"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTotalMandatoryCharges));
                                

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
        public static ApproximateTotalCharge_type0 parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            ApproximateTotalCharge_type0 object =
                new ApproximateTotalCharge_type0();

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
                    
                            if (!"ApproximateTotalCharge_type0".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (ApproximateTotalCharge_type0)org.xmlsoap.schemas.soap.envelope.ExtensionMapper.getTypeObject(
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
                    
                    // handle attribute "MileageAllowance"
                    java.lang.String tempAttribMileageAllowance =
                        
                                reader.getAttributeValue(null,"MileageAllowance");
                            
                   if (tempAttribMileageAllowance!=null){
                         java.lang.String content = tempAttribMileageAllowance;
                        
                                                 object.setMileageAllowance(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribMileageAllowance));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("MileageAllowance");
                    
                    // handle attribute "NumDays"
                    java.lang.String tempAttribNumDays =
                        
                                reader.getAttributeValue(null,"NumDays");
                            
                   if (tempAttribNumDays!=null){
                         java.lang.String content = tempAttribNumDays;
                        
                                                 object.setNumDays(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribNumDays));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("NumDays");
                    
                    // handle attribute "NumHours"
                    java.lang.String tempAttribNumHours =
                        
                                reader.getAttributeValue(null,"NumHours");
                            
                   if (tempAttribNumHours!=null){
                         java.lang.String content = tempAttribNumHours;
                        
                                                 object.setNumHours(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribNumHours));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("NumHours");
                    
                    // handle attribute "RateType"
                    java.lang.String tempAttribRateType =
                        
                                reader.getAttributeValue(null,"RateType");
                            
                   if (tempAttribRateType!=null){
                         java.lang.String content = tempAttribRateType;
                        
                                                 object.setRateType(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribRateType));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("RateType");
                    
                    // handle attribute "TotalMandatoryCharges"
                    java.lang.String tempAttribTotalMandatoryCharges =
                        
                                reader.getAttributeValue(null,"TotalMandatoryCharges");
                            
                   if (tempAttribTotalMandatoryCharges!=null){
                         java.lang.String content = tempAttribTotalMandatoryCharges;
                        
                                                 object.setTotalMandatoryCharges(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribTotalMandatoryCharges));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("TotalMandatoryCharges");
                    
                    
                    reader.next();
                



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
    