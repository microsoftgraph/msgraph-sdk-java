package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AadUserNotificationRecipient extends TeamworkNotificationRecipient implements Parsable {
    /**
     * Azure AD user identifier. Use the List users method to get this ID.
     */
    private String userId;
    /**
     * Instantiates a new aadUserNotificationRecipient and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public AadUserNotificationRecipient() {
        super();
        this.setOdataType("#microsoft.graph.aadUserNotificationRecipient");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a aadUserNotificationRecipient
     */
    @jakarta.annotation.Nonnull
    public static AadUserNotificationRecipient createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AadUserNotificationRecipient();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("userId", (n) -> { this.setUserId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the userId property value. Azure AD user identifier. Use the List users method to get this ID.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getUserId() {
        return this.userId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("userId", this.getUserId());
    }
    /**
     * Sets the userId property value. Azure AD user identifier. Use the List users method to get this ID.
     * @param value Value to set for the userId property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setUserId(@jakarta.annotation.Nullable final String value) {
        this.userId = value;
    }
}
