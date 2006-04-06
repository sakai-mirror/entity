/**********************************************************************************
 * $URL$
 * $Id$
 ***********************************************************************************
 *
 * Copyright (c) 2006 The Sakai Foundation.
 * 
 * Licensed under the Educational Community License, Version 1.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at
 * 
 *      http://www.opensource.org/licenses/ecl1.php
 * 
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an "AS IS" BASIS, 
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and 
 * limitations under the License.
 *
 **********************************************************************************/

package org.sakaiproject.entity.api;

/**
 * <p>
 * Services which implement ContextObserver declare themselves as wanting context change notification.
 * </p>
 */
public interface ContextObserver
{
	/**
	 * This is called when a context is being used for this app.
	 * 
	 * @param context
	 *        The context string.
	 */
	void startContext(String context);

	/**
	 * This is called when a context is no longer being used for this app.
	 * 
	 * @param context
	 */
	void endContext(String context);

	/**
	 * Provide the string array of tool ids, for tools that we need context preperation for.
	 * 
	 * @return
	 */
	String[] myToolIds();
}
