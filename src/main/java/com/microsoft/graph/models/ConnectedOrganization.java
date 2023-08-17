package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ConnectedOrganization extends Entity implements Parsable {
    /**
     * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     */
    private OffsetDateTime createdDateTime;
    /**
     * The description of the connected organization.
     */
    private String description;
    /**
     * The display name of the connected organization. Supports $filter (eq).
     */
    private String displayName;
    /**
     * The externalSponsors property
     */
    private java.util.List<DirectoryObject> externalSponsors;
    /**
     * The identity sources in this connected organization, one of azureActiveDirectoryTenant, domainIdentitySource, externalDomainFederation or crossCloudAzureActiveDirectoryTenant. Nullable.
     */
    private java.util.List<IdentitySource> identitySources;
    /**
     * The internalSponsors property
     */
    private java.util.List<DirectoryObject> internalSponsors;
    /**
     * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     */
    private OffsetDateTime modifiedDateTime;
    /**
     * The state of a connected organization defines whether assignment policies with requestor scope type AllConfiguredConnectedOrganizationSubjects are applicable or not.  The possible values are: configured, proposed, unknownFutureValue.
     */
    private ConnectedOrganizationState state;
    /**
     * Instantiates a new connectedOrganization and sets the default values.
     */
    public ConnectedOrganization() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a connectedOrganization
     */
    @jakarta.annotation.Nonnull
    public static ConnectedOrganization createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConnectedOrganization();
    }
    /**
     * Gets the createdDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Gets the description property value. The description of the connected organization.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the displayName property value. The display name of the connected organization. Supports $filter (eq).
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Gets the externalSponsors property value. The externalSponsors property
     * @return a directoryObject
     */
    @jakarta.annotation.Nullable
    public java.util.List<DirectoryObject> getExternalSponsors() {
        return this.externalSponsors;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("externalSponsors", (n) -> { this.setExternalSponsors(n.getCollectionOfObjectValues(DirectoryObject::createFromDiscriminatorValue)); });
        deserializerMap.put("identitySources", (n) -> { this.setIdentitySources(n.getCollectionOfObjectValues(IdentitySource::createFromDiscriminatorValue)); });
        deserializerMap.put("internalSponsors", (n) -> { this.setInternalSponsors(n.getCollectionOfObjectValues(DirectoryObject::createFromDiscriminatorValue)); });
        deserializerMap.put("modifiedDateTime", (n) -> { this.setModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(ConnectedOrganizationState.class)); });
        return deserializerMap;
    }
    /**
     * Gets the identitySources property value. The identity sources in this connected organization, one of azureActiveDirectoryTenant, domainIdentitySource, externalDomainFederation or crossCloudAzureActiveDirectoryTenant. Nullable.
     * @return a identitySource
     */
    @jakarta.annotation.Nullable
    public java.util.List<IdentitySource> getIdentitySources() {
        return this.identitySources;
    }
    /**
     * Gets the internalSponsors property value. The internalSponsors property
     * @return a directoryObject
     */
    @jakarta.annotation.Nullable
    public java.util.List<DirectoryObject> getInternalSponsors() {
        return this.internalSponsors;
    }
    /**
     * Gets the modifiedDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getModifiedDateTime() {
        return this.modifiedDateTime;
    }
    /**
     * Gets the state property value. The state of a connected organization defines whether assignment policies with requestor scope type AllConfiguredConnectedOrganizationSubjects are applicable or not.  The possible values are: configured, proposed, unknownFutureValue.
     * @return a connectedOrganizationState
     */
    @jakarta.annotation.Nullable
    public ConnectedOrganizationState getState() {
        return this.state;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeCollectionOfObjectValues("externalSponsors", this.getExternalSponsors());
        writer.writeCollectionOfObjectValues("identitySources", this.getIdentitySources());
        writer.writeCollectionOfObjectValues("internalSponsors", this.getInternalSponsors());
        writer.writeOffsetDateTimeValue("modifiedDateTime", this.getModifiedDateTime());
        writer.writeEnumValue("state", this.getState());
    }
    /**
     * Sets the createdDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the description property value. The description of the connected organization.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the displayName property value. The display name of the connected organization. Supports $filter (eq).
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the externalSponsors property value. The externalSponsors property
     * @param value Value to set for the externalSponsors property.
     */
    public void setExternalSponsors(@jakarta.annotation.Nullable final java.util.List<DirectoryObject> value) {
        this.externalSponsors = value;
    }
    /**
     * Sets the identitySources property value. The identity sources in this connected organization, one of azureActiveDirectoryTenant, domainIdentitySource, externalDomainFederation or crossCloudAzureActiveDirectoryTenant. Nullable.
     * @param value Value to set for the identitySources property.
     */
    public void setIdentitySources(@jakarta.annotation.Nullable final java.util.List<IdentitySource> value) {
        this.identitySources = value;
    }
    /**
     * Sets the internalSponsors property value. The internalSponsors property
     * @param value Value to set for the internalSponsors property.
     */
    public void setInternalSponsors(@jakarta.annotation.Nullable final java.util.List<DirectoryObject> value) {
        this.internalSponsors = value;
    }
    /**
     * Sets the modifiedDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @param value Value to set for the modifiedDateTime property.
     */
    public void setModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.modifiedDateTime = value;
    }
    /**
     * Sets the state property value. The state of a connected organization defines whether assignment policies with requestor scope type AllConfiguredConnectedOrganizationSubjects are applicable or not.  The possible values are: configured, proposed, unknownFutureValue.
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final ConnectedOrganizationState value) {
        this.state = value;
    }
}
