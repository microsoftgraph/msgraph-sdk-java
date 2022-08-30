package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ConditionalAccessUsers implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Group IDs excluded from scope of policy. */
    private java.util.List<String> _excludeGroups;
    /** Role IDs excluded from scope of policy. */
    private java.util.List<String> _excludeRoles;
    /** User IDs excluded from scope of policy and/or GuestsOrExternalUsers. */
    private java.util.List<String> _excludeUsers;
    /** Group IDs in scope of policy unless explicitly excluded, or All. */
    private java.util.List<String> _includeGroups;
    /** Role IDs in scope of policy unless explicitly excluded, or All. */
    private java.util.List<String> _includeRoles;
    /** User IDs in scope of policy unless explicitly excluded, or None or All or GuestsOrExternalUsers. */
    private java.util.List<String> _includeUsers;
    /** The OdataType property */
    private String _odataType;
    /**
     * Instantiates a new conditionalAccessUsers and sets the default values.
     * @return a void
     */
    public ConditionalAccessUsers() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.conditionalAccessUsers");
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
        return this._additionalData;
    }
    /**
     * Gets the excludeGroups property value. Group IDs excluded from scope of policy.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getExcludeGroups() {
        return this._excludeGroups;
    }
    /**
     * Gets the excludeRoles property value. Role IDs excluded from scope of policy.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getExcludeRoles() {
        return this._excludeRoles;
    }
    /**
     * Gets the excludeUsers property value. User IDs excluded from scope of policy and/or GuestsOrExternalUsers.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getExcludeUsers() {
        return this._excludeUsers;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ConditionalAccessUsers currentObject = this;
        return new HashMap<>(7) {{
            this.put("excludeGroups", (n) -> { currentObject.setExcludeGroups(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("excludeRoles", (n) -> { currentObject.setExcludeRoles(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("excludeUsers", (n) -> { currentObject.setExcludeUsers(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("includeGroups", (n) -> { currentObject.setIncludeGroups(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("includeRoles", (n) -> { currentObject.setIncludeRoles(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("includeUsers", (n) -> { currentObject.setIncludeUsers(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        }};
    }
    /**
     * Gets the includeGroups property value. Group IDs in scope of policy unless explicitly excluded, or All.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getIncludeGroups() {
        return this._includeGroups;
    }
    /**
     * Gets the includeRoles property value. Role IDs in scope of policy unless explicitly excluded, or All.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getIncludeRoles() {
        return this._includeRoles;
    }
    /**
     * Gets the includeUsers property value. User IDs in scope of policy unless explicitly excluded, or None or All or GuestsOrExternalUsers.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getIncludeUsers() {
        return this._includeUsers;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("excludeGroups", this.getExcludeGroups());
        writer.writeCollectionOfPrimitiveValues("excludeRoles", this.getExcludeRoles());
        writer.writeCollectionOfPrimitiveValues("excludeUsers", this.getExcludeUsers());
        writer.writeCollectionOfPrimitiveValues("includeGroups", this.getIncludeGroups());
        writer.writeCollectionOfPrimitiveValues("includeRoles", this.getIncludeRoles());
        writer.writeCollectionOfPrimitiveValues("includeUsers", this.getIncludeUsers());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the excludeGroups property value. Group IDs excluded from scope of policy.
     * @param value Value to set for the excludeGroups property.
     * @return a void
     */
    public void setExcludeGroups(@javax.annotation.Nullable final java.util.List<String> value) {
        this._excludeGroups = value;
    }
    /**
     * Sets the excludeRoles property value. Role IDs excluded from scope of policy.
     * @param value Value to set for the excludeRoles property.
     * @return a void
     */
    public void setExcludeRoles(@javax.annotation.Nullable final java.util.List<String> value) {
        this._excludeRoles = value;
    }
    /**
     * Sets the excludeUsers property value. User IDs excluded from scope of policy and/or GuestsOrExternalUsers.
     * @param value Value to set for the excludeUsers property.
     * @return a void
     */
    public void setExcludeUsers(@javax.annotation.Nullable final java.util.List<String> value) {
        this._excludeUsers = value;
    }
    /**
     * Sets the includeGroups property value. Group IDs in scope of policy unless explicitly excluded, or All.
     * @param value Value to set for the includeGroups property.
     * @return a void
     */
    public void setIncludeGroups(@javax.annotation.Nullable final java.util.List<String> value) {
        this._includeGroups = value;
    }
    /**
     * Sets the includeRoles property value. Role IDs in scope of policy unless explicitly excluded, or All.
     * @param value Value to set for the includeRoles property.
     * @return a void
     */
    public void setIncludeRoles(@javax.annotation.Nullable final java.util.List<String> value) {
        this._includeRoles = value;
    }
    /**
     * Sets the includeUsers property value. User IDs in scope of policy unless explicitly excluded, or None or All or GuestsOrExternalUsers.
     * @param value Value to set for the includeUsers property.
     * @return a void
     */
    public void setIncludeUsers(@javax.annotation.Nullable final java.util.List<String> value) {
        this._includeUsers = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
}
