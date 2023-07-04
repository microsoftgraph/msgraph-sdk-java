package com.microsoft.graph.models.security;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DataSourceContainer extends Entity implements Parsable {
    /**
     * Created date and time of the dataSourceContainer entity.
     */
    private OffsetDateTime createdDateTime;
    /**
     * Display name of the dataSourceContainer entity.
     */
    private String displayName;
    /**
     * The hold status of the dataSourceContainer. The possible values are: notApplied, applied, applying, removing, partial
     */
    private DataSourceHoldStatus holdStatus;
    /**
     * Last modified date and time of the dataSourceContainer.
     */
    private OffsetDateTime lastModifiedDateTime;
    /**
     * Date and time that the dataSourceContainer was released from the case.
     */
    private OffsetDateTime releasedDateTime;
    /**
     * Latest status of the dataSourceContainer. Possible values are: Active, Released.
     */
    private DataSourceContainerStatus status;
    /**
     * Instantiates a new dataSourceContainer and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DataSourceContainer() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a dataSourceContainer
     */
    @javax.annotation.Nonnull
    public static DataSourceContainer createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.security.ediscoveryCustodian": return new EdiscoveryCustodian();
                case "#microsoft.graph.security.ediscoveryNoncustodialDataSource": return new EdiscoveryNoncustodialDataSource();
            }
        }
        return new DataSourceContainer();
    }
    /**
     * Gets the createdDateTime property value. Created date and time of the dataSourceContainer entity.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Gets the displayName property value. Display name of the dataSourceContainer entity.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("holdStatus", (n) -> { this.setHoldStatus(n.getEnumValue(DataSourceHoldStatus.class)); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("releasedDateTime", (n) -> { this.setReleasedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(DataSourceContainerStatus.class)); });
        return deserializerMap;
    }
    /**
     * Gets the holdStatus property value. The hold status of the dataSourceContainer. The possible values are: notApplied, applied, applying, removing, partial
     * @return a dataSourceHoldStatus
     */
    @javax.annotation.Nullable
    public DataSourceHoldStatus getHoldStatus() {
        return this.holdStatus;
    }
    /**
     * Gets the lastModifiedDateTime property value. Last modified date and time of the dataSourceContainer.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }
    /**
     * Gets the releasedDateTime property value. Date and time that the dataSourceContainer was released from the case.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getReleasedDateTime() {
        return this.releasedDateTime;
    }
    /**
     * Gets the status property value. Latest status of the dataSourceContainer. Possible values are: Active, Released.
     * @return a dataSourceContainerStatus
     */
    @javax.annotation.Nullable
    public DataSourceContainerStatus getStatus() {
        return this.status;
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
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeEnumValue("holdStatus", this.getHoldStatus());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeOffsetDateTimeValue("releasedDateTime", this.getReleasedDateTime());
        writer.writeEnumValue("status", this.getStatus());
    }
    /**
     * Sets the createdDateTime property value. Created date and time of the dataSourceContainer entity.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the displayName property value. Display name of the dataSourceContainer entity.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the holdStatus property value. The hold status of the dataSourceContainer. The possible values are: notApplied, applied, applying, removing, partial
     * @param value Value to set for the holdStatus property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHoldStatus(@javax.annotation.Nullable final DataSourceHoldStatus value) {
        this.holdStatus = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. Last modified date and time of the dataSourceContainer.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastModifiedDateTime = value;
    }
    /**
     * Sets the releasedDateTime property value. Date and time that the dataSourceContainer was released from the case.
     * @param value Value to set for the releasedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReleasedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.releasedDateTime = value;
    }
    /**
     * Sets the status property value. Latest status of the dataSourceContainer. Possible values are: Active, Released.
     * @param value Value to set for the status property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatus(@javax.annotation.Nullable final DataSourceContainerStatus value) {
        this.status = value;
    }
}
