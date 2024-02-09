package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AccessPackageSubject extends Entity implements Parsable {
    /**
     * Instantiates a new {@link AccessPackageSubject} and sets the default values.
     */
    public AccessPackageSubject() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AccessPackageSubject}
     */
    @jakarta.annotation.Nonnull
    public static AccessPackageSubject createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessPackageSubject();
    }
    /**
     * Gets the connectedOrganization property value. The connected organization of the subject. Read-only. Nullable.
     * @return a {@link ConnectedOrganization}
     */
    @jakarta.annotation.Nullable
    public ConnectedOrganization getConnectedOrganization() {
        return this.backingStore.get("connectedOrganization");
    }
    /**
     * Gets the displayName property value. The display name of the subject.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * Gets the email property value. The email address of the subject.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEmail() {
        return this.backingStore.get("email");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("connectedOrganization", (n) -> { this.setConnectedOrganization(n.getObjectValue(ConnectedOrganization::createFromDiscriminatorValue)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("email", (n) -> { this.setEmail(n.getStringValue()); });
        deserializerMap.put("objectId", (n) -> { this.setObjectId(n.getStringValue()); });
        deserializerMap.put("onPremisesSecurityIdentifier", (n) -> { this.setOnPremisesSecurityIdentifier(n.getStringValue()); });
        deserializerMap.put("principalName", (n) -> { this.setPrincipalName(n.getStringValue()); });
        deserializerMap.put("subjectType", (n) -> { this.setSubjectType(n.getEnumValue(AccessPackageSubjectType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the objectId property value. The object identifier of the subject. null if the subject isn't yet a user in the tenant.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getObjectId() {
        return this.backingStore.get("objectId");
    }
    /**
     * Gets the onPremisesSecurityIdentifier property value. A string representation of the principal's security identifier, if known, or null if the subject doesn't have a security identifier.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOnPremisesSecurityIdentifier() {
        return this.backingStore.get("onPremisesSecurityIdentifier");
    }
    /**
     * Gets the principalName property value. The principal name, if known, of the subject.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPrincipalName() {
        return this.backingStore.get("principalName");
    }
    /**
     * Gets the subjectType property value. The resource type of the subject. The possible values are: notSpecified, user, servicePrincipal, unknownFutureValue.
     * @return a {@link AccessPackageSubjectType}
     */
    @jakarta.annotation.Nullable
    public AccessPackageSubjectType getSubjectType() {
        return this.backingStore.get("subjectType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setConnectedOrganization(@jakarta.annotation.Nullable final ConnectedOrganization value) {
        this.backingStore.set("connectedOrganization", value);
    }
    /**
     * Sets the displayName property value. The display name of the subject.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the email property value. The email address of the subject.
     * @param value Value to set for the email property.
     */
    public void setEmail(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("email", value);
    }
    /**
     * Sets the objectId property value. The object identifier of the subject. null if the subject isn't yet a user in the tenant.
     * @param value Value to set for the objectId property.
     */
    public void setObjectId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("objectId", value);
    }
    /**
     * Sets the onPremisesSecurityIdentifier property value. A string representation of the principal's security identifier, if known, or null if the subject doesn't have a security identifier.
     * @param value Value to set for the onPremisesSecurityIdentifier property.
     */
    public void setOnPremisesSecurityIdentifier(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("onPremisesSecurityIdentifier", value);
    }
    /**
     * Sets the principalName property value. The principal name, if known, of the subject.
     * @param value Value to set for the principalName property.
     */
    public void setPrincipalName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("principalName", value);
    }
    /**
     * Sets the subjectType property value. The resource type of the subject. The possible values are: notSpecified, user, servicePrincipal, unknownFutureValue.
     * @param value Value to set for the subjectType property.
     */
    public void setSubjectType(@jakarta.annotation.Nullable final AccessPackageSubjectType value) {
        this.backingStore.set("subjectType", value);
    }
}
