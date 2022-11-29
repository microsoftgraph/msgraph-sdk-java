package com.microsoft.graph.models.security;

import com.microsoft.graph.models.Entity;
import com.microsoft.graph.models.security.EdiscoveryCustodian;
import com.microsoft.graph.models.security.EdiscoveryNoncustodialDataSource;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of agreementAcceptance entities. */
public class DataSourceContainer extends Entity implements Parsable {
    /** Created date and time of the dataSourceContainer entity. */
    private OffsetDateTime _createdDateTime;
    /** Display name of the dataSourceContainer entity. */
    private String _displayName;
    /** The hold status of the dataSourceContainer. The possible values are: notApplied, applied, applying, removing, partial */
    private DataSourceHoldStatus _holdStatus;
    /** Last modified date and time of the dataSourceContainer. */
    private OffsetDateTime _lastModifiedDateTime;
    /** Date and time that the dataSourceContainer was released from the case. */
    private OffsetDateTime _releasedDateTime;
    /** Latest status of the dataSourceContainer. Possible values are: Active, Released. */
    private DataSourceContainerStatus _status;
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
        return this._createdDateTime;
    }
    /**
     * Gets the displayName property value. Display name of the dataSourceContainer entity.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DataSourceContainer currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("holdStatus", (n) -> { currentObject.setHoldStatus(n.getEnumValue(DataSourceHoldStatus.class)); });
            this.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
            this.put("releasedDateTime", (n) -> { currentObject.setReleasedDateTime(n.getOffsetDateTimeValue()); });
            this.put("status", (n) -> { currentObject.setStatus(n.getEnumValue(DataSourceContainerStatus.class)); });
        }};
    }
    /**
     * Gets the holdStatus property value. The hold status of the dataSourceContainer. The possible values are: notApplied, applied, applying, removing, partial
     * @return a dataSourceHoldStatus
     */
    @javax.annotation.Nullable
    public DataSourceHoldStatus getHoldStatus() {
        return this._holdStatus;
    }
    /**
     * Gets the lastModifiedDateTime property value. Last modified date and time of the dataSourceContainer.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this._lastModifiedDateTime;
    }
    /**
     * Gets the releasedDateTime property value. Date and time that the dataSourceContainer was released from the case.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getReleasedDateTime() {
        return this._releasedDateTime;
    }
    /**
     * Gets the status property value. Latest status of the dataSourceContainer. Possible values are: Active, Released.
     * @return a dataSourceContainerStatus
     */
    @javax.annotation.Nullable
    public DataSourceContainerStatus getStatus() {
        return this._status;
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
        this._createdDateTime = value;
    }
    /**
     * Sets the displayName property value. Display name of the dataSourceContainer entity.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the holdStatus property value. The hold status of the dataSourceContainer. The possible values are: notApplied, applied, applying, removing, partial
     * @param value Value to set for the holdStatus property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHoldStatus(@javax.annotation.Nullable final DataSourceHoldStatus value) {
        this._holdStatus = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. Last modified date and time of the dataSourceContainer.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the releasedDateTime property value. Date and time that the dataSourceContainer was released from the case.
     * @param value Value to set for the releasedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReleasedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._releasedDateTime = value;
    }
    /**
     * Sets the status property value. Latest status of the dataSourceContainer. Possible values are: Active, Released.
     * @param value Value to set for the status property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatus(@javax.annotation.Nullable final DataSourceContainerStatus value) {
        this._status = value;
    }
}
