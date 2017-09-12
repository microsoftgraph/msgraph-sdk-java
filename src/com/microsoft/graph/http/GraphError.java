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

package com.microsoft.graph.http;

import com.google.gson.annotations.SerializedName;

import com.microsoft.graph.core.GraphErrorCodes;

public class GraphError {

    @SerializedName("message")
    public String message;

    @SerializedName("code")
    public String code;

    @SerializedName("innererror")
    public GraphInnerError innererror;

    /**
     * Determine if the given error code is the one that is expected.
     * @param expectedCode The expected error code.
     * @return <c>true</c> if the error code matches, and <c>false</c> if there was no match.
     */
    public boolean isError(final GraphErrorCodes expectedCode) {
        if (code.equalsIgnoreCase(expectedCode.toString())) {
            return true;
        }
        GraphInnerError innerError = innererror;
        while (null != innerError) {
            if (innerError.code.equalsIgnoreCase(expectedCode.toString())) {
                return true;
            }
            innerError = innerError.innererror;
        }
        return false;
    }
}
