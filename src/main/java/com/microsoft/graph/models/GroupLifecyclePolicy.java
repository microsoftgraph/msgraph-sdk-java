package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class GroupLifecyclePolicy extends Entity implements Parsable {
    /** List of email address to send notifications for groups without owners. Multiple email address can be defined by separating email address with a semicolon. */
    private String _alternateNotificationEmails;
    /** Number of days before a group expires and needs to be renewed. Once renewed, the group expiration is extended by the number of days defined. */
    private Integer _groupLifetimeInDays;
    /** The group type for which the expiration policy applies. Possible values are All, Selected or None. */
    private String _managedGroupTypes;
    /**
     * Instantiates a new groupLifecyclePolicy and sets the default values.
     * @return a void
     */
    public GroupLifecyclePolicy() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a groupLifecyclePolicy
     */
    @javax.annotation.Nonnull
    public static GroupLifecyclePolicy createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GroupLifecyclePolicy();
    }
    /**
     * Gets the alternateNotificationEmails property value. List of email address to send notifications for groups without owners. Multiple email address can be defined by separating email address with a semicolon.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAlternateNotificationEmails() {
        return this._alternateNotificationEmails;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final GroupLifecyclePolicy currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("alternateNotificationEmails", (n) -> { currentObject.setAlternateNotificationEmails(n.getStringValue()); });
            this.put("groupLifetimeInDays", (n) -> { currentObject.setGroupLifetimeInDays(n.getIntegerValue()); });
            this.put("managedGroupTypes", (n) -> { currentObject.setManagedGroupTypes(n.getStringValue()); });
        }};
    }
    /**
     * Gets the groupLifetimeInDays property value. Number of days before a group expires and needs to be renewed. Once renewed, the group expiration is extended by the number of days defined.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getGroupLifetimeInDays() {
        return this._groupLifetimeInDays;
    }
    /**
     * Gets the managedGroupTypes property value. The group type for which the expiration policy applies. Possible values are All, Selected or None.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getManagedGroupTypes() {
        return this._managedGroupTypes;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("alternateNotificationEmails", this.getAlternateNotificationEmails());
        writer.writeIntegerValue("groupLifetimeInDays", this.getGroupLifetimeInDays());
        writer.writeStringValue("managedGroupTypes", this.getManagedGroupTypes());
    }
    /**
     * Sets the alternateNotificationEmails property value. List of email address to send notifications for groups without owners. Multiple email address can be defined by separating email address with a semicolon.
     * @param value Value to set for the alternateNotificationEmails property.
     * @return a void
     */
    public void setAlternateNotificationEmails(@javax.annotation.Nullable final String value) {
        this._alternateNotificationEmails = value;
    }
    /**
     * Sets the groupLifetimeInDays property value. Number of days before a group expires and needs to be renewed. Once renewed, the group expiration is extended by the number of days defined.
     * @param value Value to set for the groupLifetimeInDays property.
     * @return a void
     */
    public void setGroupLifetimeInDays(@javax.annotation.Nullable final Integer value) {
        this._groupLifetimeInDays = value;
    }
    /**
     * Sets the managedGroupTypes property value. The group type for which the expiration policy applies. Possible values are All, Selected or None.
     * @param value Value to set for the managedGroupTypes property.
     * @return a void
     */
    public void setManagedGroupTypes(@javax.annotation.Nullable final String value) {
        this._managedGroupTypes = value;
    }
}
