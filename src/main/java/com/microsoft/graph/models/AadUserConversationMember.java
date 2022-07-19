package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AadUserConversationMember extends ConversationMember implements Parsable {
    /** The email address of the user. */
    private String _email;
    /** TenantId which the Azure AD user belongs to. */
    private String _tenantId;
    /** The user property */
    private User _user;
    /** The GUID of the user. */
    private String _userId;
    /**
     * Instantiates a new AadUserConversationMember and sets the default values.
     * @return a void
     */
    public AadUserConversationMember() {
        super();
        this.setOdataType("#microsoft.graph.aadUserConversationMember");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AadUserConversationMember
     */
    @javax.annotation.Nonnull
    public static AadUserConversationMember createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AadUserConversationMember();
    }
    /**
     * Gets the email property value. The email address of the user.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEmail() {
        return this._email;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AadUserConversationMember currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("email", (n) -> { currentObject.setEmail(n.getStringValue()); });
            this.put("tenantId", (n) -> { currentObject.setTenantId(n.getStringValue()); });
            this.put("user", (n) -> { currentObject.setUser(n.getObjectValue(User::createFromDiscriminatorValue)); });
            this.put("userId", (n) -> { currentObject.setUserId(n.getStringValue()); });
        }};
    }
    /**
     * Gets the tenantId property value. TenantId which the Azure AD user belongs to.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTenantId() {
        return this._tenantId;
    }
    /**
     * Gets the user property value. The user property
     * @return a user
     */
    @javax.annotation.Nullable
    public User getUser() {
        return this._user;
    }
    /**
     * Gets the userId property value. The GUID of the user.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserId() {
        return this._userId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("email", this.getEmail());
        writer.writeStringValue("tenantId", this.getTenantId());
        writer.writeObjectValue("user", this.getUser());
        writer.writeStringValue("userId", this.getUserId());
    }
    /**
     * Sets the email property value. The email address of the user.
     * @param value Value to set for the email property.
     * @return a void
     */
    public void setEmail(@javax.annotation.Nullable final String value) {
        this._email = value;
    }
    /**
     * Sets the tenantId property value. TenantId which the Azure AD user belongs to.
     * @param value Value to set for the tenantId property.
     * @return a void
     */
    public void setTenantId(@javax.annotation.Nullable final String value) {
        this._tenantId = value;
    }
    /**
     * Sets the user property value. The user property
     * @param value Value to set for the user property.
     * @return a void
     */
    public void setUser(@javax.annotation.Nullable final User value) {
        this._user = value;
    }
    /**
     * Sets the userId property value. The GUID of the user.
     * @param value Value to set for the userId property.
     * @return a void
     */
    public void setUserId(@javax.annotation.Nullable final String value) {
        this._userId = value;
    }
}
