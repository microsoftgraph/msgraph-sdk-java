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

/**
 * A simple signal/waiter interface for synchronizing multi-threaded actions.
 */
public class SimpleWaiter {

    /**
     * The internal lock object for this waiter.
     */
    private final Object internalLock = new Object();

    /**
     * Indicates if this waiter has been triggered.
     */
    private boolean triggerState;

    /**
     * BLOCKING: Waits for the signal to be triggered, or returns immediately if it has already been triggered.
     */
    public void waitForSignal() {
        synchronized (internalLock) {
            if (this.triggerState) {
                return;
            }
            try {
                internalLock.wait();
            } catch (final InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /**
     * Triggers the signal for this waiter.
     */
    public void signal() {
        synchronized (internalLock) {
            triggerState = true;
            internalLock.notifyAll();
        }
    }
}
