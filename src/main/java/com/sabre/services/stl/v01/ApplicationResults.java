
/**
 * ApplicationResults.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.sabre.services.stl.v01;
            

            /**
            *  ApplicationResults bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ApplicationResults extends com.sabre.services.stl.v01.Results
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = ApplicationResults
                Namespace URI = http://services.sabre.com/STL/v01
                Namespace Prefix = ns3
                */
            

                        /**
                        * field for Success
                        * This was an Array!
                        */

                        
                                    protected com.sabre.services.stl.v01.ProblemInformation[] localSuccess ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSuccessTracker = false ;

                           public boolean isSuccessSpecified(){
                               return localSuccessTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.sabre.services.stl.v01.ProblemInformation[]
                           */
                           public  com.sabre.services.stl.v01.ProblemInformation[] getSuccess(){
                               return localSuccess;
                           }

                           
                        


                               
                              /**
                               * validate the array for Success
                               */
                              protected void validateSuccess(com.sabre.services.stl.v01.ProblemInformation[] param){
                             
                              if ((param != null) && (param.length > 99)){
                                throw new java.lang.RuntimeException();
                              }
                              
                              }


                             /**
                              * Auto generated setter method
                              * @param param Success
                              */
                              public void setSuccess(com.sabre.services.stl.v01.ProblemInformation[] param){
                              
                                   validateSuccess(param);

                               localSuccessTracker = param != null;
                                      
                                      this.localSuccess=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.sabre.services.stl.v01.ProblemInformation
                             */
                             public void addSuccess(com.sabre.services.stl.v01.ProblemInformation param){
                                   if (localSuccess == null){
                                   localSuccess = new com.sabre.services.stl.v01.ProblemInformation[]{};
                                   }

                            
                                 //update the setting tracker
                                localSuccessTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localSuccess);
                               list.add(param);
                               this.localSuccess =
                             (com.sabre.services.stl.v01.ProblemInformation[])list.toArray(
                            new com.sabre.services.stl.v01.ProblemInformation[list.size()]);

                             }
                             

                        /**
                        * field for Error
                        * This was an Array!
                        */

                        
                                    protected com.sabre.services.stl.v01.ProblemInformation[] localError ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localErrorTracker = false ;

                           public boolean isErrorSpecified(){
                               return localErrorTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.sabre.services.stl.v01.ProblemInformation[]
                           */
                           public  com.sabre.services.stl.v01.ProblemInformation[] getError(){
                               return localError;
                           }

                           
                        


                               
                              /**
                               * validate the array for Error
                               */
                              protected void validateError(com.sabre.services.stl.v01.ProblemInformation[] param){
                             
                              if ((param != null) && (param.length > 99)){
                                throw new java.lang.RuntimeException();
                              }
                              
                              }


                             /**
                              * Auto generated setter method
                              * @param param Error
                              */
                              public void setError(com.sabre.services.stl.v01.ProblemInformation[] param){
                              
                                   validateError(param);

                               localErrorTracker = param != null;
                                      
                                      this.localError=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.sabre.services.stl.v01.ProblemInformation
                             */
                             public void addError(com.sabre.services.stl.v01.ProblemInformation param){
                                   if (localError == null){
                                   localError = new com.sabre.services.stl.v01.ProblemInformation[]{};
                                   }

                            
                                 //update the setting tracker
                                localErrorTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localError);
                               list.add(param);
                               this.localError =
                             (com.sabre.services.stl.v01.ProblemInformation[])list.toArray(
                            new com.sabre.services.stl.v01.ProblemInformation[list.size()]);

                             }
                             

                        /**
                        * field for Warning
                        * This was an Array!
                        */

                        
                                    protected com.sabre.services.stl.v01.ProblemInformation[] localWarning ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localWarningTracker = false ;

                           public boolean isWarningSpecified(){
                               return localWarningTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.sabre.services.stl.v01.ProblemInformation[]
                           */
                           public  com.sabre.services.stl.v01.ProblemInformation[] getWarning(){
                               return localWarning;
                           }

                           
                        


                               
                              /**
                               * validate the array for Warning
                               */
                              protected void validateWarning(com.sabre.services.stl.v01.ProblemInformation[] param){
                             
                              if ((param != null) && (param.length > 99)){
                                throw new java.lang.RuntimeException();
                              }
                              
                              }


                             /**
                              * Auto generated setter method
                              * @param param Warning
                              */
                              public void setWarning(com.sabre.services.stl.v01.ProblemInformation[] param){
                              
                                   validateWarning(param);

                               localWarningTracker = param != null;
                                      
                                      this.localWarning=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.sabre.services.stl.v01.ProblemInformation
                             */
                             public void addWarning(com.sabre.services.stl.v01.ProblemInformation param){
                                   if (localWarning == null){
                                   localWarning = new com.sabre.services.stl.v01.ProblemInformation[]{};
                                   }

                            
                                 //update the setting tracker
                                localWarningTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localWarning);
                               list.add(param);
                               this.localWarning =
                             (com.sabre.services.stl.v01.ProblemInformation[])list.toArray(
                            new com.sabre.services.stl.v01.ProblemInformation[list.size()]);

                             }
                             

                        /**
                        * field for Status
                        * This was an Attribute!
                        */

                        
                                    protected com.sabre.services.stl_header.v120.CompletionCodes localStatus ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.sabre.services.stl_header.v120.CompletionCodes
                           */
                           public  com.sabre.services.stl_header.v120.CompletionCodes getStatus(){
                               return localStatus;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Status
                               */
                               public void setStatus(com.sabre.services.stl_header.v120.CompletionCodes param){
                            
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
                

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://services.sabre.com/STL/v01");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":ApplicationResults",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "ApplicationResults",
                           xmlWriter);
                   }

               
                                    
                                    if (localStatus != null){
                                        writeAttribute("",
                                           "status",
                                           localStatus.toString(), xmlWriter);
                                    }
                                    
                                      else {
                                          throw new org.apache.axis2.databinding.ADBException("required attribute localStatus is null");
                                      }
                                     if (localSuccessTracker){
                                       if (localSuccess!=null){
                                            for (int i = 0;i < localSuccess.length;i++){
                                                if (localSuccess[i] != null){
                                                 localSuccess[i].serialize(new javax.xml.namespace.QName("http://services.sabre.com/STL/v01","Success"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                        // we don't have to do any thing since minOccures is zero
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("Success cannot be null!!");
                                        
                                    }
                                 } if (localErrorTracker){
                                       if (localError!=null){
                                            for (int i = 0;i < localError.length;i++){
                                                if (localError[i] != null){
                                                 localError[i].serialize(new javax.xml.namespace.QName("http://services.sabre.com/STL/v01","Error"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                        // we don't have to do any thing since minOccures is zero
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("Error cannot be null!!");
                                        
                                    }
                                 } if (localWarningTracker){
                                       if (localWarning!=null){
                                            for (int i = 0;i < localWarning.length;i++){
                                                if (localWarning[i] != null){
                                                 localWarning[i].serialize(new javax.xml.namespace.QName("http://services.sabre.com/STL/v01","Warning"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                        // we don't have to do any thing since minOccures is zero
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("Warning cannot be null!!");
                                        
                                    }
                                 }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://services.sabre.com/STL/v01")){
                return "ns3";
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
                    attribList.add(new javax.xml.namespace.QName("http://services.sabre.com/STL/v01","ApplicationResults"));
                 if (localSuccessTracker){
                             if (localSuccess!=null) {
                                 for (int i = 0;i < localSuccess.length;i++){

                                    if (localSuccess[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://services.sabre.com/STL/v01",
                                                                          "Success"));
                                         elementList.add(localSuccess[i]);
                                    } else {
                                        
                                                // nothing to do
                                            
                                    }

                                 }
                             } else {
                                 
                                        throw new org.apache.axis2.databinding.ADBException("Success cannot be null!!");
                                    
                             }

                        } if (localErrorTracker){
                             if (localError!=null) {
                                 for (int i = 0;i < localError.length;i++){

                                    if (localError[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://services.sabre.com/STL/v01",
                                                                          "Error"));
                                         elementList.add(localError[i]);
                                    } else {
                                        
                                                // nothing to do
                                            
                                    }

                                 }
                             } else {
                                 
                                        throw new org.apache.axis2.databinding.ADBException("Error cannot be null!!");
                                    
                             }

                        } if (localWarningTracker){
                             if (localWarning!=null) {
                                 for (int i = 0;i < localWarning.length;i++){

                                    if (localWarning[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://services.sabre.com/STL/v01",
                                                                          "Warning"));
                                         elementList.add(localWarning[i]);
                                    } else {
                                        
                                                // nothing to do
                                            
                                    }

                                 }
                             } else {
                                 
                                        throw new org.apache.axis2.databinding.ADBException("Warning cannot be null!!");
                                    
                             }

                        }
                            attribList.add(
                            new javax.xml.namespace.QName("","status"));
                            
                                      attribList.add(localStatus.toString());
                                

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
        public static ApplicationResults parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            ApplicationResults object =
                new ApplicationResults();

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
                    
                            if (!"ApplicationResults".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (ApplicationResults)org.xmlsoap.schemas.soap.envelope.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    // handle attribute "status"
                    java.lang.String tempAttribStatus =
                        
                                reader.getAttributeValue(null,"status");
                            
                   if (tempAttribStatus!=null){
                         java.lang.String content = tempAttribStatus;
                        
                                                  object.setStatus(
                                                        com.sabre.services.stl_header.v120.CompletionCodes.Factory.fromString(reader,tempAttribStatus));
                                            
                    } else {
                       
                               throw new org.apache.axis2.databinding.ADBException("Required attribute status is missing");
                           
                    }
                    handledAttributes.add("status");
                    
                    
                    reader.next();
                
                        java.util.ArrayList list1 = new java.util.ArrayList();
                    
                        java.util.ArrayList list2 = new java.util.ArrayList();
                    
                        java.util.ArrayList list3 = new java.util.ArrayList();
                    
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://services.sabre.com/STL/v01","Success").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list1.add(com.sabre.services.stl.v01.ProblemInformation.Factory.parse(reader));
                                                                
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
                                                                if (new javax.xml.namespace.QName("http://services.sabre.com/STL/v01","Success").equals(reader.getName())){
                                                                    list1.add(com.sabre.services.stl.v01.ProblemInformation.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone1 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setSuccess((com.sabre.services.stl.v01.ProblemInformation[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.sabre.services.stl.v01.ProblemInformation.class,
                                                                list1));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://services.sabre.com/STL/v01","Error").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list2.add(com.sabre.services.stl.v01.ProblemInformation.Factory.parse(reader));
                                                                
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
                                                                if (new javax.xml.namespace.QName("http://services.sabre.com/STL/v01","Error").equals(reader.getName())){
                                                                    list2.add(com.sabre.services.stl.v01.ProblemInformation.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone2 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setError((com.sabre.services.stl.v01.ProblemInformation[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.sabre.services.stl.v01.ProblemInformation.class,
                                                                list2));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://services.sabre.com/STL/v01","Warning").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list3.add(com.sabre.services.stl.v01.ProblemInformation.Factory.parse(reader));
                                                                
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone3 = false;
                                                        while(!loopDone3){
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
                                                                loopDone3 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://services.sabre.com/STL/v01","Warning").equals(reader.getName())){
                                                                    list3.add(com.sabre.services.stl.v01.ProblemInformation.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone3 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setWarning((com.sabre.services.stl.v01.ProblemInformation[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.sabre.services.stl.v01.ProblemInformation.class,
                                                                list3));
                                                            
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
           
    