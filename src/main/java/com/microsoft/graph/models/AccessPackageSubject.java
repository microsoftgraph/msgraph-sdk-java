package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AccessPackageSubject extends Entity implements Parsable {
    /** The connected organization of the subject. Read-only. Nullable. */
    private ConnectedOrganization connectedOrganization;
    /** The display name of the subject. */
    private String displayName;
    /** The email address of the subject. */
    private String email;
    /** The object identifier of the subject. null if the subject is not yet a user in the tenant. */
    private String objectId;
    /** A string representation of the principal's security identifier, if known, or null if the subject does not have a security identifier. */
    private String onPremisesSecurityIdentifier;
    /** The principal name, if known, of the subject. */
    private String principalName;
    /** The resource type of the subject. The possible values are: notSpecified, user, servicePrincipal, unknownFutureValue. */
    private AccessPackageSubjectType subjectType;
    /**
     * Instantiates a new accessPackageSubject and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
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
        return this.connectedOrganization;
    }
    /**
     * Gets the displayName property value. The display name of the subject.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Gets the email property value. The email address of the subject.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEmail() {
        return this.email;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("connectedOrganization", (n) -> { this.setConnectedOrganization(n.getObjectValue(ConnectedOrganization::createFromDiscriminatorValue)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("email", (n) -> { this.setEmail(n.getStringValue()); });
        deserializerMap.put("objectId", (n) -> { this.setObjectId(n.getStringValue()); });
        deserializerMap.put("onPremisesSecurityIdentifier", (n) -> { this.setOnPremisesSecurityIdentifier(n.getStringValue()); });
        deserializerMap.put("principalName", (n) -> { this.setPrincipalName(n.getStringValue()); });
        deserializerMap.put("subjectType", (n) -> { this.setSubjectType(n.getEnumValue(AccessPackageSubjectType.class)); });
        return deserializerMap;
    }
    /**
     * Gets the objectId property value. The object identifier of the subject. null if the subject is not yet a user in the tenant.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getObjectId() {
        return this.objectId;
    }
    /**
     * Gets the onPremisesSecurityIdentifier property value. A string representation of the principal's security identifier, if known, or null if the subject does not have a security identifier.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOnPremisesSecurityIdentifier() {
        return this.onPremisesSecurityIdentifier;
    }
    /**
     * Gets the principalName property value. The principal name, if known, of the subject.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPrincipalName() {
        return this.principalName;
    }
    /**
     * Gets the subjectType property value. The resource type of the subject. The possible values are: notSpecified, user, servicePrincipal, unknownFutureValue.
     * @return a accessPackageSubjectType
     */
    @javax.annotation.Nullable
    public AccessPackageSubjectType getSubjectType() {
        return this.subjectType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
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
    @javax.annotation.Nonnull
    public void setConnectedOrganization(@javax.annotation.Nullable final ConnectedOrganization value) {
        this.connectedOrganization = value;
    }
    /**
     * Sets the displayName property value. The display name of the subject.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the email property value. The email address of the subject.
     * @param value Value to set for the email property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEmail(@javax.annotation.Nullable final String value) {
        this.email = value;
    }
    /**
     * Sets the objectId property value. The object identifier of the subject. null if the subject is not yet a user in the tenant.
     * @param value Value to set for the objectId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setObjectId(@javax.annotation.Nullable final String value) {
        this.objectId = value;
    }
    /**
     * Sets the onPremisesSecurityIdentifier property value. A string representation of the principal's security identifier, if known, or null if the subject does not have a security identifier.
     * @param value Value to set for the onPremisesSecurityIdentifier property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOnPremisesSecurityIdentifier(@javax.annotation.Nullable final String value) {
        this.onPremisesSecurityIdentifier = value;
    }
    /**
     * Sets the principalName property value. The principal name, if known, of the subject.
     * @param value Value to set for the principalName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPrincipalName(@javax.annotation.Nullable final String value) {
        this.principalName = value;
    }
    /**
     * Sets the subjectType property value. The resource type of the subject. The possible values are: notSpecified, user, servicePrincipal, unknownFutureValue.
     * @param value Value to set for the subjectType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSubjectType(@javax.annotation.Nullable final AccessPackageSubjectType value) {
        this.subjectType = value;
    }
}
