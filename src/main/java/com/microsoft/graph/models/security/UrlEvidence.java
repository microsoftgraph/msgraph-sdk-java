package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UrlEvidence extends AlertEvidence implements Parsable {
    /**
     * The Unique Resource Locator (URL).
     */
    private String url;
    /**
     * Instantiates a new urlEvidence and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public UrlEvidence() {
        super();
        this.setOdataType("#microsoft.graph.security.urlEvidence");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a urlEvidence
     */
    @jakarta.annotation.Nonnull
    public static UrlEvidence createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UrlEvidence();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("url", (n) -> { this.setUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the url property value. The Unique Resource Locator (URL).
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getUrl() {
        return this.url;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("url", this.getUrl());
    }
    /**
     * Sets the url property value. The Unique Resource Locator (URL).
     * @param value Value to set for the url property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setUrl(@jakarta.annotation.Nullable final String value) {
        this.url = value;
    }
}
