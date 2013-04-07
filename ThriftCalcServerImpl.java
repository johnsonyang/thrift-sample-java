import org.apache.thrift.TException;


public class ThriftCalcServerImpl implements TinyCalc.Iface {

	@Override
	public double sum(double param1, double param2) throws TException {
		// TODO Auto-generated method stub
		return param1 + param2;
	}

}
