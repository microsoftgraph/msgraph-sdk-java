package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SocialIdentitySource extends IdentitySource implements Parsable {
    /**
     * Instantiates a new {@link SocialIdentitySource} and sets the default values.
     */
    public SocialIdentitySource() {
        super();
        this.setOdataType("#microsoft.graph.socialIdentitySource");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SocialIdentitySource}
     */
    @jakarta.annotation.Nonnull
    public static SocialIdentitySource createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SocialIdentitySource();
    }
    /**
     * Gets the displayName property value. The displayName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("socialIdentitySourceType", (n) -> { this.setSocialIdentitySourceType(n.getEnumValue(SocialIdentitySourceType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the socialIdentitySourceType property value. The socialIdentitySourceType property
     * @return a {@link SocialIdentitySourceType}
     */
    @jakarta.annotation.Nullable
    public SocialIdentitySourceType getSocialIdentitySourceType() {
        return this.backingStore.get("socialIdentitySourceType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeEnumValue("socialIdentitySourceType", this.getSocialIdentitySourceType());
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the socialIdentitySourceType property value. The socialIdentitySourceType property
     * @param value Value to set for the socialIdentitySourceType property.
     */
    public void setSocialIdentitySourceType(@jakarta.annotation.Nullable final SocialIdentitySourceType value) {
        this.backingStore.set("socialIdentitySourceType", value);
    }
}
