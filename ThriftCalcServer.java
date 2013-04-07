import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TThreadPoolServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TTransportException;


public class ThriftCalcServer {

	public static void main(String[] args) { 
		
		ThriftCalcServer server = new ThriftCalcServer();
		
		server.start();
		
	}
	
	private void start(){
		try {
			TServerSocket serverTransport = new TServerSocket(7911);
			TinyCalc.Processor processor = new TinyCalc.Processor (new ThriftCalcServerImpl());
			
			TServer server = new TThreadPoolServer(new TThreadPoolServer.Args(serverTransport).processor(processor));
			
			System.out.println("Starting server on port 7911 ...");
			
			server.serve();
		} catch (TTransportException e) {
			e.printStackTrace();
		} 
	}
}
