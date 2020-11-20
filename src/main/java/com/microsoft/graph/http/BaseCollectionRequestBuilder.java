package com.microsoft.graph.http;

import com.microsoft.graph.core.IBaseClient;

import java.lang.reflect.InvocationTargetException;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;

/**
 * The basic implementation of a collection request builder
 * @param <T> the entity or complex type
 * @param <T2> the entity request builder type
 * @param <T3> the collection response type
 * @param <T4> the collection page type
 * @param <T5> the collection request type
 */
public class BaseCollectionRequestBuilder<T, T2 extends BaseRequestBuilder<T>,
                                            T3 extends ICollectionResponse<T>,
                                            T4 extends BaseCollectionPage<T, ? extends BaseRequestBuilder<T>>,
											T5 extends BaseCollectionRequest<T, T3, T4>> extends BaseRequestBuilder<T> {
	private final Class<T5> collRequestClass;
    private final Class<T2> reqBuilderClass;
	/**
     * The request builder for this collection of ServicePrincipal
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param requestBuilderClass the class for the request builder
     * @param collectionRequestClass the class for the collection request
     */
	public BaseCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
                                        @Nonnull final Class<T2> requestBuilderClass,
										@Nonnull final Class<T5> collectionRequestClass) {
        super(requestUrl, client, requestOptions);
		this.collRequestClass = collectionRequestClass;
        this.reqBuilderClass = requestBuilderClass;
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    @Nullable
    public T5 buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    @Nullable
    public T5 buildRequest(@Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        try {
            return collRequestClass.getConstructor(String.class, IBaseClient.class, java.util.List.class)
                                    .newInstance(getRequestUrl(), getClient(), requestOptions);
        } catch (IllegalArgumentException | InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException | SecurityException ex) {
            return null;
		}
    }

    /**
     * Gets a builder to request an item within a collection
     * 
     * @return builder to request an item within a collection
     * @param id identifier for the item
     */
    @Nullable
    public T2 byId(@Nonnull final String id) {
        try {
            return reqBuilderClass.getConstructor(String.class, IBaseClient.class, java.util.List.class)
                                .newInstance(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
        } catch (IllegalArgumentException | InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException | SecurityException ex) {
            return null;
		}
    }
}
