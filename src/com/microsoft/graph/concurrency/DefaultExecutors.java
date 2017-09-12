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

import com.microsoft.graph.logger.ILogger;
import com.microsoft.graph.core.ClientException;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * The default executors implementation for the SDK.
 */
public class DefaultExecutors implements IExecutors {

    /**
     * The executor for handling background actions.
     */
    private final ThreadPoolExecutor mBackgroundExecutor;

    /**
     * The executor for handling foreground actions.
     */
    private final SynchronousExecutor mForegroundExecutor;

    /**
     * The logger.
     */
    private final ILogger mLogger;

    /**
     * Creates a new instance of the DefaultExecutors.
     * @param logger The logger.
     */
    public DefaultExecutors(final ILogger logger) {
        mLogger = logger;
        mBackgroundExecutor = (ThreadPoolExecutor)Executors.newCachedThreadPool();
        mForegroundExecutor = new SynchronousExecutor();
    }

    /**
     * Runs the given Runnable on the background thread.
     * @param runnable The Runnable to execute.
     */
    @Override
    public void performOnBackground(final Runnable runnable) {
        mLogger.logDebug("Starting background task, current active count: "
                         + mBackgroundExecutor.getActiveCount());
        mBackgroundExecutor.execute(runnable);
    }

    /**
     * Performs the given callback with the result object.
     * @param result The result value.
     * @param callback The callback to call on the foreground with this result.
     * @param <Result> The result type.
     */
    @Override
    public <Result> void performOnForeground(final Result result,
                                             final ICallback<Result> callback) {
        mLogger.logDebug("Starting foreground task, current active count:"
                         + mForegroundExecutor.getActiveCount()
                         + ", with result "
                         + result);
        mForegroundExecutor.execute(new Runnable() {
            @Override
            public void run() {
                callback.success(result);
            }
        });
    }

    /**
     * Performs the given callback with the result object.
     * @param progress The progress value.
     * @param progressMax The progress value.
     * @param callback The callback to call on the foreground with this result.
     * @param <Result> The result type.
     */
    public <Result> void performOnForeground(final int progress,
                                             final int progressMax,
                                             final IProgressCallback<Result> callback) {
        mLogger.logDebug("Starting foreground task, current active count:"
                         + mForegroundExecutor.getActiveCount()
                         + ", with progress  "
                         + progress
                         + ", max progress"
                         + progressMax);
        mForegroundExecutor.execute(new Runnable() {
            @Override
            public void run() {
                callback.progress(progress, progressMax);
            }
        });
    }
    /**
     * Performs the given callback with the exception object.
     * @param exception The exception value.
     * @param callback The callback to call on the foreground with this exception.
     * @param <Result> The result type.
     */
    @Override
    public <Result> void performOnForeground(final ClientException exception,
                                             final ICallback<Result> callback) {
        mLogger.logDebug("Starting foreground task, current active count:"
                         + mForegroundExecutor.getActiveCount()
                         + ", with exception "
                         + exception);
        mForegroundExecutor.execute(new Runnable() {
            @Override
            public void run() {
                callback.failure(exception);
            }
        });
    }

}
