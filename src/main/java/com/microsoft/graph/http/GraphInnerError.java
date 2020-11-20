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

package com.microsoft.graph.http;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;

/**
 * Represents an inner error returned by the service
 */
public class GraphInnerError {

    /** The error code */
    @SerializedName("code")
    @Nullable
    public String code;

    /** The error type */
    @SerializedName("errorType")
    @Nullable
    public String errorType;

    /** The debug message */
    @SerializedName("debugMessage")
    @Nullable
    public String debugMessage;

    /** The stacktrace */
    @SerializedName("stackTrace")
    @Nullable
    public String stackTrace;

    /** The throw site */
    @SerializedName("throwSite")
    @Nullable
    public String throwSite;

    /** The inner error */
    @SerializedName("innererror")
    @Nullable
    public GraphInnerError innererror;
}
