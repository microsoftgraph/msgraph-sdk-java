package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ContentActivity extends Entity implements Parsable {
    /**
     * Instantiates a new {@link ContentActivity} and sets the default values.
     */
    public ContentActivity() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ContentActivity}
     */
    @jakarta.annotation.Nonnull
    public static ContentActivity createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ContentActivity();
    }
    /**
     * Gets the contentMetadata property value. The contentMetadata property
     * @return a {@link ProcessContentRequest}
     */
    @jakarta.annotation.Nullable
    public ProcessContentRequest getContentMetadata() {
        return this.backingStore.get("contentMetadata");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("contentMetadata", (n) -> { this.setContentMetadata(n.getObjectValue(ProcessContentRequest::createFromDiscriminatorValue)); });
        deserializerMap.put("scopeIdentifier", (n) -> { this.setScopeIdentifier(n.getStringValue()); });
        deserializerMap.put("userId", (n) -> { this.setUserId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the scopeIdentifier property value. The scope identified from computed protection scopes.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getScopeIdentifier() {
        return this.backingStore.get("scopeIdentifier");
    }
    /**
     * Gets the userId property value. ID of the user.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUserId() {
        return this.backingStore.get("userId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("contentMetadata", this.getContentMetadata());
        writer.writeStringValue("scopeIdentifier", this.getScopeIdentifier());
        writer.writeStringValue("userId", this.getUserId());
    }
    /**
     * Sets the contentMetadata property value. The contentMetadata property
     * @param value Value to set for the contentMetadata property.
     */
    public void setContentMetadata(@jakarta.annotation.Nullable final ProcessContentRequest value) {
        this.backingStore.set("contentMetadata", value);
    }
    /**
     * Sets the scopeIdentifier property value. The scope identified from computed protection scopes.
     * @param value Value to set for the scopeIdentifier property.
     */
    public void setScopeIdentifier(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("scopeIdentifier", value);
    }
    /**
     * Sets the userId property value. ID of the user.
     * @param value Value to set for the userId property.
     */
    public void setUserId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userId", value);
    }
}
