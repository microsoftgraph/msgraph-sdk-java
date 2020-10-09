package com.microsoft.graph.http;

import java.util.List;

import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.ISerializer;

public interface ICollectionResponse<T> extends IJsonBackedObject{
    
    List<T> values();

    /**
     * The URL to the next page of this collection, or null
     */
    String nextLink();
}
