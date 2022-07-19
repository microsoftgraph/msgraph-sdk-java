package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class StaffAvailabilityItem implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Each item in this collection indicates a slot and the status of the staff member. */
    private java.util.List<AvailabilityItem> _availabilityItems;
    /** The OdataType property */
    private String _odataType;
    /** The ID of the staff member. */
    private String _staffId;
    /**
     * Instantiates a new staffAvailabilityItem and sets the default values.
     * @return a void
     */
    public StaffAvailabilityItem() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.staffAvailabilityItem");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a staffAvailabilityItem
     */
    @javax.annotation.Nonnull
    public static StaffAvailabilityItem createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new StaffAvailabilityItem();
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
     * Gets the availabilityItems property value. Each item in this collection indicates a slot and the status of the staff member.
     * @return a availabilityItem
     */
    @javax.annotation.Nullable
    public java.util.List<AvailabilityItem> getAvailabilityItems() {
        return this._availabilityItems;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final StaffAvailabilityItem currentObject = this;
        return new HashMap<>(3) {{
            this.put("availabilityItems", (n) -> { currentObject.setAvailabilityItems(n.getCollectionOfObjectValues(AvailabilityItem::createFromDiscriminatorValue)); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("staffId", (n) -> { currentObject.setStaffId(n.getStringValue()); });
        }};
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
     * Gets the staffId property value. The ID of the staff member.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getStaffId() {
        return this._staffId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("availabilityItems", this.getAvailabilityItems());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("staffId", this.getStaffId());
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
     * Sets the availabilityItems property value. Each item in this collection indicates a slot and the status of the staff member.
     * @param value Value to set for the availabilityItems property.
     * @return a void
     */
    public void setAvailabilityItems(@javax.annotation.Nullable final java.util.List<AvailabilityItem> value) {
        this._availabilityItems = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the staffId property value. The ID of the staff member.
     * @param value Value to set for the staffId property.
     * @return a void
     */
    public void setStaffId(@javax.annotation.Nullable final String value) {
        this._staffId = value;
    }
}
