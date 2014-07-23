
/**
 * Equipment_type1.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.sabre.webservices.sabrexml._2011._10;
            

            /**
            *  Equipment_type1 bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class Equipment_type1
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = Equipment_type1
                Namespace URI = http://webservices.sabre.com/sabreXML/2011/10
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for EquipType
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localEquipType ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getEquipType(){
                               return localEquipType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param EquipType
                               */
                               public void setEquipType(java.lang.String param){
                            
                                            this.localEquipType=param;
                                    

                               }
                            

                        /**
                        * field for Quantity
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localQuantity ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getQuantity(){
                               return localQuantity;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Quantity
                               */
                               public void setQuantity(java.lang.String param){
                            
                                            this.localQuantity=param;
                                    

                               }
                            

                        /**
                        * field for SpecialEquip
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localSpecialEquip ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSpecialEquip(){
                               return localSpecialEquip;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SpecialEquip
                               */
                               public void setSpecialEquip(java.lang.String param){
                            
                                            this.localSpecialEquip=param;
                                    

                               }
                            

                        /**
                        * field for SpecialEquipConfirmed
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localSpecialEquipConfirmed ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSpecialEquipConfirmed(){
                               return localSpecialEquipConfirmed;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SpecialEquipConfirmed
                               */
                               public void setSpecialEquipConfirmed(java.lang.String param){
                            
                                            this.localSpecialEquipConfirmed=param;
                                    

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
                           namespacePrefix+":Equipment_type1",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "Equipment_type1",
                           xmlWriter);
                   }

               
                   }
               
                                            if (localEquipType != null){
                                        
                                                writeAttribute("",
                                                         "EquipType",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEquipType), xmlWriter);

                                            
                                      }
                                    
                                            if (localQuantity != null){
                                        
                                                writeAttribute("",
                                                         "Quantity",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localQuantity), xmlWriter);

                                            
                                      }
                                    
                                            if (localSpecialEquip != null){
                                        
                                                writeAttribute("",
                                                         "SpecialEquip",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSpecialEquip), xmlWriter);

                                            
                                      }
                                    
                                            if (localSpecialEquipConfirmed != null){
                                        
                                                writeAttribute("",
                                                         "SpecialEquipConfirmed",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSpecialEquipConfirmed), xmlWriter);

                                            
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
                            new javax.xml.namespace.QName("","EquipType"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEquipType));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","Quantity"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localQuantity));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","SpecialEquip"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSpecialEquip));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","SpecialEquipConfirmed"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSpecialEquipConfirmed));
                                

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
        public static Equipment_type1 parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            Equipment_type1 object =
                new Equipment_type1();

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
                    
                            if (!"Equipment_type1".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (Equipment_type1)org.xmlsoap.schemas.soap.envelope.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    // handle attribute "EquipType"
                    java.lang.String tempAttribEquipType =
                        
                                reader.getAttributeValue(null,"EquipType");
                            
                   if (tempAttribEquipType!=null){
                         java.lang.String content = tempAttribEquipType;
                        
                                                 object.setEquipType(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribEquipType));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("EquipType");
                    
                    // handle attribute "Quantity"
                    java.lang.String tempAttribQuantity =
                        
                                reader.getAttributeValue(null,"Quantity");
                            
                   if (tempAttribQuantity!=null){
                         java.lang.String content = tempAttribQuantity;
                        
                                                 object.setQuantity(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribQuantity));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("Quantity");
                    
                    // handle attribute "SpecialEquip"
                    java.lang.String tempAttribSpecialEquip =
                        
                                reader.getAttributeValue(null,"SpecialEquip");
                            
                   if (tempAttribSpecialEquip!=null){
                         java.lang.String content = tempAttribSpecialEquip;
                        
                                                 object.setSpecialEquip(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribSpecialEquip));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("SpecialEquip");
                    
                    // handle attribute "SpecialEquipConfirmed"
                    java.lang.String tempAttribSpecialEquipConfirmed =
                        
                                reader.getAttributeValue(null,"SpecialEquipConfirmed");
                            
                   if (tempAttribSpecialEquipConfirmed!=null){
                         java.lang.String content = tempAttribSpecialEquipConfirmed;
                        
                                                 object.setSpecialEquipConfirmed(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribSpecialEquipConfirmed));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("SpecialEquipConfirmed");
                    
                    
                    reader.next();
                



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
    