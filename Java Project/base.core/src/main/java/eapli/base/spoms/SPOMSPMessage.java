package eapli.base.spoms;

import java.io.DataInputStream;
import java.io.IOException;

public class SPOMSPMessage {

    private static Integer version = 1;
    private static Integer code;
    private static Integer d_lenght_1;
    private static Integer d_lenght_2;
    private static byte[] data;


    static byte[] read(DataInputStream in) throws IOException {

        byte[] data;
        version = ( in.read());
        code =(in.read());
        d_lenght_1 = ( in.read());
        d_lenght_2 =(in.read());

        int dataLength = d_lenght_1 + 256 * d_lenght_2;

        if (d_lenght_1 > 0) {

            data = new byte[dataLength + 1];
            SPOMSPMessage.data = new byte[dataLength];

            in.read(SPOMSPMessage.data, 0, dataLength);
            data[0] = code.byteValue();
            System.arraycopy(SPOMSPMessage.data,0,data,1,dataLength);

        } else {
            data = new byte[1];
            data[0] = code.byteValue();
        }
        return data;
    }


    static byte[] write(Integer code, byte[] data, Integer dataLength) {

        byte[] data1 = new byte[dataLength +4];

        if (dataLength < 256){

            int l2 = 0;
            data1[0] = version.byteValue();
            data1[1] = code.byteValue();
            data1[2] = dataLength.byteValue();
            data1[3] = (byte) l2;

            System.arraycopy(data,0,data1,4,dataLength);

        }else {

            int l1 = 256;
            int l2 = (dataLength - 256)/256 ;
            data1[0] = version.byteValue();
            data1[1] = code.byteValue();
            data1[2] = (byte) l1;
            data1[3] = (byte) l2;

            System.arraycopy(data,0,data1,4,dataLength);

        }
        return data1;
    }
}
