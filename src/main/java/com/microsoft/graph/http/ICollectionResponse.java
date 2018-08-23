package com.microsoft.graph.http;

import java.util.List;

public interface ICollectionResponse<T> {
    
    List<T> values();

}
