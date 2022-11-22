package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CopyNotebookModel implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The createdBy property */
    private String _createdBy;
    /** The createdByIdentity property */
    private IdentitySet _createdByIdentity;
    /** The createdTime property */
    private OffsetDateTime _createdTime;
    /** The id property */
    private String _id;
    /** The isDefault property */
    private Boolean _isDefault;
    /** The isShared property */
    private Boolean _isShared;
    /** The lastModifiedBy property */
    private String _lastModifiedBy;
    /** The lastModifiedByIdentity property */
    private IdentitySet _lastModifiedByIdentity;
    /** The lastModifiedTime property */
    private OffsetDateTime _lastModifiedTime;
    /** The links property */
    private NotebookLinks _links;
    /** The name property */
    private String _name;
    /** The OdataType property */
    private String _odataType;
    /** The sectionGroupsUrl property */
    private String _sectionGroupsUrl;
    /** The sectionsUrl property */
    private String _sectionsUrl;
    /** The self property */
    private String _self;
    /** The userRole property */
    private OnenoteUserRole _userRole;
    /**
     * Instantiates a new CopyNotebookModel and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public CopyNotebookModel() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CopyNotebookModel
     */
    @javax.annotation.Nonnull
    public static CopyNotebookModel createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CopyNotebookModel();
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
     * Gets the createdBy property value. The createdBy property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCreatedBy() {
        return this._createdBy;
    }
    /**
     * Gets the createdByIdentity property value. The createdByIdentity property
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getCreatedByIdentity() {
        return this._createdByIdentity;
    }
    /**
     * Gets the createdTime property value. The createdTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedTime() {
        return this._createdTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(16);
        deserializerMap.put("createdBy", (n) -> { this.setCreatedBy(n.getStringValue()); });
        deserializerMap.put("createdByIdentity", (n) -> { this.setCreatedByIdentity(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("createdTime", (n) -> { this.setCreatedTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("isDefault", (n) -> { this.setIsDefault(n.getBooleanValue()); });
        deserializerMap.put("isShared", (n) -> { this.setIsShared(n.getBooleanValue()); });
        deserializerMap.put("lastModifiedBy", (n) -> { this.setLastModifiedBy(n.getStringValue()); });
        deserializerMap.put("lastModifiedByIdentity", (n) -> { this.setLastModifiedByIdentity(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedTime", (n) -> { this.setLastModifiedTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("links", (n) -> { this.setLinks(n.getObjectValue(NotebookLinks::createFromDiscriminatorValue)); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("sectionGroupsUrl", (n) -> { this.setSectionGroupsUrl(n.getStringValue()); });
        deserializerMap.put("sectionsUrl", (n) -> { this.setSectionsUrl(n.getStringValue()); });
        deserializerMap.put("self", (n) -> { this.setSelf(n.getStringValue()); });
        deserializerMap.put("userRole", (n) -> { this.setUserRole(n.getEnumValue(OnenoteUserRole.class)); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. The id property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getId() {
        return this._id;
    }
    /**
     * Gets the isDefault property value. The isDefault property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsDefault() {
        return this._isDefault;
    }
    /**
     * Gets the isShared property value. The isShared property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsShared() {
        return this._isShared;
    }
    /**
     * Gets the lastModifiedBy property value. The lastModifiedBy property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLastModifiedBy() {
        return this._lastModifiedBy;
    }
    /**
     * Gets the lastModifiedByIdentity property value. The lastModifiedByIdentity property
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getLastModifiedByIdentity() {
        return this._lastModifiedByIdentity;
    }
    /**
     * Gets the lastModifiedTime property value. The lastModifiedTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedTime() {
        return this._lastModifiedTime;
    }
    /**
     * Gets the links property value. The links property
     * @return a notebookLinks
     */
    @javax.annotation.Nullable
    public NotebookLinks getLinks() {
        return this._links;
    }
    /**
     * Gets the name property value. The name property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this._name;
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
     * Gets the sectionGroupsUrl property value. The sectionGroupsUrl property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSectionGroupsUrl() {
        return this._sectionGroupsUrl;
    }
    /**
     * Gets the sectionsUrl property value. The sectionsUrl property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSectionsUrl() {
        return this._sectionsUrl;
    }
    /**
     * Gets the self property value. The self property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSelf() {
        return this._self;
    }
    /**
     * Gets the userRole property value. The userRole property
     * @return a onenoteUserRole
     */
    @javax.annotation.Nullable
    public OnenoteUserRole getUserRole() {
        return this._userRole;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("createdBy", this.getCreatedBy());
        writer.writeObjectValue("createdByIdentity", this.getCreatedByIdentity());
        writer.writeOffsetDateTimeValue("createdTime", this.getCreatedTime());
        writer.writeStringValue("id", this.getId());
        writer.writeBooleanValue("isDefault", this.getIsDefault());
        writer.writeBooleanValue("isShared", this.getIsShared());
        writer.writeStringValue("lastModifiedBy", this.getLastModifiedBy());
        writer.writeObjectValue("lastModifiedByIdentity", this.getLastModifiedByIdentity());
        writer.writeOffsetDateTimeValue("lastModifiedTime", this.getLastModifiedTime());
        writer.writeObjectValue("links", this.getLinks());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("sectionGroupsUrl", this.getSectionGroupsUrl());
        writer.writeStringValue("sectionsUrl", this.getSectionsUrl());
        writer.writeStringValue("self", this.getSelf());
        writer.writeEnumValue("userRole", this.getUserRole());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the createdBy property value. The createdBy property
     * @param value Value to set for the createdBy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedBy(@javax.annotation.Nullable final String value) {
        this._createdBy = value;
    }
    /**
     * Sets the createdByIdentity property value. The createdByIdentity property
     * @param value Value to set for the createdByIdentity property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedByIdentity(@javax.annotation.Nullable final IdentitySet value) {
        this._createdByIdentity = value;
    }
    /**
     * Sets the createdTime property value. The createdTime property
     * @param value Value to set for the createdTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdTime = value;
    }
    /**
     * Sets the id property value. The id property
     * @param value Value to set for the id property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setId(@javax.annotation.Nullable final String value) {
        this._id = value;
    }
    /**
     * Sets the isDefault property value. The isDefault property
     * @param value Value to set for the isDefault property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsDefault(@javax.annotation.Nullable final Boolean value) {
        this._isDefault = value;
    }
    /**
     * Sets the isShared property value. The isShared property
     * @param value Value to set for the isShared property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsShared(@javax.annotation.Nullable final Boolean value) {
        this._isShared = value;
    }
    /**
     * Sets the lastModifiedBy property value. The lastModifiedBy property
     * @param value Value to set for the lastModifiedBy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedBy(@javax.annotation.Nullable final String value) {
        this._lastModifiedBy = value;
    }
    /**
     * Sets the lastModifiedByIdentity property value. The lastModifiedByIdentity property
     * @param value Value to set for the lastModifiedByIdentity property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedByIdentity(@javax.annotation.Nullable final IdentitySet value) {
        this._lastModifiedByIdentity = value;
    }
    /**
     * Sets the lastModifiedTime property value. The lastModifiedTime property
     * @param value Value to set for the lastModifiedTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedTime = value;
    }
    /**
     * Sets the links property value. The links property
     * @param value Value to set for the links property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLinks(@javax.annotation.Nullable final NotebookLinks value) {
        this._links = value;
    }
    /**
     * Sets the name property value. The name property
     * @param value Value to set for the name property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setName(@javax.annotation.Nullable final String value) {
        this._name = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the sectionGroupsUrl property value. The sectionGroupsUrl property
     * @param value Value to set for the sectionGroupsUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSectionGroupsUrl(@javax.annotation.Nullable final String value) {
        this._sectionGroupsUrl = value;
    }
    /**
     * Sets the sectionsUrl property value. The sectionsUrl property
     * @param value Value to set for the sectionsUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSectionsUrl(@javax.annotation.Nullable final String value) {
        this._sectionsUrl = value;
    }
    /**
     * Sets the self property value. The self property
     * @param value Value to set for the self property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSelf(@javax.annotation.Nullable final String value) {
        this._self = value;
    }
    /**
     * Sets the userRole property value. The userRole property
     * @param value Value to set for the userRole property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserRole(@javax.annotation.Nullable final OnenoteUserRole value) {
        this._userRole = value;
    }
}
