package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserScopeTeamsAppInstallation extends TeamsAppInstallation implements Parsable {
    /**
     * Instantiates a new UserScopeTeamsAppInstallation and sets the default values.
     */
    public UserScopeTeamsAppInstallation() {
        super();
        this.setOdataType("#microsoft.graph.userScopeTeamsAppInstallation");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UserScopeTeamsAppInstallation
     */
    @jakarta.annotation.Nonnull
    public static UserScopeTeamsAppInstallation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserScopeTeamsAppInstallation();
    }
    /**
     * Gets the chat property value. The chat between the user and Teams app.
     * @return a Chat
     */
    @jakarta.annotation.Nullable
    public Chat getChat() {
        return this.backingStore.get("chat");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("chat", (n) -> { this.setChat(n.getObjectValue(Chat::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("chat", this.getChat());
    }
    /**
     * Sets the chat property value. The chat between the user and Teams app.
     * @param value Value to set for the chat property.
     */
    public void setChat(@jakarta.annotation.Nullable final Chat value) {
        this.backingStore.set("chat", value);
    }
}
