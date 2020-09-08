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

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import com.microsoft.graph.httpcore.middlewareoption.IShouldRedirect;
import com.microsoft.graph.httpcore.middlewareoption.IShouldRetry;
import com.microsoft.graph.httpcore.middlewareoption.RedirectOptions;
import com.microsoft.graph.httpcore.middlewareoption.RetryOptions;
import com.microsoft.graph.options.HeaderOption;
import com.microsoft.graph.options.Option;

/**
 * Mock request for {@see IHttpRequest}
 */
class MockRequest implements IHttpRequest {

    @Override
    public URL getRequestUrl() {
        try {
            return new URL("http://localhost");
        } catch (final MalformedURLException ignored) {
        }
        return null;
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.GET;
    }

    @Override
    public List<HeaderOption> getHeaders() {
        return new ArrayList<>();
    }

    @Override
    public List<Option> getOptions() {
        return new ArrayList<>();
    }

    @Override
    public void addHeader(final String header, final String value) {
    }

    @Override
    public void setUseCaches(boolean useCaches) {
        // Don't set it for Mock request.
    }

    @Override
    public boolean getUseCaches() {
        return false;
    }

	@Override
	public void setMaxRedirects(int maxRedirects) {
	}

	@Override
	public int getMaxRedirects() {
		return RedirectOptions.DEFAULT_MAX_REDIRECTS;
	}

	@Override
	public void setShouldRedirect(IShouldRedirect shouldRedirect) {
	}

	@Override
	public IShouldRedirect getShouldRedirect() {
		return RedirectOptions.DEFAULT_SHOULD_REDIRECT;
	}

	@Override
	public void setShouldRetry(IShouldRetry shouldretry) {
	}

	@Override
	public IShouldRetry getShouldRetry() {
		return RetryOptions.DEFAULT_SHOULD_RETRY;
	}

	@Override
	public void setMaxRetries(int maxRetries) {
	}

	@Override
	public int getMaxRetries() {
		return RetryOptions.DEFAULT_MAX_RETRIES;
	}

	@Override
	public void setDelay(long delay) {
	}

	@Override
	public long getDelay() {
		return RetryOptions.DEFAULT_DELAY;
	}
}
