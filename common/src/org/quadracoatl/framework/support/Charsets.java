/*
 * Copyright 2016, Robert 'Bobby' Zenz
 * 
 * This file is part of Quadracoatl.
 * 
 * Quadracoatl is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * Quadracoatl is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with Quadracoatl.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.quadracoatl.framework.support;

import java.nio.charset.Charset;

/**
 * {@link Charsets} is a static helper utility containing various
 * {@link Charset}s.
 */
public final class Charsets {
	/** The {@link Charset} for {@code UTF-8}. */
	public static final Charset UTF_8 = Charset.forName("UTF-8");
	
	/**
	 * This is a static helper utility, no instance needed.
	 */
	private Charsets() {
		// No instance needed.
	}
}
