
/**
 * IdentifierSystem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.sabre.services.stl_header.v120;
            

            /**
            *  IdentifierSystem bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class IdentifierSystem extends com.sabre.services.stl_header.v120.Identifier
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = Identifier.System
                Namespace URI = http://services.sabre.com/STL_Header/v120
                Namespace Prefix = ns2
                */
            

                        /**
                        * field for Identifier
                        */

                        

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getIdentifier(){
                               return localIdentifier;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Identifier
                               */
                               public void setIdentifier(java.lang.String param){
                            
                                            if (  (1 <= java.lang.String.valueOf(param).length()) &&  (java.lang.String.valueOf(param).length() <= 255)  ) {
                                                this.localIdentifier=param;
                                            }
                                            else {
                                                throw new java.lang.RuntimeException();
                                            }
                                        

                               }
                            

                            public java.lang.String toString(){
                                
                                        return localIdentifier.toString();
                                    
                            }
                        

                        /**
                        * field for Instance
                        * This was an Attribute!
                        */

                        
                                    protected com.sabre.services.stl_header.v120.Identifier localInstance ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.sabre.services.stl_header.v120.Identifier
                           */
                           public  com.sabre.services.stl_header.v120.Identifier getInstance(){
                               return localInstance;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Instance
                               */
                               public void setInstance(com.sabre.services.stl_header.v120.Identifier param){
                            
                                            this.localInstance=param;
                                    

                               }
                            

                        /**
                        * field for Cluster
                        * This was an Attribute!
                        */

                        
                                    protected com.sabre.services.stl_header.v120.Identifier localCluster ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.sabre.services.stl_header.v120.Identifier
                           */
                           public  com.sabre.services.stl_header.v120.Identifier getCluster(){
                               return localCluster;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Cluster
                               */
                               public void setCluster(com.sabre.services.stl_header.v120.Identifier param){
                            
                                            this.localCluster=param;
                                    

                               }
                            

                        /**
                        * field for Host
                        * This was an Attribute!
                        */

                        
                                    protected com.sabre.services.stl_header.v120.Identifier localHost ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.sabre.services.stl_header.v120.Identifier
                           */
                           public  com.sabre.services.stl_header.v120.Identifier getHost(){
                               return localHost;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Host
                               */
                               public void setHost(com.sabre.services.stl_header.v120.Identifier param){
                            
                                            this.localHost=param;
                                    

                               }
                            

                        /**
                        * field for Uri
                        * This was an Attribute!
                        */

                        
                                    protected com.sabre.services.stl_header.v120.Identifier localUri ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.sabre.services.stl_header.v120.Identifier
                           */
                           public  com.sabre.services.stl_header.v120.Identifier getUri(){
                               return localUri;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Uri
                               */
                               public void setUri(com.sabre.services.stl_header.v120.Identifier param){
                            
                                            this.localUri=param;
                                    

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
                

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://services.sabre.com/STL_Header/v120");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":Identifier.System",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "Identifier.System",
                           xmlWriter);
                   }

               
                                    
                                    if (localInstance != null){
                                        writeAttribute("",
                                           "instance",
                                           localInstance.toString(), xmlWriter);
                                    }
                                    
                                    
                                    if (localCluster != null){
                                        writeAttribute("",
                                           "cluster",
                                           localCluster.toString(), xmlWriter);
                                    }
                                    
                                    
                                    if (localHost != null){
                                        writeAttribute("",
                                           "host",
                                           localHost.toString(), xmlWriter);
                                    }
                                    
                                    
                                    if (localUri != null){
                                        writeAttribute("",
                                           "uri",
                                           localUri.toString(), xmlWriter);
                                    }
                                    

                                          if (localIdentifier==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Identifier cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localIdentifier);
                                            
                                          }
                                    
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://services.sabre.com/STL_Header/v120")){
                return "ns2";
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

                
                    attribList.add(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema-instance","type"));
                    attribList.add(new javax.xml.namespace.QName("http://services.sabre.com/STL_Header/v120","Identifier.System"));
                
                                     
                                     elementList.add(org.apache.axis2.databinding.utils.reader.ADBXMLStreamReader.ELEMENT_TEXT);
                                 
                                        if (localIdentifier != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIdentifier));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Identifier cannot be null!!");
                                        }
                                    
                            attribList.add(
                            new javax.xml.namespace.QName("","instance"));
                            
                                      attribList.add(localInstance.toString());
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","cluster"));
                            
                                      attribList.add(localCluster.toString());
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","host"));
                            
                                      attribList.add(localHost.toString());
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","uri"));
                            
                                      attribList.add(localUri.toString());
                                

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        
                public static IdentifierSystem fromString(java.lang.String value,
                                                    java.lang.String namespaceURI){
                    IdentifierSystem returnValue = new  IdentifierSystem();
                    
                            returnValue.setIdentifier(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(value));
                        

                    return returnValue;
                }

                public static IdentifierSystem fromString(javax.xml.stream.XMLStreamReader xmlStreamReader,
                                                                    java.lang.String content) {
                    if (content.indexOf(":") > -1){
                        java.lang.String prefix = content.substring(0,content.indexOf(":"));
                        java.lang.String namespaceUri = xmlStreamReader.getNamespaceContext().getNamespaceURI(prefix);
                        return IdentifierSystem.Factory.fromString(content,namespaceUri);
                    } else {
                       return IdentifierSystem.Factory.fromString(content,"");
                    }
                }

            

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static IdentifierSystem parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            IdentifierSystem object =
                new IdentifierSystem();

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
                    
                            if (!"Identifier.System".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (IdentifierSystem)org.xmlsoap.schemas.soap.envelope.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    // handle attribute "instance"
                    java.lang.String tempAttribInstance =
                        
                                reader.getAttributeValue(null,"instance");
                            
                   if (tempAttribInstance!=null){
                         java.lang.String content = tempAttribInstance;
                        
                                                  object.setInstance(
                                                        com.sabre.services.stl_header.v120.Identifier.Factory.fromString(reader,tempAttribInstance));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("instance");
                    
                    // handle attribute "cluster"
                    java.lang.String tempAttribCluster =
                        
                                reader.getAttributeValue(null,"cluster");
                            
                   if (tempAttribCluster!=null){
                         java.lang.String content = tempAttribCluster;
                        
                                                  object.setCluster(
                                                        com.sabre.services.stl_header.v120.Identifier.Factory.fromString(reader,tempAttribCluster));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("cluster");
                    
                    // handle attribute "host"
                    java.lang.String tempAttribHost =
                        
                                reader.getAttributeValue(null,"host");
                            
                   if (tempAttribHost!=null){
                         java.lang.String content = tempAttribHost;
                        
                                                  object.setHost(
                                                        com.sabre.services.stl_header.v120.Identifier.Factory.fromString(reader,tempAttribHost));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("host");
                    
                    // handle attribute "uri"
                    java.lang.String tempAttribUri =
                        
                                reader.getAttributeValue(null,"uri");
                            
                   if (tempAttribUri!=null){
                         java.lang.String content = tempAttribUri;
                        
                                                  object.setUri(
                                                        com.sabre.services.stl_header.v120.Identifier.Factory.fromString(reader,tempAttribUri));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("uri");
                       
                while(!reader.isEndElement()) {
                    if (reader.isStartElement()  || reader.hasText()){
                
                                    if (reader.isStartElement()  || reader.hasText()){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Identifier" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setIdentifier(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                              }  // End of if for expected property start element
                                
                             else{
                                        // A start element we are not expecting indicates an invalid parameter was passed
                                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                             }
                          
                             } else {
                                reader.next();
                             }  
                           }  // end of while loop
                        



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
    