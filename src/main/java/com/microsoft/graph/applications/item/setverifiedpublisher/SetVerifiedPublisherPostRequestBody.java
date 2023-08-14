package com.microsoft.graph.applications.item.setverifiedpublisher;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SetVerifiedPublisherPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The verifiedPublisherId property
     */
    private String verifiedPublisherId;
    /**
     * Instantiates a new setVerifiedPublisherPostRequestBody and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public SetVerifiedPublisherPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a setVerifiedPublisherPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static SetVerifiedPublisherPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SetVerifiedPublisherPostRequestBody();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("verifiedPublisherId", (n) -> { this.setVerifiedPublisherId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the verifiedPublisherId property value. The verifiedPublisherId property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getVerifiedPublisherId() {
        return this.verifiedPublisherId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("verifiedPublisherId", this.getVerifiedPublisherId());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the verifiedPublisherId property value. The verifiedPublisherId property
     * @param value Value to set for the verifiedPublisherId property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setVerifiedPublisherId(@jakarta.annotation.Nullable final String value) {
        this.verifiedPublisherId = value;
    }
}
