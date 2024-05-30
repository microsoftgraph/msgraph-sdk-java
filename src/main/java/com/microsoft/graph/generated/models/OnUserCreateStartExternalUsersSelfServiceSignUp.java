package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OnUserCreateStartExternalUsersSelfServiceSignUp extends OnUserCreateStartHandler implements Parsable {
    /**
     * Instantiates a new {@link OnUserCreateStartExternalUsersSelfServiceSignUp} and sets the default values.
     */
    public OnUserCreateStartExternalUsersSelfServiceSignUp() {
        super();
        this.setOdataType("#microsoft.graph.onUserCreateStartExternalUsersSelfServiceSignUp");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link OnUserCreateStartExternalUsersSelfServiceSignUp}
     */
    @jakarta.annotation.Nonnull
    public static OnUserCreateStartExternalUsersSelfServiceSignUp createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OnUserCreateStartExternalUsersSelfServiceSignUp();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("userTypeToCreate", (n) -> { this.setUserTypeToCreate(n.getEnumValue(UserType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the userTypeToCreate property value. The type of user to create. Maps to userType property of user object. The possible values are: member, guest, unknownFutureValue.
     * @return a {@link UserType}
     */
    @jakarta.annotation.Nullable
    public UserType getUserTypeToCreate() {
        return this.backingStore.get("userTypeToCreate");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("userTypeToCreate", this.getUserTypeToCreate());
    }
    /**
     * Sets the userTypeToCreate property value. The type of user to create. Maps to userType property of user object. The possible values are: member, guest, unknownFutureValue.
     * @param value Value to set for the userTypeToCreate property.
     */
    public void setUserTypeToCreate(@jakarta.annotation.Nullable final UserType value) {
        this.backingStore.set("userTypeToCreate", value);
    }
}
