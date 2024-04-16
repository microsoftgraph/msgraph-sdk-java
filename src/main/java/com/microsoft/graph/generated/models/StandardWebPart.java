package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class StandardWebPart extends WebPart implements Parsable {
    /**
     * Instantiates a new {@link StandardWebPart} and sets the default values.
     */
    public StandardWebPart() {
        super();
        this.setOdataType("#microsoft.graph.standardWebPart");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link StandardWebPart}
     */
    @jakarta.annotation.Nonnull
    public static StandardWebPart createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new StandardWebPart();
    }
    /**
     * Gets the containerTextWebPartId property value. The instance identifier of the container text webPart. It only works for inline standard webPart in rich text webParts.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getContainerTextWebPartId() {
        return this.backingStore.get("containerTextWebPartId");
    }
    /**
     * Gets the data property value. Data of the webPart.
     * @return a {@link WebPartData}
     */
    @jakarta.annotation.Nullable
    public WebPartData getData() {
        return this.backingStore.get("data");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("containerTextWebPartId", (n) -> { this.setContainerTextWebPartId(n.getStringValue()); });
        deserializerMap.put("data", (n) -> { this.setData(n.getObjectValue(WebPartData::createFromDiscriminatorValue)); });
        deserializerMap.put("webPartType", (n) -> { this.setWebPartType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the webPartType property value. A Guid that indicates the webPart type.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getWebPartType() {
        return this.backingStore.get("webPartType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("containerTextWebPartId", this.getContainerTextWebPartId());
        writer.writeObjectValue("data", this.getData());
        writer.writeStringValue("webPartType", this.getWebPartType());
    }
    /**
     * Sets the containerTextWebPartId property value. The instance identifier of the container text webPart. It only works for inline standard webPart in rich text webParts.
     * @param value Value to set for the containerTextWebPartId property.
     */
    public void setContainerTextWebPartId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("containerTextWebPartId", value);
    }
    /**
     * Sets the data property value. Data of the webPart.
     * @param value Value to set for the data property.
     */
    public void setData(@jakarta.annotation.Nullable final WebPartData value) {
        this.backingStore.set("data", value);
    }
    /**
     * Sets the webPartType property value. A Guid that indicates the webPart type.
     * @param value Value to set for the webPartType property.
     */
    public void setWebPartType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("webPartType", value);
    }
}
