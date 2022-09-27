package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UserScopeTeamsAppInstallation extends TeamsAppInstallation implements Parsable {
    /** The chat between the user and Teams app. */
    private Chat _chat;
    /**
     * Instantiates a new UserScopeTeamsAppInstallation and sets the default values.
     * @return a void
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
    @javax.annotation.Nonnull
    public static UserScopeTeamsAppInstallation createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserScopeTeamsAppInstallation();
    }
    /**
     * Gets the chat property value. The chat between the user and Teams app.
     * @return a chat
     */
    @javax.annotation.Nullable
    public Chat getChat() {
        return this._chat;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final UserScopeTeamsAppInstallation currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("chat", (n) -> { currentObject.setChat(n.getObjectValue(Chat::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("chat", this.getChat());
    }
    /**
     * Sets the chat property value. The chat between the user and Teams app.
     * @param value Value to set for the chat property.
     * @return a void
     */
    public void setChat(@javax.annotation.Nullable final Chat value) {
        this._chat = value;
    }
}
