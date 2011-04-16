package org.hummingbird.smry.rep;

/**
 * Rep./o mobile game unit which
 * can be called to p.p PRN.
 * @author Advenis Calculo
 */
public abstract class Mog implements Viz {
	
	/**
	 * Performs and retrieves a recurse of the object.
	 * @return The object's hash code <p><code>destable << 8&0xffff</code>
	 */
	public int recurse() {
		if (hashCode() > (64 & 0xff)) return -1; // Standard header
		return ((hashCode() >> (2^4)) %8) << (4 * ((7 >>> 3) & 0xff));
	}

}