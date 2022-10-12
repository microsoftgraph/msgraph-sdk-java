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
public class LicenseAssignmentState implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The assignedByGroup property */
    private String _assignedByGroup;
    /** The disabledPlans property */
    private java.util.List<String> _disabledPlans;
    /** The error property */
    private String _error;
    /** The lastUpdatedDateTime property */
    private OffsetDateTime _lastUpdatedDateTime;
    /** The skuId property */
    private String _skuId;
    /** The state property */
    private String _state;
    /**
     * Instantiates a new licenseAssignmentState and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public LicenseAssignmentState() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a licenseAssignmentState
     */
    @javax.annotation.Nonnull
    public static LicenseAssignmentState createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LicenseAssignmentState();
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
     * Gets the assignedByGroup property value. The assignedByGroup property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAssignedByGroup() {
        return this._assignedByGroup;
    }
    /**
     * Gets the disabledPlans property value. The disabledPlans property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getDisabledPlans() {
        return this._disabledPlans;
    }
    /**
     * Gets the error property value. The error property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getError() {
        return this._error;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final LicenseAssignmentState currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(6) {{
            this.put("assignedByGroup", (n) -> { currentObject.setAssignedByGroup(n.getStringValue()); });
            this.put("disabledPlans", (n) -> { currentObject.setDisabledPlans(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("error", (n) -> { currentObject.setError(n.getStringValue()); });
            this.put("lastUpdatedDateTime", (n) -> { currentObject.setLastUpdatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("skuId", (n) -> { currentObject.setSkuId(n.getStringValue()); });
            this.put("state", (n) -> { currentObject.setState(n.getStringValue()); });
        }};
    }
    /**
     * Gets the lastUpdatedDateTime property value. The lastUpdatedDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastUpdatedDateTime() {
        return this._lastUpdatedDateTime;
    }
    /**
     * Gets the skuId property value. The skuId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSkuId() {
        return this._skuId;
    }
    /**
     * Gets the state property value. The state property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getState() {
        return this._state;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("assignedByGroup", this.getAssignedByGroup());
        writer.writeCollectionOfPrimitiveValues("disabledPlans", this.getDisabledPlans());
        writer.writeStringValue("error", this.getError());
        writer.writeOffsetDateTimeValue("lastUpdatedDateTime", this.getLastUpdatedDateTime());
        writer.writeStringValue("skuId", this.getSkuId());
        writer.writeStringValue("state", this.getState());
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
     * Sets the assignedByGroup property value. The assignedByGroup property
     * @param value Value to set for the assignedByGroup property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAssignedByGroup(@javax.annotation.Nullable final String value) {
        this._assignedByGroup = value;
    }
    /**
     * Sets the disabledPlans property value. The disabledPlans property
     * @param value Value to set for the disabledPlans property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisabledPlans(@javax.annotation.Nullable final java.util.List<String> value) {
        this._disabledPlans = value;
    }
    /**
     * Sets the error property value. The error property
     * @param value Value to set for the error property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setError(@javax.annotation.Nullable final String value) {
        this._error = value;
    }
    /**
     * Sets the lastUpdatedDateTime property value. The lastUpdatedDateTime property
     * @param value Value to set for the lastUpdatedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastUpdatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastUpdatedDateTime = value;
    }
    /**
     * Sets the skuId property value. The skuId property
     * @param value Value to set for the skuId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSkuId(@javax.annotation.Nullable final String value) {
        this._skuId = value;
    }
    /**
     * Sets the state property value. The state property
     * @param value Value to set for the state property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setState(@javax.annotation.Nullable final String value) {
        this._state = value;
    }
}
