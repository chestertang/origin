package annnotation.client;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.xml.bind.Element;

import org.chest.java.annotation.clazz.CXFclass;
import org.chest.java.annotation.clazz.CXFmethod;
import org.chest.java.annotation.clazz.CXFparameter;

/**
 * Service001 This is an element marker interface. Under certain circumstances,
 * it is necessary for the binding compiler to generate derived java content
 * classes that implement this interface.
 * 
 * @author Administrator
 */
@Path(value = "/pppService001/")
@CXFclass("CService001")
public class Service001 {

	private int num;

	private String name;

	/**
	 * @param executeUserAct
	 * @param msg
	 *            CXFparameter
	 * @author Administrator
	 */
	@CXFmethod("MexecuteUserAct")
	public void executeUserAct(@CXFparameter("PuserId") String userId, @CXFparameter("Ptype") Integer type) {
	}

	/**
	 * Prints an error message
	 * 
	 * @param e
	 *            :The element which has caused the error. Can be null
	 * @param msg
	 *            : The error message
	 */
	public void error(Element e, String msg) {
	}

	@GET
	@Path(value = "/calcateXDF")
	public void calcateXDF(double d, int a, int b, long c) {
	}

	/**
	 * @return num
	 */
	public int getNum() {
		return num;
	}

	/**
	 * @param num
	 * @param ddddd
	 */
	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
