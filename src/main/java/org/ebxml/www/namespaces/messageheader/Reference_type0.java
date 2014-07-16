
/**
 * Reference_type0.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package org.ebxml.www.namespaces.messageheader;
            

            /**
            *  Reference_type0 bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class Reference_type0
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = Reference_type0
                Namespace URI = http://www.ebxml.org/namespaces/messageHeader
                Namespace Prefix = ns6
                */
            

                        /**
                        * field for Schema
                        * This was an Array!
                        */

                        
                                    protected org.ebxml.www.namespaces.messageheader.Schema_type0[] localSchema ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSchemaTracker = false ;

                           public boolean isSchemaSpecified(){
                               return localSchemaTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return org.ebxml.www.namespaces.messageheader.Schema_type0[]
                           */
                           public  org.ebxml.www.namespaces.messageheader.Schema_type0[] getSchema(){
                               return localSchema;
                           }

                           
                        


                               
                              /**
                               * validate the array for Schema
                               */
                              protected void validateSchema(org.ebxml.www.namespaces.messageheader.Schema_type0[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param Schema
                              */
                              public void setSchema(org.ebxml.www.namespaces.messageheader.Schema_type0[] param){
                              
                                   validateSchema(param);

                               localSchemaTracker = param != null;
                                      
                                      this.localSchema=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param org.ebxml.www.namespaces.messageheader.Schema_type0
                             */
                             public void addSchema(org.ebxml.www.namespaces.messageheader.Schema_type0 param){
                                   if (localSchema == null){
                                   localSchema = new org.ebxml.www.namespaces.messageheader.Schema_type0[]{};
                                   }

                            
                                 //update the setting tracker
                                localSchemaTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localSchema);
                               list.add(param);
                               this.localSchema =
                             (org.ebxml.www.namespaces.messageheader.Schema_type0[])list.toArray(
                            new org.ebxml.www.namespaces.messageheader.Schema_type0[list.size()]);

                             }
                             

                        /**
                        * field for Description
                        * This was an Array!
                        */

                        
                                    protected org.ebxml.www.namespaces.messageheader.Description_type0[] localDescription ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDescriptionTracker = false ;

                           public boolean isDescriptionSpecified(){
                               return localDescriptionTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return org.ebxml.www.namespaces.messageheader.Description_type0[]
                           */
                           public  org.ebxml.www.namespaces.messageheader.Description_type0[] getDescription(){
                               return localDescription;
                           }

                           
                        


                               
                              /**
                               * validate the array for Description
                               */
                              protected void validateDescription(org.ebxml.www.namespaces.messageheader.Description_type0[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param Description
                              */
                              public void setDescription(org.ebxml.www.namespaces.messageheader.Description_type0[] param){
                              
                                   validateDescription(param);

                               localDescriptionTracker = param != null;
                                      
                                      this.localDescription=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param org.ebxml.www.namespaces.messageheader.Description_type0
                             */
                             public void addDescription(org.ebxml.www.namespaces.messageheader.Description_type0 param){
                                   if (localDescription == null){
                                   localDescription = new org.ebxml.www.namespaces.messageheader.Description_type0[]{};
                                   }

                            
                                 //update the setting tracker
                                localDescriptionTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localDescription);
                               list.add(param);
                               this.localDescription =
                             (org.ebxml.www.namespaces.messageheader.Description_type0[])list.toArray(
                            new org.ebxml.www.namespaces.messageheader.Description_type0[list.size()]);

                             }
                             

                        /**
                        * field for ExtraElement
                        * This was an Array!
                        */

                        
                                    protected org.apache.axiom.om.OMElement[] localExtraElement ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localExtraElementTracker = false ;

                           public boolean isExtraElementSpecified(){
                               return localExtraElementTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return org.apache.axiom.om.OMElement[]
                           */
                           public  org.apache.axiom.om.OMElement[] getExtraElement(){
                               return localExtraElement;
                           }

                           
                        


                               
                              /**
                               * validate the array for ExtraElement
                               */
                              protected void validateExtraElement(org.apache.axiom.om.OMElement[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param ExtraElement
                              */
                              public void setExtraElement(org.apache.axiom.om.OMElement[] param){
                              
                                   validateExtraElement(param);

                               localExtraElementTracker = param != null;
                                      
                                      this.localExtraElement=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param org.apache.axiom.om.OMElement
                             */
                             public void addExtraElement(org.apache.axiom.om.OMElement param){
                                   if (localExtraElement == null){
                                   localExtraElement = new org.apache.axiom.om.OMElement[]{};
                                   }

                            
                                 //update the setting tracker
                                localExtraElementTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localExtraElement);
                               list.add(param);
                               this.localExtraElement =
                             (org.apache.axiom.om.OMElement[])list.toArray(
                            new org.apache.axiom.om.OMElement[list.size()]);

                             }
                             

                        /**
                        * field for Id
                        * This was an Attribute!
                        */

                        
                                    protected org.apache.axis2.databinding.types.Id localId ;
                                

                           /**
                           * Auto generated getter method
                           * @return org.apache.axis2.databinding.types.Id
                           */
                           public  org.apache.axis2.databinding.types.Id getId(){
                               return localId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Id
                               */
                               public void setId(org.apache.axis2.databinding.types.Id param){
                            
                                            this.localId=param;
                                    

                               }
                            

                        /**
                        * field for Type
                        * This was an Attribute!
                        */

                        
                                    protected org.w3.www._1999.xlink.Type_type0 localType ;
                                

                           /**
                           * Auto generated getter method
                           * @return org.w3.www._1999.xlink.Type_type0
                           */
                           public  org.w3.www._1999.xlink.Type_type0 getType(){
                               return localType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Type
                               */
                               public void setType(org.w3.www._1999.xlink.Type_type0 param){
                            
                                            this.localType=param;
                                    

                               }
                            

                        /**
                        * field for Href
                        * This was an Attribute!
                        */

                        
                                    protected org.apache.axis2.databinding.types.URI localHref ;
                                

                           /**
                           * Auto generated getter method
                           * @return org.apache.axis2.databinding.types.URI
                           */
                           public  org.apache.axis2.databinding.types.URI getHref(){
                               return localHref;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Href
                               */
                               public void setHref(org.apache.axis2.databinding.types.URI param){
                            
                                            this.localHref=param;
                                    

                               }
                            

                        /**
                        * field for Role
                        * This was an Attribute!
                        */

                        
                                    protected org.apache.axis2.databinding.types.URI localRole ;
                                

                           /**
                           * Auto generated getter method
                           * @return org.apache.axis2.databinding.types.URI
                           */
                           public  org.apache.axis2.databinding.types.URI getRole(){
                               return localRole;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Role
                               */
                               public void setRole(org.apache.axis2.databinding.types.URI param){
                            
                                            this.localRole=param;
                                    

                               }
                            

                        /**
                        * field for ExtraAttributes
                        * This was an Attribute!
                        * This was an Array!
                        */

                        
                                    protected org.apache.axiom.om.OMAttribute[] localExtraAttributes ;
                                

                           /**
                           * Auto generated getter method
                           * @return org.apache.axiom.om.OMAttribute[]
                           */
                           public  org.apache.axiom.om.OMAttribute[] getExtraAttributes(){
                               return localExtraAttributes;
                           }

                           
                        


                               
                              /**
                               * validate the array for ExtraAttributes
                               */
                              protected void validateExtraAttributes(org.apache.axiom.om.OMAttribute[] param){
                             
                              if ((param != null) && (param.length > 1)){
                                throw new java.lang.RuntimeException();
                              }
                              
                              if ((param != null) && (param.length < 1)){
                                throw new java.lang.RuntimeException();
                              }
                              
                              }


                             /**
                              * Auto generated setter method
                              * @param param ExtraAttributes
                              */
                              public void setExtraAttributes(org.apache.axiom.om.OMAttribute[] param){
                              
                                   validateExtraAttributes(param);

                               
                                      this.localExtraAttributes=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param org.apache.axiom.om.OMAttribute
                             */
                             public void addExtraAttributes(org.apache.axiom.om.OMAttribute param){
                                   if (localExtraAttributes == null){
                                   localExtraAttributes = new org.apache.axiom.om.OMAttribute[]{};
                                   }

                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localExtraAttributes);
                               list.add(param);
                               this.localExtraAttributes =
                             (org.apache.axiom.om.OMAttribute[])list.toArray(
                            new org.apache.axiom.om.OMAttribute[list.size()]);

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
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://www.ebxml.org/namespaces/messageHeader");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":Reference_type0",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "Reference_type0",
                           xmlWriter);
                   }

               
                   }
               
                                            if (localId != null){
                                        
                                                writeAttribute("http://www.ebxml.org/namespaces/messageHeader",
                                                         "id",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localId), xmlWriter);

                                            
                                      }
                                    
                                    
                                    if (localType != null){
                                        writeAttribute("http://www.w3.org/1999/xlink",
                                           "type",
                                           localType.toString(), xmlWriter);
                                    }
                                    
                                            if (localHref != null){
                                        
                                                writeAttribute("http://www.w3.org/1999/xlink",
                                                         "href",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localHref), xmlWriter);

                                            
                                      }
                                    
                                            if (localRole != null){
                                        
                                                writeAttribute("http://www.w3.org/1999/xlink",
                                                         "role",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRole), xmlWriter);

                                            
                                      }
                                    
                             if (localExtraAttributes != null) {
                                 for (int i=0;i <localExtraAttributes.length;i++){
                                     writeAttribute(localExtraAttributes[i].getNamespace().getName(),
                                                    localExtraAttributes[i].getLocalName(),
                                                    localExtraAttributes[i].getAttributeValue(),xmlWriter);
                                     }
                             }
                         if (localSchemaTracker){
                                       if (localSchema!=null){
                                            for (int i = 0;i < localSchema.length;i++){
                                                if (localSchema[i] != null){
                                                 localSchema[i].serialize(new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader","Schema"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                        // we don't have to do any thing since minOccures is zero
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("Schema cannot be null!!");
                                        
                                    }
                                 } if (localDescriptionTracker){
                                       if (localDescription!=null){
                                            for (int i = 0;i < localDescription.length;i++){
                                                if (localDescription[i] != null){
                                                 localDescription[i].serialize(new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader","Description"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                        // we don't have to do any thing since minOccures is zero
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("Description cannot be null!!");
                                        
                                    }
                                 } if (localExtraElementTracker){
                            
                            if (localExtraElement != null){
                                for (int i = 0;i < localExtraElement.length;i++){
                                    if (localExtraElement[i] != null){
                                        localExtraElement[i].serialize(xmlWriter);
                                    } else {
                                        
                                                // we have to do nothing since minOccures zero
                                            
                                    }
                                }
                            } else {
                                throw new org.apache.axis2.databinding.ADBException("extraElement cannot be null!!");
                            }
                        }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://www.ebxml.org/namespaces/messageHeader")){
                return "ns6";
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

                 if (localSchemaTracker){
                             if (localSchema!=null) {
                                 for (int i = 0;i < localSchema.length;i++){

                                    if (localSchema[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader",
                                                                          "Schema"));
                                         elementList.add(localSchema[i]);
                                    } else {
                                        
                                                // nothing to do
                                            
                                    }

                                 }
                             } else {
                                 
                                        throw new org.apache.axis2.databinding.ADBException("Schema cannot be null!!");
                                    
                             }

                        } if (localDescriptionTracker){
                             if (localDescription!=null) {
                                 for (int i = 0;i < localDescription.length;i++){

                                    if (localDescription[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader",
                                                                          "Description"));
                                         elementList.add(localDescription[i]);
                                    } else {
                                        
                                                // nothing to do
                                            
                                    }

                                 }
                             } else {
                                 
                                        throw new org.apache.axis2.databinding.ADBException("Description cannot be null!!");
                                    
                             }

                        } if (localExtraElementTracker){
                            if (localExtraElement != null) {
                                for (int i = 0;i < localExtraElement.length;i++){
                                    if (localExtraElement[i] != null){
                                       elementList.add(new javax.xml.namespace.QName("",
                                                                          "extraElement"));
                                      elementList.add(
                                      org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localExtraElement[i]));
                                    } else {
                                        
                                                // have to do nothing
                                            
                                    }

                                }
                            } else {
                               throw new org.apache.axis2.databinding.ADBException("extraElement cannot be null!!");
                            }
                        }
                            attribList.add(
                            new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader","id"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localId));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("http://www.w3.org/1999/xlink","type"));
                            
                                      attribList.add(localType.toString());
                                
                            attribList.add(
                            new javax.xml.namespace.QName("http://www.w3.org/1999/xlink","href"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localHref));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("http://www.w3.org/1999/xlink","role"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRole));
                                
                             for (int i=0;i <localExtraAttributes.length;i++){
                               attribList.add(org.apache.axis2.databinding.utils.Constants.OM_ATTRIBUTE_KEY);
                               attribList.add(localExtraAttributes[i]);
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
        public static Reference_type0 parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            Reference_type0 object =
                new Reference_type0();

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
                    
                            if (!"Reference_type0".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (Reference_type0)org.xmlsoap.schemas.soap.envelope.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    // handle attribute "id"
                    java.lang.String tempAttribId =
                        
                                reader.getAttributeValue("http://www.ebxml.org/namespaces/messageHeader","id");
                            
                   if (tempAttribId!=null){
                         java.lang.String content = tempAttribId;
                        
                                                 object.setId(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToID(tempAttribId));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("id");
                    
                    // handle attribute "type"
                    java.lang.String tempAttribType =
                        
                                reader.getAttributeValue("http://www.w3.org/1999/xlink","type");
                            
                   if (tempAttribType!=null){
                         java.lang.String content = tempAttribType;
                        
                                                  object.setType(
                                                        org.w3.www._1999.xlink.Type_type0.Factory.fromString(reader,tempAttribType));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("type");
                    
                    // handle attribute "href"
                    java.lang.String tempAttribHref =
                        
                                reader.getAttributeValue("http://www.w3.org/1999/xlink","href");
                            
                   if (tempAttribHref!=null){
                         java.lang.String content = tempAttribHref;
                        
                                                 object.setHref(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToAnyURI(tempAttribHref));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("href");
                    
                    // handle attribute "role"
                    java.lang.String tempAttribRole =
                        
                                reader.getAttributeValue("http://www.w3.org/1999/xlink","role");
                            
                   if (tempAttribRole!=null){
                         java.lang.String content = tempAttribRole;
                        
                                                 object.setRole(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToAnyURI(tempAttribRole));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("role");
                    
                        // now run through all any or extra attributes
                        // which were not reflected until now
                        for (int i=0; i < reader.getAttributeCount(); i++) {
                            if (!handledAttributes.contains(reader.getAttributeLocalName(i))) {
                                // this is an anyAttribute and we create
                                // an OMAttribute for this
                                org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();
                                org.apache.axiom.om.OMAttribute attr =
                                    factory.createOMAttribute(
                                            reader.getAttributeLocalName(i),
                                            factory.createOMNamespace(
                                                reader.getAttributeNamespace(i), reader.getAttributePrefix(i)),
                                            reader.getAttributeValue(i));

                                // and add it to the extra attributes
                                
                                         object.addExtraAttributes(attr);
                                    

                            }
                        }
                    
                    
                    reader.next();
                
                        java.util.ArrayList list1 = new java.util.ArrayList();
                    
                        java.util.ArrayList list2 = new java.util.ArrayList();
                    
                        java.util.ArrayList list3 = new java.util.ArrayList();
                    
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader","Schema").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list1.add(org.ebxml.www.namespaces.messageheader.Schema_type0.Factory.parse(reader));
                                                                
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
                                                                if (new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader","Schema").equals(reader.getName())){
                                                                    list1.add(org.ebxml.www.namespaces.messageheader.Schema_type0.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone1 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setSchema((org.ebxml.www.namespaces.messageheader.Schema_type0[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                org.ebxml.www.namespaces.messageheader.Schema_type0.class,
                                                                list1));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader","Description").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list2.add(org.ebxml.www.namespaces.messageheader.Description_type0.Factory.parse(reader));
                                                                
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
                                                                if (new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader","Description").equals(reader.getName())){
                                                                    list2.add(org.ebxml.www.namespaces.messageheader.Description_type0.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone2 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setDescription((org.ebxml.www.namespaces.messageheader.Description_type0[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                org.ebxml.www.namespaces.messageheader.Description_type0.class,
                                                                list2));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                   if (reader.isStartElement()){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                           boolean loopDone3=false;

                                             while (!loopDone3){
                                                 event = reader.getEventType();
                                                 if (javax.xml.stream.XMLStreamConstants.START_ELEMENT == event){

                                                      // We need to wrap the reader so that it produces a fake START_DOCUEMENT event
                                                      org.apache.axis2.databinding.utils.NamedStaxOMBuilder builder3
                                                         = new org.apache.axis2.databinding.utils.NamedStaxOMBuilder(
                                                              new org.apache.axis2.util.StreamWrapper(reader), reader.getName());

                                                       list3.add(builder3.getOMElement());
                                                        reader.next();
                                                        if (reader.isEndElement()) {
                                                            // we have two countinuos end elements
                                                           loopDone3 = true;
                                                        }

                                                 }else if (javax.xml.stream.XMLStreamConstants.END_ELEMENT == event){
                                                     loopDone3 = true;
                                                 }else{
                                                     reader.next();
                                                 }

                                             }

                                            
                                             object.setExtraElement((org.apache.axiom.om.OMElement[])
                                                 org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                     org.apache.axiom.om.OMElement.class,list3));
                                                
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
           
    