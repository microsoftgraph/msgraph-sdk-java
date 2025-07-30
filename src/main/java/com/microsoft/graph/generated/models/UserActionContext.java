package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserActionContext extends SignInContext implements Parsable {
    /**
     * Instantiates a new {@link UserActionContext} and sets the default values.
     */
    public UserActionContext() {
        super();
        this.setOdataType("#microsoft.graph.userActionContext");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UserActionContext}
     */
    @jakarta.annotation.Nonnull
    public static UserActionContext createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserActionContext();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("userAction", (n) -> { this.setUserAction(n.getEnumValue(UserAction::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the userAction property value. Represents the user action that the authenticating identity is performing. The possible values are: registerSecurityInformation, registerOrJoinDevices, unknownFutureValue.
     * @return a {@link UserAction}
     */
    @jakarta.annotation.Nullable
    public UserAction getUserAction() {
        return this.backingStore.get("userAction");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("userAction", this.getUserAction());
    }
    /**
     * Sets the userAction property value. Represents the user action that the authenticating identity is performing. The possible values are: registerSecurityInformation, registerOrJoinDevices, unknownFutureValue.
     * @param value Value to set for the userAction property.
     */
    public void setUserAction(@jakarta.annotation.Nullable final UserAction value) {
        this.backingStore.set("userAction", value);
    }
}
