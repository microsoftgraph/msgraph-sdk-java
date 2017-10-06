// ------------------------------------------------------------------------------
// Copyright (c) 2015 Microsoft Corporation
// 
// Permission is hereby granted, free of charge, to any person obtaining a copy
// of this software and associated documentation files (the "Software"), to deal
// in the Software without restriction, including without limitation the rights
// to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
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

package com.microsoft.graph.logger;

import java.util.ArrayList;

/**
 * Mock {@see ILogger}, logs nothing
 */
public class MockLogger implements ILogger {

    private LoggerLevel mLevel = LoggerLevel.Error;
    private ArrayList<String> mLogMessage = new ArrayList<String>();

    @Override
    public void setLoggingLevel(final LoggerLevel level) {
        mLevel = level;
    }

    @Override
    public LoggerLevel getLoggingLevel() {
        return mLevel;
    }

    @Override
    public void logDebug(final String message) {
        mLogMessage.add(message);
    }

    @Override
    public void logError(final String message, final Throwable throwable) {
        mLogMessage.add(message);
    }

    public ArrayList<String> getLogMessages() {
        return mLogMessage;
    }

    public Boolean hasMessage(final String message){
        return mLogMessage.indexOf(message) > -1;
    }
}
