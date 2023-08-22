package com.microsoft.graph.drives.item.items.item.workbook.functions.hyperlink;

import com.microsoft.graph.models.Json;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class HyperlinkPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The friendlyName property
     */
    private Json friendlyName;
    /**
     * The linkLocation property
     */
    private Json linkLocation;
    /**
     * Instantiates a new hyperlinkPostRequestBody and sets the default values.
     */
    public HyperlinkPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a hyperlinkPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static HyperlinkPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new HyperlinkPostRequestBody();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("friendlyName", (n) -> { this.setFriendlyName(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("linkLocation", (n) -> { this.setLinkLocation(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the friendlyName property value. The friendlyName property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getFriendlyName() {
        return this.friendlyName;
    }
    /**
     * Gets the linkLocation property value. The linkLocation property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getLinkLocation() {
        return this.linkLocation;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("friendlyName", this.getFriendlyName());
        writer.writeObjectValue("linkLocation", this.getLinkLocation());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the friendlyName property value. The friendlyName property
     * @param value Value to set for the friendlyName property.
     */
    public void setFriendlyName(@jakarta.annotation.Nullable final Json value) {
        this.friendlyName = value;
    }
    /**
     * Sets the linkLocation property value. The linkLocation property
     * @param value Value to set for the linkLocation property.
     */
    public void setLinkLocation(@jakarta.annotation.Nullable final Json value) {
        this.linkLocation = value;
    }
}
