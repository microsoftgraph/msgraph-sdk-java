package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ServiceHostedMediaConfig extends MediaConfig implements Parsable {
    /**
     * The list of media to pre-fetch.
     */
    private java.util.List<MediaInfo> preFetchMedia;
    /**
     * Instantiates a new serviceHostedMediaConfig and sets the default values.
     */
    public ServiceHostedMediaConfig() {
        super();
        this.setOdataType("#microsoft.graph.serviceHostedMediaConfig");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a serviceHostedMediaConfig
     */
    @jakarta.annotation.Nonnull
    public static ServiceHostedMediaConfig createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceHostedMediaConfig();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("preFetchMedia", (n) -> { this.setPreFetchMedia(n.getCollectionOfObjectValues(MediaInfo::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the preFetchMedia property value. The list of media to pre-fetch.
     * @return a mediaInfo
     */
    @jakarta.annotation.Nullable
    public java.util.List<MediaInfo> getPreFetchMedia() {
        return this.preFetchMedia;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("preFetchMedia", this.getPreFetchMedia());
    }
    /**
     * Sets the preFetchMedia property value. The list of media to pre-fetch.
     * @param value Value to set for the preFetchMedia property.
     */
    public void setPreFetchMedia(@jakarta.annotation.Nullable final java.util.List<MediaInfo> value) {
        this.preFetchMedia = value;
    }
}
