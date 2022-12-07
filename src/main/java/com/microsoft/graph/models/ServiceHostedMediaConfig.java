package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ServiceHostedMediaConfig extends MediaConfig implements Parsable {
    /** The list of media to pre-fetch. */
    private java.util.List<MediaInfo> _preFetchMedia;
    /**
     * Instantiates a new ServiceHostedMediaConfig and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ServiceHostedMediaConfig() {
        super();
        this.setOdataType("#microsoft.graph.serviceHostedMediaConfig");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceHostedMediaConfig
     */
    @javax.annotation.Nonnull
    public static ServiceHostedMediaConfig createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceHostedMediaConfig();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("preFetchMedia", (n) -> { this.setPreFetchMedia(n.getCollectionOfObjectValues(MediaInfo::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the preFetchMedia property value. The list of media to pre-fetch.
     * @return a mediaInfo
     */
    @javax.annotation.Nullable
    public java.util.List<MediaInfo> getPreFetchMedia() {
        return this._preFetchMedia;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("preFetchMedia", this.getPreFetchMedia());
    }
    /**
     * Sets the preFetchMedia property value. The list of media to pre-fetch.
     * @param value Value to set for the preFetchMedia property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPreFetchMedia(@javax.annotation.Nullable final java.util.List<MediaInfo> value) {
        this._preFetchMedia = value;
    }
}
