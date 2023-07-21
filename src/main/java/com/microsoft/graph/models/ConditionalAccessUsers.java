package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ConditionalAccessUsers implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Group IDs excluded from scope of policy.
     */
    private java.util.List<String> excludeGroups;
    /**
     * Internal guests or external users excluded from the policy scope. Optionally populated.
     */
    private ConditionalAccessGuestsOrExternalUsers excludeGuestsOrExternalUsers;
    /**
     * Role IDs excluded from scope of policy.
     */
    private java.util.List<String> excludeRoles;
    /**
     * User IDs excluded from scope of policy and/or GuestsOrExternalUsers.
     */
    private java.util.List<String> excludeUsers;
    /**
     * Group IDs in scope of policy unless explicitly excluded.
     */
    private java.util.List<String> includeGroups;
    /**
     * Internal guests or external users included in the policy scope. Optionally populated.
     */
    private ConditionalAccessGuestsOrExternalUsers includeGuestsOrExternalUsers;
    /**
     * Role IDs in scope of policy unless explicitly excluded.
     */
    private java.util.List<String> includeRoles;
    /**
     * User IDs in scope of policy unless explicitly excluded, None, All, or GuestsOrExternalUsers.
     */
    private java.util.List<String> includeUsers;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new conditionalAccessUsers and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ConditionalAccessUsers() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a conditionalAccessUsers
     */
    @javax.annotation.Nonnull
    public static ConditionalAccessUsers createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConditionalAccessUsers();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the excludeGroups property value. Group IDs excluded from scope of policy.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getExcludeGroups() {
        return this.excludeGroups;
    }
    /**
     * Gets the excludeGuestsOrExternalUsers property value. Internal guests or external users excluded from the policy scope. Optionally populated.
     * @return a conditionalAccessGuestsOrExternalUsers
     */
    @javax.annotation.Nullable
    public ConditionalAccessGuestsOrExternalUsers getExcludeGuestsOrExternalUsers() {
        return this.excludeGuestsOrExternalUsers;
    }
    /**
     * Gets the excludeRoles property value. Role IDs excluded from scope of policy.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getExcludeRoles() {
        return this.excludeRoles;
    }
    /**
     * Gets the excludeUsers property value. User IDs excluded from scope of policy and/or GuestsOrExternalUsers.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getExcludeUsers() {
        return this.excludeUsers;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("excludeGroups", (n) -> { this.setExcludeGroups(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("excludeGuestsOrExternalUsers", (n) -> { this.setExcludeGuestsOrExternalUsers(n.getObjectValue(ConditionalAccessGuestsOrExternalUsers::createFromDiscriminatorValue)); });
        deserializerMap.put("excludeRoles", (n) -> { this.setExcludeRoles(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("excludeUsers", (n) -> { this.setExcludeUsers(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("includeGroups", (n) -> { this.setIncludeGroups(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("includeGuestsOrExternalUsers", (n) -> { this.setIncludeGuestsOrExternalUsers(n.getObjectValue(ConditionalAccessGuestsOrExternalUsers::createFromDiscriminatorValue)); });
        deserializerMap.put("includeRoles", (n) -> { this.setIncludeRoles(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("includeUsers", (n) -> { this.setIncludeUsers(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the includeGroups property value. Group IDs in scope of policy unless explicitly excluded.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getIncludeGroups() {
        return this.includeGroups;
    }
    /**
     * Gets the includeGuestsOrExternalUsers property value. Internal guests or external users included in the policy scope. Optionally populated.
     * @return a conditionalAccessGuestsOrExternalUsers
     */
    @javax.annotation.Nullable
    public ConditionalAccessGuestsOrExternalUsers getIncludeGuestsOrExternalUsers() {
        return this.includeGuestsOrExternalUsers;
    }
    /**
     * Gets the includeRoles property value. Role IDs in scope of policy unless explicitly excluded.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getIncludeRoles() {
        return this.includeRoles;
    }
    /**
     * Gets the includeUsers property value. User IDs in scope of policy unless explicitly excluded, None, All, or GuestsOrExternalUsers.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getIncludeUsers() {
        return this.includeUsers;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("excludeGroups", this.getExcludeGroups());
        writer.writeObjectValue("excludeGuestsOrExternalUsers", this.getExcludeGuestsOrExternalUsers());
        writer.writeCollectionOfPrimitiveValues("excludeRoles", this.getExcludeRoles());
        writer.writeCollectionOfPrimitiveValues("excludeUsers", this.getExcludeUsers());
        writer.writeCollectionOfPrimitiveValues("includeGroups", this.getIncludeGroups());
        writer.writeObjectValue("includeGuestsOrExternalUsers", this.getIncludeGuestsOrExternalUsers());
        writer.writeCollectionOfPrimitiveValues("includeRoles", this.getIncludeRoles());
        writer.writeCollectionOfPrimitiveValues("includeUsers", this.getIncludeUsers());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the excludeGroups property value. Group IDs excluded from scope of policy.
     * @param value Value to set for the excludeGroups property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExcludeGroups(@javax.annotation.Nullable final java.util.List<String> value) {
        this.excludeGroups = value;
    }
    /**
     * Sets the excludeGuestsOrExternalUsers property value. Internal guests or external users excluded from the policy scope. Optionally populated.
     * @param value Value to set for the excludeGuestsOrExternalUsers property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExcludeGuestsOrExternalUsers(@javax.annotation.Nullable final ConditionalAccessGuestsOrExternalUsers value) {
        this.excludeGuestsOrExternalUsers = value;
    }
    /**
     * Sets the excludeRoles property value. Role IDs excluded from scope of policy.
     * @param value Value to set for the excludeRoles property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExcludeRoles(@javax.annotation.Nullable final java.util.List<String> value) {
        this.excludeRoles = value;
    }
    /**
     * Sets the excludeUsers property value. User IDs excluded from scope of policy and/or GuestsOrExternalUsers.
     * @param value Value to set for the excludeUsers property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExcludeUsers(@javax.annotation.Nullable final java.util.List<String> value) {
        this.excludeUsers = value;
    }
    /**
     * Sets the includeGroups property value. Group IDs in scope of policy unless explicitly excluded.
     * @param value Value to set for the includeGroups property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIncludeGroups(@javax.annotation.Nullable final java.util.List<String> value) {
        this.includeGroups = value;
    }
    /**
     * Sets the includeGuestsOrExternalUsers property value. Internal guests or external users included in the policy scope. Optionally populated.
     * @param value Value to set for the includeGuestsOrExternalUsers property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIncludeGuestsOrExternalUsers(@javax.annotation.Nullable final ConditionalAccessGuestsOrExternalUsers value) {
        this.includeGuestsOrExternalUsers = value;
    }
    /**
     * Sets the includeRoles property value. Role IDs in scope of policy unless explicitly excluded.
     * @param value Value to set for the includeRoles property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIncludeRoles(@javax.annotation.Nullable final java.util.List<String> value) {
        this.includeRoles = value;
    }
    /**
     * Sets the includeUsers property value. User IDs in scope of policy unless explicitly excluded, None, All, or GuestsOrExternalUsers.
     * @param value Value to set for the includeUsers property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIncludeUsers(@javax.annotation.Nullable final java.util.List<String> value) {
        this.includeUsers = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
}
