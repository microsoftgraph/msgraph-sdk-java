package com.microsoft.graph.http;

import java.util.List;

import com.microsoft.graph.serializer.IJsonBackedObject;

public interface ICollectionResponse<T> extends IJsonBackedObject{
    
    List<T> values();
    
}
