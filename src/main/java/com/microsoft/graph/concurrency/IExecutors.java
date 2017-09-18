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

package com.microsoft.graph.concurrency;

import com.microsoft.graph.core.ClientException;

/**
 * A way to manage scheduled actions that are run in the foreground or background threading environments.
 */
public interface IExecutors {

    /**
     * Runs the given Runnable on the background thread.
     * @param runnable The Runnable to execute.
     */
    void performOnBackground(final Runnable runnable);

    /**
     * Performs the given callback with the result object.
     * @param result The result value.
     * @param callback The callback to call on the foreground with this result.
     * @param <Result> The result type.
     */
    <Result> void performOnForeground(final Result result,
                                      final ICallback<Result> callback);

    /**
     * Performs the given callback with the result object.
     * @param progress The progress value.
     * @param progressMax The progress value.
     * @param callback The callback to call on the foreground with this result.
     * @param <Result> The result type.
     */
    <Result> void performOnForeground(final int progress,
                                      final int progressMax,
                                      final IProgressCallback<Result> callback);

    /**
     * Performs the given callback with the exception object.
     * @param exception The exception value.
     * @param callback The callback to call on the foreground with this exception.
     * @param <Result> The result type.
     */
    <Result> void performOnForeground(final ClientException exception,
                                      final ICallback<Result> callback);
}
