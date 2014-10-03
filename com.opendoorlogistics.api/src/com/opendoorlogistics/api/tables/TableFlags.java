/*******************************************************************************
 * Copyright (c) 2014 Open Door Logistics (www.opendoorlogistics.com)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v3
 * which accompanies this distribution, and is available at http://www.gnu.org/licenses/lgpl.txt
 ******************************************************************************/
package com.opendoorlogistics.api.tables;

/**
 * Flags used for tables, columns etc.
 * @author Phil
 *
 */
public interface TableFlags {

	/**
	 * Flag indicating a column should be treated as a batch key
	 */
	public static final long FLAG_IS_BATCH_KEY = 1 << 1;

	/**
	 * Flag indicating a table or column is optional and not 
	 * necessarily needed by a component.
	 */
	public static final long FLAG_IS_OPTIONAL = 1 << 0;
	
	/**
	 * Flag indicating that a column is read-only (typically generated by a formula).
	 */
	public static final long FLAG_IS_READ_ONLY = 1 << 3; 
	
	/**
	 * Flag indicate the column is used as a key field in the reports to
	 * connect a master and subreport.
	 */
	public static final long FLAG_IS_REPORT_KEYFIELD = 1<<4;
	

	/**
	 * Flag indicating the field is used in a group-by query
	 */
	public static final long FLAG_IS_GROUP_BY_FIELD = 1<<5;
	
//	/**
//	 * Flag indicating a table required in the input to a component can take any name
//	 */
//	public static final long FLAG_TABLE_TAKES_ANY_NAME = 1<<6;

	/**
	 * Can values in the table be set?
	 */
	public static final long UI_SET_ALLOWED = 1<<7;
	
	/**
	 * Can rows be inserted into the table?
	 */
	public static final long UI_INSERT_ALLOWED = 1<<8;
	
	/**
	 * Can rows be deleted from the table?
	 */
	public static final long UI_DELETE_ALLOWED = 1<<9;
	
	/**
	 * Can rows be moved in the table?
	 */
	public static final long UI_MOVE_ALLOWED = 1<<10;
	
	public static final long UI_SET_INSERT_DELETE_PERMISSION_FLAGS = UI_SET_ALLOWED|UI_INSERT_ALLOWED|UI_DELETE_ALLOWED;

	public static final long UI_EDIT_PERMISSION_FLAGS = UI_SET_INSERT_DELETE_PERMISSION_FLAGS|UI_MOVE_ALLOWED;
	
	/**
	 * Set if a column should *not* be indexed. Columns are indexed
	 * by default in the in-memory datastore.
	 */
	public static final long FLAG_COLUMN_NOT_INDEXED = 1<<11;

	/**
	 * Is the row selected in a user interface map?
	 */
	public static final long FLAG_ROW_SELECTED_IN_MAP = 1<<12;

	/**
	 * A flag on the datastore indicating it can take any tables
	 */
	public static final long FLAG_TABLE_WILDCARD = 1<<13;
	
	/**
	 * A flag on a table indicating it can take any fields.
	 */
	public static final long FLAG_COLUMN_WILDCARD = 1<<14;
	
	/**
	 * Flag indicating a datastore goes into the reporter component.
	 */
	public static final long FLAG_IS_REPORTER_INPUT = 1<<15;
	
	/**
	 * Flag indicating the datastore or table is drawable
	 */
	public static final long FLAG_IS_DRAWABLES = 1<<16;
	
	/**
	 * Flag indicating the table can take any name going into a component
	 */
	public static final long FLAG_TABLE_NAME_WILDCARD = 1<<17;

	/**
	 * Flag indicating the table name going into a component should be the
	 * original table name, not the destination table name
	 */
	public static final long FLAG_TABLE_NAME_USE_SOURCE = 1<<18;

}