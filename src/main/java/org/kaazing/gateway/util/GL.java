/**
 * Copyright (c) 2007-2014 Kaazing Corporation. All rights reserved.
 * 
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.kaazing.gateway.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GL {

    public static final void info(String module, String format, Object ... args) {
        Logger logger = LoggerFactory.getLogger(module);
        if (logger.isInfoEnabled()) {
            logger.info(format, args);
        }
    }
    
    public static final void debug(String module, String format, Object ... args) {
        Logger logger = LoggerFactory.getLogger(module);
        if (logger.isDebugEnabled()) {
            logger.debug(format, args);
        }
    }

    public static final void trace(String module, String format, Object ... args) {
        Logger logger = LoggerFactory.getLogger(module);
        if (logger.isTraceEnabled()) {
            logger.trace(format, args);
        }
    }

    public static final void error(String module, String format, Object ... args) {
        Logger logger = LoggerFactory.getLogger(module);
        if (logger.isErrorEnabled()) {
            logger.error(format, args);
        }
    }

    public static final void warn(String module, String format, Object ... args) {
        Logger logger = LoggerFactory.getLogger(module);
        if (logger.isWarnEnabled()) {
            logger.warn(format, args);
        }
    }
    
    public static final String identity(Object obj) {
        return obj.getClass().getSimpleName() + "@" + obj.hashCode();
    }
}
