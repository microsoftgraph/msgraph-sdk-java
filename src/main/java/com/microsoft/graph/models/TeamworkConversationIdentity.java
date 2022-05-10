package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TeamworkConversationIdentity extends Identity implements Parsable {
    /** Type of conversation. Possible values are: team, channel, and chat. */
    private TeamworkConversationIdentityType _conversationIdentityType;
    /**
     * Instantiates a new teamworkConversationIdentity and sets the default values.
     * @return a void
     */
    public TeamworkConversationIdentity() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a teamworkConversationIdentity
     */
    @javax.annotation.Nonnull
    public static TeamworkConversationIdentity createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamworkConversationIdentity();
    }
    /**
     * Gets the conversationIdentityType property value. Type of conversation. Possible values are: team, channel, and chat.
     * @return a teamworkConversationIdentityType
     */
    @javax.annotation.Nullable
    public TeamworkConversationIdentityType getConversationIdentityType() {
        return this._conversationIdentityType;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final TeamworkConversationIdentity currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("conversationIdentityType", (n) -> { currentObject.setConversationIdentityType(n.getEnumValue(TeamworkConversationIdentityType.class)); });
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
        writer.writeEnumValue("conversationIdentityType", this.getConversationIdentityType());
    }
    /**
     * Sets the conversationIdentityType property value. Type of conversation. Possible values are: team, channel, and chat.
     * @param value Value to set for the conversationIdentityType property.
     * @return a void
     */
    public void setConversationIdentityType(@javax.annotation.Nullable final TeamworkConversationIdentityType value) {
        this._conversationIdentityType = value;
    }
}
