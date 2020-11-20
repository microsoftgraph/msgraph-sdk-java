package com.microsoft.graph.http;

import java.util.List;

import javax.annotation.Nullable;

import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.ISerializer;

/**
 * Represents a response of a collection of items returned by the service
 * @param <T> the type for the items in the response.
 */
public interface ICollectionResponse<T> extends IJsonBackedObject{
    /** 
     * Gets the deserialized values the response contains
     * @return the deserialized values for the response
     */
    @Nullable
    List<T> values();

    /**
     * Gets the link to the next page of this collection
     * @return The URL to the next page of this collection, or null
     */
    @Nullable
    String nextLink();
}
