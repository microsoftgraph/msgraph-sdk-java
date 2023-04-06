package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ItemReference implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Unique identifier of the drive instance that contains the driveItem. Only returned if the item is located in a [drive][]. Read-only. */
    private String driveId;
    /** Identifies the type of drive. Only returned if the item is located in a [drive][]. See [drive][] resource for values. */
    private String driveType;
    /** Unique identifier of the driveItem in the drive or a listItem in a list. Read-only. */
    private String id;
    /** The name of the item being referenced. Read-only. */
    private String name;
    /** The OdataType property */
    private String odataType;
    /** Path that can be used to navigate to the item. Read-only. */
    private String path;
    /** A unique identifier for a shared resource that can be accessed via the [Shares][] API. */
    private String shareId;
    /** Returns identifiers useful for SharePoint REST compatibility. Read-only. */
    private SharepointIds sharepointIds;
    /** For OneDrive for Business and SharePoint, this property represents the ID of the site that contains the parent document library of the driveItem resource or the parent list of the listItem resource. The value is the same as the id property of that [site][] resource. It is an opaque string that consists of three identifiers of the site. For OneDrive, this property is not populated. */
    private String siteId;
    /**
     * Instantiates a new itemReference and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ItemReference() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a itemReference
     */
    @javax.annotation.Nonnull
    public static ItemReference createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ItemReference();
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
     * Gets the driveId property value. Unique identifier of the drive instance that contains the driveItem. Only returned if the item is located in a [drive][]. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDriveId() {
        return this.driveId;
    }
    /**
     * Gets the driveType property value. Identifies the type of drive. Only returned if the item is located in a [drive][]. See [drive][] resource for values.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDriveType() {
        return this.driveType;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("driveId", (n) -> { this.setDriveId(n.getStringValue()); });
        deserializerMap.put("driveType", (n) -> { this.setDriveType(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("path", (n) -> { this.setPath(n.getStringValue()); });
        deserializerMap.put("shareId", (n) -> { this.setShareId(n.getStringValue()); });
        deserializerMap.put("sharepointIds", (n) -> { this.setSharepointIds(n.getObjectValue(SharepointIds::createFromDiscriminatorValue)); });
        deserializerMap.put("siteId", (n) -> { this.setSiteId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. Unique identifier of the driveItem in the drive or a listItem in a list. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the name property value. The name of the item being referenced. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this.name;
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
     * Gets the path property value. Path that can be used to navigate to the item. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPath() {
        return this.path;
    }
    /**
     * Gets the shareId property value. A unique identifier for a shared resource that can be accessed via the [Shares][] API.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getShareId() {
        return this.shareId;
    }
    /**
     * Gets the sharepointIds property value. Returns identifiers useful for SharePoint REST compatibility. Read-only.
     * @return a sharepointIds
     */
    @javax.annotation.Nullable
    public SharepointIds getSharepointIds() {
        return this.sharepointIds;
    }
    /**
     * Gets the siteId property value. For OneDrive for Business and SharePoint, this property represents the ID of the site that contains the parent document library of the driveItem resource or the parent list of the listItem resource. The value is the same as the id property of that [site][] resource. It is an opaque string that consists of three identifiers of the site. For OneDrive, this property is not populated.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSiteId() {
        return this.siteId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("driveId", this.getDriveId());
        writer.writeStringValue("driveType", this.getDriveType());
        writer.writeStringValue("id", this.getId());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("path", this.getPath());
        writer.writeStringValue("shareId", this.getShareId());
        writer.writeObjectValue("sharepointIds", this.getSharepointIds());
        writer.writeStringValue("siteId", this.getSiteId());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the driveId property value. Unique identifier of the drive instance that contains the driveItem. Only returned if the item is located in a [drive][]. Read-only.
     * @param value Value to set for the driveId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDriveId(@javax.annotation.Nullable final String value) {
        this.driveId = value;
    }
    /**
     * Sets the driveType property value. Identifies the type of drive. Only returned if the item is located in a [drive][]. See [drive][] resource for values.
     * @param value Value to set for the driveType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDriveType(@javax.annotation.Nullable final String value) {
        this.driveType = value;
    }
    /**
     * Sets the id property value. Unique identifier of the driveItem in the drive or a listItem in a list. Read-only.
     * @param value Value to set for the id property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setId(@javax.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the name property value. The name of the item being referenced. Read-only.
     * @param value Value to set for the name property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setName(@javax.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the path property value. Path that can be used to navigate to the item. Read-only.
     * @param value Value to set for the path property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPath(@javax.annotation.Nullable final String value) {
        this.path = value;
    }
    /**
     * Sets the shareId property value. A unique identifier for a shared resource that can be accessed via the [Shares][] API.
     * @param value Value to set for the shareId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setShareId(@javax.annotation.Nullable final String value) {
        this.shareId = value;
    }
    /**
     * Sets the sharepointIds property value. Returns identifiers useful for SharePoint REST compatibility. Read-only.
     * @param value Value to set for the sharepointIds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSharepointIds(@javax.annotation.Nullable final SharepointIds value) {
        this.sharepointIds = value;
    }
    /**
     * Sets the siteId property value. For OneDrive for Business and SharePoint, this property represents the ID of the site that contains the parent document library of the driveItem resource or the parent list of the listItem resource. The value is the same as the id property of that [site][] resource. It is an opaque string that consists of three identifiers of the site. For OneDrive, this property is not populated.
     * @param value Value to set for the siteId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSiteId(@javax.annotation.Nullable final String value) {
        this.siteId = value;
    }
}
