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

package com.microsoft.graph.concurrency;

import com.microsoft.graph.logger.ILogger;
import com.google.common.annotations.VisibleForTesting;
import com.microsoft.graph.core.ClientException;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;

/**
 * The default executors implementation for the SDK
 */
public class DefaultExecutors implements IExecutors {

    /**
     * The executor for handling background actions
     */
    private final ThreadPoolExecutor backgroundExecutor;

    /**
     * The executor for handling foreground actions
     */
    private final SynchronousExecutor foregroundExecutor;
    
    /**
     * The logger
     */
    private final ILogger logger;

    /**
     * Creates a new instance of the DefaultExecutors
     * 
     * @param logger the logger
     */
    public DefaultExecutors(@Nonnull final ILogger logger) {
    	this.logger = logger;
        backgroundExecutor = (ThreadPoolExecutor)Executors.newCachedThreadPool();
        foregroundExecutor = new SynchronousExecutor();
    }

    /**
     * Runs the given Runnable on the background thread
     * 
     * @param runnable the Runnable to execute
     */
    @Override
    public void performOnBackground(@Nonnull final Runnable runnable) {
    	logger.logDebug("Starting background task, current active count: "
                + backgroundExecutor.getActiveCount());
        backgroundExecutor.execute(runnable);
    }

    /**
     * Performs the given callback with the result object
     * 
     * @param result   the result value
     * @param callback the callback to call on the foreground with this result
     * @param <Result> the result type
     */
    @Override
    @Nullable
    public <Result> void performOnForeground(@Nullable final Result result,
                                             @Nonnull final ICallback<Result> callback) {
    	logger.logDebug("Starting foreground task, current active count:"
                + foregroundExecutor.getActiveCount()
                + ", with result "
                + result);
        foregroundExecutor.execute(new Runnable() {
            @Override
            public void run() {
                callback.success(result);
            }
        });
    }

    /**
     * Performs the given callback with the result object
     * 
     * @param progress    the progress value
     * @param progressMax the progress value
     * @param callback    the callback to call on the foreground with this result
     * @param <Result>    the result type
     */
    public <Result> void performOnForeground(final int progress,
                                             final int progressMax,
                                             @Nonnull final IProgressCallback<Result> callback) {
    	logger.logDebug("Starting foreground task, current active count:"
                + foregroundExecutor.getActiveCount()
                + ", with progress  "
                + progress
                + ", max progress"
                + progressMax);
        foregroundExecutor.execute(new Runnable() {
            @Override
            public void run() {
                callback.progress(progress, progressMax);
            }
        });
    }
    /**
     * Performs the given callback with the exception object
     * 
     * @param exception the exception value
     * @param callback  the callback to call on the foreground with this exception
     * @param <Result>  the result type
     */
    @Override
    public <Result> void performOnForeground(@Nonnull final ClientException exception,
                                             @Nonnull final ICallback<Result> callback) {
    	logger.logDebug("Starting foreground task, current active count:"
                + foregroundExecutor.getActiveCount()
                + ", with exception "
                + exception);
        foregroundExecutor.execute(new Runnable() {
            @Override
            public void run() {
                callback.failure(exception);
            }
        });
    }

    /**
     * Gets the logger in use for executors
     * 
     * @return a logger
     */
    @VisibleForTesting
    @Nullable
    public ILogger getLogger() {
        return logger;
    }
    
    /**
     * Shuts down the background executors
     */
    public void shutdownBackgroundExecutors() {
    	this.backgroundExecutor.shutdown();
    }
}
