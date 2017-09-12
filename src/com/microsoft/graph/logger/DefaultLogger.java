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

import android.util.Log;

/**
 * The default logger for the service client, which writes to logcat.
 */
public class DefaultLogger implements ILogger {

    /**
     * The logging level.
     */
    private LoggerLevel mLevel = LoggerLevel.Error;

    /**
     * Sets the logging level of this logger.
     * @param level The level to log at.
     */
    public void setLoggingLevel(final LoggerLevel level) {
        Log.i(getTag(), "Setting logging level to " + level);
        mLevel = level;
    }

    /**
     * Gets the logging level of this logger.
     * @return The level the logger is set to.
     */
    public LoggerLevel getLoggingLevel() {
        return mLevel;
    }

    /**
     * Creates the tag automatically.
     * @return The tag for the current method.
     * Sourced from https://gist.github.com/eefret/a9c7ac052854a10a8936
     */
    private String getTag() {
        try {
            final StringBuilder sb = new StringBuilder();
            final int callerStackDepth = 4;
            final String className = Thread.currentThread().getStackTrace()[callerStackDepth].getClassName();
            sb.append(className.substring(className.lastIndexOf(".") + 1));
            sb.append("[");
            sb.append(Thread.currentThread().getStackTrace()[callerStackDepth].getMethodName());
            sb.append("] - ");
            sb.append(Thread.currentThread().getStackTrace()[callerStackDepth].getLineNumber());
            return sb.toString();
        } catch (final Exception ex) {
            Log.e("DefaultLogger", ex.getMessage());
        }
        return null;
    }

    /**
     * Logs a debug message.
     * @param message The message.
     */
    @Override
    public void logDebug(final String message) {

                for (final String line : message.split("\n")) {
                    Log.d(getTag(), line);
                }

    }

    /**
     * Logs an error message with throwable.
     * @param message The message.
     * @param throwable The throwable.
     */
    @Override
    public void logError(final String message, final Throwable throwable) {
        switch (mLevel) {
            default:
            case Debug:
            case Error:
                for (final String line : message.split("\n")) {
                    Log.e(getTag(), line);
                }
                Log.e(getTag(), "Throwable detail: ", throwable);
        }
    }
}
