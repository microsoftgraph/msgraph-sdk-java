package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AccessPackageSubject extends Entity implements Parsable {
    /** The connected organization of the subject. Read-only. Nullable. */
    private ConnectedOrganization _connectedOrganization;
    /** The display name of the subject. */
    private String _displayName;
    /** The email address of the subject. */
    private String _email;
    /** The object identifier of the subject. null if the subject is not yet a user in the tenant. */
    private String _objectId;
    /** A string representation of the principal's security identifier, if known, or null if the subject does not have a security identifier. */
    private String _onPremisesSecurityIdentifier;
    /** The principal name, if known, of the subject. */
    private String _principalName;
    /** The resource type of the subject. The possible values are: notSpecified, user, servicePrincipal, unknownFutureValue. */
    private AccessPackageSubjectType _subjectType;
    /**
     * Instantiates a new accessPackageSubject and sets the default values.
     * @return a void
     */
    public AccessPackageSubject() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a accessPackageSubject
     */
    @javax.annotation.Nonnull
    public static AccessPackageSubject createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessPackageSubject();
    }
    /**
     * Gets the connectedOrganization property value. The connected organization of the subject. Read-only. Nullable.
     * @return a connectedOrganization
     */
    @javax.annotation.Nullable
    public ConnectedOrganization getConnectedOrganization() {
        return this._connectedOrganization;
    }
    /**
     * Gets the displayName property value. The display name of the subject.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * Gets the email property value. The email address of the subject.
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
        final AccessPackageSubject currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("connectedOrganization", (n) -> { currentObject.setConnectedOrganization(n.getObjectValue(ConnectedOrganization::createFromDiscriminatorValue)); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("email", (n) -> { currentObject.setEmail(n.getStringValue()); });
            this.put("objectId", (n) -> { currentObject.setObjectId(n.getStringValue()); });
            this.put("onPremisesSecurityIdentifier", (n) -> { currentObject.setOnPremisesSecurityIdentifier(n.getStringValue()); });
            this.put("principalName", (n) -> { currentObject.setPrincipalName(n.getStringValue()); });
            this.put("subjectType", (n) -> { currentObject.setSubjectType(n.getEnumValue(AccessPackageSubjectType.class)); });
        }};
    }
    /**
     * Gets the objectId property value. The object identifier of the subject. null if the subject is not yet a user in the tenant.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getObjectId() {
        return this._objectId;
    }
    /**
     * Gets the onPremisesSecurityIdentifier property value. A string representation of the principal's security identifier, if known, or null if the subject does not have a security identifier.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOnPremisesSecurityIdentifier() {
        return this._onPremisesSecurityIdentifier;
    }
    /**
     * Gets the principalName property value. The principal name, if known, of the subject.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPrincipalName() {
        return this._principalName;
    }
    /**
     * Gets the subjectType property value. The resource type of the subject. The possible values are: notSpecified, user, servicePrincipal, unknownFutureValue.
     * @return a accessPackageSubjectType
     */
    @javax.annotation.Nullable
    public AccessPackageSubjectType getSubjectType() {
        return this._subjectType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("connectedOrganization", this.getConnectedOrganization());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("email", this.getEmail());
        writer.writeStringValue("objectId", this.getObjectId());
        writer.writeStringValue("onPremisesSecurityIdentifier", this.getOnPremisesSecurityIdentifier());
        writer.writeStringValue("principalName", this.getPrincipalName());
        writer.writeEnumValue("subjectType", this.getSubjectType());
    }
    /**
     * Sets the connectedOrganization property value. The connected organization of the subject. Read-only. Nullable.
     * @param value Value to set for the connectedOrganization property.
     * @return a void
     */
    public void setConnectedOrganization(@javax.annotation.Nullable final ConnectedOrganization value) {
        this._connectedOrganization = value;
    }
    /**
     * Sets the displayName property value. The display name of the subject.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the email property value. The email address of the subject.
     * @param value Value to set for the email property.
     * @return a void
     */
    public void setEmail(@javax.annotation.Nullable final String value) {
        this._email = value;
    }
    /**
     * Sets the objectId property value. The object identifier of the subject. null if the subject is not yet a user in the tenant.
     * @param value Value to set for the objectId property.
     * @return a void
     */
    public void setObjectId(@javax.annotation.Nullable final String value) {
        this._objectId = value;
    }
    /**
     * Sets the onPremisesSecurityIdentifier property value. A string representation of the principal's security identifier, if known, or null if the subject does not have a security identifier.
     * @param value Value to set for the onPremisesSecurityIdentifier property.
     * @return a void
     */
    public void setOnPremisesSecurityIdentifier(@javax.annotation.Nullable final String value) {
        this._onPremisesSecurityIdentifier = value;
    }
    /**
     * Sets the principalName property value. The principal name, if known, of the subject.
     * @param value Value to set for the principalName property.
     * @return a void
     */
    public void setPrincipalName(@javax.annotation.Nullable final String value) {
        this._principalName = value;
    }
    /**
     * Sets the subjectType property value. The resource type of the subject. The possible values are: notSpecified, user, servicePrincipal, unknownFutureValue.
     * @param value Value to set for the subjectType property.
     * @return a void
     */
    public void setSubjectType(@javax.annotation.Nullable final AccessPackageSubjectType value) {
        this._subjectType = value;
    }
}
