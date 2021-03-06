/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.cxf.tools.common.toolspec;
import org.apache.cxf.tools.common.ToolException;
public interface Tool {

    String TOOL_SPEC_PUBLIC_ID = "http://cxf.apache.org/Xutil/ToolSpecification";

    void init() throws ToolException;

    /**
     * A tool has to be prepared to perform it's duty any number of times.
     */
    void performFunction() throws ToolException;

    void destroy() throws ToolException;

}
