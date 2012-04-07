package groupMembership;

import java.net.InetAddress;
import java.util.Date;
import java.util.Hashtable;
import java.util.Set;

import session.Session;

public class Server {
	public InetAddress ip;
	public Integer port;
	private final String IPP = ip+"-"+port;
	private final static String IPPnull = "000000000-0";
	
	private GroupMembershipManager gmm;

	public Server(InetAddress sip, int sport) {
		ip = sip;
		port = sport;
		
		gmm = new GroupMembershipManager(this.toString());
		gmm.start();
	}

	public Set<String> getMbrSet() {
		return gmm.getMbrSet();
	}
	
	public String toString() {
		return IPP;
	}

	public static String getNull() {
		return IPPnull;
	}

	
}
