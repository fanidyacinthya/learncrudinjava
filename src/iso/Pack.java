package iso;
import isopackager.CustomPackager;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.io.IOException;
import org.jpos.iso.ISOException;
import org.jpos.iso.ISOMsg;
import org.jpos.iso.ISOPackager;
import org.jpos.iso.packager.GenericPackager;

public class Pack {
public static void main(String[] args) throws IOException, ISOException {
		// Create Packager based on XML that contain DE type
		ISOPackager packager = new CustomPackager();
		ISOMsg isoMsg = new ISOMsg();
		isoMsg.setPackager(packager);
	
         // Create ISO Message 
                 // Setting MTI
		isoMsg.setMTI("0200");
                
                // Setting processing code
		isoMsg.set(3, "200600");
                
                // Setting transaction amount
		isoMsg.set(4, "9A0000000012");
                
                
		isoMsg.set(7, "3456123106");
                
                // Setting system trace audit number
		isoMsg.set(11, "131101");
                
                 // Setting data element #48
		isoMsg.set(48, "A5DFGR");
                
                
		isoMsg.set(105, "ABCDEFGHIJ 1234567890");
 
        // pack the ISO 8583 Message
        byte[] bIsoMsg = isoMsg.pack();
 
        // output ISO 8583 Message String
        String isoMessage = "";
        for (int i = 0; i < bIsoMsg.length; i++) {
            isoMessage += (char) bIsoMsg[i];
        }
        System.out.println("Packed ISO8385 Message = '"+isoMessage+"'");
    }
}