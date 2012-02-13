/*
 * Automatically generated by jrpcgen 1.0.5 on 10/23/08 8:11 PM
 * jrpcgen is part of the "Remote Tea" ONC/RPC package for Java
 * See http://remotetea.sourceforge.net for details
 */
package ganglia.xdr.v31x;
import org.acplt.oncrpc.*;
import java.io.IOException;

public class Ganglia_extra_data implements XdrAble {
    public String name;
    public String data;

    public Ganglia_extra_data() {
    }

    public Ganglia_extra_data(XdrDecodingStream xdr)
           throws OncRpcException, IOException {
        xdrDecode(xdr);
    }

    public void xdrEncode(XdrEncodingStream xdr)
           throws OncRpcException, IOException {
        xdr.xdrEncodeString(name);
        xdr.xdrEncodeString(data);
    }

    public void xdrDecode(XdrDecodingStream xdr)
           throws OncRpcException, IOException {
        name = xdr.xdrDecodeString();
        data = xdr.xdrDecodeString();
    }

}
// End of Ganglia_extra_data.java
