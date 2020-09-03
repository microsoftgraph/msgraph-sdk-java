// ------------------------------------------------------------------------------
// Copyright (c) 2017 Microsoft Corporation
// 
// Permission is hereby granted, free of charge, to any person obtaining a copy
// of this software and associated documentation files (the "Software"), to deal
// in the Software without restriction, including without limitation the rights
// to use, copy, modify, merge, publish, distribute, sub-license, and/or sell
// copies of the Software, and to permit persons to whom the Software is
// furnished to do so, subject to the following conditions:
// 
// The above copyright notice and this permission notice shall be included in
// all copies or substantial portions of the Software.
// 
// THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
// IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
// FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
// AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
// LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
// OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
// THE SOFTWARE.
// ------------------------------------------------------------------------------

package com.microsoft.graph.serializer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/**
 * Serializes and deserializes a string
 * 
 * https://github.com/MSOpenTech/orc-for-android/blob/master/src/orc-android/
 *  src/main/java/com/microsoft/services/orc/serialization/impl/CalendarSerializer.java
 */
public final class CalendarSerializer {

    /**
     * Not available for instantiation
     */
    private CalendarSerializer() {
    }
    
    /**
     * Deserializes an ISO-8601 formatted date
     * 
     * @param strVal the string value
     * @return       the calendar
     * @throws java.text.ParseException the parse exception
     */
    public static Calendar deserialize(final String strVal) throws ParseException {
        // Change Z to adapt the string to a format
        // that can be parsed in Java
        final boolean hasZ = strVal.indexOf('Z') != -1;
        final boolean hasDot = strVal.indexOf('.') != -1;
		

        String modifiedStrVal;
        final String zSuffix;
        if (hasZ && hasDot) {
        	zSuffix = "";
            modifiedStrVal = strVal.replace("Z", "+00:00");
        } else if (hasZ && !hasDot) {
            zSuffix = "Z";
            modifiedStrVal = strVal.replace("Z", "+0000");
        } else {
            zSuffix = "";
            modifiedStrVal = strVal;
        }
        
        final boolean hasOffset = modifiedStrVal.contains("T")
				? (modifiedStrVal.substring(modifiedStrVal.indexOf('T') + 1).contains("+"))
						|| (modifiedStrVal.substring(modifiedStrVal.indexOf('T') + 1).contains("-"))
				: false;
						
        // Parse the well-formatted date string with and without offsets (eg: 2019-06-21T17:12:35.138, 2019-06-21T17:12:35.138+0000, 2019-06-21T17:12:35.138-07:00)
        final String datePattern;
        if (hasDot) {
        	
			String offsetSuffix = modifiedStrVal.substring(modifiedStrVal.indexOf(".") + 1);
			
			// Find index of offset
			int offsetIndex = -1;
			if (hasOffset) {
				offsetIndex = (offsetSuffix.indexOf('+') != -1) ? offsetSuffix.indexOf('+') : offsetSuffix.indexOf('-');
				offsetIndex = modifiedStrVal.indexOf('.') + 1 + offsetIndex; //find offset index in original string
			}
			
			
            //SimpleDateFormat only supports 3 milliseconds
			//Strip extra characters in millisecond field (eg: 2019-06-21T17:12:35.1385912-07:00)
			String milliSeconds = hasOffset ? modifiedStrVal.substring(modifiedStrVal.indexOf('.') + 1, offsetIndex)
					: modifiedStrVal.substring(modifiedStrVal.indexOf('.') + 1);
            final int MILLIS_SEGMENT_LENGTH = 3;
            
            if (milliSeconds.length() > MILLIS_SEGMENT_LENGTH) {
                milliSeconds = milliSeconds.substring(0, MILLIS_SEGMENT_LENGTH);
            }
            
            //Handle date formats with and without offset cases
			if (hasOffset) {
				modifiedStrVal = modifiedStrVal.substring(0, modifiedStrVal.indexOf('.') + 1) + milliSeconds
						+ modifiedStrVal.substring(offsetIndex);
				datePattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX";
			} else {
				modifiedStrVal = modifiedStrVal.substring(0, modifiedStrVal.indexOf('.') + 1) + milliSeconds;
				datePattern = "yyyy-MM-dd'T'HH:mm:ss.SSS" + zSuffix;
			}
			
        } else if (zSuffix != "") {
        	datePattern = "yyyy-MM-dd'T'HH:mm:ss" + zSuffix;
        } else if (hasOffset){
        	datePattern = "yyyy-MM-dd'T'HH:mm:ssX";
        } else {
        	datePattern = "yyyy-MM-dd'T'HH:mm:ss";
        }

        
        final SimpleDateFormat dateFormat = new SimpleDateFormat(datePattern);
        dateFormat.setTimeZone(TimeZone.getDefault());

        final Date date = dateFormat.parse(modifiedStrVal);

        final Calendar calendar = java.util.Calendar.getInstance();
        calendar.setTime(date);
        return calendar;
    }

    /**
     * Serializes the string
     *
     * @param src the source calendar
     * @return    the string
     */
    public static String serialize(final Calendar src) {
        final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'.'SSS'Z'", Locale.ROOT);
        dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return dateFormat.format(src.getTime());
    }
}
