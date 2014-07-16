
/**
 * PersonName_type1.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.sabre.webservices.sabrexml._2011._10;
            

            /**
            *  PersonName_type1 bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class PersonName_type1
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = PersonName_type1
                Namespace URI = http://webservices.sabre.com/sabreXML/2011/10
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for Email
                        * This was an Array!
                        */

                        
                                    protected java.lang.String[] localEmail ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localEmailTracker = false ;

                           public boolean isEmailSpecified(){
                               return localEmailTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String[]
                           */
                           public  java.lang.String[] getEmail(){
                               return localEmail;
                           }

                           
                        


                               
                              /**
                               * validate the array for Email
                               */
                              protected void validateEmail(java.lang.String[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param Email
                              */
                              public void setEmail(java.lang.String[] param){
                              
                                   validateEmail(param);

                               localEmailTracker = param != null;
                                      
                                      this.localEmail=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param java.lang.String
                             */
                             public void addEmail(java.lang.String param){
                                   if (localEmail == null){
                                   localEmail = new java.lang.String[]{};
                                   }

                            
                                 //update the setting tracker
                                localEmailTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localEmail);
                               list.add(param);
                               this.localEmail =
                             (java.lang.String[])list.toArray(
                            new java.lang.String[list.size()]);

                             }
                             

                        /**
                        * field for GivenName
                        */

                        
                                    protected java.lang.String localGivenName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGivenNameTracker = false ;

                           public boolean isGivenNameSpecified(){
                               return localGivenNameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getGivenName(){
                               return localGivenName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GivenName
                               */
                               public void setGivenName(java.lang.String param){
                            localGivenNameTracker = param != null;
                                   
                                            this.localGivenName=param;
                                    

                               }
                            

                        /**
                        * field for GroupInfo
                        */

                        
                                    protected com.sabre.webservices.sabrexml._2011._10.GroupInfo_type0 localGroupInfo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGroupInfoTracker = false ;

                           public boolean isGroupInfoSpecified(){
                               return localGroupInfoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.sabre.webservices.sabrexml._2011._10.GroupInfo_type0
                           */
                           public  com.sabre.webservices.sabrexml._2011._10.GroupInfo_type0 getGroupInfo(){
                               return localGroupInfo;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GroupInfo
                               */
                               public void setGroupInfo(com.sabre.webservices.sabrexml._2011._10.GroupInfo_type0 param){
                            localGroupInfoTracker = param != null;
                                   
                                            this.localGroupInfo=param;
                                    

                               }
                            

                        /**
                        * field for ProfileIndex
                        * This was an Array!
                        */

                        
                                    protected java.lang.String[] localProfileIndex ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localProfileIndexTracker = false ;

                           public boolean isProfileIndexSpecified(){
                               return localProfileIndexTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String[]
                           */
                           public  java.lang.String[] getProfileIndex(){
                               return localProfileIndex;
                           }

                           
                        


                               
                              /**
                               * validate the array for ProfileIndex
                               */
                              protected void validateProfileIndex(java.lang.String[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param ProfileIndex
                              */
                              public void setProfileIndex(java.lang.String[] param){
                              
                                   validateProfileIndex(param);

                               localProfileIndexTracker = param != null;
                                      
                                      this.localProfileIndex=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param java.lang.String
                             */
                             public void addProfileIndex(java.lang.String param){
                                   if (localProfileIndex == null){
                                   localProfileIndex = new java.lang.String[]{};
                                   }

                            
                                 //update the setting tracker
                                localProfileIndexTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localProfileIndex);
                               list.add(param);
                               this.localProfileIndex =
                             (java.lang.String[])list.toArray(
                            new java.lang.String[list.size()]);

                             }
                             

                        /**
                        * field for Surname
                        */

                        
                                    protected java.lang.String localSurname ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSurnameTracker = false ;

                           public boolean isSurnameSpecified(){
                               return localSurnameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSurname(){
                               return localSurname;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Surname
                               */
                               public void setSurname(java.lang.String param){
                            localSurnameTracker = param != null;
                                   
                                            this.localSurname=param;
                                    

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
                        * field for NameReference
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localNameReference ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getNameReference(){
                               return localNameReference;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NameReference
                               */
                               public void setNameReference(java.lang.String param){
                            
                                            this.localNameReference=param;
                                    

                               }
                            

                        /**
                        * field for PassengerType
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localPassengerType ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPassengerType(){
                               return localPassengerType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PassengerType
                               */
                               public void setPassengerType(java.lang.String param){
                            
                                            this.localPassengerType=param;
                                    

                               }
                            

                        /**
                        * field for RPH
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localRPH ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getRPH(){
                               return localRPH;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RPH
                               */
                               public void setRPH(java.lang.String param){
                            
                                            this.localRPH=param;
                                    

                               }
                            

                        /**
                        * field for Infant
                        * This was an Attribute!
                        */

                        
                                    protected boolean localInfant ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getInfant(){
                               return localInfant;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Infant
                               */
                               public void setInfant(boolean param){
                            
                                            this.localInfant=param;
                                    

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
                           namespacePrefix+":PersonName_type1",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "PersonName_type1",
                           xmlWriter);
                   }

               
                   }
               
                                            if (localNameNumber != null){
                                        
                                                writeAttribute("",
                                                         "NameNumber",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNameNumber), xmlWriter);

                                            
                                      }
                                    
                                            if (localNameReference != null){
                                        
                                                writeAttribute("",
                                                         "NameReference",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNameReference), xmlWriter);

                                            
                                      }
                                    
                                            if (localPassengerType != null){
                                        
                                                writeAttribute("",
                                                         "PassengerType",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPassengerType), xmlWriter);

                                            
                                      }
                                    
                                            if (localRPH != null){
                                        
                                                writeAttribute("",
                                                         "RPH",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRPH), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "Infant",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localInfant), xmlWriter);

                                            
                                      }
                                     if (localEmailTracker){
                             if (localEmail!=null) {
                                   namespace = "http://webservices.sabre.com/sabreXML/2011/10";
                                   for (int i = 0;i < localEmail.length;i++){
                                        
                                            if (localEmail[i] != null){
                                        
                                                writeStartElement(null, namespace, "Email", xmlWriter);

                                            
                                                        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEmail[i]));
                                                    
                                                xmlWriter.writeEndElement();
                                              
                                                } else {
                                                   
                                                           // we have to do nothing since minOccurs is zero
                                                       
                                                }

                                   }
                             } else {
                                 
                                         throw new org.apache.axis2.databinding.ADBException("Email cannot be null!!");
                                    
                             }

                        } if (localGivenNameTracker){
                                    namespace = "http://webservices.sabre.com/sabreXML/2011/10";
                                    writeStartElement(null, namespace, "GivenName", xmlWriter);
                             

                                          if (localGivenName==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("GivenName cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localGivenName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localGroupInfoTracker){
                                            if (localGroupInfo==null){
                                                 throw new org.apache.axis2.databinding.ADBException("GroupInfo cannot be null!!");
                                            }
                                           localGroupInfo.serialize(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","GroupInfo"),
                                               xmlWriter);
                                        } if (localProfileIndexTracker){
                             if (localProfileIndex!=null) {
                                   namespace = "http://webservices.sabre.com/sabreXML/2011/10";
                                   for (int i = 0;i < localProfileIndex.length;i++){
                                        
                                            if (localProfileIndex[i] != null){
                                        
                                                writeStartElement(null, namespace, "ProfileIndex", xmlWriter);

                                            
                                                        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localProfileIndex[i]));
                                                    
                                                xmlWriter.writeEndElement();
                                              
                                                } else {
                                                   
                                                           // we have to do nothing since minOccurs is zero
                                                       
                                                }

                                   }
                             } else {
                                 
                                         throw new org.apache.axis2.databinding.ADBException("ProfileIndex cannot be null!!");
                                    
                             }

                        } if (localSurnameTracker){
                                    namespace = "http://webservices.sabre.com/sabreXML/2011/10";
                                    writeStartElement(null, namespace, "Surname", xmlWriter);
                             

                                          if (localSurname==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Surname cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localSurname);
                                            
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

                 if (localEmailTracker){
                            if (localEmail!=null){
                                  for (int i = 0;i < localEmail.length;i++){
                                      
                                         if (localEmail[i] != null){
                                          elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                              "Email"));
                                          elementList.add(
                                          org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEmail[i]));
                                          } else {
                                             
                                                    // have to do nothing
                                                
                                          }
                                      

                                  }
                            } else {
                              
                                    throw new org.apache.axis2.databinding.ADBException("Email cannot be null!!");
                                
                            }

                        } if (localGivenNameTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                      "GivenName"));
                                 
                                        if (localGivenName != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGivenName));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("GivenName cannot be null!!");
                                        }
                                    } if (localGroupInfoTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                      "GroupInfo"));
                            
                            
                                    if (localGroupInfo==null){
                                         throw new org.apache.axis2.databinding.ADBException("GroupInfo cannot be null!!");
                                    }
                                    elementList.add(localGroupInfo);
                                } if (localProfileIndexTracker){
                            if (localProfileIndex!=null){
                                  for (int i = 0;i < localProfileIndex.length;i++){
                                      
                                         if (localProfileIndex[i] != null){
                                          elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                              "ProfileIndex"));
                                          elementList.add(
                                          org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localProfileIndex[i]));
                                          } else {
                                             
                                                    // have to do nothing
                                                
                                          }
                                      

                                  }
                            } else {
                              
                                    throw new org.apache.axis2.databinding.ADBException("ProfileIndex cannot be null!!");
                                
                            }

                        } if (localSurnameTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10",
                                                                      "Surname"));
                                 
                                        if (localSurname != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSurname));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Surname cannot be null!!");
                                        }
                                    }
                            attribList.add(
                            new javax.xml.namespace.QName("","NameNumber"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNameNumber));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","NameReference"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNameReference));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","PassengerType"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPassengerType));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","RPH"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRPH));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","Infant"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localInfant));
                                

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
        public static PersonName_type1 parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            PersonName_type1 object =
                new PersonName_type1();

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
                    
                            if (!"PersonName_type1".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (PersonName_type1)org.xmlsoap.schemas.soap.envelope.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
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
                    
                    // handle attribute "NameReference"
                    java.lang.String tempAttribNameReference =
                        
                                reader.getAttributeValue(null,"NameReference");
                            
                   if (tempAttribNameReference!=null){
                         java.lang.String content = tempAttribNameReference;
                        
                                                 object.setNameReference(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribNameReference));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("NameReference");
                    
                    // handle attribute "PassengerType"
                    java.lang.String tempAttribPassengerType =
                        
                                reader.getAttributeValue(null,"PassengerType");
                            
                   if (tempAttribPassengerType!=null){
                         java.lang.String content = tempAttribPassengerType;
                        
                                                 object.setPassengerType(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribPassengerType));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("PassengerType");
                    
                    // handle attribute "RPH"
                    java.lang.String tempAttribRPH =
                        
                                reader.getAttributeValue(null,"RPH");
                            
                   if (tempAttribRPH!=null){
                         java.lang.String content = tempAttribRPH;
                        
                                                 object.setRPH(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribRPH));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("RPH");
                    
                    // handle attribute "Infant"
                    java.lang.String tempAttribInfant =
                        
                                reader.getAttributeValue(null,"Infant");
                            
                   if (tempAttribInfant!=null){
                         java.lang.String content = tempAttribInfant;
                        
                                                 object.setInfant(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribInfant));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("Infant");
                    
                    
                    reader.next();
                
                        java.util.ArrayList list1 = new java.util.ArrayList();
                    
                        java.util.ArrayList list4 = new java.util.ArrayList();
                    
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","Email").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list1.add(reader.getElementText());
                                            
                                            //loop until we find a start element that is not part of this array
                                            boolean loopDone1 = false;
                                            while(!loopDone1){
                                                // Ensure we are at the EndElement
                                                while (!reader.isEndElement()){
                                                    reader.next();
                                                }
                                                // Step out of this element
                                                reader.next();
                                                // Step to next element event.
                                                while (!reader.isStartElement() && !reader.isEndElement())
                                                    reader.next();
                                                if (reader.isEndElement()){
                                                    //two continuous end elements means we are exiting the xml structure
                                                    loopDone1 = true;
                                                } else {
                                                    if (new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","Email").equals(reader.getName())){
                                                         list1.add(reader.getElementText());
                                                        
                                                    }else{
                                                        loopDone1 = true;
                                                    }
                                                }
                                            }
                                            // call the converter utility  to convert and set the array
                                            
                                                    object.setEmail((java.lang.String[])
                                                        list1.toArray(new java.lang.String[list1.size()]));
                                                
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","GivenName").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"GivenName" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setGivenName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","GroupInfo").equals(reader.getName())){
                                
                                                object.setGroupInfo(com.sabre.webservices.sabrexml._2011._10.GroupInfo_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","ProfileIndex").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list4.add(reader.getElementText());
                                            
                                            //loop until we find a start element that is not part of this array
                                            boolean loopDone4 = false;
                                            while(!loopDone4){
                                                // Ensure we are at the EndElement
                                                while (!reader.isEndElement()){
                                                    reader.next();
                                                }
                                                // Step out of this element
                                                reader.next();
                                                // Step to next element event.
                                                while (!reader.isStartElement() && !reader.isEndElement())
                                                    reader.next();
                                                if (reader.isEndElement()){
                                                    //two continuous end elements means we are exiting the xml structure
                                                    loopDone4 = true;
                                                } else {
                                                    if (new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","ProfileIndex").equals(reader.getName())){
                                                         list4.add(reader.getElementText());
                                                        
                                                    }else{
                                                        loopDone4 = true;
                                                    }
                                                }
                                            }
                                            // call the converter utility  to convert and set the array
                                            
                                                    object.setProfileIndex((java.lang.String[])
                                                        list4.toArray(new java.lang.String[list4.size()]));
                                                
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.sabre.com/sabreXML/2011/10","Surname").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Surname" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSurname(
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
           
    