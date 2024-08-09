package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserStorage extends Entity implements Parsable {
    /**
     * Instantiates a new {@link UserStorage} and sets the default values.
     */
    public UserStorage() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UserStorage}
     */
    @jakarta.annotation.Nonnull
    public static UserStorage createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserStorage();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("quota", (n) -> { this.setQuota(n.getObjectValue(UnifiedStorageQuota::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the quota property value. The quota property
     * @return a {@link UnifiedStorageQuota}
     */
    @jakarta.annotation.Nullable
    public UnifiedStorageQuota getQuota() {
        return this.backingStore.get("quota");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("quota", this.getQuota());
    }
    /**
     * Sets the quota property value. The quota property
     * @param value Value to set for the quota property.
     */
    public void setQuota(@jakarta.annotation.Nullable final UnifiedStorageQuota value) {
        this.backingStore.set("quota", value);
    }
}
