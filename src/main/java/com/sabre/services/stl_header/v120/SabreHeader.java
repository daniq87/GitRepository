
/**
 * SabreHeader.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.sabre.services.stl_header.v120;
            

            /**
            *  SabreHeader bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class SabreHeader
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = SabreHeader
                Namespace URI = http://services.sabre.com/STL_Header/v120
                Namespace Prefix = ns2
                */
            

                        /**
                        * field for Service
                        */

                        
                                    protected com.sabre.services.stl_header.v120.Service localService ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.sabre.services.stl_header.v120.Service
                           */
                           public  com.sabre.services.stl_header.v120.Service getService(){
                               return localService;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Service
                               */
                               public void setService(com.sabre.services.stl_header.v120.Service param){
                            
                                            this.localService=param;
                                    

                               }
                            

                        /**
                        * field for Identification
                        */

                        
                                    protected com.sabre.services.stl_header.v120.Identification localIdentification ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.sabre.services.stl_header.v120.Identification
                           */
                           public  com.sabre.services.stl_header.v120.Identification getIdentification(){
                               return localIdentification;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Identification
                               */
                               public void setIdentification(com.sabre.services.stl_header.v120.Identification param){
                            
                                            this.localIdentification=param;
                                    

                               }
                            

                        /**
                        * field for ResultSummary
                        */

                        
                                    protected com.sabre.services.stl_header.v120.ResultSummary localResultSummary ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localResultSummaryTracker = false ;

                           public boolean isResultSummarySpecified(){
                               return localResultSummaryTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.sabre.services.stl_header.v120.ResultSummary
                           */
                           public  com.sabre.services.stl_header.v120.ResultSummary getResultSummary(){
                               return localResultSummary;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ResultSummary
                               */
                               public void setResultSummary(com.sabre.services.stl_header.v120.ResultSummary param){
                            localResultSummaryTracker = param != null;
                                   
                                            this.localResultSummary=param;
                                    

                               }
                            

                        /**
                        * field for Security
                        */

                        
                                    protected com.sabre.services.stl_header.v120.Security localSecurity ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSecurityTracker = false ;

                           public boolean isSecuritySpecified(){
                               return localSecurityTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.sabre.services.stl_header.v120.Security
                           */
                           public  com.sabre.services.stl_header.v120.Security getSecurity(){
                               return localSecurity;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Security
                               */
                               public void setSecurity(com.sabre.services.stl_header.v120.Security param){
                            localSecurityTracker = param != null;
                                   
                                            this.localSecurity=param;
                                    

                               }
                            

                        /**
                        * field for Traces
                        */

                        
                                    protected com.sabre.services.stl_header.v120.Traces localTraces ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTracesTracker = false ;

                           public boolean isTracesSpecified(){
                               return localTracesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.sabre.services.stl_header.v120.Traces
                           */
                           public  com.sabre.services.stl_header.v120.Traces getTraces(){
                               return localTraces;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Traces
                               */
                               public void setTraces(com.sabre.services.stl_header.v120.Traces param){
                            localTracesTracker = param != null;
                                   
                                            this.localTraces=param;
                                    

                               }
                            

                        /**
                        * field for Diagnostics
                        */

                        
                                    protected com.sabre.services.stl_header.v120.Diagnostics localDiagnostics ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDiagnosticsTracker = false ;

                           public boolean isDiagnosticsSpecified(){
                               return localDiagnosticsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.sabre.services.stl_header.v120.Diagnostics
                           */
                           public  com.sabre.services.stl_header.v120.Diagnostics getDiagnostics(){
                               return localDiagnostics;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Diagnostics
                               */
                               public void setDiagnostics(com.sabre.services.stl_header.v120.Diagnostics param){
                            localDiagnosticsTracker = param != null;
                                   
                                            this.localDiagnostics=param;
                                    

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
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://services.sabre.com/STL_Header/v120");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":SabreHeader",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "SabreHeader",
                           xmlWriter);
                   }

               
                   }
               
                                            if (localService==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Service cannot be null!!");
                                            }
                                           localService.serialize(new javax.xml.namespace.QName("http://services.sabre.com/STL_Header/v120","Service"),
                                               xmlWriter);
                                        
                                            if (localIdentification==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Identification cannot be null!!");
                                            }
                                           localIdentification.serialize(new javax.xml.namespace.QName("http://services.sabre.com/STL_Header/v120","Identification"),
                                               xmlWriter);
                                         if (localResultSummaryTracker){
                                            if (localResultSummary==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ResultSummary cannot be null!!");
                                            }
                                           localResultSummary.serialize(new javax.xml.namespace.QName("http://services.sabre.com/STL_Header/v120","ResultSummary"),
                                               xmlWriter);
                                        } if (localSecurityTracker){
                                            if (localSecurity==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Security cannot be null!!");
                                            }
                                           localSecurity.serialize(new javax.xml.namespace.QName("http://services.sabre.com/STL_Header/v120","Security"),
                                               xmlWriter);
                                        } if (localTracesTracker){
                                            if (localTraces==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Traces cannot be null!!");
                                            }
                                           localTraces.serialize(new javax.xml.namespace.QName("http://services.sabre.com/STL_Header/v120","Traces"),
                                               xmlWriter);
                                        } if (localDiagnosticsTracker){
                                            if (localDiagnostics==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Diagnostics cannot be null!!");
                                            }
                                           localDiagnostics.serialize(new javax.xml.namespace.QName("http://services.sabre.com/STL_Header/v120","Diagnostics"),
                                               xmlWriter);
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

                
                            elementList.add(new javax.xml.namespace.QName("http://services.sabre.com/STL_Header/v120",
                                                                      "Service"));
                            
                            
                                    if (localService==null){
                                         throw new org.apache.axis2.databinding.ADBException("Service cannot be null!!");
                                    }
                                    elementList.add(localService);
                                
                            elementList.add(new javax.xml.namespace.QName("http://services.sabre.com/STL_Header/v120",
                                                                      "Identification"));
                            
                            
                                    if (localIdentification==null){
                                         throw new org.apache.axis2.databinding.ADBException("Identification cannot be null!!");
                                    }
                                    elementList.add(localIdentification);
                                 if (localResultSummaryTracker){
                            elementList.add(new javax.xml.namespace.QName("http://services.sabre.com/STL_Header/v120",
                                                                      "ResultSummary"));
                            
                            
                                    if (localResultSummary==null){
                                         throw new org.apache.axis2.databinding.ADBException("ResultSummary cannot be null!!");
                                    }
                                    elementList.add(localResultSummary);
                                } if (localSecurityTracker){
                            elementList.add(new javax.xml.namespace.QName("http://services.sabre.com/STL_Header/v120",
                                                                      "Security"));
                            
                            
                                    if (localSecurity==null){
                                         throw new org.apache.axis2.databinding.ADBException("Security cannot be null!!");
                                    }
                                    elementList.add(localSecurity);
                                } if (localTracesTracker){
                            elementList.add(new javax.xml.namespace.QName("http://services.sabre.com/STL_Header/v120",
                                                                      "Traces"));
                            
                            
                                    if (localTraces==null){
                                         throw new org.apache.axis2.databinding.ADBException("Traces cannot be null!!");
                                    }
                                    elementList.add(localTraces);
                                } if (localDiagnosticsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://services.sabre.com/STL_Header/v120",
                                                                      "Diagnostics"));
                            
                            
                                    if (localDiagnostics==null){
                                         throw new org.apache.axis2.databinding.ADBException("Diagnostics cannot be null!!");
                                    }
                                    elementList.add(localDiagnostics);
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
        public static SabreHeader parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            SabreHeader object =
                new SabreHeader();

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
                    
                            if (!"SabreHeader".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (SabreHeader)org.xmlsoap.schemas.soap.envelope.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://services.sabre.com/STL_Header/v120","Service").equals(reader.getName())){
                                
                                                object.setService(com.sabre.services.stl_header.v120.Service.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://services.sabre.com/STL_Header/v120","Identification").equals(reader.getName())){
                                
                                                object.setIdentification(com.sabre.services.stl_header.v120.Identification.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://services.sabre.com/STL_Header/v120","ResultSummary").equals(reader.getName())){
                                
                                                object.setResultSummary(com.sabre.services.stl_header.v120.ResultSummary.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://services.sabre.com/STL_Header/v120","Security").equals(reader.getName())){
                                
                                                object.setSecurity(com.sabre.services.stl_header.v120.Security.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://services.sabre.com/STL_Header/v120","Traces").equals(reader.getName())){
                                
                                                object.setTraces(com.sabre.services.stl_header.v120.Traces.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://services.sabre.com/STL_Header/v120","Diagnostics").equals(reader.getName())){
                                
                                                object.setDiagnostics(com.sabre.services.stl_header.v120.Diagnostics.Factory.parse(reader));
                                              
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
           
    