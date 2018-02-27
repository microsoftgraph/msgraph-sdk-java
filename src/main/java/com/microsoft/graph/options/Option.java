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

package com.microsoft.graph.options;

/**
 * An option that is settable for a request
 */
public class Option {

    /**
     * The name of the option
     */
    private final String name;

    /**
     * The value of the option
     */
    private final Object value;

    /**
     * Creates an option object
     * 
     * @param name  the name of the option
     * @param value the value of the option
     */
    protected Option(final String name, final Object value) {
        this.name = name;
        this.value = value;
    }

    /**
     * Gets the name of the option
     * 
     * @return the name of the option
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the value of the option
     * 
     * @return the value of the option
     */
    public Object getValue() {
        return value;
    }
}
