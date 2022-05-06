package microsoft.graph.models;

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
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** The id of the group that assigns this license. If the assignment is a direct-assigned license, this field will be Null. Read-Only.  */
    private String _assignedByGroup;
    /** The service plans that are disabled in this assignment. Read-Only.  */
    private java.util.List<String> _disabledPlans;
    /** License assignment failure error. If the license is assigned successfully, this field will be Null. Read-Only. The possible values are CountViolation, MutuallyExclusiveViolation, DependencyViolation, ProhibitedInUsageLocationViolation, UniquenessViolation, and Other. For more information on how to identify and resolve license assignment errors see here.  */
    private String _error;
    /** The timestamp when the state of the license assignment was last updated.  */
    private OffsetDateTime _lastUpdatedDateTime;
    /** The unique identifier for the SKU. Read-Only.  */
    private String _skuId;
    /** Indicate the current state of this assignment. Read-Only. The possible values are Active, ActiveWithError, Disabled, and Error.  */
    private String _state;
    /**
     * Instantiates a new licenseAssignmentState and sets the default values.
     * @return a void
     */
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
     * Gets the assignedByGroup property value. The id of the group that assigns this license. If the assignment is a direct-assigned license, this field will be Null. Read-Only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAssignedByGroup() {
        return this._assignedByGroup;
    }
    /**
     * Gets the disabledPlans property value. The service plans that are disabled in this assignment. Read-Only.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getDisabledPlans() {
        return this._disabledPlans;
    }
    /**
     * Gets the error property value. License assignment failure error. If the license is assigned successfully, this field will be Null. Read-Only. The possible values are CountViolation, MutuallyExclusiveViolation, DependencyViolation, ProhibitedInUsageLocationViolation, UniquenessViolation, and Other. For more information on how to identify and resolve license assignment errors see here.
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
        return new HashMap<>(6) {{
            this.put("assignedByGroup", (n) -> { currentObject.setAssignedByGroup(n.getStringValue()); });
            this.put("disabledPlans", (n) -> { currentObject.setDisabledPlans(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("error", (n) -> { currentObject.setError(n.getStringValue()); });
            this.put("lastUpdatedDateTime", (n) -> { currentObject.setLastUpdatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("skuId", (n) -> { currentObject.setSkuId(n.getStringValue()); });
            this.put("state", (n) -> { currentObject.setState(n.getStringValue()); });
        }};
    }
    /**
     * Gets the lastUpdatedDateTime property value. The timestamp when the state of the license assignment was last updated.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastUpdatedDateTime() {
        return this._lastUpdatedDateTime;
    }
    /**
     * Gets the skuId property value. The unique identifier for the SKU. Read-Only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSkuId() {
        return this._skuId;
    }
    /**
     * Gets the state property value. Indicate the current state of this assignment. Read-Only. The possible values are Active, ActiveWithError, Disabled, and Error.
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
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the assignedByGroup property value. The id of the group that assigns this license. If the assignment is a direct-assigned license, this field will be Null. Read-Only.
     * @param value Value to set for the assignedByGroup property.
     * @return a void
     */
    public void setAssignedByGroup(@javax.annotation.Nullable final String value) {
        this._assignedByGroup = value;
    }
    /**
     * Sets the disabledPlans property value. The service plans that are disabled in this assignment. Read-Only.
     * @param value Value to set for the disabledPlans property.
     * @return a void
     */
    public void setDisabledPlans(@javax.annotation.Nullable final java.util.List<String> value) {
        this._disabledPlans = value;
    }
    /**
     * Sets the error property value. License assignment failure error. If the license is assigned successfully, this field will be Null. Read-Only. The possible values are CountViolation, MutuallyExclusiveViolation, DependencyViolation, ProhibitedInUsageLocationViolation, UniquenessViolation, and Other. For more information on how to identify and resolve license assignment errors see here.
     * @param value Value to set for the error property.
     * @return a void
     */
    public void setError(@javax.annotation.Nullable final String value) {
        this._error = value;
    }
    /**
     * Sets the lastUpdatedDateTime property value. The timestamp when the state of the license assignment was last updated.
     * @param value Value to set for the lastUpdatedDateTime property.
     * @return a void
     */
    public void setLastUpdatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastUpdatedDateTime = value;
    }
    /**
     * Sets the skuId property value. The unique identifier for the SKU. Read-Only.
     * @param value Value to set for the skuId property.
     * @return a void
     */
    public void setSkuId(@javax.annotation.Nullable final String value) {
        this._skuId = value;
    }
    /**
     * Sets the state property value. Indicate the current state of this assignment. Read-Only. The possible values are Active, ActiveWithError, Disabled, and Error.
     * @param value Value to set for the state property.
     * @return a void
     */
    public void setState(@javax.annotation.Nullable final String value) {
        this._state = value;
    }
}
