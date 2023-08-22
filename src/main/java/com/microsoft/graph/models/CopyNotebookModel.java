package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CopyNotebookModel implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The createdBy property
     */
    private String createdBy;
    /**
     * The createdByIdentity property
     */
    private IdentitySet createdByIdentity;
    /**
     * The createdTime property
     */
    private OffsetDateTime createdTime;
    /**
     * The id property
     */
    private String id;
    /**
     * The isDefault property
     */
    private Boolean isDefault;
    /**
     * The isShared property
     */
    private Boolean isShared;
    /**
     * The lastModifiedBy property
     */
    private String lastModifiedBy;
    /**
     * The lastModifiedByIdentity property
     */
    private IdentitySet lastModifiedByIdentity;
    /**
     * The lastModifiedTime property
     */
    private OffsetDateTime lastModifiedTime;
    /**
     * The links property
     */
    private NotebookLinks links;
    /**
     * The name property
     */
    private String name;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The sectionGroupsUrl property
     */
    private String sectionGroupsUrl;
    /**
     * The sectionsUrl property
     */
    private String sectionsUrl;
    /**
     * The self property
     */
    private String self;
    /**
     * The userRole property
     */
    private OnenoteUserRole userRole;
    /**
     * Instantiates a new CopyNotebookModel and sets the default values.
     */
    public CopyNotebookModel() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CopyNotebookModel
     */
    @jakarta.annotation.Nonnull
    public static CopyNotebookModel createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CopyNotebookModel();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the createdBy property value. The createdBy property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getCreatedBy() {
        return this.createdBy;
    }
    /**
     * Gets the createdByIdentity property value. The createdByIdentity property
     * @return a identitySet
     */
    @jakarta.annotation.Nullable
    public IdentitySet getCreatedByIdentity() {
        return this.createdByIdentity;
    }
    /**
     * Gets the createdTime property value. The createdTime property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedTime() {
        return this.createdTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(16);
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
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the isDefault property value. The isDefault property
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsDefault() {
        return this.isDefault;
    }
    /**
     * Gets the isShared property value. The isShared property
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsShared() {
        return this.isShared;
    }
    /**
     * Gets the lastModifiedBy property value. The lastModifiedBy property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getLastModifiedBy() {
        return this.lastModifiedBy;
    }
    /**
     * Gets the lastModifiedByIdentity property value. The lastModifiedByIdentity property
     * @return a identitySet
     */
    @jakarta.annotation.Nullable
    public IdentitySet getLastModifiedByIdentity() {
        return this.lastModifiedByIdentity;
    }
    /**
     * Gets the lastModifiedTime property value. The lastModifiedTime property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedTime() {
        return this.lastModifiedTime;
    }
    /**
     * Gets the links property value. The links property
     * @return a notebookLinks
     */
    @jakarta.annotation.Nullable
    public NotebookLinks getLinks() {
        return this.links;
    }
    /**
     * Gets the name property value. The name property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the sectionGroupsUrl property value. The sectionGroupsUrl property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getSectionGroupsUrl() {
        return this.sectionGroupsUrl;
    }
    /**
     * Gets the sectionsUrl property value. The sectionsUrl property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getSectionsUrl() {
        return this.sectionsUrl;
    }
    /**
     * Gets the self property value. The self property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getSelf() {
        return this.self;
    }
    /**
     * Gets the userRole property value. The userRole property
     * @return a onenoteUserRole
     */
    @jakarta.annotation.Nullable
    public OnenoteUserRole getUserRole() {
        return this.userRole;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the createdBy property value. The createdBy property
     * @param value Value to set for the createdBy property.
     */
    public void setCreatedBy(@jakarta.annotation.Nullable final String value) {
        this.createdBy = value;
    }
    /**
     * Sets the createdByIdentity property value. The createdByIdentity property
     * @param value Value to set for the createdByIdentity property.
     */
    public void setCreatedByIdentity(@jakarta.annotation.Nullable final IdentitySet value) {
        this.createdByIdentity = value;
    }
    /**
     * Sets the createdTime property value. The createdTime property
     * @param value Value to set for the createdTime property.
     */
    public void setCreatedTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdTime = value;
    }
    /**
     * Sets the id property value. The id property
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the isDefault property value. The isDefault property
     * @param value Value to set for the isDefault property.
     */
    public void setIsDefault(@jakarta.annotation.Nullable final Boolean value) {
        this.isDefault = value;
    }
    /**
     * Sets the isShared property value. The isShared property
     * @param value Value to set for the isShared property.
     */
    public void setIsShared(@jakarta.annotation.Nullable final Boolean value) {
        this.isShared = value;
    }
    /**
     * Sets the lastModifiedBy property value. The lastModifiedBy property
     * @param value Value to set for the lastModifiedBy property.
     */
    public void setLastModifiedBy(@jakarta.annotation.Nullable final String value) {
        this.lastModifiedBy = value;
    }
    /**
     * Sets the lastModifiedByIdentity property value. The lastModifiedByIdentity property
     * @param value Value to set for the lastModifiedByIdentity property.
     */
    public void setLastModifiedByIdentity(@jakarta.annotation.Nullable final IdentitySet value) {
        this.lastModifiedByIdentity = value;
    }
    /**
     * Sets the lastModifiedTime property value. The lastModifiedTime property
     * @param value Value to set for the lastModifiedTime property.
     */
    public void setLastModifiedTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastModifiedTime = value;
    }
    /**
     * Sets the links property value. The links property
     * @param value Value to set for the links property.
     */
    public void setLinks(@jakarta.annotation.Nullable final NotebookLinks value) {
        this.links = value;
    }
    /**
     * Sets the name property value. The name property
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the sectionGroupsUrl property value. The sectionGroupsUrl property
     * @param value Value to set for the sectionGroupsUrl property.
     */
    public void setSectionGroupsUrl(@jakarta.annotation.Nullable final String value) {
        this.sectionGroupsUrl = value;
    }
    /**
     * Sets the sectionsUrl property value. The sectionsUrl property
     * @param value Value to set for the sectionsUrl property.
     */
    public void setSectionsUrl(@jakarta.annotation.Nullable final String value) {
        this.sectionsUrl = value;
    }
    /**
     * Sets the self property value. The self property
     * @param value Value to set for the self property.
     */
    public void setSelf(@jakarta.annotation.Nullable final String value) {
        this.self = value;
    }
    /**
     * Sets the userRole property value. The userRole property
     * @param value Value to set for the userRole property.
     */
    public void setUserRole(@jakarta.annotation.Nullable final OnenoteUserRole value) {
        this.userRole = value;
    }
}
