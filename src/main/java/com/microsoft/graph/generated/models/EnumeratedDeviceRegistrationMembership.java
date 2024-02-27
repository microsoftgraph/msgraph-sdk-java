package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EnumeratedDeviceRegistrationMembership extends DeviceRegistrationMembership implements Parsable {
    /**
     * Instantiates a new {@link EnumeratedDeviceRegistrationMembership} and sets the default values.
     */
    public EnumeratedDeviceRegistrationMembership() {
        super();
        this.setOdataType("#microsoft.graph.enumeratedDeviceRegistrationMembership");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link EnumeratedDeviceRegistrationMembership}
     */
    @jakarta.annotation.Nonnull
    public static EnumeratedDeviceRegistrationMembership createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EnumeratedDeviceRegistrationMembership();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("groups", (n) -> { this.setGroups(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("users", (n) -> { this.setUsers(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the groups property value. The groups property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getGroups() {
        return this.backingStore.get("groups");
    }
    /**
     * Gets the users property value. The users property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getUsers() {
        return this.backingStore.get("users");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfPrimitiveValues("groups", this.getGroups());
        writer.writeCollectionOfPrimitiveValues("users", this.getUsers());
    }
    /**
     * Sets the groups property value. The groups property
     * @param value Value to set for the groups property.
     */
    public void setGroups(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("groups", value);
    }
    /**
     * Sets the users property value. The users property
     * @param value Value to set for the users property.
     */
    public void setUsers(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("users", value);
    }
}
