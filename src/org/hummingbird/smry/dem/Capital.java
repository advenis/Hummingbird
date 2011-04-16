package org.hummingbird.smry.dem;

import java.util.PriorityQueue;

import org.hummingbird.smry.rep.*;

/**
 * Sole arranger of avid .rep/maj\.
 * @author Advenis Calculo
 */
public final class Capital {
	
	/**
	 * Encases {@link Viz} interfacing units, which are
	 * later determined as <tt>lean</tt> or <tt>built</tt>
	 */
	private PriorityQueue<Viz> vizQueue = new PriorityQueue<Viz>();
	
	/**
	 * Fetches the capital's viz. queue.
	 * @return <abs>l/b</abs> encased in a {@link java.util.Queue}
	 */
	public PriorityQueue<Viz> getVizQueue() {
		return vizQueue;
	}

}