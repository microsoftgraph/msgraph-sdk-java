package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class HttpRequestEndpoint extends CustomExtensionEndpointConfiguration implements Parsable {
    /**
     * Instantiates a new {@link HttpRequestEndpoint} and sets the default values.
     */
    public HttpRequestEndpoint() {
        super();
        this.setOdataType("#microsoft.graph.httpRequestEndpoint");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link HttpRequestEndpoint}
     */
    @jakarta.annotation.Nonnull
    public static HttpRequestEndpoint createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new HttpRequestEndpoint();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("targetUrl", (n) -> { this.setTargetUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the targetUrl property value. The HTTP endpoint that a custom extension calls.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTargetUrl() {
        return this.backingStore.get("targetUrl");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("targetUrl", this.getTargetUrl());
    }
    /**
     * Sets the targetUrl property value. The HTTP endpoint that a custom extension calls.
     * @param value Value to set for the targetUrl property.
     */
    public void setTargetUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("targetUrl", value);
    }
}
