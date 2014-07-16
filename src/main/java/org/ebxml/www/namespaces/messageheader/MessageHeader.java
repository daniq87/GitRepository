
/**
 * MessageHeader.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package org.ebxml.www.namespaces.messageheader;
            

            /**
            *  MessageHeader bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class MessageHeader
        implements org.apache.axis2.databinding.ADBBean{
        
                public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://www.ebxml.org/namespaces/messageHeader",
                "MessageHeader",
                "ns6");

            

                        /**
                        * field for From
                        */

                        
                                    protected org.ebxml.www.namespaces.messageheader.From_type0 localFrom ;
                                

                           /**
                           * Auto generated getter method
                           * @return org.ebxml.www.namespaces.messageheader.From_type0
                           */
                           public  org.ebxml.www.namespaces.messageheader.From_type0 getFrom(){
                               return localFrom;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param From
                               */
                               public void setFrom(org.ebxml.www.namespaces.messageheader.From_type0 param){
                            
                                            this.localFrom=param;
                                    

                               }
                            

                        /**
                        * field for To
                        */

                        
                                    protected org.ebxml.www.namespaces.messageheader.To_type0 localTo ;
                                

                           /**
                           * Auto generated getter method
                           * @return org.ebxml.www.namespaces.messageheader.To_type0
                           */
                           public  org.ebxml.www.namespaces.messageheader.To_type0 getTo(){
                               return localTo;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param To
                               */
                               public void setTo(org.ebxml.www.namespaces.messageheader.To_type0 param){
                            
                                            this.localTo=param;
                                    

                               }
                            

                        /**
                        * field for CPAId
                        */

                        
                                    protected org.ebxml.www.namespaces.messageheader.NonEmptyString localCPAId ;
                                

                           /**
                           * Auto generated getter method
                           * @return org.ebxml.www.namespaces.messageheader.NonEmptyString
                           */
                           public  org.ebxml.www.namespaces.messageheader.NonEmptyString getCPAId(){
                               return localCPAId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CPAId
                               */
                               public void setCPAId(org.ebxml.www.namespaces.messageheader.NonEmptyString param){
                            
                                            this.localCPAId=param;
                                    

                               }
                            

                        /**
                        * field for ConversationId
                        */

                        
                                    protected org.ebxml.www.namespaces.messageheader.NonEmptyString localConversationId ;
                                

                           /**
                           * Auto generated getter method
                           * @return org.ebxml.www.namespaces.messageheader.NonEmptyString
                           */
                           public  org.ebxml.www.namespaces.messageheader.NonEmptyString getConversationId(){
                               return localConversationId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ConversationId
                               */
                               public void setConversationId(org.ebxml.www.namespaces.messageheader.NonEmptyString param){
                            
                                            this.localConversationId=param;
                                    

                               }
                            

                        /**
                        * field for Service
                        */

                        
                                    protected org.ebxml.www.namespaces.messageheader.Service_type1 localService ;
                                

                           /**
                           * Auto generated getter method
                           * @return org.ebxml.www.namespaces.messageheader.Service_type1
                           */
                           public  org.ebxml.www.namespaces.messageheader.Service_type1 getService(){
                               return localService;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Service
                               */
                               public void setService(org.ebxml.www.namespaces.messageheader.Service_type1 param){
                            
                                            this.localService=param;
                                    

                               }
                            

                        /**
                        * field for Action
                        */

                        
                                    protected org.ebxml.www.namespaces.messageheader.NonEmptyString localAction ;
                                

                           /**
                           * Auto generated getter method
                           * @return org.ebxml.www.namespaces.messageheader.NonEmptyString
                           */
                           public  org.ebxml.www.namespaces.messageheader.NonEmptyString getAction(){
                               return localAction;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Action
                               */
                               public void setAction(org.ebxml.www.namespaces.messageheader.NonEmptyString param){
                            
                                            this.localAction=param;
                                    

                               }
                            

                        /**
                        * field for MessageData
                        */

                        
                                    protected org.ebxml.www.namespaces.messageheader.MessageData_type0 localMessageData ;
                                

                           /**
                           * Auto generated getter method
                           * @return org.ebxml.www.namespaces.messageheader.MessageData_type0
                           */
                           public  org.ebxml.www.namespaces.messageheader.MessageData_type0 getMessageData(){
                               return localMessageData;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MessageData
                               */
                               public void setMessageData(org.ebxml.www.namespaces.messageheader.MessageData_type0 param){
                            
                                            this.localMessageData=param;
                                    

                               }
                            

                        /**
                        * field for DuplicateElimination
                        */

                        
                                    protected java.lang.Object localDuplicateElimination ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDuplicateEliminationTracker = false ;

                           public boolean isDuplicateEliminationSpecified(){
                               return localDuplicateEliminationTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.Object
                           */
                           public  java.lang.Object getDuplicateElimination(){
                               return localDuplicateElimination;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DuplicateElimination
                               */
                               public void setDuplicateElimination(java.lang.Object param){
                            localDuplicateEliminationTracker = param != null;
                                   
                                            this.localDuplicateElimination=param;
                                    

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
                        * field for Version
                        * This was an Attribute!
                        */

                        
                                    protected org.ebxml.www.namespaces.messageheader.NonEmptyString localVersion ;
                                

                           /**
                           * Auto generated getter method
                           * @return org.ebxml.www.namespaces.messageheader.NonEmptyString
                           */
                           public  org.ebxml.www.namespaces.messageheader.NonEmptyString getVersion(){
                               return localVersion;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Version
                               */
                               public void setVersion(org.ebxml.www.namespaces.messageheader.NonEmptyString param){
                            
                                            this.localVersion=param;
                                    

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
                       new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME);
               return factory.createOMElement(dataSource,MY_QNAME);
            
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
                           namespacePrefix+":MessageHeader",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "MessageHeader",
                           xmlWriter);
                   }

               
                   }
               
                                            if (localId != null){
                                        
                                                writeAttribute("http://www.ebxml.org/namespaces/messageHeader",
                                                         "id",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localId), xmlWriter);

                                            
                                      }
                                    
                                    
                                    if (localVersion != null){
                                        writeAttribute("http://www.ebxml.org/namespaces/messageHeader",
                                           "version",
                                           localVersion.toString(), xmlWriter);
                                    }
                                    
                                            if (localFrom==null){
                                                 throw new org.apache.axis2.databinding.ADBException("From cannot be null!!");
                                            }
                                           localFrom.serialize(new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader","From"),
                                               xmlWriter);
                                        
                                            if (localTo==null){
                                                 throw new org.apache.axis2.databinding.ADBException("To cannot be null!!");
                                            }
                                           localTo.serialize(new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader","To"),
                                               xmlWriter);
                                        
                                            if (localCPAId==null){
                                                 throw new org.apache.axis2.databinding.ADBException("CPAId cannot be null!!");
                                            }
                                           localCPAId.serialize(new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader","CPAId"),
                                               xmlWriter);
                                        
                                            if (localConversationId==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ConversationId cannot be null!!");
                                            }
                                           localConversationId.serialize(new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader","ConversationId"),
                                               xmlWriter);
                                        
                                            if (localService==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Service cannot be null!!");
                                            }
                                           localService.serialize(new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader","Service"),
                                               xmlWriter);
                                        
                                            if (localAction==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Action cannot be null!!");
                                            }
                                           localAction.serialize(new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader","Action"),
                                               xmlWriter);
                                        
                                            if (localMessageData==null){
                                                 throw new org.apache.axis2.databinding.ADBException("MessageData cannot be null!!");
                                            }
                                           localMessageData.serialize(new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader","MessageData"),
                                               xmlWriter);
                                         if (localDuplicateEliminationTracker){
                            
                            if (localDuplicateElimination!=null){
                                if (localDuplicateElimination instanceof org.apache.axis2.databinding.ADBBean){
                                    ((org.apache.axis2.databinding.ADBBean)localDuplicateElimination).serialize(
                                               new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader","DuplicateElimination"),
                                               xmlWriter,true);
                                 } else {
                                    writeStartElement(null, "http://www.ebxml.org/namespaces/messageHeader", "DuplicateElimination", xmlWriter);
                                    org.apache.axis2.databinding.utils.ConverterUtil.serializeAnyType(localDuplicateElimination, xmlWriter);
                                    xmlWriter.writeEndElement();
                                 }
                            } else {
                                
                                         throw new org.apache.axis2.databinding.ADBException("DuplicateElimination cannot be null!!");
                                    
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

                
                            elementList.add(new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader",
                                                                      "From"));
                            
                            
                                    if (localFrom==null){
                                         throw new org.apache.axis2.databinding.ADBException("From cannot be null!!");
                                    }
                                    elementList.add(localFrom);
                                
                            elementList.add(new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader",
                                                                      "To"));
                            
                            
                                    if (localTo==null){
                                         throw new org.apache.axis2.databinding.ADBException("To cannot be null!!");
                                    }
                                    elementList.add(localTo);
                                
                            elementList.add(new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader",
                                                                      "CPAId"));
                            
                            
                                    if (localCPAId==null){
                                         throw new org.apache.axis2.databinding.ADBException("CPAId cannot be null!!");
                                    }
                                    elementList.add(localCPAId);
                                
                            elementList.add(new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader",
                                                                      "ConversationId"));
                            
                            
                                    if (localConversationId==null){
                                         throw new org.apache.axis2.databinding.ADBException("ConversationId cannot be null!!");
                                    }
                                    elementList.add(localConversationId);
                                
                            elementList.add(new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader",
                                                                      "Service"));
                            
                            
                                    if (localService==null){
                                         throw new org.apache.axis2.databinding.ADBException("Service cannot be null!!");
                                    }
                                    elementList.add(localService);
                                
                            elementList.add(new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader",
                                                                      "Action"));
                            
                            
                                    if (localAction==null){
                                         throw new org.apache.axis2.databinding.ADBException("Action cannot be null!!");
                                    }
                                    elementList.add(localAction);
                                
                            elementList.add(new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader",
                                                                      "MessageData"));
                            
                            
                                    if (localMessageData==null){
                                         throw new org.apache.axis2.databinding.ADBException("MessageData cannot be null!!");
                                    }
                                    elementList.add(localMessageData);
                                 if (localDuplicateEliminationTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader",
                                                                      "DuplicateElimination"));
                            
                            
                                    if (localDuplicateElimination==null){
                                         throw new org.apache.axis2.databinding.ADBException("DuplicateElimination cannot be null!!");
                                    }
                                    elementList.add(localDuplicateElimination);
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
                            new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader","version"));
                            
                                      attribList.add(localVersion.toString());
                                

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
        public static MessageHeader parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            MessageHeader object =
                new MessageHeader();

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
                    
                            if (!"MessageHeader".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (MessageHeader)org.xmlsoap.schemas.soap.envelope.ExtensionMapper.getTypeObject(
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
                    
                    // handle attribute "version"
                    java.lang.String tempAttribVersion =
                        
                                reader.getAttributeValue("http://www.ebxml.org/namespaces/messageHeader","version");
                            
                   if (tempAttribVersion!=null){
                         java.lang.String content = tempAttribVersion;
                        
                                                  object.setVersion(
                                                        org.ebxml.www.namespaces.messageheader.NonEmptyString.Factory.fromString(reader,tempAttribVersion));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("version");
                    
                    
                    reader.next();
                
                        java.util.ArrayList list9 = new java.util.ArrayList();
                    
                        java.util.ArrayList list10 = new java.util.ArrayList();
                    
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader","From").equals(reader.getName())){
                                
                                                object.setFrom(org.ebxml.www.namespaces.messageheader.From_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader","To").equals(reader.getName())){
                                
                                                object.setTo(org.ebxml.www.namespaces.messageheader.To_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader","CPAId").equals(reader.getName())){
                                
                                                object.setCPAId(org.ebxml.www.namespaces.messageheader.NonEmptyString.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader","ConversationId").equals(reader.getName())){
                                
                                                object.setConversationId(org.ebxml.www.namespaces.messageheader.NonEmptyString.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader","Service").equals(reader.getName())){
                                
                                                object.setService(org.ebxml.www.namespaces.messageheader.Service_type1.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader","Action").equals(reader.getName())){
                                
                                                object.setAction(org.ebxml.www.namespaces.messageheader.NonEmptyString.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader","MessageData").equals(reader.getName())){
                                
                                                object.setMessageData(org.ebxml.www.namespaces.messageheader.MessageData_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader","DuplicateElimination").equals(reader.getName())){
                                
                                     object.setDuplicateElimination(org.apache.axis2.databinding.utils.ConverterUtil.getAnyTypeObject(reader,
                                                org.xmlsoap.schemas.soap.envelope.ExtensionMapper.class));
                                       
                                         reader.next();
                                     
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader","Description").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list9.add(org.ebxml.www.namespaces.messageheader.Description_type0.Factory.parse(reader));
                                                                
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone9 = false;
                                                        while(!loopDone9){
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
                                                                loopDone9 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader","Description").equals(reader.getName())){
                                                                    list9.add(org.ebxml.www.namespaces.messageheader.Description_type0.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone9 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setDescription((org.ebxml.www.namespaces.messageheader.Description_type0[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                org.ebxml.www.namespaces.messageheader.Description_type0.class,
                                                                list9));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                   if (reader.isStartElement()){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                           boolean loopDone10=false;

                                             while (!loopDone10){
                                                 event = reader.getEventType();
                                                 if (javax.xml.stream.XMLStreamConstants.START_ELEMENT == event){

                                                      // We need to wrap the reader so that it produces a fake START_DOCUEMENT event
                                                      org.apache.axis2.databinding.utils.NamedStaxOMBuilder builder10
                                                         = new org.apache.axis2.databinding.utils.NamedStaxOMBuilder(
                                                              new org.apache.axis2.util.StreamWrapper(reader), reader.getName());

                                                       list10.add(builder10.getOMElement());
                                                        reader.next();
                                                        if (reader.isEndElement()) {
                                                            // we have two countinuos end elements
                                                           loopDone10 = true;
                                                        }

                                                 }else if (javax.xml.stream.XMLStreamConstants.END_ELEMENT == event){
                                                     loopDone10 = true;
                                                 }else{
                                                     reader.next();
                                                 }

                                             }

                                            
                                             object.setExtraElement((org.apache.axiom.om.OMElement[])
                                                 org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                     org.apache.axiom.om.OMElement.class,list10));
                                                
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
           
    