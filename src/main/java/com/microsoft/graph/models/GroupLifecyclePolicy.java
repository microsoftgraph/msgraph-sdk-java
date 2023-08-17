package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class GroupLifecyclePolicy extends Entity implements Parsable {
    /**
     * List of email address to send notifications for groups without owners. Multiple email address can be defined by separating email address with a semicolon.
     */
    private String alternateNotificationEmails;
    /**
     * Number of days before a group expires and needs to be renewed. Once renewed, the group expiration is extended by the number of days defined.
     */
    private Integer groupLifetimeInDays;
    /**
     * The group type for which the expiration policy applies. Possible values are All, Selected or None.
     */
    private String managedGroupTypes;
    /**
     * Instantiates a new groupLifecyclePolicy and sets the default values.
     */
    public GroupLifecyclePolicy() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a groupLifecyclePolicy
     */
    @jakarta.annotation.Nonnull
    public static GroupLifecyclePolicy createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GroupLifecyclePolicy();
    }
    /**
     * Gets the alternateNotificationEmails property value. List of email address to send notifications for groups without owners. Multiple email address can be defined by separating email address with a semicolon.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getAlternateNotificationEmails() {
        return this.alternateNotificationEmails;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("alternateNotificationEmails", (n) -> { this.setAlternateNotificationEmails(n.getStringValue()); });
        deserializerMap.put("groupLifetimeInDays", (n) -> { this.setGroupLifetimeInDays(n.getIntegerValue()); });
        deserializerMap.put("managedGroupTypes", (n) -> { this.setManagedGroupTypes(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the groupLifetimeInDays property value. Number of days before a group expires and needs to be renewed. Once renewed, the group expiration is extended by the number of days defined.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getGroupLifetimeInDays() {
        return this.groupLifetimeInDays;
    }
    /**
     * Gets the managedGroupTypes property value. The group type for which the expiration policy applies. Possible values are All, Selected or None.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getManagedGroupTypes() {
        return this.managedGroupTypes;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("alternateNotificationEmails", this.getAlternateNotificationEmails());
        writer.writeIntegerValue("groupLifetimeInDays", this.getGroupLifetimeInDays());
        writer.writeStringValue("managedGroupTypes", this.getManagedGroupTypes());
    }
    /**
     * Sets the alternateNotificationEmails property value. List of email address to send notifications for groups without owners. Multiple email address can be defined by separating email address with a semicolon.
     * @param value Value to set for the alternateNotificationEmails property.
     */
    public void setAlternateNotificationEmails(@jakarta.annotation.Nullable final String value) {
        this.alternateNotificationEmails = value;
    }
    /**
     * Sets the groupLifetimeInDays property value. Number of days before a group expires and needs to be renewed. Once renewed, the group expiration is extended by the number of days defined.
     * @param value Value to set for the groupLifetimeInDays property.
     */
    public void setGroupLifetimeInDays(@jakarta.annotation.Nullable final Integer value) {
        this.groupLifetimeInDays = value;
    }
    /**
     * Sets the managedGroupTypes property value. The group type for which the expiration policy applies. Possible values are All, Selected or None.
     * @param value Value to set for the managedGroupTypes property.
     */
    public void setManagedGroupTypes(@jakarta.annotation.Nullable final String value) {
        this.managedGroupTypes = value;
    }
}
