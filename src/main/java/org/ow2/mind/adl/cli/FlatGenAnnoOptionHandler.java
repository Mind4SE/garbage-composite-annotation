/**
 * Copyright (C) 2013 Schneider Electric
 *
 * This file is part of "Mind Compiler" is free software: you can redistribute 
 * it and/or modify it under the terms of the GNU Lesser General Public License 
 * as published by the Free Software Foundation, either version 3 of the 
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT 
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License for more
 * details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Contact: mind@ow2.org
 *
 * Authors: Stephane SEYVOZ
 * Contributors:
 */

package org.ow2.mind.adl.cli;

import java.util.Map;

import org.ow2.mind.cli.CmdOption;
import org.ow2.mind.cli.CommandLine;
import org.ow2.mind.cli.CommandOptionHandler;
import org.ow2.mind.cli.InvalidCommandLineException;

public class FlatGenAnnoOptionHandler implements CommandOptionHandler {

	public static final String FLATTEN_SERIALIZE_ANNOTATIONS_CONTEXT_KEY = "flatten-serialize-annotations";
	
	public void processCommandOption(CmdOption cmdOption, CommandLine cmdLine,
			Map<Object, Object> context) throws InvalidCommandLineException {
		
		// Only keep track of the flag being enabled
		context.put(FLATTEN_SERIALIZE_ANNOTATIONS_CONTEXT_KEY, true);
	}

	public static boolean isFlattenSerializationAnnotationsEnabled(Map<Object, Object> context) {
		Boolean result = (Boolean) context.get(FLATTEN_SERIALIZE_ANNOTATIONS_CONTEXT_KEY);
		if (result == null)
			return false;
		else
			return result.booleanValue();
	}
	
}
