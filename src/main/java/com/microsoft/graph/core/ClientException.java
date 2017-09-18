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

package com.microsoft.graph.core;

/**
 * An exception from the client.
 */
public class ClientException extends RuntimeException {

    /**
     * The error code for this exception.
     */
    private final GraphErrorCodes mErrorCode;

    /**
     * Creates the client exception.
     * @param message The message to display.
     * @param ex The exception from.
     * @param errorCode The error code for this exception.
     */
    public ClientException(final String message, final Throwable ex, final GraphErrorCodes errorCode) {
        super(message, ex);
        mErrorCode = errorCode;
    }

    /**
     * Determines if the given error code is expected.
     * @param expectedCode The expected error code.
     * @return true if the error code matches, and false if there was no match.
     */
    public boolean isError(final GraphErrorCodes expectedCode) {
        return mErrorCode == expectedCode;
    }
}
