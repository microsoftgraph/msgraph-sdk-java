package com.microsoft.graph.http;

import com.microsoft.graph.core.IBaseClient;
import java.lang.reflect.InvocationTargetException;

public class BaseCollectionRequestBuilder<T, T2 extends BaseRequestBuilder<T>,
                                            T3 extends ICollectionResponse<T>,
                                            T4 extends BaseCollectionPage<T, ? extends BaseRequestBuilder<T>>,
											T5 extends BaseCollectionRequest<T, T3, T4>> extends BaseRequestBuilder<T> {
	private final Class<T5> collRequestClass;
    private final Class<T2> reqBuilderClass;
    private final Class<T4> collPageClass;
    private final Class<T3> respCollectionClass;
	/**
     * The request builder for this collection of ServicePrincipal
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param requestBuilderClass the class for the request builder
     * @param responseCollectionClass the class for the collection response
     * @param collectionPageClass the class for the collection page
     * @param collectionRequestClass the class for the collection request
     */
	public BaseCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
                                        final Class<T2> requestBuilderClass,
                                        final Class<T3> responseCollectionClass,
                                        final Class<T4> collectionPageClass,
										final Class<T5> collectionRequestClass) {
        super(requestUrl, client, requestOptions);
		this.collRequestClass = collectionRequestClass;
        this.reqBuilderClass = requestBuilderClass;
        this.collPageClass = collectionPageClass;
        this.respCollectionClass = responseCollectionClass;
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public T5 buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public T5 buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        try {
            return collRequestClass.getConstructor(String.class, IBaseClient.class, getOptions().getClass(), this.respCollectionClass , this.collPageClass, this.getClass())
                                .newInstance(getRequestUrl(), getClient(), getOptions(), this.respCollectionClass , this.collPageClass, this);
        } catch (IllegalArgumentException | InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException | SecurityException ex) {
            return null;
		}
    }

    public T2 byId(final String id) {
        try {
            return reqBuilderClass.getConstructor(String.class, IBaseClient.class, getOptions().getClass())
                                .newInstance(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
        } catch (IllegalArgumentException | InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException | SecurityException ex) {
            return null;
		}
    }
}
