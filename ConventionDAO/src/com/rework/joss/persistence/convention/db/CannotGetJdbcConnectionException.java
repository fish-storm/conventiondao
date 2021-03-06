﻿/*
 * Copyright 2002-2005 the original author or authors.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.rework.joss.persistence.convention.db;


/**
 * Fatal exception thrown when we can't connect to an RDBMS using JDBC.
 *
 */
public class CannotGetJdbcConnectionException extends RuntimeException {

	/**
	 * Constructor for CannotGetJdbcConnectionException.
	 * @param msg the detail message
	 * @param ex SQLException root cause
	 */
	public CannotGetJdbcConnectionException(String msg, Exception ex) {
		super(msg, ex);
	}

	/**
	 * Constructor for CannotGetJdbcConnectionException.
	 * @param msg the detail message
	 * @param ex ClassNotFoundException root cause
	 */
	public CannotGetJdbcConnectionException(String msg, ClassNotFoundException ex) {
		super(msg, ex);
	}

}
