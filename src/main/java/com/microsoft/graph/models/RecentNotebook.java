package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class RecentNotebook implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The name of the notebook.
     */
    private String displayName;
    /**
     * The date and time when the notebook was last modified. The timestamp represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     */
    private OffsetDateTime lastAccessedTime;
    /**
     * Links for opening the notebook. The oneNoteClientURL link opens the notebook in the OneNote client, if it's installed. The oneNoteWebURL link opens the notebook in OneNote on the web.
     */
    private RecentNotebookLinks links;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The backend store where the Notebook resides, either OneDriveForBusiness or OneDrive.
     */
    private OnenoteSourceService sourceService;
    /**
     * Instantiates a new recentNotebook and sets the default values.
     */
    public RecentNotebook() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a recentNotebook
     */
    @jakarta.annotation.Nonnull
    public static RecentNotebook createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RecentNotebook();
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
     * Gets the displayName property value. The name of the notebook.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("lastAccessedTime", (n) -> { this.setLastAccessedTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("links", (n) -> { this.setLinks(n.getObjectValue(RecentNotebookLinks::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("sourceService", (n) -> { this.setSourceService(n.getEnumValue(OnenoteSourceService.class)); });
        return deserializerMap;
    }
    /**
     * Gets the lastAccessedTime property value. The date and time when the notebook was last modified. The timestamp represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastAccessedTime() {
        return this.lastAccessedTime;
    }
    /**
     * Gets the links property value. Links for opening the notebook. The oneNoteClientURL link opens the notebook in the OneNote client, if it's installed. The oneNoteWebURL link opens the notebook in OneNote on the web.
     * @return a recentNotebookLinks
     */
    @jakarta.annotation.Nullable
    public RecentNotebookLinks getLinks() {
        return this.links;
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
     * Gets the sourceService property value. The backend store where the Notebook resides, either OneDriveForBusiness or OneDrive.
     * @return a onenoteSourceService
     */
    @jakarta.annotation.Nullable
    public OnenoteSourceService getSourceService() {
        return this.sourceService;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeOffsetDateTimeValue("lastAccessedTime", this.getLastAccessedTime());
        writer.writeObjectValue("links", this.getLinks());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("sourceService", this.getSourceService());
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
     * Sets the displayName property value. The name of the notebook.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the lastAccessedTime property value. The date and time when the notebook was last modified. The timestamp represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @param value Value to set for the lastAccessedTime property.
     */
    public void setLastAccessedTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastAccessedTime = value;
    }
    /**
     * Sets the links property value. Links for opening the notebook. The oneNoteClientURL link opens the notebook in the OneNote client, if it's installed. The oneNoteWebURL link opens the notebook in OneNote on the web.
     * @param value Value to set for the links property.
     */
    public void setLinks(@jakarta.annotation.Nullable final RecentNotebookLinks value) {
        this.links = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the sourceService property value. The backend store where the Notebook resides, either OneDriveForBusiness or OneDrive.
     * @param value Value to set for the sourceService property.
     */
    public void setSourceService(@jakarta.annotation.Nullable final OnenoteSourceService value) {
        this.sourceService = value;
    }
}
