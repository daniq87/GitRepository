package com.sabre.sws.tools.wsdl.utils;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.awt.*;
import java.io.Reader;
import java.io.StringReader;

/**
 * Created by SG0221139 on 7/16/2014.
 */
public class LogMonitor extends JFrame {

    private final int windowWidth = 1000;
    private final int windowHeight = 800;

    private final JPanel contentPanel;
    private final JTextArea textArea;

    private final String line = "\n\n*  *   *   *   *   *   *  *   *   *   *   *   *  *   *   *   *   *   *  *   *   *   *   *   *  *   *   *   *   *   *   *   *   *\n\n";

    private final static LogMonitor instance = new LogMonitor();

    public static void logString( String s ) {
        instance.addString( s );
    }

    public void addString( String s ) {

        textArea.append( s.replace( ">", ">\n" ).replace( "\n\n", "\n" ).concat( line ) );

        if( 0 < 1 ) return;
        StringBuffer buffer = new StringBuffer();
        Reader reader = new StringReader( s );
        XMLInputFactory factory = XMLInputFactory.newInstance();

        textArea.append( s );

        XMLStreamReader streamReader;

        try {
            streamReader = factory.createXMLStreamReader( reader );
        } catch (XMLStreamException e) {
            e.printStackTrace();
            return;
        }

        int lvl = 1;

        try {

            do {
                int event = streamReader.next();
                if(event == XMLStreamConstants.START_ELEMENT) {
                    // check if correct root tag
                    break;
                }

                // add check for document end if you want to

            } while(streamReader.hasNext());

            textArea.append( "\n" );

            while( streamReader.hasNext() ) {

                if( streamReader.getEventType() == XMLStreamConstants.START_ELEMENT ) {
                    ++lvl;
                    for( int i = 0; i < lvl; ++i ) {
                        textArea.append( "  " );
                    }
                    textArea.append( "<" + streamReader.getName().getLocalPart() );
                    for( int i = 0; i < streamReader.getAttributeCount(); ++i ) {
                        textArea.append( " " + streamReader.getAttributeLocalName( i ) + "=" + streamReader.getAttributeValue( i ) );
                    }
                    textArea.append( ">" );

                }  else if( streamReader.getEventType() == XMLStreamConstants.END_ELEMENT ) {
                    --lvl;
                    for( int i = 0; i <= lvl; ++i ) {
                        textArea.append( "  " );
                    }
                    textArea.append( "</" + streamReader.getName().getLocalPart() + ">" );
                }
                textArea.append( "\n" );
                streamReader.next();
            }

            //textArea.append( buffer.toString() );

        } catch (XMLStreamException e) {
            e.printStackTrace();
        }

    }

    private LogMonitor() {
        super( "SWS Soap Log Monitor" );

        setBounds(100, 100, 491, 310);

        Dimension windowSize = new Dimension( windowWidth, windowHeight );
        setPreferredSize( windowSize );
        setSize( windowSize );

        contentPanel = new JPanel();
        contentPanel.setBorder ( new TitledBorder( new EtchedBorder(), "SOAP Messages" ) );

        textArea = new JTextArea( 45, 85 );

        textArea.setEditable( true );
        JScrollPane scrollPane = new JScrollPane( textArea );
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

//        setContentPane(contentPanel);
        contentPanel.add( scrollPane );

        add( contentPanel );
        pack();
        setLocationRelativeTo( null );

        setResizable(false);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible( true );
    }

}
