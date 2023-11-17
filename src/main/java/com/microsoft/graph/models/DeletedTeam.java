package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeletedTeam extends Entity implements Parsable {
    /**
     * Instantiates a new DeletedTeam and sets the default values.
     */
    public DeletedTeam() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeletedTeam
     */
    @jakarta.annotation.Nonnull
    public static DeletedTeam createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeletedTeam();
    }
    /**
     * Gets the channels property value. The channels that are either shared with this deleted team or created in this deleted team.
     * @return a java.util.List<Channel>
     */
    @jakarta.annotation.Nullable
    public java.util.List<Channel> getChannels() {
        return this.backingStore.get("channels");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("channels", (n) -> { this.setChannels(n.getCollectionOfObjectValues(Channel::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("channels", this.getChannels());
    }
    /**
     * Sets the channels property value. The channels that are either shared with this deleted team or created in this deleted team.
     * @param value Value to set for the channels property.
     */
    public void setChannels(@jakarta.annotation.Nullable final java.util.List<Channel> value) {
        this.backingStore.set("channels", value);
    }
}
