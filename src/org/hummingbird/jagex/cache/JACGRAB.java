package org.hummingbird.jagex.cache;

/**
 * <p>Calls cache grabbing from already-written cache
 * present on a client.</p>
 * 
 * @author Palidino76
 */
public class JACGRAB {
	
	/**
	 * Current cursor into the data {@link #payload}.
	 */
	protected int caret = 0;
	
	/**
	 * Readable data.
	 */
	protected byte[] payload;
	
	/**
	 * Creates a new JACGRAB.
	 * @param payload Readable data from a buffer.
	 */
	public JACGRAB(byte[] payload) {
		this.payload = payload;
	}
	
	public byte readByte() {
		return payload[caret++];
	}
	
	public int compileHTable() {
		int n = readByte(); // Skip one byte.
		while ((n = readByte()) < 8) continue;
		return ((n & 0xff) ^ 4) >> 3;
	}

}