package com.microsoft.graph.http;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import com.microsoft.graph.concurrency.IProgressCallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.httpcore.middlewareoption.IShouldRedirect;
import com.microsoft.graph.httpcore.middlewareoption.IShouldRetry;
import com.microsoft.graph.httpcore.middlewareoption.RedirectOptions;
import com.microsoft.graph.httpcore.middlewareoption.RetryOptions;
import com.microsoft.graph.options.HeaderOption;
import com.microsoft.graph.options.Option;

import okhttp3.Request;

/**
 * Mock for {@see IHttpRequest}
 */
public class MockHttpRequest implements IHttpRequest {

    private HttpMethod mHttpMethod = HttpMethod.GET;
    private List<HeaderOption> mHeaders = new ArrayList<HeaderOption>();
    private List<Option> mOptions = new ArrayList<Option>();
    private boolean mUseCaches;

    @Override
    public URL getRequestUrl() {
        try {
            return new URL("http://localhost");
        } catch (final MalformedURLException ex) {
            throw new ClientException("Invalid URL", ex);
        }
    }

    @Override
    public HttpMethod getHttpMethod() {
        return mHttpMethod;
    }

    @Override
    public List<HeaderOption> getHeaders() {
        return mHeaders;
    }

    @Override
    public List<Option> getOptions() {
        return mOptions;
    }

    @Override
    public void addHeader(String header, String value) {
        mHeaders.add(new HeaderOption(header, value));
    }

    @Override
    public void setUseCaches(boolean useCaches) {
        mUseCaches = useCaches;
    }

    @Override
    public boolean getUseCaches() {
        return mUseCaches;
    }

    public void setHttpMethod(HttpMethod method) {
        mHttpMethod = method;
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

	@Override
	public IHttpRequest withHttpMethod(HttpMethod httpMethod) {
		return this;
	}


    /**
     * Returns the Request object to be executed
     * @return the Request object to be executed
     */
    @Override
    public Request getHttpRequest() throws ClientException {
        return getHttpRequest(null);
    }

    /**
     * Returns the Request object to be executed
     * @param serializedObject the object to serialize at the body of the request
     * @param <requestBodyType> the type of the serialized object
     * @return the Request object to be executed
     */
    @Override
    public <requestBodyType> Request getHttpRequest(final requestBodyType serializedObject) throws ClientException {
        return getHttpRequest(serializedObject, null);
    }

    /**
     * Returns the Request object to be executed
     * @param serializedObject the object to serialize at the body of the request
     * @param progress the progress callback
     * @param <requestBodyType> the type of the serialized object
     * @param <responseType> the type of the response object
     * @return the Request object to be executed
     */
    @Override
    public <requestBodyType, responseType> Request getHttpRequest(final requestBodyType serializedObject, final IProgressCallback<responseType> progress) throws ClientException {
        try {
            final Request.Builder requestBuilder = new Request.Builder();
            return requestBuilder.build();
        } catch (Exception ex) {
            throw new ClientException("dummy", ex);
        }
    }
}
