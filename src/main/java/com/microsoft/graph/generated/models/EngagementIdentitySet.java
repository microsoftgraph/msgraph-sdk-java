package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The Viva Engage identities.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EngagementIdentitySet extends IdentitySet implements Parsable {
    /**
     * Instantiates a new {@link EngagementIdentitySet} and sets the default values.
     */
    public EngagementIdentitySet() {
        super();
        this.setOdataType("#microsoft.graph.engagementIdentitySet");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link EngagementIdentitySet}
     */
    @jakarta.annotation.Nonnull
    public static EngagementIdentitySet createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EngagementIdentitySet();
    }
    /**
     * Gets the audience property value. Optional. The audience associated with this action.
     * @return a {@link Identity}
     */
    @jakarta.annotation.Nullable
    public Identity getAudience() {
        return this.backingStore.get("audience");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("audience", (n) -> { this.setAudience(n.getObjectValue(Identity::createFromDiscriminatorValue)); });
        deserializerMap.put("group", (n) -> { this.setGroup(n.getObjectValue(Identity::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the group property value. Optional. The group associated with this action.
     * @return a {@link Identity}
     */
    @jakarta.annotation.Nullable
    public Identity getGroup() {
        return this.backingStore.get("group");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("audience", this.getAudience());
        writer.writeObjectValue("group", this.getGroup());
    }
    /**
     * Sets the audience property value. Optional. The audience associated with this action.
     * @param value Value to set for the audience property.
     */
    public void setAudience(@jakarta.annotation.Nullable final Identity value) {
        this.backingStore.set("audience", value);
    }
    /**
     * Sets the group property value. Optional. The group associated with this action.
     * @param value Value to set for the group property.
     */
    public void setGroup(@jakarta.annotation.Nullable final Identity value) {
        this.backingStore.set("group", value);
    }
}
