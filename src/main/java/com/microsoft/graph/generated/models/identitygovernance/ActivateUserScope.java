package com.microsoft.graph.models.identitygovernance;

import com.microsoft.graph.models.User;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ActivateUserScope extends ActivationScope implements Parsable {
    /**
     * Instantiates a new {@link ActivateUserScope} and sets the default values.
     */
    public ActivateUserScope() {
        super();
        this.setOdataType("#microsoft.graph.identityGovernance.activateUserScope");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ActivateUserScope}
     */
    @jakarta.annotation.Nonnull
    public static ActivateUserScope createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ActivateUserScope();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("users", (n) -> { this.setUsers(n.getCollectionOfObjectValues(User::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the users property value. The users property
     * @return a {@link java.util.List<User>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<User> getUsers() {
        return this.backingStore.get("users");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("users", this.getUsers());
    }
    /**
     * Sets the users property value. The users property
     * @param value Value to set for the users property.
     */
    public void setUsers(@jakarta.annotation.Nullable final java.util.List<User> value) {
        this.backingStore.set("users", value);
    }
}
