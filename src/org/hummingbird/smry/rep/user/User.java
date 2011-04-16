package org.hummingbird.smry.rep.user;

import org.hummingbird.smry.rep.Mog;

public class User extends Mog {

	@Override
	public int getFormmatedIndex() {
		return recurse() << 4^4;
	}

}