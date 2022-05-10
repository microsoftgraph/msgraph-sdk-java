package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EmployeeOrgData implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The cost center associated with the user. Returned only on $select. Supports $filter. */
    private String _costCenter;
    /** The name of the division in which the user works. Returned only on $select. Supports $filter. */
    private String _division;
    /**
     * Instantiates a new employeeOrgData and sets the default values.
     * @return a void
     */
    public EmployeeOrgData() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a employeeOrgData
     */
    @javax.annotation.Nonnull
    public static EmployeeOrgData createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EmployeeOrgData();
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
     * Gets the costCenter property value. The cost center associated with the user. Returned only on $select. Supports $filter.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCostCenter() {
        return this._costCenter;
    }
    /**
     * Gets the division property value. The name of the division in which the user works. Returned only on $select. Supports $filter.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDivision() {
        return this._division;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final EmployeeOrgData currentObject = this;
        return new HashMap<>(2) {{
            this.put("costCenter", (n) -> { currentObject.setCostCenter(n.getStringValue()); });
            this.put("division", (n) -> { currentObject.setDivision(n.getStringValue()); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("costCenter", this.getCostCenter());
        writer.writeStringValue("division", this.getDivision());
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
     * Sets the costCenter property value. The cost center associated with the user. Returned only on $select. Supports $filter.
     * @param value Value to set for the costCenter property.
     * @return a void
     */
    public void setCostCenter(@javax.annotation.Nullable final String value) {
        this._costCenter = value;
    }
    /**
     * Sets the division property value. The name of the division in which the user works. Returned only on $select. Supports $filter.
     * @param value Value to set for the division property.
     * @return a void
     */
    public void setDivision(@javax.annotation.Nullable final String value) {
        this._division = value;
    }
}
