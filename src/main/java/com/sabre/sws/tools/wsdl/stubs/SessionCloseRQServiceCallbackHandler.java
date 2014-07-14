
/**
 * SessionCloseRQServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package com.sabre.sws.tools.wsdl.stubs;

    /**
     *  SessionCloseRQServiceCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class SessionCloseRQServiceCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public SessionCloseRQServiceCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public SessionCloseRQServiceCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for sessionCloseRQ method
            * override this method for handling normal response from sessionCloseRQ operation
            */
           public void receiveResultsessionCloseRQ(
                    com.sabre.sws.tools.wsdl.stubs.SessionCloseRQServiceStub.SessionCloseRS result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from sessionCloseRQ operation
           */
            public void receiveErrorsessionCloseRQ(java.lang.Exception e) {
            }
                


    }
    